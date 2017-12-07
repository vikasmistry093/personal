<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank:Transaction</title>
</head>
<body>
	<%@include file="includes/logoutheader.html"%>
	<div class="bodyContent">
		<h1>Welcome ${username}</h1>
	<div class="row">
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>
				<!-- benificiary type Transaction hoga  -->	            	
						
			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading" align="center">Transaction Process </div>
				</div>
						<form:form action="${pageContext.request.contextPath}/transfer" method="post" modelAttribute="transaction">
			            	<table>
								<tr><th colspan="4"><h3>Welcome User</h3></th></tr>
								
								<tr>
									<td>
									 	<label>Holder's Account Number:</label>
									 </td>
									 <td colspan="3">
									 	<label>${AccountNumber}</label>
									</td>
								</tr>
								
								<tr>
									<td>
										<label>Benificiary Name:</label>
									</td>
									<td colspan="3">
										<form:input type="text" class="form-control" path="benificiaryName" placeholder="Reciever Name" size="10" requried="true"/><br>
									</td>
								</tr>
								
								<tr>
									<td>
										<label>Benificiary Account Number:</label>
									</td>
									<td colspan="3">
										<form:input type="number" class="form-control" path="benificiaryAccNo" placeholder="Account No" size="10" requried="true"/><br>
									</td>
								</tr>
								
								<tr>
									<td>
										<label>Benificiary Description:</label>
									</td>
									<td colspan="3">
										<form:textarea path="description"  type="text" class="form-control" placeholder="Description" requried="true"/><br>							
									</td>
								</tr>
									
								<tr>
									<td>
										<label>Amount:</label>
									</td>
									<td colspan="3">
										<form:input type="number" class="form-control" path="transactionAmount" placeholder="Rs" requried="true"/><br>
									</td>
								</tr>
								
								<%-- <tr><th colspan="4"><h3>Personal Details</h3></th></tr>
								  
								  <tr>
								  <td>
										<form:input type="number" class="form-control" path="transactionAmount" placeholder="Rs" requried="true"/><br>
								  </td>
								  <td>
										<form:input type="number" class="form-control" path="transactionAmount" placeholder="Rs" requried="true"/><br>
								  </td>
								  <td>
										<form:input type="number" class="form-control" path="transactionAmount" placeholder="Rs" requried="true"/><br>
								  </td>
								  <td>
										<form:input type="number" class="form-control" path="transactionAmount" placeholder="Rs" requried="true"/><br>
								  </td>
								  </tr> --%>
								  
								<tr>
									<td align="center" colspan="2"><input type="reset" class="btn btn-default"  value="RESET"/></td>
					    			<td align="center" colspan="2"><input type="submit" class="btn btn-default" onclick="mysuccessalert();" value="SUBMIT"/></td>
								</tr>
								            	
			            	</table>			
						</form:form>
			  
		   </div>

			<div class="col-sm-3">
			<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
			</div>
		</div>
	</div>
	
	<%@include file="includes/footer.html"%>
  </body>
</html>