<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information Details</title>
</head>
<body>
<%@include file="includes/includer.html"%>
<%@include file="includes/header.html"%>


	<div class="bodyContent">
	<h1>Personal Details</h1>
		<div class="row">
			<div class="col-sm-3">
			<img alt="advertise" src="advertisement.jpg" width="50px" height="100px"/>
			</div>
			<div class="col-sm-5">

			<div class="tab">
  				<button  class="tablinks"  onclick="opentab(event, 'User Details') ">User Details</button>
  				<button class="tablinks" onclick="opentab(event, 'Personal Details')">Personal Details</button>
  				<button class="tablinks" onclick="opentab(event, 'Other Details')">Other Details</button>
			</div>

				<div id="User Details" class="tabcontent">
  		
  			<form:form action="${pageContext.request.contextPath}/newuser2" method="post">
					
					<label>Salutation</label><br>
					<form:input type="radio" path="miss" name="salutation" value="miss"/> Miss &nbsp;	&nbsp;	&nbsp;	&nbsp;	
				    <form:input type="radio" path="mrs" name="salutation" value="mrs"/> Mrs &nbsp;	&nbsp;	&nbsp;	&nbsp;	
  					<form:input type="radio" path="ms" name="salutation" value="ms"/> Ms &nbsp;	&nbsp;	&nbsp;	&nbsp;	
  					<form:input type="radio" path="mr" name="salutation" value="mr"/> Mr<br>
  					
					<label>First Name:</label>         			
					<form:input type="text" class="form-control" path="firstName" placeholder="First Name" requried="true"/><br>
					
					<label>Middle Name:</label>         			
					<form:input type="text" class="form-control" path="firstName" placeholder="Middle Name" requried="true"/><br>
					
					<label>Last Name:</label>
					<form:input type="text" class="form-control" path="lastName"  placeholder="Last Name" requried="true"/><br>
					
					<label>Mobile No:</label>
					<form:input type="text" class="form-control" path="Mobile No" placeholder="Mobile No" size="10" requried="true"/><br>
					
				    <form:button type="submit" class="btn btn-default" style="float: right;">Next</form:button><br><br>
				</div>  		
  				
				<div id="Personal Details" class="tabcontent">
					
					<label>Address:</label>
					<form:input type="text" class="form-control" path="Address" placeholder="Address" requried="ture"/><br>
					
					<label>Date Of Birth(DOB):</label>
					<form:input type="date" class="form-control" path="Date Of Birth" placeholder="Date Of Birth" requried="ture"/><br>
				
					<label>Email Address:</label>
					<form:input type="email" class="form-control" path="Email Address" placeholder="Email Address" requried="true"/><br>
					
					<form:button type="submit" class="btn btn-default" style="float: right;">Next</form:button><br><br>
  				</div>

				<div id="Other Details" class="tabcontent">
  					
					<label>Account Type:</label><br>
					<form:input type="radio" name="salutation" path="current" value="current"/> Current &nbsp; &nbsp; &nbsp; &nbsp;	
				    <form:input type="radio" name="salutation" path="saving" value="saving"/> Saving &nbsp; &nbsp; &nbsp; &nbsp;<br>	
  						
  					<label>Enter Adhaar Card No:</label>
					<form:input type="number" class="form-control" path="Adhaar Card No" placeholder="Adhaar Card No" size="10" requried/><br>

					<label>Enter Pan Card No:</label>
					<form:input type="number" class="form-control" path="Pan Card No" placeholder="Pan Card No" size="10" requried/><br>
					
					<label>Nominee Name:</label>
					<form:input type="text" class="form-control" path="nominee Name" placeholder="Nominee Name" requried="true"/><br>
					
					<label>Nominee Relation:</label>
					<form:input type="text" class="form-control" path="nominee Relation" placeholder="Nominee Relation" requried="true"/><br>
					
										
				    <form:input type="submit" path="submiit" class="btn btn-default" style="float: right;"/><br><br>
 		</form:form>
	  				</div>
			</div>
			<div class="col-sm-3">
			<div>
			<img alt="advertise" src="advertisement.jpg" width="50px" height="100px"/>
			</div>
			</div>
		</div>
	</div>
			
<%@include file="includes/footer.html"%>

</body>
</html>
				
<%-- 	<form action="${pageContext.request.contextPath}" method="post">
						
					<!-- Give the OTP nd one time password to user and then following steps  -->
				
					<label>Set UserName:</label>
					<input type="text" class="form-control" path="UserName" placeholder="UserName" requried="true"/><br>
					<label>Set Password:</label>
					<input type="password" class="form-control" path="Password" placeholder="Password" requried="true"/><br>
					<label>Re-Enter Password:</label>
					<input type="password" class="form-control" path="Password" placeholder="Password" requried="true"/><br>
				</form>	
				 --%>