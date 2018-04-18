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
				
				<h3 align="center"><b>GOOD NEWS TRAVELS FAST, REALLY FAST.</b></h3>
				
				
					<h4 class="qoutes">
						<i>Customer can open an zero balance accounts and at best available interest rate, hoping superior customer experience will win the day.</i><br>
					</h4>
							
							<h4 align="right"> <b>~ Anonymous</b></h4><br>
							
					<h4 class="qoutes">
					<i>Customers can open accounts and access services from our website without visiting a branch.</i><br>
					</h4>			
							
							<h4 align="right"><b>~ Anonymous</b></h4><br>
							
					<h4 class="qoutes">
					<i>Banking services require minimum amount of documentation,which totally reduces the paper work.</i><br>
					</h4>		
							<h4 align="right"><b>~ Anonymous</b></h4><br>
				
				
	 			</div>
			<div class="col-sm-3">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/bankbannerad.jpg" width="100%" height="500px"/>
			</div>
		</div>
  </div>
  
	<%@include file="includes/footer.html"%>
</body>
</html>