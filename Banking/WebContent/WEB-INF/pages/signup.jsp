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
<%@include file="includes/header.jsp"%>

	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-3">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="800px"/>
			</div>
			
			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">SIGN UP </div>
				</div>
				<form:form action="${pageContext.request.contextPath}/registration" method="post" modelAttribute="customer" >
					<table>
						<tr><th colspan="4"><h3>Personal Details</h3></th></tr>
						
						<tr>
							<td>
								<label>Salutation: </label>
							</td>
							<td>	
			  					<form:radiobutton path="salutatn" name="salutation" value="Mr" required="required" /> Mr &nbsp;
			  					<form:radiobutton path="salutatn" name="salutation" value="Ms" required="required"/> Ms 
			  					<form:errors path="salutatn" cssClass="error"/>
			  				</td>
			  				
			  				<td>
			  					<label>Gender: </label>
			  				</td>
			  				<td>
			  					<form:radiobutton path="gender" name="gender" value="male" required="required"/>Male &nbsp;
			  					<form:radiobutton path="gender" name="gender" value="female" required="required"/>Female 
			  					<form:errors path="gender" cssClass="error"/><br>
			  				</td>
						</tr>

						<tr>
							<td>
								<label>Account Type: </label>
							</td>
							<td colspan="3">
								<form:radiobutton path="account.accountType" name="accountType" value="current" required="required"/> Current &nbsp;
								<form:radiobutton path="account.accountType" name="accountType" value="saving" required="required"/> Saving
								<form:errors path="account.accountType" cssClass="error"/><br>
							</td>
						</tr>
											
						<tr>
							<td>
								<label>Name: </label>
							</td>
							<td>
								<form:input path="firstName" type="text" class="form-control" placeholder="First Name" required="required"/>
								<form:errors path="firstName" cssClass="error"/><br>
							</td>
							<td>
								<form:input path="middleName" type="text" class="form-control" placeholder="Middle Name" required="required"/>
								<form:errors path="middleName" cssClass="error"/><br>
							</td>
							<td>
								<form:input path="lastName" type="text" class="form-control" placeholder="Last Name" required="required"/>
								<form:errors path="lastName" cssClass="error"/><br>
								
							</td>
						</tr>
							
						<tr>
							<td>
								<label>Mobile No: </label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="mobileNumber" placeholder="Mobile Number" pattern="[789][0-9]{9}" maxlength="10" required="required"/>
								<form:errors path="mobileNumber" cssClass="error"/><br>
							</td>
						</tr>
						
						<tr>	
							<td>
								<label>Date Of Birth: </label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="dob" placeholder="Date Of Birth (DD/MM/YYYY)" pattern="(0[1-9]|1[0-9]|2[0-9]|3[01]).(0[1-9]|1[012]).[0-9]{4}" required="required"/>
								<form:errors path="dob" cssClass="error"/><br>
							</td>
						</tr>
						
						<tr>
							<td>
								<label>Address:</label>
							</td>
							<td colspan="3">	
								<form:textarea type="text" class="form-control" path="address" placeholder="Address" required="required"/>
								<form:errors path="address" cssClass="error"/><br>
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
								<form:input type="email" class="form-control" path="email" placeholder="Email Address" required="required"/>
								<form:errors path="email" cssClass="error"/><br>
							</td>
						</tr>	
						
						<tr>
							<td>
								<label>Aadhaar Number:</label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="aadharcard" placeholder="Adhaar Card No" maxlength="12" required="required"/>
								<form:errors path="aadharcard" cssClass="error"/><br>					
							</td>
						</tr>	
						
						<tr>
							<td>
								<label>Pan Card Number:</label>
							</td>
							<td colspan="3">
								<form:input type="text" class="form-control" path="pancard" placeholder="Pan Card No" pattern="[A-Z]{5}[0-9]{4}[A-Z]{1}" maxlength="10" required="required"/>
								<form:errors path="pancard" cssClass="error"/><br>
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
								<form:input type="text" class="form-control" path="nomineeName" placeholder="Nominee Name" required="required"/>
								<form:errors path="nomineeName" cssClass="error" /><br>
							</td>
						</tr>
						
						<tr>
							<td>
								<label>Nominee Relation:</label>
							</td>
							<td colspan="3">		
								<form:input type="text" class="form-control" path="nomineeRelation" placeholder="Nominee Relation" required="required"/>
								<form:errors path="nomineeRelation" cssClass="error" /><br>
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
					
					