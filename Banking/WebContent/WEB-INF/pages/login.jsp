<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to ABS Bank</title>
</head>

<body>
	<%@include file="includes/header.jsp"%>
	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-4">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
			</div>
				
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading">USER LOGIN </div>
				</div>
				
				 	<form:form action="${pageContext.request.contextPath}/home" modelAttribute="user" commandName="user" method="post" >
					<div>
					<label>User name:</label>
					<form:input type="text" class="form-control" path="userName" name="userName" placeholder="User Name" /><br>
					<form:errors path="userName" cssClass="error"/><br>
					</div>
					
					<div>
					<label>Password:</label>
					<form:input type="password" class="form-control" path="userPassword" name="userPassword" placeholder="Password"/><br>
					<form:errors path="userPassword" cssClass="error" /><br>
				    </div>
				    
					<form:button type="button" class="btn btn-default" style="float: left;" onclick="getSignUpPage();">Sign Up</form:button> 
			    	<form:button type="submit" class="btn btn-default" style="float: right;">Login</form:button>
				</form:form><br>
	 		</div>
			<div class="col-sm-4">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
			</div>
		</div>
  </div>
  
	<%@include file="includes/footer.html"%>
</body>
</html>