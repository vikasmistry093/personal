<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: Apply Loan</title>
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
					<div class="panel-heading">Apply for account</div>
				</div>
				<div class="panel-body">
					<form:form action="${pageContext.request.contextPath}/home" modelAttribute="account" commandName="account" method="post" >
						
						<h3>Welcome,${customer.firstName} ${customer.middleName} ${customer.lastName}</h3><br>
					
					<table>						
						<tr>
							<td style="padding-left: 160px;">
								<div class="panel panel-primary">
									<div class="panel-heading">Select The Type Of Account</div>
								</div>	
							</td>
						</tr>
						
						<tr>
							<td style="padding-left: 160px;">
								<form:radiobutton path = "accountType"  value = "saving" /><label>Saving Account</label>
                  				<form:radiobutton path = "accountType" value = "current"/><label>Current Account</label><br>
							</td>
						</tr>
						
						<tr>
							<td style="padding-left: 160px;"><form:button type="submit" class="btn btn-default" style="float: right;">submit</form:button></td>
						</tr>			
							
					</table>
				</form:form>
				</div>
			</div>

			<div class="col-sm-2">
				<img alt="advertise"
					src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"
					width="100%" height="510px" />
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
</body>
</html>

