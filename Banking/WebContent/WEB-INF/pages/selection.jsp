<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Information Details</title>
</head>
<body>
<%@include file="includes/includer.html"%>
<%@include file="includes/header.html"%>

<div class="bodyContent">
	<div id="overlay">
  		<div id="text">
			<label>Account Type:</label><br>
					<input type="radio" name="salutation" path="current" value="Current"/> Current &nbsp; &nbsp; &nbsp; &nbsp;	
				    <input type="radio" name="salutation" path="saving" value="Saving"/> Saving &nbsp; &nbsp; &nbsp; &nbsp;<br>	
					<input type="radio" name="salutation" path="saving" value="Loan"/> Saving &nbsp; &nbsp; &nbsp; &nbsp;<br>	
		 <button onclick="off()">Turn Off overlay effect</button>	
  
  		</div>
	</div>

		<div>
  		<h2>Overlay with Text</h2>
 		<button onclick="on()">Turn on overlay effect</button>
		</div>
</div>


</body>
</html>