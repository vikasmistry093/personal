<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="includes/includer.html"%>

<table id="transactionSummary" border="2px;" style="width: 100%">
	<tr>
		<th>Transaction Date</th>
		<th>Benficiary Account Number</th>
		<th>Benficiary Name</th>
		<th>Description</th>
		<th>Transaction Type</th>
		<th>Transaction Amount</th>
	</tr>
	
	<c:forEach var="trans" items="${transactionDetails}">
	<tr>
		<th>${trans.transactionDate}</th>
		<th>${trans.benificiaryAccNo }</th>
		<th>${trans.benificiaryName }</th>
		<th>${trans.description }</th>
		<th>${trans.transactionType }</th>
		<th>${trans.transactionAmount }</th>
	</tr>
	
	</c:forEach>
	
</table>