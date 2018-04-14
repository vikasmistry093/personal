<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>16ane.com : Log In</title>
</head>
<body>
<%@ include file="header.jsp"%>


<div class="row">
<div class="col-md-4"></div>
<div class="col-md-4">
	<form:form action="/validateLoggedUser?url=${url}" modelAttribute="user">
		
	</form:form>
</div>
<div class="col-md-4"></div>
</div>

<%@ include file="footer.jsp"%>
</body>
</html>