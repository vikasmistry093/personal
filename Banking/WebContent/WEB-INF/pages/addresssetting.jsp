<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: General Setting</title>
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
					<div class="panel-heading">Address Setting</div>
				</div>	
					<form:form action="${pageContext.request.contextPath}/updateaddress" method="post" modelAttribute="customer" >
					<table>
						
						<tr>
						
						<td style="padding-left: 160px;"></td>
						
						<td>
							<label>Current Address: </label>
						</td>
						
						<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>
						
						<td>
							<textarea rows="4" cols="40" class="form-control" readonly="readonly"> ${customer.address} </textarea><br>
						</td>
						</tr>
						
						<tr>
						
						<td></td>
						
						<td>
							<label>Enter New Address: </label>
						</td>
						
						<td></td>
						
						<td>
							<form:textarea type="text" class="form-control" path="address" placeholder="Re-Enter New Address" required="required"/><br>
						</td>
						</tr>
						
						<tr>
							<td></td>
							<td align="center"><input type="reset" class="btn btn-default"  value="RESET"/></td>
							<td></td>
			    			<td align="center"><input type="submit" class="btn btn-default" onclick="mysuccessalert()" value="SUBMIT"/></td>
						</tr>
					</table>
					</form:form>
				
			</div>

			<div class="col-sm-2">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						