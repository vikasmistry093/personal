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
						<a href="#" class="list-group-item">Account Setting</a> 
						<a href="#" class="list-group-item">Create Loan</a> 
						<a href="#" class="list-group-item">Card Details</a> 
						<a href="#" class="list-group-item">What's New</a>
						<a href="#" class="list-group-item">Help</a>
						<a href="#" class="list-group-item">FAQ'S</a>
						<a href="#" class="list-group-item">About Us</a>
					</div>
				</div>
			</div>

			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">Security Setting</div>
					<table>
						<tr>
							<th colspan="6"><h3>Setting</h3></th>
						</tr>
						<tr>
							<td align="left" colspan="3"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg"  class="img-rounded" alt="notification" width="100%" height="41%"/></td>
							<td align="center" colspan="3"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="general" width="100%" height="41%"/></td>
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
						
						