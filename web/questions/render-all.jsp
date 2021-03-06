﻿<%@ page import="java.time.format.DateTimeFormatter" %>
<%@ page import="java.time.format.FormatStyle" %>
<%@ page import="java.util.Iterator" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Collection" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Set" %>
<%@ page import="java.util.HashSet" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="org.apache.commons.lang3.exception.ExceptionUtils" %>
<%@ page import="org.apache.commons.lang3.tuple.Pair" %>
<%@ page import="com.google.common.collect.Multimaps" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.siliconage.util.WebDataFilter" %>
<%@ page import="com.opal.DatabaseQuery" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.Category" %>
<%@ page import="com.scobolsolo.application.Diff" %>
<%@ page import="com.scobolsolo.application.Placement" %>
<%@ page import="com.scobolsolo.application.PlacementFactory" %>
<%@ page import="com.scobolsolo.application.Question" %>
<%@ page import="com.scobolsolo.application.QuestionFactory" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Questions" />
	<jsp:param name="topMenu" value="<%= Menus.QUESTIONS().asTopLevel().output(request, \"render-all\") %>" />
	<jsp:param name="h1" value="Questions" />
</jsp:include><%

Collection<Tournament> lclSelectedTournamentsFromRequest = Validate.notNull(TournamentFactory.getInstance().multipleFromHttpRequest(request));
boolean lclShowUnused = request.getParameter("unused") == null || Boolean.parseBoolean(request.getParameter("unused")); // i.e., if there is no parameter for this, default to true

Set<Tournament> lclSelectedTournaments = new HashSet<>(lclSelectedTournamentsFromRequest);
if (lclSelectedTournaments.isEmpty()) {
	TournamentFactory.getInstance().acquireForQuery(lclSelectedTournaments, new ImplicitTableDatabaseQuery("date > NOW()"));
}

%><form action="render-all.jsp" method="get">
	<div class="row">
		<div class="small-12 medium-4 large-2 columns">
			<label>Show&nbsp;questions&hellip;</label>
		</div><%
		List<Tournament> lclTs = TournamentFactory.getInstance().getAll().stream()
			.filter(argT -> argT.getPacketSet().isEmpty() == false)
			.sorted()
			.collect(Collectors.toList());
		
		for (Tournament lclT : lclTs) {
			%><div class="small-6 medium-4 large-2 columns">
				<label>
					<input type="checkbox" name="tournament_code" value="<%= lclT.getCode() %>"<%= lclSelectedTournaments.contains(lclT) ? " checked=\"checked\"" : "" %>>&nbsp;used in <%= lclT.getShortName() %></label>
				</label>
			</div><%
		}
		
		%><div class="small-6 medium-4 large-2 columns">
			<label>
				<input type="checkbox" name="unused" value="<%= HTMLUtility.DEFAULT_TRUE_STRING %>"<%= lclShowUnused ? " checked=\"checked\"" : "" %> />&nbsp;that&nbsp;are&nbsp;unused
			</label>
		</div>
		
		<div class="small-6 medium-4 large-2 columns">
			<input type="submit" class="tiny" value="Reload" />
		</div>
	</div>
</div><%

if (lclShowUnused) {
	List<Question> lclUnused = QuestionFactory.getInstance().acquireForQuery(
		new ArrayList<>(),
		new ImplicitTableDatabaseQuery("id NOT IN (SELECT question_id FROM Placement WHERE question_id IS NOT NULL)")
	);
	lclUnused.sort(Question.CATEGORY_COMPARATOR);
	
	%><div class="row">
		<div class="small-12 columns">
			<h2>
				<a onclick="$('#unused').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
				Unused (<%= lclUnused.size() %>)
			</h2>
			<div id="unused"><%= renderUnused(Multimaps.index(lclUnused, Question::getCategory)) %></div>
		</div>
	</div><%
}

for (Tournament lclT : lclSelectedTournaments) {
	// In principle, this will run n queries for n selected tournaments (plus the one query for unused questions, if applicable).  This is inefficient and not really necessary, but it makes the code cleaner and it’s pretty unusual to use this page with multiple selected tournaments.
	List<Placement> lclPLs = PlacementFactory.getInstance().acquireForQuery(
		new ArrayList<>(),
		new DatabaseQuery("SELECT PL.* FROM Placement PL JOIN Packet P ON PL.packet_id = P.id WHERE PL.question_id IS NOT NULL AND P.tournament_code = ?", lclT.getCode())
	);
	lclPLs.sort(null);
	
	%><div class="row">
		<div class="small-12 columns">
			<h2>
				<a onclick="$('#<%= lclT.getCode() %>').toggle('slow'); flipIcon(this)" class="fa fa-compress"></a>
				<%= lclT.getName() %> (<%= lclPLs.size() %>)
			</h2>
			<div id="<%= lclT.getCode() %>"><%= renderUsed(lclT, Multimaps.index(lclPLs, Placement::getCategory)) %></div>
		</div>
	</div><%
}
%>

<script type="text/javascript">
	function flipIcon(argElement) {
		if (argElement.className == "fa fa-compress") {
			argElement.className = "fa fa-expand";
		} else if (argElement.className == "fa fa-expand") {
			argElement.className = "fa fa-compress";
		}
	}
</script>

<jsp:include page="/template/footer.jsp" />
<%!

// TODO: The following few methods could probably be DRYed up a bit more

String renderUnused(ListMultimap<Category, Question> argMM) {
	Validate.notNull(argMM);
	
	if (argMM.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argMM.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			String lclSectionId = "unused_" + lclC.getCode();
			String lclCollapseToggleLinkId = "collapse_toggle_" + lclSectionId;
			
			lclSB.append("<h3><a onclick=\"$('#" + lclSectionId + "').toggle('slow'); flipIcon(this)\" class=\"fa fa-compress\"></a> " + lclC.getName() + " (" + argMM.get(lclC).size() + ")</h3>")
				.append("<section id=\"").append(lclSectionId).append("\">");
			
			appendQuestions(lclSB, argMM.get(lclC));
			
			lclSB.append("</section>");
		}
		
		return lclSB.toString();
	}
}

String renderUsed(Tournament argT, ListMultimap<Category, Placement> argMM) {
	Validate.notNull(argT);
	Validate.notNull(argMM);
	
	if (argMM.isEmpty()) {
		return "<p>[no questions]</p>";
	} else {
		StringBuilder lclSB = new StringBuilder();
		List<Category> lclCategories = new ArrayList<>(argMM.keySet());
		lclCategories.sort(null);
		
		for (Category lclC : lclCategories) {
			String lclSectionId = "unused_" + lclC.getCode();
			String lclCollapseToggleLinkId = "collapse_toggle_" + lclSectionId;
			
			lclSB.append("<h3><a onclick=\"$('#" + lclSectionId + "').toggle('slow'); flipIcon(this)\" class=\"fa fa-compress\"></a> " + lclC.getName() + " (" + argMM.get(lclC).size() + ")</h3>")
				.append("<section id=\"").append(lclSectionId).append("\">");
			
			appendPlacements(lclSB, argMM.get(lclC));
			
			lclSB.append("</section>");
		}
		
		return lclSB.toString();
	}
}

void appendQuestions(StringBuilder argSB, List<Question> argQs) {
	Validate.notEmpty(argSB);
	Validate.notEmpty(argQs);
	
	for (Question lclQ : argQs) {
		argSB.append("<h4>")
			.append("<a href=\"question-edit.jsp?question_id=").append(lclQ.getId()).append("\">").append(lclQ.getDescription()).append("</a>")
			.append("</h4>");
		
		appendQuestion(argSB, lclQ);
	}
}

void appendPlacements(StringBuilder argSB, List<Placement> argPLs) {
	Validate.notEmpty(argSB);
	Validate.notEmpty(argPLs);
	
	for (Placement lclPL : argPLs) {
		Validate.isTrue(lclPL.isFilled());
		Question lclQ = lclPL.getQuestion();
		
		argSB.append("<h4>")
			.append("<a href=\"question-edit.jsp?question_id=").append(lclQ.getId()).append("\">").append(lclQ.getDescription()).append("</a>: ").append(lclPL.getString())
			.append("</h4>");
		
		appendQuestion(argSB, lclQ);
	}
}

void appendQuestion(StringBuilder argSB, Question argQ) {
	Validate.notNull(argSB);
	Validate.notNull(argQ);
		
	try {
		argSB.append("<p class=\"question-text small\">").append(Question.outputTextHTML(argQ.getCurrentDiff(), Question.SHOW_PRONUNCIATION_GUIDES)).append("</p>")
			.append("<p class=\"question-answer small\">").append(Question.outputAnswerHTML(argQ.getCurrentDiff(), true)).append("</p>");
		if (argQ.getNote() != null) {
			argSB.append("<p class=\"question-note small\">").append(argQ.getNote()).append("</p>");
		}
	} catch (Exception lclE) {
		argSB.append("<h4 class=\"error\">Couldn’t output <a href=\"question-edit.jsp?question_id=").append(argQ.getId()).append("\">#").append(argQ.getId()).append("</a></h4>")
			.append("<p>").append(WebDataFilter.scrubForHTMLDisplay(lclE.getClass().getName())).append(": ").append(WebDataFilter.scrubForHTMLDisplay(lclE.getMessage())).append("</p>")
			.append("<pre>").append(ExceptionUtils.getStackTrace(lclE)).append("</pre>");
	}
}

%>
