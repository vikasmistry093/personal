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
	<%@include file="includes/logoutheader.jsp"%>
	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-3">
			  <%@include file="includes/menu.html"%>
			</div>

			<div class="col-sm-7">
				<div class="panel panel-primary">
					<div class="panel-heading">Notification Setting</div>
					<table>
						<tr>
							<td align="center" colspan="3"><a href="${pageContext.request.contextPath}/emailsetting"><img src="${pageContext.request.contextPath}/resources/images/emailsetting.jpg"  class="img-rounded" alt="email" width="40%" height="41%"/></a></td>
							<td align="center" colspan="3"><a href="${pageContext.request.contextPath}/mobilesetting"><img src="${pageContext.request.contextPath}/resources/images/mobilesetting.jpg" class="img-rounded" alt="mobile" width="40%" height="41%"/></a></td>
						</tr>
						<tr>
							<td align="center" colspan="3"><h3>Email Setting</h3></td>
							<td align="center" colspan="3"><h3>Mobile Number Setting</h3></td>
						</tr>
			       	</table>			
			    </div>
			    <div>
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advert.jpg"  width="100%" height="220px"/>
				</div>
		   </div>
		
		   <div class="col-sm-2">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg" width="100%" height="500px"/>
		   </div>
		 </div>
	</div>	   
	<%@include file="includes/footer.html"%>
  </body>
</html>