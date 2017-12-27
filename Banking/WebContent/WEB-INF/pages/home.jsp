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
	<%@include file="includes/logoutheader.html"%>
	<div class="bodyContent">
		<h1>Welcome Akash Mistry</h1>
		<div class="row">
		
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">Account Summary</div>
					<table>
						
						<tr>
							<td colspan="3"><label>User Name: </label></td>
							<td><label>${username} Akash Anil Mistry</label></td>
						</tr>
						
						<tr>
							<td colspan="3"><label>Mobile Number: </label></td>
							<td><label>${username} 8286515987</label></td>
						</tr>
						
						<tr>
							<td colspan="3"><label>Account Number: </label></td>
							<td><label>${accountNumber} Ak1997</label></td>
						</tr>
						<tr>
							<td  colspan="3"><label>Account Type: </label></td>
							<td><label>${accountType} Saving</label></td>
						</tr>
						<tr>
							<td colspan="3"><label>Current Balance: </label></td>
							<td><label>${currentBalance} 7000</label></td>
						</tr>
					</table>
				</div>
				
				<div class="panel panel-primary">
					<div class="panel-heading">Quick Access</div>

					<table>
						<tr>
							<th colspan="6">Quick Profile</th>
						</tr>
						<tr>
							<td align="left" colspan="2"> <img src="${pageContext.request.contextPath}/resources/images/chase.jpg"  class="img-rounded" alt="MyProfile" width="100%" height="41%"/></td>
							<td align="center" colspan="2"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="Transaction" width="100%" height="41%"/></td>
							<td align="right" colspan="2"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="EditAccount" width="100%" height="41%"/></td>
						</tr>
						<tr>
							<th colspan="6">Quick Recharge</th>
						</tr>
						<tr>	
							 <td align="left" colspan="2"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="MobileRecharge" width="100%" height="41%"/></td>
							<td align="center" colspan="2"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="DTHRecharge" width="100%" height="41%"/></td>
							<td align="right" colspan="2"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="OtherRecharge" width="100%" height="41%"/></td>
						</tr>
					</table>

				</div>
			</div>

			<div class="col-sm-3">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						