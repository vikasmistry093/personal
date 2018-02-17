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
					<div class="panel-heading">Apply For Loan</div>
				</div>
				<div class="panel-body">
					<form:form action="${pageContext.request.contextPath}/home" modelAttribute="loan" method="post" >
					<table>
						<tr>
							<td style="padding-left: 160px;"></td>

							<td><label> Loan Type:</label></td>

							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

							<td>
							<form:select path="loantype">
								<form:option value="personalloan">Personal Loan</form:option>
								<form:option value="carloan">Car Loan</form:option>
							</form:select><br>
							</td>

						</tr>

						<tr>
							<td></td>

							<td><label>Loan Amount:</label></td>

							<td></td>

							<td><form:input type="number" class="form-control"
									path="loanamount" placeholder="Amount" size="10"
									requried="true" /><br>
							</td>
						</tr>

						<tr>
							<td></td>

							<td><label>Loan Period:</label></td>

							<td></td>

							<td>
							<form:select path="loanperiod">
								<form:option value="1">1</form:option>
								<form:option value="2">2</form:option>
								<form:option value="5">5</form:option>
								<form:option value="10">10</form:option>
								<form:option value="15">15</form:option>
							</form:select><br>
							</td>
						</tr>

						<tr>
							<td></td>

							<td><label>Upload Document:</label></td>

							<td></td>

							<td>
							<form:input type="file"  name="loandocument" accept="images/*"  path="loandocument"/><br>
							</td>
						</tr>

						<tr>
							<td></td>
							<td align="center"><input type="reset"
								class="btn btn-default" value="RESET" /></td>
							<td></td>
							<td align="center"><input type="submit"
								class="btn btn-default" onclick="mysuccessalert();"
								value="SUBMIT" /></td>
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
