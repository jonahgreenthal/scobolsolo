<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));

Account lclUser = Account.demand(request);
Staff lclS = lclUser.getContact().findStaff(lclT);
List<Match> lclMatchCandidates = lclS == null ? Collections.emptyList() : lclS.findMatches();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Games" />
	<jsp:param name="topMenu" value="<%= Menus.staff(lclUser.findStaff(lclT)).asTopLevel().output(request, \"my-matches\") %>" />
	<jsp:param name="h1" value="Games" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		if (lclMatchCandidates.isEmpty()) {
			%><p>Sorry, there are no obvious choices for what match you might want to enter now based on your assignments. Try the <a href="all.jsp?object=<%= lclT.getUniqueString() %>">list of all matches</a>.</p><%
		} else {
			List<Match> lclUnentered = lclMatchCandidates.stream().filter(argM -> argM.determineStatus() == MatchStatus.READY).collect(Collectors.toList());
			if (lclUnentered.size() == 1) {
				Match lclM = lclUnentered.iterator().next();
				%><h2>Ready for Entry</h2>
				<p>You probably want to <a href="sides.jsp?match_id=<%= lclM.getId() %>">enter the <%= lclM.getRound().getName() %> game between <%= lclM.getGame().getIncomingWinningCardPlayer().getNameWithSchoolShortName() %> and <%= lclM.getGame().getIncomingLosingCardPlayer().getNameWithSchoolShortName() %></a>.</p><%
			} else if (lclUnentered.size() > 1) {
				%><h2>Ready for Entry</h2>
				<p>You might want to enter one of these matches:</p>
				<ul><%
					for (Match lclM : lclUnentered) {
						%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getGame().getIncomingWinningCardPlayer().getNameWithSchoolShortName() %> and <%= lclM.getGame().getIncomingLosingCardPlayer().getNameWithSchoolShortName() %></a></li><%
					}
				%></ul><%
			}
			
			List<Match> lclHalfReady = lclMatchCandidates.stream().filter(argM -> argM.determineStatus() == MatchStatus.ONE_PLAYER_KNOWN).collect(Collectors.toList());
			if (lclHalfReady.size() == 1) {
				Match lclM = lclHalfReady.iterator().next();
				%><h2>Half-Ready for Entry</h2>
				<p>You might want to <a href="sides.jsp?match_id=<%= lclM.getId() %>">enter the <%= lclM.getRound().getName() %> game featuring <%= lclM.getGame().getSingleKnownPlayer().getNameWithSchoolShortName() %> and a player to be named later.</p><%
			} else if (lclHalfReady.size() > 1) {
				%><h2>Half-Ready for Entry</h2>
				<p>You might want to enter one of these matches:</p>
				<ul><%
					for (Match lclM : lclHalfReady) {
						%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getGame().getSingleKnownPlayer().getNameWithSchoolShortName() %> and a player to be named later</a></li><%
					}
				%></ul><%
			}
			
			List<Match> lclNotReady = lclMatchCandidates.stream().filter(argM -> argM.determineStatus() == MatchStatus.NO_DATA).collect(Collectors.toList());
			if (lclNotReady.size() == 1) {
				Match lclM = lclNotReady.iterator().next();
				%><h2>Down the Road</h2>
				<p>Eventually you'll have <a href="sides.jsp?match_id=<%= lclM.getId() %>">the <%= lclM.getRound().getName() %> game between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %>.</p><%
			} else if (lclHalfReady.size() > 1) {
				%><h2>Down the Road</h2>
				<p>These matches are coming up in your <%= lclS.getStaffAssignmentCount() > 1 ? "rooms" : "room" %>:</p>
				<ul><%
					for (Match lclM : lclNotReady) {
						%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %></a></li><%
					}
				%></ul><%
			}
			
			List<Match> lclAlreadyEntered = lclMatchCandidates.stream().filter(argM -> argM.determineStatus() == MatchStatus.COMPLETE).collect(Collectors.toList());
			if (lclAlreadyEntered.size() == 1) {
				Match lclM = lclAlreadyEntered.iterator().next();
				Game lclG = lclM.getGame();
				%><h2>Looking Back</h2>
				<p>You might want to go back and tweak <a href="sides.jsp?match_id=<%= lclM.getId() %>">the <%= lclM.getRound().getName() %> game in which <%= lclG.getOutgoingWinningCardPlayer().getNameWithSchoolShortName() %> defeated <%= lclG.getOutgoingLosingCardPlayer().getNameWithSchoolShortName() %>, <%= lclG.getScoreHTML() %></a>. But you should only do that with the control room's approval.</p><%
			} else if (lclHalfReady.size() > 1) {
				%><h2>Looking Back</h2>
				<p>You might want to go back and tweak these games. But you should only do that with the control room's approval.</p>
				<ul><%
					for (Match lclM : lclAlreadyEntered) {
						Game lclG = lclM.getGame();
						%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>">the <%= lclM.getRound().getName() %> game in which <%= lclG.getOutgoingWinningCardPlayer().getNameWithSchoolShortName() %> defeated <%= lclG.getOutgoingLosingCardPlayer().getNameWithSchoolShortName() %>, <%= lclG.getScoreHTML() %></li><%
					}
				%></ul><%
			}
			
			%><p>If you don't see the match you're looking to work on anywhere above, you might try the <a href="all.jsp?object=<%= lclT.getUniqueString() %>">list of all matches</a>.</p><%
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />