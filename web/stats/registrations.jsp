﻿<%@ page import="java.text.NumberFormat" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Registrations" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"registrations\") %>" />
	<jsp:param name="h1" value="<%= lclT.getName() + \": Registrations\" %>" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table>
			<thead>
				<tr>
					<th>School</th>
					<th>Location</th>
					<th>Players</th>
					<th>Waitlist Players</th>
					<th>Standby Players</th>
					<th>Staff</th>
					<th>Buzzers</th>
					<th>Paid</th>
					<th>Owed</th>
				</tr>
			</thead>
			<tbody><%
				int lclPlayers = 0, lclWaitlist = 0, lclStandby = 0, lclBuzzers = 0;
				
				SchoolRegistration[] lclSRs = lclT.createSchoolRegistrationArray();
				Arrays.sort(lclSRs, SchoolRegistration.SchoolNameComparator.getInstance());
				
				for (SchoolRegistration lclSR : lclSRs) {
					lclPlayers += lclSR.getFullPlayerCount();
					
					int lclWaitlistPlayers = lclSR.streamWaitlistEntry().mapToInt(WaitlistEntry::getPlayerCount).sum();
					lclWaitlist += lclWaitlistPlayers;
					
					int lclStandbyPlayers = lclSR.streamStandbyEntry().mapToInt(StandbyEntry::getPlayerCount).sum();
					lclStandby += lclStandbyPlayers;
					
					lclBuzzers += lclSR.getBuzzerSet().size();
					
					%><tr>
						<th><a href="/stats/field.jsp?object=<%= lclT.getUniqueString() %>#<%= lclSR.getId() %>"><%= lclSR.getSchool().getName() %></a></th>
						<td><%= lclSR.getSchool().getLocation("&nbsp;") %></td>
						<td><%= lclSR.getFullPlayerCount() %></td>
						<td><%= lclWaitlistPlayers %></td>
						<td><%= lclStandbyPlayers %></td>
						<td><%= lclSR.getStaffSet().size() %></td>
						<td><%= lclSR.getBuzzerSet().size() %></td>
						<td><%= NumberFormat.getCurrencyInstance().format(lclSR.getAmountPaid()) %></td>
						<td><%= NumberFormat.getCurrencyInstance().format(lclSR.getAmountOwed()) %></td>
					</tr><%
				}
			%></tbody>
			<tfoot>
				<tr>
					<th>Total</th>
					<td>&nbsp;</td>
					<td><%= lclPlayers %></td>
					<td><%= lclWaitlist %></td>
					<td><%= lclStandby %></td>
					<td><%= lclT.getStaffSet().size() %></td>
					<td><%= lclBuzzers %></td>
					<td>&nbsp;</td>
					<td>&nbsp;</td>
				</tr>
			</tfoot>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />