﻿<%@ page import="java.text.DecimalFormat" %>
<%@ page import="java.util.Arrays" %>
<%@ page import="java.util.Map" %>
<%@ page import="java.util.SortedSet" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.stream.Collectors" %>
<%@ page import="org.apache.commons.lang3.Validate" %>
<%@ page import="com.google.common.collect.RowSortedTable" %>
<%@ page import="com.google.common.collect.TreeBasedTable" %>
<%@ page import="com.google.common.collect.SortedSetMultimap" %>
<%@ page import="com.google.common.collect.TreeMultimap" %>
<%@ page import="com.siliconage.util.Tally" %>
<%@ page import="com.opal.ImplicitTableDatabaseQuery" %>
<%@ page import="com.scobolsolo.application.*" %>
<%@ page import="com.scobolsolo.menu.Menus" %>

<%
Tournament lclT = Validate.notNull(TournamentFactory.getInstance().forUniqueString(request.getParameter("object")));

DecimalFormat lclDF = new DecimalFormat("0.00");
%>

<jsp:include page="/template/header.jsp">
	<jsp:param name="tournamentCode" value="<%= lclT.getCode() %>" />
	<jsp:param name="pageTitle" value="Conversion by Question" />
	<jsp:param name="topMenu" value="<%= Menus.stats(lclT).asTopLevel().output(request, \"conversion-by-question\") %>" />
	<jsp:param name="h1" value="Conversion by Question" />
</jsp:include>

<style type="text/css">
	.packet-public {
		/* Nothing unusual */
	}
	
	.packet-not-public {
		color: #999;
	}
</style>

<div class="row">
	<div class="small-12 large-9 columns"><%
		List<ResponseType> lclRTs = ResponseTypeFactory.getInstance().streamAll()
			.filter(ResponseType::isShowInReports)
			.sorted()
			.collect(Collectors.toList());
		Tally<ResponseType> lclRTTally = new Tally<>();
		
		List<Round> lclRounds = lclT.getRounds(); // comes pre-sorted
		for (Round lclR : lclRounds) {
			%><h2 id="round_<%= lclR.getId() %>" data-magellan-target="round_<%= lclR.getId() %>"><%= lclR.getName() %></h2><%
			Packet lclP = lclR.getPacket();
			
			if (lclP.isQuestionsPublic()) {
				%><table class="responsive">
					<thead>
						<tr>
							<th>#</th>
							<th>Question</th>
							<th>Category</th><%
							for (ResponseType lclRT : lclRTs) {
								%><th><%= lclRT.getShortName() %></th><%
							}
							%>
							<th><abbr title="points per 20 tossups heard">PP20TUH</abbr></th>
						</tr>
					</thead>
					<tbody><%
						List<PlacementConversionV> lclPCVs = new ArrayList<>();
						PlacementConversionVFactory.getInstance().acquireForQuery(
							lclPCVs,
							new ImplicitTableDatabaseQuery("tournament_code = ? AND placement_id IN (SELECT id FROM Placement WHERE packet_id = ?)", lclT.getCode(), lclP.getIdAsObject())
						);
						
						RowSortedTable<Placement, ResponseType, Integer> lclTable = TreeBasedTable.create();
						for (PlacementConversionV lclPCV : lclPCVs) {
							lclTable.put(lclPCV.getPlacement(), lclPCV.getResponseType(), lclPCV.getResponseTypeCountAsObject());
						}
						
						for (Map.Entry<Placement, Map<ResponseType, Integer>> lclEntry : lclTable.rowMap().entrySet()) {
							Placement lclPL = lclEntry.getKey();
							Map<ResponseType, Integer> lclRTMap = lclEntry.getValue();
							%><tr>
								<th><%= lclPL.getNumber() %></th>
								<th><%= lclPL.getQuestion().getDescription() %></th>
								<th><%= lclPL.getQuestion().getCategory().getName() %></th><%
								int lclPoints = 0, lclHeard = 0;
								for (ResponseType lclRT : lclRTs) {
									Integer lclResponseCount = lclRTMap.get(lclRT);
									if (lclResponseCount != null) {
										if (lclRT.isAttempt()) {
											lclPoints += lclResponseCount.intValue() * lclRT.getPoints();
											lclHeard += lclResponseCount.intValue();
										}
										
										for (int lclI = 1; lclI <= lclResponseCount.intValue(); ++lclI) {
											lclRTTally.tally(lclRT);
										}
									}
									%><td><%= lclResponseCount == null ? "0" : lclResponseCount %></td><%
								}
								%><td><%
									if (lclHeard > 0) {
										%><%= lclDF.format(20.0d * lclPoints / lclHeard) %><%
									} else {
										%>-<%
									}
								%></td>
							</tr><%
						}
					%></tbody>
					<tfoot>
						<tr>
							<th colspan="3">Total</th><%
							int lclPoints = 0, lclHeard = 0;
							for (ResponseType lclRT : lclRTs) {
								int lclCount = lclRTTally.get(lclRT);
								if (lclRT.isAttempt()) {
									lclPoints += lclCount * lclRT.getPoints();
									lclHeard += lclCount;
								}
								%><td><%= lclCount %></td><%
							}
							%><td><%
								if (lclHeard > 0) {
									%><%= lclDF.format(20.0d * lclPoints / lclHeard) %><%
								} else {
									%>-<%
								}
							%></td>
						</tr>
					</tfoot>
				</table><%
			} else {
				%><p>For question security reasons, these data are not yet publicly available.</p><%
			}
			lclRTTally.clear();
		}
	%></div>
	
	<div class="show-for-large-up large-3 columns">
		<ul class="magellan side-nav no-bullet" data-magellan><%
			for (Round lclR : lclT.getRounds()) {
				Packet lclP = lclR.getPacket();
				String lclClass = lclP.isQuestionsPublic() ? "packet-public" : "packet-not-public";
				%><li class="<%= lclClass %>"><a href="#round_<%= lclR.getId() %>"><%= lclR.getName() %></a></li><%
			}
		%></ul>
	</div>
</div>

<jsp:include page="/template/footer.jsp" />