<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<%@include file="includes/includer.html"%>

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome to DBS Bank: Home</title>
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
					<div class="panel-heading">Recharge</div>
					<table>
						<tr>	
							 <td align="center" colspan="2"><a href="${pageContext.request.contextPath}/mobilerecharge"><img src="${pageContext.request.contextPath}/resources/images/mobilerecharge.png" class="img-rounded" alt="MobileRecharge" width="35%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/dthrecharge.png"><img src="${pageContext.request.contextPath}/resources/images/Dthrecharge.png" class="img-rounded" alt="DTHRecharge" width="55%" height="30%"/></a></td>
							<td align="center" colspan="2"><a href="${pageContext.request.contextPath}/electricityrecharge"><img src="${pageContext.request.contextPath}/resources/images/electricityrechrge.png" class="img-rounded" alt="OtherRecharge" width="55%" height="30%"/></a></td>
						</tr>
						<tr>
							<td align="center" colspan="2"><h3>Mobile Recharge</h3></td>
							<td align="center" colspan="2"><h3>DTH Recharge</h3></td>
							<td align="center" colspan="2"><h3>Gas Recharge</h3></td>
						</tr>
						
					</table>
				</div>
				
				<div>
					<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="240px"/>
				</div>
			</div>

			<div class="col-sm-2">
				<img alt="advertise" src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"  width="100%" height="510px"/>
			</div>
		</div>
	</div>
	<%@include file="includes/footer.html"%>
	</body>
</html>
						
						