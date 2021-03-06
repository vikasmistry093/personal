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
	<%@include file="includes/logoutheader.jsp"%>
	<div class="bodyContent">
		<div class="row">
			<div class="col-sm-3">
				<%@include file="includes/menu.html"%>
			</div>
			<!-- benificiary type Transaction hoga  -->

			<div class="col-sm-7">
				<div class="panel panel-primary">
					<div class="panel-heading" align="center">Transaction Process
					</div>
				</div>
				<form:form
					action="${pageContext.request.contextPath}/completetransaction"
					method="post" modelAttribute="transaction">
					<table>
						<tr>
							<td style="padding-left: 160px;"></td>

							<td><label>Holder's Account Number:</label></td>

							<td>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</td>

							<td><form:select path="account.accountNumber" required="required">
									<form:option value="0" selected="selected">--- Select ---</form:option>
									<c:forEach var="account" items="${customer.accounts}">
										<form:option value="${account.accountNumber}">${account.accountNumber}</form:option>
									</c:forEach>
								</form:select><br></td>

						</tr>

						<tr>
							<td></td>

							<td><label>Benificiary Name:</label></td>

							<td></td>

							<td><form:input type="text" class="form-control"
									path="benificiaryName" placeholder="RecieverName"
									required="required" /><br></td>
						</tr>

						<tr>
							<td></td>

							<td><label>Benificiary Account Number:</label></td>

							<td></td>

							<td><form:input type="text" class="form-control"
									path="benificiaryAccNo" placeholder="AccountNumber" maxlength="4"
									required="required" /><br></td>
						</tr>
<%-- 
						<tr>
							<td></td>

							<td><label>Transaction Type:</label></td>

							<td></td>

							<td>
									
							<form:select path="transactionType">
								<form:option value="0" selected="selected" required="required">--- Select ---</form:option>
								<form:option value="neft">NEFT</form:option>
								<form:option value="rtgs">RTGS</form:option>
										
							</form:select><br>
							</td>
						</tr>
 						 --%>
						
						<tr>
							<td></td>

							<td><label>Benificiary Description:</label></td>

							<td></td>

							<td><form:textarea path="description" type="text"
									class="form-control" placeholder="Description" required="required" /><br>
							</td>
						</tr>


						<tr>
							<td></td>

							<td><label>Amount:</label></td>

							<td></td>

							<td><form:input type="number" class="form-control"
									path="transactionAmount" placeholder="Rs" required="required" /><br>
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

			<div class="col-sm-2">
				<img alt="advertise"
					src="${pageContext.request.contextPath}/resources/images/advertisement.jpg"
					width="100%" height="500px" />
			</div>
		</div>
	</div>

	<%@include file="includes/footer.html"%>
</body>
</html>