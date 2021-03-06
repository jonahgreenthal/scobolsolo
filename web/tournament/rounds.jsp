﻿<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.List" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>
<%@ page import="com.scobolsolo.HTMLUtility" %>

<%
OpalMainForm<Tournament> lclOF = OpalForm.create(
	session,
	request,
	"/OpalFormController",
	TournamentFactory.getInstance().forUniqueString(request.getParameter("object")),
	TournamentFactory.getInstance()
);

Tournament lclT = lclOF.getUserFacing();
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Rounds" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"rounds-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Rounds" />
</jsp:include>

<%= lclOF.open() %><%
if (lclOF.hasErrors()) {
	%><div class="row">
		<div class="small-12 columns">
			<p class="form-error-intro">Error:</p>
			<div class="form-errors"><%= lclOF.displayResultOrErrors() %></div>
		</div>
	</div><%
}

List<OpalForm<Phase>> lclPOFs = lclOF.children(
	"Phase",
	PhaseFactory.getInstance(),
	1 // row for a new Phase
);

for (OpalForm<Phase> lclPOF : lclPOFs) {
	Phase lclP = lclPOF.getUserFacing();
	%><%= lclPOF.open() %>
	
	<div class="row">
		<div class="small-12 columns">
			<h2><%= lclPOF.isNew() ? "New phase" : "Phase: " + lclPOF.getUserFacing().getName() %></h2>
		</div>
	</div>
	
	<div class="row">
		<div class="small-6 medium-3 columns">
			<label>
				Name
				<%= lclPOF.text("Name", 30) %>
			</label>
		</div>
		<div class="small-6 medium-3 columns">
			<label>
				Short name
				<%= lclPOF.text("ShortName", 10) %>
			</label>
		</div>
		<div class="small-6 medium-3 columns">
			<label>
				Sequence
				<%= lclPOF.number("Sequence") %>
			</label>
		</div>
		<div class="small-3 medium-2 columns">
			<label>
				<span class="show-for-small-only">Cards?</span>
				<span class="show-for-medium-only">Card system?</span>
				<span class="show-for-large">Uses card system?</span>
				<%= HTMLUtility.switchWidget(lclPOF, "CardSystem") %><%
				if (lclPOF.alreadyExists() && lclP.isCardSystem()) {
					%><a href="cards.jsp?phase_id=<%= lclP.getId() %>">Edit Cards</a><%
				}
			%></label>
		</div>
		<div class="small-3 medium-1 columns"><%
			if (lclPOF.alreadyExists()) {
				%><label>
					Delete?
					<%= HTMLUtility.deleteWidget(lclPOF) %>
				</label><%
			} // otherwise, nothing
		%></div>
	</div>
	
	<div class="row">
		<div class="small-11 columns small-offset-1">
			<h3>Rounds in <%= lclPOF.isNew() ? "new phase" : lclPOF.getUserFacing().getShortName() %></h3>
			<table>
				<thead>
					<tr>
						<th>Name</th>
						<th>Short&nbsp;name</th>
						<th>Start&nbsp;time</th>
						<th>Earliest&nbsp;entry&nbsp;allowed</th>
						<th>Sequence</th>
						<th>Lunch&nbsp;is&nbsp;after?</th>
						<th>Edit</th>
						<th><span title="delete">Del?</span></th>
					</tr>
				</thead>
				<tbody><%
					List<OpalForm<Round>> lclROFs = lclPOF.children(
						"Round",
						RoundFactory.getInstance(),
						1 // row for a new round
					);
					
					for (OpalForm<Round> lclROF : lclROFs) {
						Round lclR = lclROF.getUserFacing();
						
						%><tr>
							<%= lclROF.open() %>
							<th><%= lclROF.text("Name", 20) %></th>
							<td><%= lclROF.text("ShortName", 10) %></td>
							<td><%= lclROF.text("StartTime", 10) %></td>
							<td><%= lclROF.datetime("EarliestEntryAllowed").placeholder("yyyy-mm-dd hh:mm") %></td>
							<td><%= lclROF.number("Sequence") %></td>
							<td><%= HTMLUtility.switchWidget(lclROF, "LunchAfter") %></td>
							<td><%
								if (lclROF.isNew()) {
									%>&nbsp;<%
								} else {
									%><a href="round-edit.jsp?round_id=<%= lclR.getId() %>">Edit</a><%
								}
							%></td>
							<td><%= HTMLUtility.deleteWidget(lclROF) %></td>
							<%= lclROF.close() %>
						</tr><%
					}
				%></tbody>
			</table>
		</div>
	</div>
	
	<%= lclPOF.close() %><%
}

%><div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %>
		<%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %>

<jsp:include page="/template/footer.jsp" />