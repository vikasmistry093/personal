<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: My Profile</title>
</head>
<body>
	<%@include file="includes/logoutheader.html"%>
	<div class="bodyContent">
		<h1>Welcome ${username}</h1>
		<div class="row">
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">${username} Details </div>
				</div>	
					<table>
						<tr>
							<td><th colspan="4"><h3>Personal Details </h3></th>
						</tr>

						<tr>	
							<td colspan="2">
								<label>User Name: ${firstname} ${middelname} ${lastname}</label>
							</td>
							
							<td>
								<label>Account Type: ${accounttype}</label>
							</td>
							
							<td>
								<label>Last Time Logged In: ${lastLoginTime}</label>
							</td>
						</tr>
						
						<tr>
							<td colspan="2">
								<label>Account Number: ${accountNumber}</label>
							</td>
							<td colspan="2">
								<label>Current Balance: ${balance}</label>
							</td>	
						</tr>
						
						<tr>
							<td colspan="2">
								<label>Address: ${address}</label><a href="#">edit</a>
							</td>
							<td colspan="2">
								<label>DOb: ${dob}</label>
							</td>
						</tr>
						
						<tr>
							<td colspan="2">
								<label>Mobile Number: ${mobilenumber}</label><a href="#">edit</a>
							</td>
							<td colspan="2">
								<label>Email Address: ${email}</label><a href="#">edit</a>
							</td>
						</tr>
						
						<tr>
							<td><th colspan="4"><h3>Other Details </h3></th>
						</tr>
						
						<tr>
							<td colspan="2">
								<label>Aadhaar Card Number: ${aadharcard}</label>
							</td>
							<td colspan="2">
								<label>Pancard Number: ${pancard}</label>
							</td>
						</tr>
						
						<tr>
							<td><th colspan="4"><h3>Nominee Details </h3></th>
						</tr>
						
						<tr>
							<td colspan="2">
								<label>Nominee Name: ${nomineeName}</label>
							</td>
							<td colspan="2">
								<label>Nominee Relation: ${nomineeRelation}</label>
							</td>
						</tr>
					</table>
			</div>

			<div class="col-sm-3">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						