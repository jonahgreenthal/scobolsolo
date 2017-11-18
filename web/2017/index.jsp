﻿<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2017" />
	<jsp:param name="pageTitle" value="Scobol Solo 2017" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2017()).asTopLevel().output(request, \"home\") %>" />
	<jsp:param name="h1" value="Scobol Solo 2017" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>Scobol Solo 2017 was held on Saturday, October&nbsp;28. There were 125 players from 29 schools.</p>
		
		<table class="tournament-final-standings">
			<caption style="caption-side: top;">The nine players who made the Championship Match finished as follows:</p>
			<tbody>
				<tr>
					<th class="rank">1.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1122#player_1621">Ethan Strombeck</a></th>
					<td class="school">Auburn (Rockford)</td>
					<td class="note">Morning champion</td>
				</tr>
				<tr>
					<th class="rank">2.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1119#player_1550">Kevin Kodama</a></th>
					<td class="school">Oak Park-River Forest</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">3.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1118#player_1549">Mitch McCullar</a></th>
					<td class="school">Williamsville</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">4.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1141#player_1601">Aristotle Vainikos</a></th>
					<td class="school">Carl Sandburg (Orland Park)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">5T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1131#player_1653">Matthew Lee</a></th>
					<td class="school">IMSA (Aurora)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1124#player_1635">Jaden Lucas</a></th>
					<td class="school">Carbondale</td></td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1142#player_1661">Arjun Nageswaran</a></th>
					<td class="school">Stevenson (Lincolnshire)</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">8T.</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1125#player_1560">Ana Pranger</a></th>
					<td class="school">Latin School of Chicago</td>
					<td class="note">&nbsp;</td>
				</tr>
				<tr>
					<th class="rank">&nbsp;</th>
					<th class="player"><a href="/stats/player-detail.jsp?school_registration_id=1123#player_1559">Wilder Seitz</a></th>
					<td class="school">Barrington</td>
					<td class="note">&nbsp;</td>
				</tr>
			</tbody>
		</table>
		
		<p>The full <a href="/stats/standings.jsp?object=2017">preliminary results</a> are available, as is the <a href="championship-match.jsp">championship match scoresheet</a>.</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />