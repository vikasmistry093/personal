<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>16ane.com : Log In</title>
</head>
<body>
<%@ include file="header.jsp"%>

<div class="login-row row">
<div class="col-md-4"></div>
<div class="col-md-4">
	<img alt="logo" src="${pageContext.request.contextPath}/images/logo.jpg" width="250" height="125">
</div>
<div class="col-md-4"></div>
</div>
<br />
<form:form action="/registerUser?url=${url}" modelAttribute="user">
<div class="row">
	<div class="col-md-2"></div>
	<div class="col-md-4">
		<table>
			<tr>
				<th colspan="2"><h3>User Details</h3></th>
			</tr>
			<tr>
				<th><label>Name :</label></th>
				<th><form:input class="form-control" path="name"/></th>
			</tr>
			<tr>
				<th><label>Email :</label></th>
				<th><form:input class="form-control" path="email"/></th>
			</tr>
			<tr>
				<th><label>Contact :</label></th>
				<th><form:input class="form-control" path="contact"/></th>
			</tr>
			<tr>
				<th><label>Password :</label></th>
				<th><form:input type="password" class="form-control" path="password"/></th>
			</tr>
			<tr>
				<th><label>Confirm Password :</label></th>
				<th><input type="password" class="form-control"/></th>
			</tr>
			</table>
	</div>
	<div class="col-md-4">
	<table>
		<tr>
				<th colspan="2"><h3>Delivered Address</h3></th>
			</tr>
			<tr>
				<th><label>Street :</label></th>
				<th><form:input class="form-control" path="userAddress[0].street"/></th>
			</tr>
			<tr>
				<th><label>LandMark :</label></th>
				<th><form:input class="form-control" path="userAddress[0].landMark"/></th>
			</tr>
			<tr>
				<th><label>City :</label></th>
				<th><form:input class="form-control" path="userAddress[0].city"/></th>
			</tr>
			<tr>
				<th><label>State :</label></th>
				<th><form:input class="form-control" path="userAddress[0].state"/></th>
			</tr>
			<tr>
				<th><label>Pin :</label></th>
				<th><form:input class="form-control" path="userAddress[0].pin"/></th>
			</tr>
			</table>
	</div>
<div class="col-md-2"></div>
</div>

<div class="login-row row">
<div class="col-md-2"></div>
<div class="col-md-4">
	<table>
		<tr>
			<th><button type="reset" class="form-control" value="Reset">Reset</button></th>
		</tr>
	</table>
</div>
<div class="col-md-4">
	<table>
		<tr>
			<th><button type="submit" class="form-control" value="Register">Register</button></th>
		</tr>
	</table>
</div>
<div class="col-md-2"></div>
</div>
</form:form>


<%@ include file="footer.jsp"%>
</body>
</html>