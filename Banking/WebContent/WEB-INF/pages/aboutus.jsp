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
		<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/bankbanner.jpg" class="bankbanner" width="100%" height="500px"/>
		</div>
		
			<div class="col-sm-9">
			<div class="col-sm-2"></div>
				<div class="col-sm-6">
				<h3 align="left"><b>MyBank</b></h3>
				
				
					<h4 class="qoutes" align="center">
						<i>MyBank, is an entire bank squeezed to fit into your computer.
						 Our objective? Changing banking the way you know it and reduce the paper word.It let you transfer money within the bank
						 with lightning speed, it also lets you set goals and draw out a plan to achieve them.
						 It's a bank with your interest in mind.</i><br>
						 <i>So save your time, energy and money with MyBank and go about doing what matters most. Live more, bank less.</i><br>
					</h4>
							
							<h4 align="right"> <b>~ MyBank.</b></h4><br>
							
				<div class="col-sm-1"></div>
				
				
				
				</div>
				
					
				
	 			</div>
			<div class="col-sm-3">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/bankbannerad.jpg" width="100%" height="500px"/>
			</div>
		</div>
  </div>
  
	<%@include file="includes/footer.html"%>
</body>
</html>