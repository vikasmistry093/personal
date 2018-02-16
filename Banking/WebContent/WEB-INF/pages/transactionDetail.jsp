<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@include file="includes/includer.html"%>

<table id="passbook">
	<thead>
		<tr>
			<th>Transaction Date</th>
			<th>Benficiary Account Number</th>
			<th>Benficiary Name</th>
			<th>Description</th>
			<th>Transaction Type</th>
			<th>Transaction Amount</th>
		</tr>
	</thead>
	
	<tbody>
		<c:forEach var="trans" items="${transactionDetails}">
			<tr>
				<td>${trans.transactionDate}</td>
				<td>${trans.benificiaryAccNo }</td>
				<td>${trans.benificiaryName }</td>
				<td>${trans.description }</td>
				<td>${trans.transactionType }</td>
				<td>${trans.transactionAmount }</td>
			</tr>
			<tr>
				<td>${trans.transactionDate}</td>
				<td>${trans.benificiaryAccNo }</td>
				<td>${trans.benificiaryName }</td>
				<td>${trans.description }</td>
				<td>${trans.transactionType }</td>
				<td>${trans.transactionAmount }</td>
			</tr>
		</c:forEach>
	</tbody>
</table>