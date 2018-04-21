<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: Home</title>
</head>
<body>
	<%@include file="includes/logoutheader.jsp"%>
	
	<div class="bodyContent">
	<h3 class="userTitle">Welcome, ${customer.firstName} ${customer.middleName} ${customer.lastName}.</h3>
		<div class="row">
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>
			<div class="col-sm-7">
				
					<div class="panel panel-primary">
					<div class="panel-heading">Account Details</div>
				</div>	
					<table width="100%" border="2px;">
						<tr >
							<th>Account's</th>
							<th id="accountTable">Account Type</th>
							<th id="accountTable">Account Number</th>
							<th id="accountTable">Current Balance</th>
						</tr>
						<c:forEach varStatus="i" var="account" items="${customer.accounts}" >
						<tr>
							<th>${i.index + 1}</th>
							<th id="accountTable"><label>${account.accountType}</label></th>
							<th id="accountTable"><label>${account.accountNumber}</label></th>
							<th id="accountTable"><label>${account.balance}</label></th>
						</tr>
						</c:forEach>
					</table>
					<br>
					<div class="panel panel-primary">
						<div class="panel-heading">Quick Access</div>
					</div>	
					
					<table>
						<tr>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/myprofile"><img src="${pageContext.request.contextPath}/resources/images/myprofile.jpg"  class="img-rounded" alt="MyProfile" width="38%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/transaction"><img src="${pageContext.request.contextPath}/resources/images/transaction.jpg" class="img-rounded" alt="Transaction" width="38%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/setting"><img src="${pageContext.request.contextPath}/resources/images/settings.jpg" class="img-rounded" alt="EditAccount" width="38%" height="30%"/></a></td>
						</tr>
						<tr>
							<td align="center" colspan="2"><h3>My Profile</h3></td>
							<td align="center" colspan="2"><h3>Transaction</h3></td>
							<td align="center" colspan="2"><h3>Setting</h3></td>
						</tr>
						
						<tr>	
							 <td align="center" colspan="2"><a href="${pageContext.request.contextPath}/mobilerecharge"><img src="${pageContext.request.contextPath}/resources/images/mobilerecharge.jpg" class="img-rounded" alt="MobileRecharge" width="38%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/dthrecharge.png"><img src="${pageContext.request.contextPath}/resources/images/Dthrecharge.jpg" class="img-rounded" alt="DTHRecharge" width="36%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/electricityrecharge"><img src="${pageContext.request.contextPath}/resources/images/electricityrechrge.jpg" class="img-rounded" alt="OtherRecharge" width="38%" height="30%"/></a></td>
						</tr>
						<tr>
							<td align="center" colspan="2"><h3>Mobile Recharge</h3></td>
							<td align="center" colspan="2"><h3>DTH Recharge</h3></td>
							<td align="center" colspan="2"><h3>Electricity Recharge</h3></td>
						</tr>
						
						
					</table>
					
			</div>

			<div class="col-sm-2">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						