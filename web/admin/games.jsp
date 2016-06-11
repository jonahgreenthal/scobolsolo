﻿<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Comparator" %>
<%@ page import="com.scobolsolo.application.Game" %>
<%@ page import="com.scobolsolo.application.GameFactory" %>
<%@ page import="com.scobolsolo.application.Match" %>
<%@ page import="com.scobolsolo.application.Performance" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="pageTitle" value="Games" />
	<jsp:param name="pageDescription" value="Game List" />
	<jsp:param name="topMenu" value="<%= Menus.ADMIN().asTopLevel().output(request, \"games\") %>" />
	<jsp:param name="h1" value="Games" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<table class="responsive">
			<thead>
				<tr>
					<th>ID</th>
					<th>Tournament</th>
					<th>Round</th>
					<th>Room</th>
					<th>Players</th>
				</tr>
			</thead>
			<tbody><%
				Game[] lclGames = GameFactory.getInstance().createAllArray();
				Arrays.sort(lclGames, Comparator.comparing(Game::getMatch));
				for (Game lclG : lclGames) {
					Match lclM = lclG.getMatch();
					%><tr>
						<td><a href="game-edit.jsp?game_id=<%= lclG.getId() %>"><%= lclG.getId() %></td>
						<td><%= lclM.getTournament().getShortName() %></td>
						<td><%= lclM.getRound().getShortName() %></td>
						<td><%= lclM.getRoom().getShortName() %></td>
						<td><%
							for (Performance lclP : lclG.createPerformanceArray()) {
								%><%= lclP.getPlayer().getNameWithSchoolShortName() %><br /><%
							}
						%></td>
					</tr><%
				}
			%></tbody>
		</table>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />