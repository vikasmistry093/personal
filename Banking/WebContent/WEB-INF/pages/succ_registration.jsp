<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank:</title>
</head>
<body>
	<%@include file="includes/header.jsp"%>
	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-4">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
			</div>
			<div class="col-sm-4">
				<div class="panel panel-primary">
					<div class="panel-heading" align="center">WELCOME</div>
			            	<table>
			            	
								<tr>
									<td align="center">
									 	<a href="${pageContext.request.contextPath}/"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg"  class="img-rounded" alt="notification" width="70%" height="41%"/></a>
									</td>
								</tr>
								
								<tr>	 
									 <td >
										<h3>Welcome,You have Successfully Logged In</h3><br>
									 </td>
								</tr>
							
			            	</table>			
						</div>
				    </div>
			<div class="col-sm-4">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
			</div>
		</div>	
	</div>
	<%@include file="includes/footer.html"%>
  </body>
</html>