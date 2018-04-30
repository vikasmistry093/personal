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

<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4">
	<form:form action="/validateLoggedUser?url=${url}" modelAttribute="user">
		<table>
			<tr>
				<th><label>Email :</label></th>
				<th><form:input class="form-control" path="email"/></th>
			</tr>
			<tr>
				<th><label>Password :</label></th>
				<th><form:input type="password" class="form-control" path="password"/></th>
			</tr>
			<tr>
				<th><button type="button" class="login-signup form-control" value="Sign Up" onclick="signUp()">Sign Up</button></th>
				<th><button type="submit" class="login-signin form-control" value="Sign In">Sign In</button></th>
			</tr>
			<tr>
				<th colspan="2"><a href="javascript:;">Forgot your password?</a></th>
			</tr>
		</table>
	</form:form>
</div>
<div class="col-md-4"></div>
</div>

<%@ include file="footer.jsp"%>
</body>
</html>