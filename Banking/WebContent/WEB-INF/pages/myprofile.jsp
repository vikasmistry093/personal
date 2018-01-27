<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: My Profile</title>
</head>
<body>
	<%@include file="includes/logoutheader.jsp"%>
	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-7">
				<div class="panel panel-primary">
					<div class="panel-heading">My Profile</div>
				</div>	
					<table>
						
						<tr>
							<th colspan="5" align="left"><h3>Personal Details</h3></th>
						</tr>
						
						<tr>	
							<td>
								<label>Name:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="userName" value="${customer.firstName} ${customer.middleName} ${customer.lastName}" readonly="readonly">
							</td>
							
								<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
							<td>
								<label>Mobile Number:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="mobilenumber" value="${customer.mobileNumber}" readonly="readonly"><br>
							</td>
							
						</tr>
						
						<tr>
							
							<td></td>
							
						</tr>
						
						<tr>
							<td>
								<label>Address:</label>
							</td>
							
							<td >
								<input type="text" class="form-control" name="address" value="${customer.address}" readonly="readonly">
							</td>
							
							<td></td>
							
							<td>
								<label>DOb:</label>
							</td>
							
							<td >
								<input type="text" class="form-control" name="dob" value="${customer.dob}" readonly="readonly"><br>
							</td>
						</tr>
						
						<tr>
							<td>
								<label>Email Address:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="email" value="${customer.email}" readonly="readonly">
							</td>
							
							<td></td>
							
							<td>
								
							</td>
							
							<td>
								
							</td>
						</tr>
						
						
						<tr>
							<th colspan="5" align="left"><h3>Other Details </h3></th>
						</tr>
						
						<tr>
							<td>
								<label>Aadhaar Card Number:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="aadharcard" value="${customer.aadharcard}" readonly="readonly">
							</td>
							
							<td></td>
							
							<td>
								<label>Pancard Number:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="pancard" value="${customer.pancard}" readonly="readonly">
							</td>
						</tr>
						
						<tr>
							<th colspan="5" align="left"><h3>Nominee Details</h3></th>
						</tr>
						
						 
						<tr>
							<td>
								<label>Nominee Name:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="nomineeName" value="${customer.nomineeName}" readonly="readonly">
							</td>
							
							<td></td>
							
							<td>
								<label>Nominee Relation:</label>
							</td>
							
							<td>
								<input type="text" class="form-control" name="nomineeRelation" value="${customer.nomineeRelation}" readonly="readonly"><br>
							</td>
						</tr>
					</table>
			</div>

			<div class="col-sm-2">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						