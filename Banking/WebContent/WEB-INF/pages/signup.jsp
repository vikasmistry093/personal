<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information Details</title>
</head>
<body>
<%@include file="includes/header.html"%>

	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-3">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="800px"/>
			</div>
			
			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">SIGN UP</div>
				</div>
				<form:form action="${pageContext.request.contextPath}/home" method="post" modelAttribute="customer" >
					<table>
						<tr><th colspan="4"><h3>Personal Details</h3></th></tr>
						
						<tr>
							<td>
								<label>Salutation: </label>
								
							</td>
							<td colspan="3">	
								<form:radiobutton path="salutatn" name="salutation" value="miss"/> Miss &nbsp;
							    <form:radiobutton path="salutatn" name="salutation" value="mrs"/> Mrs &nbsp;
			  					<form:radiobutton path="salutatn" name="salutation" value="ms"/> Ms &nbsp;
			  					<form:radiobutton path="salutatn" name="salutation" value="mr"/> Mr &nbsp;
			  				</td>
						</tr>
						<%-- 
						                 //Create a string for account type 
						
						<tr>
							<td>
								<label>Account Type: </label>
							</td>
							<td colspan="3">
								<form:radiobutton path="accountType" name="current" value="current"/> Current &nbsp;
								<form:radiobutton path="accountType" name="saving" value="saving"/> Saving &nbsp;
								<form:radiobutton path="accountType" name="Loan" value="Loan"/> Loan &nbsp;	
							</td>
						</tr>
						 --%>					
						<tr>
							<td>
								<label>Name: </label>
							</td>
							<td>
								<form:input path="firstName" type="text" class="form-control" placeholder="First Name"/><br>
							</td>
							<td>
								<form:input path="middleName" type="text" class="form-control" placeholder="Middle Name"/><br>
							</td>
							<td>
								<form:input path="lastName" type="text" class="form-control" placeholder="Last Name"/><br>
							</td>
						</tr>
							
						<tr>
							<td>
								<label>Mobile No: </label>
							</td>
							<td colspan="3">
								<form:input type="number" class="form-control" path="mobileNumber" placeholder="Mobile Number" requried="true"/><br>
							</td>
						</tr>
						
						<tr>	
							<td>
								<label>Date Of Birth: </label>
							</td>
							<td colspan="3">
								<form:input type="date" class="form-control" path="dob" placeholder="Date Of Birth" requried="true"/><br>
							</td>
						</tr>
						
						<tr>
							<td>
								<label>Address:</label>
							</td>
							<td colspan="3">	
								<form:textarea type="text" class="form-control" path="address" placeholder="Address" requried="true"/><br>
							</td>
						</tr>
								
						<tr>
							<th colspan="4"><h3>Other Details </h3></th>
						</tr>
						
						<tr>
							<td>
								<label>Email Address:</label>
							</td>
							<td colspan="3">
								<form:input type="email" class="form-control" path="email" placeholder="Email Address" requried="true"/><br>
							</td>
						</tr>	
						
						<tr>
							<td>
								<label>Aadhaar Number:</label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="aadharcard" placeholder="Adhaar Card No" requried="true"/><br>
							</td>
						</tr>	
						
						<tr>
							<td>
								<label>Pan Card Number:</label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="pancard" placeholder="Pan Card No" requried="true"/><br>
							</td>
						</tr>
						
						<tr>
							<th colspan="4"><h3>Nominee Details</h3></th>
						</tr>
						
						<tr>	
							<td>
								<label>Nominee Name:</label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="nomineeName" placeholder="Nominee Name" requried="true"/><br>
							</td>
						</tr>
						
						<tr>
							<td>
								<label>Nominee Relation:</label>
							</td>
							<td colspan="3">		
								<form:input type="text" class="form-control" path="nomineeRelation" placeholder="Nominee Relation" requried="true"/><br>
							</td>
						</tr>
						
						
						<tr>
							<td align="center" colspan="2"><input type="reset" class="btn btn-default"  value="RESET"/></td>
			    			<td align="center" colspan="2"><input type="submit" class="btn btn-default" value="SUBMIT"/></td>
						</tr>
						
					</table>
				</form:form>
			</div>
			
			<div class="col-sm-3">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="800px"/>
			</div>
		</div>
	</div>	
	
	<%@include file="includes/footer.html"%>
</body>
</html>
					
					