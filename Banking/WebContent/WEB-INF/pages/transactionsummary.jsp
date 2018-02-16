<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: Transaction Summary</title>
</head>
<body>
	<%@include file="includes/logoutheader.jsp"%>
	<div class="bodyContent">
		<div class="row">

			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-7">
				<div class="panel panel-primary">
					<div class="panel-heading">Transaction Summary</div>
				</div>
				<div class="panel-body">
					<table>
						<tr>
							<td>Select Account Number: </td>
							<td>
								<select id="transactionAcountNumber" onchange="getPassbookByAccount();">
									<option value="0" selected="selected">--- Selected ---</option>
									<c:forEach var="account" items="${customer.accounts }">
										<option value="${account.accountNumber }">${account.accountNumber }</option>
									</c:forEach>
								</select>
							</td>
						</tr>
					</table>
					
					<div id="trasactionSummary">  </div>
					
				</div>
			</div>

			<div class="col-sm-2">
				<img id="advertise"
					src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" />
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
</body>
</html>