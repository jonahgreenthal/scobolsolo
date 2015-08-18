﻿<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Packet> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	PacketFactory.getInstance(),
	"packet_id"
);
Packet lclP = lclOF.getUserFacing();
Tournament lclT = lclP.getTournament();
lclOF.setDeleteURI("cancel-confirmation.jsp?object=" + lclT.getUniqueString() + "&class_name=packet");

String lclTitle = lclP.getName() + " at " + lclT.getName();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="<%= lclTitle %>" />
	<jsp:param name="pageDescription" value="<%= lclTitle %>" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"packets-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="<%= lclTitle %>" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.errors() %></div>
		</div>
	</div><%
}

%><div class="row">
	<div class="small-12 medium-6 columns">
		<label>
			Name
			<%= lclOF.text("Name", 30) %>
		</label>
	</div>
	<div class="small-12 medium-6 columns">
		<label>
			Short name
			<%= lclOF.text("ShortName", 10) %>
		</label>
	</div>
	
	<div class="small-4 large-5 columns">
		<label>
			Round
			<%= lclOF.dropdown("Round", Round.StandardComparator.getInstance()).filter(argR -> argR.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-4 large-5 columns">
		<label>
			<span class="hide-for-medium-up">Replacements</span>
			<span class="show-for-medium-up">Replacements from</span>
			<%= lclOF.dropdown("ReplacementPacket", Packet.StandardComparator.getInstance()).filter(argP -> argP.getTournament() == lclT) %>
		</label>
	</div>
	<div class="small-4 large-2 columns">
		<label>
			<span class="hide-for-medium-up">Questions public?</span>
			<span class="show-for-medium-up">Are questions public?</span>
			<%= HTMLUtility.switchWidget(lclOF, "QuestionsPublic") %>
		</label>
	</div>
	
	<div class="small-12 columns">
		<label>
			Note
			<%= lclOF.textarea("Note", 60, 3) %>
		</label>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<h2>Questions (<%= lclP.getPlacementCount() %>)</h2>
		<table class="responsive">
			<thead>
				<tr>
					<th>Question</th>
					<th>Sequence</th>
					<th>Category</th>
					<th>Description</th>
					<th>Tiebreaker?</th>
					<th>Score check after?</th>
					<th>Edit</th>
					<th>Remove?</th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Placement>> lclPOFs = lclOF.children(
					"Placement",
					PlacementFactory.getInstance(),
					1, // row for a new placement
					Placement.SequenceComparator.getInstance()
				);
				
				for (OpalForm<Placement> lclPLOF : lclPOFs) {
					Placement lclPL = lclPLOF.getUserFacing();
					
					OpalForm<Question> lclQOF = lclPLOF.isNew() ? null : lclPLOF.targetForm("Question", QuestionFactory.getInstance());
					
					%><tr>
						<%= lclPLOF.open() %>
						<%= lclQOF != null ? lclQOF.open() : "" %>
						<td><%= lclPLOF.dropdown("Question", Question.IdComparator.getInstance()).filter(new Question.PlacingFilter(lclPL)).namer(Question::getDescriptionSafe) %></td>
						<td><%= lclPLOF.text("Sequence", 3) %></td>
						<td><%= lclPLOF.dropdown("Category", Category.StandardComparator.getInstance()).filter(argC -> argC.isUsedAt(lclT)) %></td>
						<td><%= lclQOF != null ? lclQOF.text("Description", 30) : "&nbsp" %></td>
						<td><%= HTMLUtility.switchWidget(lclPLOF, "Tiebreaker") %></td>
						<td><%= HTMLUtility.switchWidget(lclPLOF, "ScorecheckAfter") %></td>
						<td><%
							if (lclPLOF.alreadyExists() && lclPL.isFilled()) {
								%><a href="question-edit.jsp?question_id=<%= lclQOF.getUserFacing().getId() %>">Edit</a><%
							} else {
								%>&nbsp;<%
							}
						%></td>
						<td><%= HTMLUtility.deleteWidget(lclPLOF) %></td>
						<%= lclQOF != null ? lclQOF.close() : "" %>
						<%= lclPLOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %> <%= lclOF.delete("Delete") %> <%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />
