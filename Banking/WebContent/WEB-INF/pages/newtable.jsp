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
			<form:form action="">
			<table>
			<tr>
			<th><h3>Personal Details</h3></th>
				<td>
					<label>Salutation</label>
					<form:input type="radio" path="miss" name="salutation" value="miss"/> Miss &nbsp;	&nbsp;	&nbsp;	&nbsp;	
				    <form:input type="radio" path="mrs" name="salutation" value="mrs"/> Mrs &nbsp;	&nbsp;	&nbsp;	&nbsp;	
  					<form:input type="radio" path="ms" name="salutation" value="ms"/> Ms &nbsp;	&nbsp;	&nbsp;	&nbsp;	
  					<form:input type="radio" path="mr" name="salutation" value="mr"/> Mr
  				</td>
  				<td>
  				</td>	
  			</tr>		
			
			<tr>
			<td>
			<label>First Name:</label>
			</td>
			<td>
			<label>Middle Name:</label>
			</td>
			<td>
			<label>Last Name:</label>
			</td>
			</tr>
			
			<tr>
			<td>
			<form:input type="text" class="form-control" path="firstName" placeholder="First Name" requried="true"/><br>
			</td>
			<td>
			<form:input type="text" class="form-control" path="firstName" placeholder="Middle Name" requried="true"/><br>
			</td>
			<td>
			<form:input type="text" class="form-control" path="lastName"  placeholder="Last Name" requried="true"/><br>
			</td>
			</tr>				
			
			<tr>
			<td>
			<label>Mobile No:</label>
			</td>
			<td>
			<label>Date Of Birth(DOB):</label>
			</td>
			</tr>
			
			<tr>
			<td>
			<form:input type="number" class="form-control" path="Mobile No" placeholder="Mobile No" size="10" requried="true"/><br>
			</td>
			<td>
			<form:input type="date" class="form-control" path="Date Of Birth" placeholder="Date Of Birth" requried="ture"/><br>
			</td>
			</tr>				
			
			<tr>
			<td>
			<label>Address:</label><br>
			<form:input type="text" class="form-control" path="Address" placeholder="Address" requried="ture"/><br>
			</td>
			</tr>
					
			<tr>
			<th><h3>Other Details:</h3></th>
			<tr>
			<td>
			<label>Email Address:</label>
			</td>
			<td>
			<label>Enter Adhaar Card No:</label>
			</td>
			<td>
			<label>Enter Pan Card No:</label>
			</td>
			</tr>
			
			<tr>
			<td>
			<form:input type="email" class="form-control" path="Email Address" placeholder="Email Address" requried="true"/><br>
			</td>
			<td>
			<form:input type="number" class="form-control" path="Adhaar Card No" placeholder="Adhaar Card No" size="10" requried="true"/><br>
			</td>
			<td>
			<form:input type="number" class="form-control" path="Pan Card No" placeholder="Pan Card No" size="10" requried="true"/><br>
			</td>
			</tr>				
			
			<tr>
			<th><h3>Nominee Details:</h3></th>
			<td>
			<label>Nominee Name:</label>
			</td>
			<td>
			<label>Nominee Relation:</label>
			</td>
			</tr>
			
			<tr>
			<td>
			<form:input type="text" class="form-control" path="nominee Name" placeholder="Nominee Name" requried="true"/><br>
			</td>
			<td>		
			<form:input type="text" class="form-control" path="nominee Relation" placeholder="Nominee Relation" requried="true"/><br>
			</td>
			</tr>		

			<tr>
    		<td align='right'><input type='submit' name='SUBMIT' value="submit"/></td>
			</tr>
				
			</table>
			</form:form>
			
			
			</div>
			
			<div class="col-sm-3">
			<img alt="advertise" src="advertisement.jpg" width="50px" height="100px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
</body>
</html>
					
					