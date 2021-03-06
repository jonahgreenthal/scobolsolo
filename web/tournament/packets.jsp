﻿<%@ page import="java.util.Comparator" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.List" %>
<%@ page import="org.apache.commons.lang3.StringUtils" %>
<%@ page import="com.opal.cma.OpalForm" %>
<%@ page import="com.opal.cma.OpalMainForm" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Packet" %>
<%@ page import="com.scobolsolo.application.PacketFactory" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
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

Account lclUser = Account.demand(request);
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Packets" />
	<jsp:param name="topMenu" value="<%= Menus.tournamentAdmin(lclT).asTopLevel().output(request, \"packets-\" + lclT.getUniqueString()) %>" />
	<jsp:param name="h1" value="Packets" />
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

%><div class="row">
	<div class="small-12 columns">
		<label><%= lclOF.checkbox("QuestionsComplete") %>&nbsp;Questions are complete</label>
	</div>
</div>
<div class="row">
	<div class="small-12 columns">
		<table>
			<thead>
				<tr>
					<th>Name</th>
					<th>Short name</th>
					<th>Round</th>
					<th>Replacements from</th>
					<th><span title="May question-specific details be shown publicly?">Pub?</span></th>
					<th><abbr title="Sequence">Seq</abbr></th>
					<th>Edit</th>
					<th><span title="Delete?">Del?</span></th>
				</tr>
			</thead>
			<tbody><%
				List<OpalForm<Packet>> lclPOFs = lclOF.children(
					"Packet",
					PacketFactory.getInstance(),
					1 // row for a new packet
				);
				
				for (OpalForm<Packet> lclPOF : lclPOFs) {
					Packet lclP = lclPOF.getUserFacing();
					
					%><tr>
						<%= lclPOF.open() %>
						<th data-order="<%= lclP == null ? "" : lclP.getName() %>"><%= lclPOF.text("Name", 20) %></th>
						<td data-order="<%= lclP == null ? "" : lclP.getShortName() %>"><%= lclPOF.text("ShortName", 10) %></td>
						<td data-order="<%= lclP == null || lclP.getRound() == null ? "" : lclP.getRound().getName() %>"><%= lclPOF.<Round>dropdown("Round").filter(argR -> argR.getTournament() == lclT).namer(Round::getShortName) %></td>
						<td data-order="<%= lclP == null || lclP.getReplacementPacket() == null ? "" : lclP.getReplacementPacket().getName() %>"><%= lclPOF.<Packet>dropdown("ReplacementPacket").filter(argP -> argP.getTournament() == lclT).namer(Packet::getShortName) %></td>
						<td data-order="<%= lclP == null ? 0 : (lclP.isQuestionsPublic() ? 1 : 0) %>"><%= lclPOF.checkbox("QuestionsPublic") %></td>
						<td data-order="<%= lclP == null ? "" : lclP.getSequence() %>"><%= lclPOF.number("Sequence") %></td>
						<td><%= lclP == null ? "&nbsp;" : "<a href=\"packet-edit.jsp?packet_id=" + lclP.getId() + "\">Edit</a>" %></td>
						<td><%= lclPOF.delete() %></td>
						<%= lclPOF.close() %>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<div class="row">
	<div class="small-12 columns">
		<%= lclOF.submit() %>
		<%= lclOF.cancel() %>
	</div>
</div>

<%= lclOF.close() %><%

if (lclUser.isAdministrator() && lclT.getPacketSet().isEmpty() == false) {
	%>
	<div class="row">
		<div class="small-12 columns">
			<h2>Actions</h2>
			<form id="order" action="OrderPackets" method="post">
				<input form="order" type="hidden" name="tournament_code" value="<%= lclT.getCode() %>" />
			</form>
			<form id="output" action="OutputPackets" method="get">
				<input form="output" type="hidden" name="tournament_code" value="<%= lclT.getCode() %>" />
			</form>
			<table>
				<thead>
					<tr>
						<th>Packet</th>
						<th class="text-center">Order?</th>
						<th class="text-center">Output?</th>
						<th>&nbsp;</th>
					</tr>
				</thead>
				<tbody><%
					Packet[] lclPs = lclT.createPacketArray();
					Arrays.sort(lclPs);
					for (Packet lclP : lclPs) {
						List<String> lclWarnings = lclP.determineIncompletionWarnings();
						%><tr>
							<td><a href="packet-edit.jsp?packet_id=<%= lclP.getId() %>"><%= lclP.getName() %></a></td>
							<td class="switch tiny text-center">
								<input form="order" type="checkbox" id="order_packet_id_<%= lclP.getId() %>" name="packet_id" value="<%= lclP.getId() %>" />
								<label for="order_packet_id_<%= lclP.getId() %>"></label>
							</td>
							<td class="switch tiny text-center">
								<input form="output" type="checkbox" id="output_packet_id_<%= lclP.getId() %>" name="packet_id" value="<%= lclP.getId() %>" />
								<label for="output_packet_id_<%= lclP.getId() %>"></label>
							</td><%
							if (lclWarnings.isEmpty()) {
								%><td>&nbsp;</td><%
							} else {
								%><td class="warning"><%= StringUtils.join(lclWarnings, "<br />") %></td><%
							}
						%></tr><%
					}
				%></tbody>
				<tfoot>
					<td>&nbsp;</td>
					<td class="text-center"><input form="order" type="submit" value="Order" /></td>
					<td class="text-center"><input form="output" type="submit" value="Output" /></td>
					<td>&nbsp;</td>
				</tfoot>
			</table>
		</div>
	</div><%
}
%>

<jsp:include page="/template/footer.jsp" />