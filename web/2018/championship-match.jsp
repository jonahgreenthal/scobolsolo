﻿<%@ page import="com.scobolsolo.application.TournamentFactory" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="2018" />
	<jsp:param name="pageTitle" value="Championship Match" />
	<jsp:param name="topMenu" value="<%= Menus.stats(TournamentFactory._2018()).asTopLevel().output(request, \"championship-match\") %>" />
	<jsp:param name="h1" value="Championship Match" />
</jsp:include>

<div class="row">
	<div class="small-12 columns">
		<p>The participants in the Championship Match are the one player who won all 7 preliminary matches (the Morning Champion), the seven players who won 6 of their preliminary matches, and the (one) player who had the highest points per tossup heard among those who won 5 of their preliminary matches.</p>
		
		<p>Unlike in the preliminary rounds, all incorrect answers result in a deduction of 1&nbsp;point. This is true regardless of whether the incorrect answer interrupted the question; it is thus different from ordinary “negs”.</p>
		
		<p>Each player starts with 3&nbsp;points. A player whose score reaches 0 is immediately removed from the match.</p>
		
		<p>If any player reaches a score of 10 during the first 20&nbsp;tossups, they sit out until tossup&nbsp;21.</p>
		
		<p>The Morning Champion sits out for the first 20&nbsp;tossups, and enters at tossup&nbsp;21 with a score equal to that of the leader at that time. After tossup&nbsp;40, the lowest-scoring players are removed until four remain; if necessary, tiebreaker tossups are used, but they do not count in the overall score of the championship match. After tossup&nbsp;50, the lowest-scoring remaining players are eliminated until two remain; the tiebreaker procedure is the same as before. At the conclusion of the match, tiebreaker tossups are read if and as necessary.</p>
		
		<table class="even-spacing unsortable championship-scoresheet">
			<thead>
				<tr class="player-names">
					<th>&nbsp;</th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1311#player_2606">Kevin Kodama</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1301#player_2590">Olivia Lamberti</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1297#player_2630">Ethan Strombeck</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1298#player_2598">Aristotle Vainikos</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1314#player_2689">Hanson Hao</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1301#player_2589">Govind Prabhakar</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1302#player_2612">Jonathan Lau</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1302#player_2610">Dylan Bowman</a></th>
					<th class="player-name"><a href="/stats/player-detail.jsp?school_registration_id=1307#player_2693">Tom&aacute;s Aguilar-Fraga</a></th>
					<th class="answer" rowspan="2">Answer</th>
				</tr>
				<tr class="player-schools">
					<th>&nbsp;</th>
					<th class="player-school">Oak Park-River Forest</th><!-- Kevin -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Olivia -->
					<th class="player-school">Auburn (Rockford)</th><!-- Ethan -->
					<th class="player-school">Sandburg (Orland Park)</th><!-- Aristotle -->
					<th class="player-school">IMSA (Aurora)</th><!-- Hanson -->
					<th class="player-school">Stevenson (Lincolnshire)</th><!-- Govind -->
					<th class="player-school">University Lab (Urbana)</th><!-- Jonathan -->
					<th class="player-school">University Lab (Urbana)</th><!-- Dylan -->
					<th class="player-school">Saint Joseph (South Bend, Indiana)</th><!-- Tomas -->
				</tr>
			</thead>
			<tbody>
				<tr class="score-check">
					<th class="score-check-label">Initial scores</th>
					<td class="player-score-check">&nbsp;</td><!-- Kevin -->
					<td class="player-score-check">3</td><!-- Olivia -->
					<td class="player-score-check">3</td><!-- Ethan -->
					<td class="player-score-check">3</td><!-- Aristotle -->
					<td class="player-score-check">3</td><!-- Hanson -->
					<td class="player-score-check">3</td><!-- Govind -->
					<td class="player-score-check">3</td><!-- Jonathan -->
					<td class="player-score-check">3</td><!-- Dylan -->
					<td class="player-score-check">3</td><!-- Tomas -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr>
					<th class="question-number">1</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">&#8220;The Idea of Order at Key West&#8221;</td>
				</tr>
				<tr>
					<th class="question-number">2</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">First Battle of Bull Run</td>
				</tr>
				<tr>
					<th class="question-number">3</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Bah&aacute;&#8217;i</td>
				</tr>
				<tr>
					<th class="question-number">4</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Reynolds number</td>
				</tr>
				<tr>
					<th class="question-number">5</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Sweeney Todd</td>
				</tr>
				<tr>
					<th class="question-number">6</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Margaret Chase Smith</td>
				</tr>
				<tr>
					<th class="question-number">7</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Rosalind</td>
				</tr>
				<tr>
					<th class="question-number">8</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">triangular numbers</td>
				<tr>
					<th class="question-number">9</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Max Weber</td>
				</tr>
				<tr>
					<th class="question-number">10</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">trumpet</td>
				</tr>
				<tr>
					<th class="question-number">11</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Pablo Escobar</td>
				</tr>
				<tr>
					<th class="question-number">12</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-incorrect-response">&minus;1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">molecular orbital theory</td>
				</tr>
				<tr>
					<th class="question-number">13</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Uganda (in history)</td>
				</tr>
				<tr>
					<th class="question-number">14</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-incorrect-response">&minus;1</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Istanbul (in literature)</td>
				</tr>
				<tr>
					<th class="question-number">15</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Armenian genocide</td>
				</tr>
				<tr>
					<th class="question-number">16</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">sex determination</td>
				</tr>
				<tr>
					<th class="question-number">17</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Mary Cassatt</td>
				</tr>
				<tr>
					<th class="question-number">18</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Annie Proulx</td>
				</tr>
				<tr>
					<th class="question-number">19</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Serengeti National Park</td>
				</tr>
				<tr>
					<th class="question-number">20</td>
					<td class="player-not-in-game">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Cambrian Period</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 20</th>
					<td class="player-score-check">&nbsp;</td><!-- Kevin -->
					<td class="player-score-check">3</td><!-- Olivia -->
					<td class="player-score-check">6</td><!-- Ethan -->
					<td class="player-score-check">6</td><!-- Aristotle -->
					<td class="player-score-check">7</td><!-- Hanson -->
					<td class="player-score-check">4</td><!-- Govind -->
					<td class="player-score-check">6</td><!-- Jonathan -->
					<td class="player-score-check">5</td><!-- Dylan -->
					<td class="player-score-check">3</td><!-- Tomas -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">Kevin Kodama, as Morning Champion, entered the game with a score equal to that of the then-leader, Hanson Hao: 7.</td>
				</tr>
				<tr>
					<th class="question-number">21</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-correct-response">1</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Peter Debye</td>
				</tr>
				<tr>
					<th class="question-number">22</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Charles Bukowski</td>
				</tr>
				<tr>
					<th class="question-number">23</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-correct-response">1</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Acadia National Park</td>
				</tr>
				<tr>
					<th class="question-number">24</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-incorrect-response">&minus;1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">China (in painting)</td>
				</tr>
				<tr>
					<th class="question-number">25</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Cleon</td>
				</tr>
				<tr>
					<th class="question-number">26</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">hash table</td>
				</tr>
				<tr>
					<th class="question-number">27</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">cows (in Celtic mythology)</td>
				</tr>
				<tr>
					<th class="question-number">28</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Menander</td>
				</tr>
				<tr>
					<th class="question-number">29</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Great Zimbabwe</td>
				</tr>
				<tr>
					<th class="question-number">30</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">restriction enzymes</td>
				</tr>
				<tr>
					<th class="question-number">31</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">France (in film)</td>
				</tr>
				<tr>
					<th class="question-number">32</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-correct-response">1</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Jim Jordan</td>
				</tr>
				<tr>
					<th class="question-number">33</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Robert Hayden</td>
				</tr>
				<tr>
					<th class="question-number">34</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">cubing</td>
				</tr>
				<tr>
					<th class="question-number">35</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Cleveland (in history)</td>
				</tr>
				<tr>
					<th class="question-number">36</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Hannah Arendt</td>
				</tr>
				<tr>
					<th class="question-number">37</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-correct-response">1</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer"><i>Orlando</i> (the Virginia Woolf novel)</td>
				</tr>
				<tr>
					<th class="question-number">38</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Finland (in music)</td>
				</tr>
				<tr>
					<th class="question-number">39</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-correct-response">1</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">Solidarity</td>
				</tr>
				<tr>
					<th class="question-number">40</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-no-response">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-no-response">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-no-response">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-no-response">&nbsp;</td><!-- Dylan -->
					<td class="player-no-response">&nbsp;</td><!-- Tomas -->
					<td class="answer">esters</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 40</th>
					<td class="player-score-check">9</td><!-- Kevin -->
					<td class="player-score-check">5</td><!-- Olivia -->
					<td class="player-score-check">9</td><!-- Ethan -->
					<td class="player-score-check">7</td><!-- Aristotle -->
					<td class="player-score-check">11</td><!-- Hanson -->
					<td class="player-score-check">6</td><!-- Govind -->
					<td class="player-score-check">7</td><!-- Jonathan -->
					<td class="player-score-check">6</td><!-- Dylan -->
					<td class="player-score-check">3</td><!-- Tomas -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The five players with the lowest scores were to be eliminated. Govind Prabhakar, Dylan Bowman, and Tom&aacute;s Aguilar-Fraga were thus eliminated. A tiebreaker was held to determine whether Aristotle Vainikos or Jonathan Lau would remain in the game; Jonathan answered the first tiebreaker correctly, so Aristotle was eliminated. Thus, Kevin Kodama, Ethan Strombeck, Hanson Hao, and Jonathan Lau remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">41</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Henry&#8217;s law</td>
				</tr>
				<tr>
					<th class="question-number">42</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">&Eacute;mile Zola</td>
				</tr>
				<tr>
					<th class="question-number">43</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">John Bolton</td>
				</tr>
				<tr>
					<th class="question-number">44</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Mohammad Reza Shah Palavi</td>
				</tr>
				<tr>
					<th class="question-number">45</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&minus;1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">magnetic permeability</td>
				</tr>
				<tr>
					<th class="question-number">46</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Wilkie Collins</td>
				</tr>
				<tr>
					<th class="question-number">47</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-correct-response">1</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Pyotr Ilyich Tchaikovsky</td>
				</tr>
				<tr>
					<th class="question-number">48</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Mahavira</td>
				</tr>
				<tr>
					<th class="question-number">49</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Queen Anne</td>
				</tr>
				<tr>
					<th class="question-number">50</td>
					<td class="player-incorrect-response">&minus;1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-no-response">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-no-response">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">matrix inverse</td>
				</tr>
				<tr class="score-check">
					<th class="score-check-label">Scores through 50</th>
					<td class="player-score-check">13</td><!-- Kevin -->
					<td class="player-eliminated">eliminated</td><!-- Olivia -->
					<td class="player-score-check">11</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle-->
					<td class="player-score-check">12</td><!-- Hanson -->
					<td class="player-eliminated">eliminated</td><!-- Govind -->
					<td class="player-score-check">7</td><!-- Jonathan -->
					<td class="player-eliminated">eliminated</td><!-- Dylan -->
					<td class="player-eliminated">eliminated</td><!-- Tomas -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
				<tr class="note">
					<th>&nbsp;</th>
					<td colspan="9" class="note">
						The two players with the lowest scores were eliminated: Ethan Strombeck and Jonathan Lau. Thus, Kevin Kodama and Hanson Hao remained.
					</td>
				</tr>
				<tr>
					<th class="question-number">51</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Sandra Cisneros</td>
				</tr>
				<tr>
					<th class="question-number">52</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Beethoven&#8217;s piano sonatas</td>
				</tr>
				<tr>
					<th class="question-number">53</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">endosymbiosis</td>
				</tr>
				<tr>
					<th class="question-number">54</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Boudicca</td>
				</tr>
				<tr>
					<th class="question-number">55</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Armenia (in geography)</td>
				</tr>
				<tr>
					<th class="question-number">56</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">flowers (in literature)</td>
				</tr>
				<tr>
					<th class="question-number">57</td>
					<td class="player-correct-response">1</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-no-response">&nbsp;</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">William Herschel</td>
				</tr>
				<tr>
					<th class="question-number">58</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&minus;1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Austria</td>
				</tr>
				<tr>
					<th class="question-number">59</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-correct-response">1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Arabic (in philosophy)</td>
				</tr>
				<tr>
					<th class="question-number">60</td>
					<td class="player-no-response">&nbsp;</td><!-- Kevin -->
					<td class="player-not-in-game">&nbsp;</td><!-- Olivia -->
					<td class="player-not-in-game">&nbsp;</td><!-- Ethan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Aristotle -->
					<td class="player-incorrect-response">&minus;1</td><!-- Hanson -->
					<td class="player-not-in-game">&nbsp;</td><!-- Govind -->
					<td class="player-not-in-game">&nbsp;</td><!-- Jonathan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Dylan -->
					<td class="player-not-in-game">&nbsp;</td><!-- Tomas -->
					<td class="answer">Slaughterhouse cases</td>
				</tr>
			</tbody>
			<tfoot>
				<tr class="score-check">
					<th class="score-check-label">Final scores</th>
					<td class="player-score-check">17</td><!-- Kevin -->
					<td class="player-eliminated">eliminated</td><!-- Olivia -->
					<td class="player-eliminated">eliminated</td><!-- Ethan -->
					<td class="player-eliminated">eliminated</td><!-- Aristotle -->
					<td class="player-score-check">14</td><!-- Hanson -->
					<td class="player-eliminated">eliminated</td><!-- Govind -->
					<td class="player-eliminated">eliminated</td><!-- Jonathan -->
					<td class="player-eliminated">eliminated</td><!-- Dylan -->
					<td class="player-eliminated">eliminated</td><!-- Tomas -->
					<td class="answer-blank">&nbsp;</td>
				</tr>
			</tfoot>
		</table>
		
		<p>Kevin Kodama of Oak Park and River Forest High School is the champion of the 2018 Scobol Solo. He is the first player from OPRF to win the tournament. The previous best finishes by OPRF players were second place (<a href="/stats/player-detail.jsp?school_registration_id=1119#player_1550">Kevin himself</a>, 2017; <a href="/stats/player-detail.jsp?school_registration_id=1215#player_2142">Ben Carbery</a>, 2010).</p>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />
