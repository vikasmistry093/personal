<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank:Account Setting</title>
</head>
<body>
	<%@include file="includes/logoutheader.html"%>
	<div class="bodyContent">
		<h1>Welcome Akash Mistry</h1>
		<div class="row">
			<div class="col-sm-3">
			  <%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-6">
				<div class="panel panel-primary">
					<div class="panel-heading">Notification Setting</div>
					<table>
						<tr>
							<th colspan="6"><h3>Setting</h3></th>
						</tr>
						<tr>
							<td align="left" colspan="3"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg"  class="img-rounded" alt="password" width="100%" height="41%"/></td>
							<td align="center" colspan="3"><img src="${pageContext.request.contextPath}/resources/images/chase.jpg" class="img-rounded" alt="address" width="100%" height="41%"/></td>
						</tr>
			       	</table>			
			    </div> 
		   </div>
		
		   <div class="col-sm-3">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
		   </div>
	</div>
</div>		   
	<%@include file="includes/footer.html"%>
  </body>
</html>