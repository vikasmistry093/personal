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
	<%@include file="includes/header.html"%>
	<div class="bodyContent">
		<h1>Welcome ${username}</h1>
		<div class="row">
			<div class="col-sm-3">

				<div class="list-group">
					<div class="panel panel-primary">
						<div class="panel-heading" align="center">Menu</div>
						<a href="#" class="list-group-item">My Profile</a> 
						<a href="#" class="list-group-item">PassBook</a> 
						<a href="#" class="list-group-item">Recharge</a> 
						<a href="#" class="list-group-item">Transfer</a> 
						<a href="#" class="list-group-item">Edit Account</a> 
						<a href="#" class="list-group-item">Create Loan</a> 
						<a href="#" class="list-group-item">Card Details</a> 
						<a href="#" class="list-group-item">What's New</a>
						<a href="#" class="list-group-item">Help</a>
						<a href="#" class="list-group-item">FAQ'S</a>
						<a href="#" class="list-group-item">About Us</a>
					</div>
				</div>
			</div>

			<div class="col-sm-5">
				<div class="panel panel-primary">
					<div class="panel-heading">Account Summary</div>
					<table>
						<tr>
							<td><label>User Name:</label><label>${username}</label></td>
						</tr>
						<tr>
							<td><label>Account Number:</label><label>${accountNumber}</label></td>
						</tr>
						<tr>
							<td><label>Account Type:</label><label>${accountType}</label></td>
						</tr>
						<tr>
							<td><label>Current Balance:</label><label>${currentBalance}</label></td>
						</tr>
					</table>
				</div>
			</div>

			<div class="col-sm-5">
				<div class="panel panel-primary">
					<div class="panel-heading">Quick Access</div>
					<!-- 	<table> 
			<tr>
			<th>Quick Profile</th>
			<td>My Profile</td>
			<td>Transaction</td>
			<td>Edit Account</td>
			</tr>
		
			<tr>
			<th>Quick Recharge</th>
			<td>Mobile Recharge</td>
			<td>DTH Recharge</td>
			<td>Other Recharge</td>
			</tr>
			</table>	 -->

					<table>
						<tr>
							<th colspan="3">Quick Profile</th>
						</tr>
						<tr>
							<td align="left"> <img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="MyProfile" width="50" height="50"/></td>
							<td align="center"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="Transaction" width="50" height="50"/></td>
							<td align="right"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="EditAccount" width="50" height="50"/></td>
						</tr>
						<tr>
							<th colspan="3">Quick Recharge</th>
						</tr>
						<tr>	
							 <td align="left"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="MobileRecharge" width="50" height="50"/></td>
							<td align="center"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="DTHRecharge" width="50" height="50"/></td>
							<td align="right"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="OtherRecharge" width="50" height="50"/></td>
						</tr>
					</table>

				</div>
			</div>

			<div class="col-sm-3">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="50px"
					height="100px" />
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						