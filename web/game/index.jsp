﻿<%@ page import="java.time.LocalDateTime" %>
<%@ page import="java.util.Collections" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.ObjectUtils" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.Multimaps" %>
<%@ page import="com.google.common.collect.ListMultimap" %>
<%@ page import="com.opal.LocalDateCache" %>
<%@ page import="com.scobolsolo.application.Account" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Message" %>
<%@ page import="com.scobolsolo.application.Round" %>
<%@ page import="com.scobolsolo.application.Staff" %>
<%@ page import="com.scobolsolo.application.Tournament" %>
<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.matches.MatchStatus" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(
	ObjectUtils.firstNonNull(
		TournamentFactory.getInstance().forUniqueString(request.getParameter("object")),
		Tournament.findNext()
	),
	"No tournament specified; no future tournament found"
);

Account lclUser = Account.demand(request);
Staff lclS = lclUser.getContact().findStaff(lclT);
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
    <jsp:param name="pageTitle" value="Games" />
	<jsp:param name="topMenu" value="<%= lclS == null ? Menus.TOURNAMENTS().asTopLevel().output(request, \"games\") : Menus.staff(lclS).asTopLevel().output(request, \"my-matches\") %>" />
	<jsp:param name="h1" value="Games" />
</jsp:include>

<div class="row">
	<div class="small-12 columns"><%
		if (lclS == null) {
			%><p>You are not a staff member for <%= lclT.getName() %>.</p><%
		} else {
			ListMultimap<MatchStatus, Match> lclCandidatesByStatus = Multimaps.index(lclS.findMatches(), Match::determineStatus);
			if (lclCandidatesByStatus.isEmpty()) {
				%><p>Sorry, there are no obvious choices for what match you might want to enter now based on your assignments and what rounds are available for entry yet.</p>
				
				<p>Note that matches are only listed beginning at the official start time of their round.</p><%
				
				
				LocalDateTime lclNow = LocalDateCache.now();
				List<Round> lclFuture = lclT.getRounds().stream() // comes in sorted
					.filter(it -> it.getEarliestEntryAllowed() != null && it.getEarliestEntryAllowed().isAfter(lclNow))
					.collect(Collectors.toList());
				if (lclFuture.isEmpty() == false) {
					if (lclFuture.size() == 1) {
						Round lclR = lclFuture.get(0);
						%><p><%= lclR.getName() %> will be available for entry starting at <%= Message.TIMESTAMP_FORMATTER_WITHOUT_DATE.format(lclR.getEarliestEntryAllowed()) %>.</p><%
					} else {
						%><ul><%
							for (Round lclR : lclFuture) {
								%><li><%= lclR.getName() %> will be available for entry starting at <%= Message.TIMESTAMP_FORMATTER_WITHOUT_DATE.format(lclR.getEarliestEntryAllowed()) %>.</li><%
							}
						%></ul><%
					}
				}
				
				%><p>You may view the <a href="all.jsp?object=<%= lclT.getUniqueString() %>">list of all matches</a>.</p><%
			} else {
				List<Match> lclUnentered = lclCandidatesByStatus.get(MatchStatus.READY);
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
				
				List<Match> lclHalfReady = lclCandidatesByStatus.get(MatchStatus.ONE_PLAYER_KNOWN);
				if (lclHalfReady.size() == 1) {
					Match lclM = lclHalfReady.iterator().next();
					%><h2>Half-Ready for Entry</h2>
					<p>You might want to <a href="sides.jsp?match_id=<%= lclM.getId() %>">enter the <%= lclM.getRound().getName() %> game featuring <%= lclM.getGame().getSingleKnownPlayer().getNameWithSchoolShortName() %> and a player to be named later</a>.</p><%
				} else if (lclHalfReady.size() > 1) {
					%><h2>Half-Ready for Entry</h2>
					<p>You might want to enter one of these matches:</p>
					<ul><%
						for (Match lclM : lclHalfReady) {
							%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getGame().getSingleKnownPlayer().getNameWithSchoolShortName() %> and a player to be named later</a></li><%
						}
					%></ul><%
				}
				
				List<Match> lclInProcess = lclCandidatesByStatus.get(MatchStatus.IN_PROGRESS);
				if (lclInProcess.size() == 1) {
					Match lclM = lclInProcess.iterator().next();
					%><h2>In Process</h2>
					<p><a href="sides.jsp?match_id=<%= lclM.getId() %>">The <%= lclM.getRound().getName() %> game between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %></a> is in the middle of being entered in your <%= lclS.getStaffAssignmentSet().size() > 1 ? "rooms" : "room" %>.</p><%
				} else if (lclInProcess.size() > 1) {
					%><h2>In Process</h2>
					<p>These matches are in the middle of being entered in your <%= lclS.getStaffAssignmentSet().size() > 1 ? "rooms" : "room" %>:</p>
					<ul><%
						for (Match lclM : lclInProcess) {
							%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %></a></li><%
						}
					%></ul><%
				}
				
				List<Match> lclNotReady = lclCandidatesByStatus.get(MatchStatus.NO_DATA);
				if (lclNotReady.size() == 1) {
					Match lclM = lclNotReady.iterator().next();
					%><h2>Later</h2>
					<p>Eventually you’ll have <a href="sides.jsp?match_id=<%= lclM.getId() %>">the <%= lclM.getRound().getName() %> game between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %></a>.</p><%
				} else if (lclNotReady.size() > 1) {
					%><h2>Later</h2>
					<p>These matches are coming up in your <%= lclS.getStaffAssignmentSet().size() > 1 ? "rooms" : "room" %>:</p>
					<ul><%
						for (Match lclM : lclNotReady) {
							%><li><a href="sides.jsp?match_id=<%= lclM.getId() %>"><%= lclM.getRound().getName() %> between <%= lclM.getWinningCard().getName() %> and <%= lclM.getLosingCard().getName() %></a></li><%
						}
					%></ul><%
				}
				
				%><p>If you don’t see the match you’re looking to work on, you might try the <a href="all.jsp?object=<%= lclT.getUniqueString() %>">list of all matches</a>.</p><%
			}
		}
	%></div>
</div>

<jsp:include page="/template/footer.jsp" />