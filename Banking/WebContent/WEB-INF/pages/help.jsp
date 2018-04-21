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
	<%@include file="includes/logoutheader.jsp"%>
	<div class="bodyContent">
	<h3 class="userTitle">Welcome, ${customer.firstName} ${customer.middleName} ${customer.lastName}.</h3>
		<div class="row">
		<div class="col-sm-12">
		
		<div class="panel panel-danger">
			<div class="panel-heading"><h3>FAQs</h3></div>
		</div>
		</div>
		
			<div class="col-sm-8">
				<div class="col-sm-4">
				
				<h3 align="center"><b>How long does it take to activate my new account ?</b></h3>
				
				
					<h4 class="qoutes">
						<i>Opening an account takes less than 90 seconds. After that you can access the services provided by bank.</i><br>
					</h4>
							
				
				
				</div>
				
							
					<div class="col-sm-4">
				
				<h3 align="center"><b>I've forgotten my password ?</b></h3>
				
				
					<h4 class="qoutes">
						<i>You can regain your password by tapping 'Forget Password' on the login screen. After entering the details your new password will be mailed to you.  </i><br>
					</h4>
							
				
				
				
				</div>
				
				<div class="col-sm-4">
				
				<h3 align="center"><b>I'm changing my Email address ?</b></h3>
				
				
					<h4 class="qoutes">
						<i>You'll need to update your profile information so that you can receive notifications for security purposes.
						You can change your Email address at any time from your Profile.</i><br>
					</h4>
							
				
				
				</div>
	 			</div>
			<div class="col-sm-4">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/adverAbu.jpg" width="100%" height="500px"/>
			</div>
		</div>
  </div>
  
	<%@include file="includes/footer.html"%>
</body>
</html>