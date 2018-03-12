<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="admin-importer.jsp" %>
<title>Welcome Admin</title>
</head>
<body>
	<%@ include file="admin-header.jsp" %>
	
	<div class="main-container">
		<%@ include file="admin-sidebar.jsp" %>
		
		<div class="admin-main-body">
			<h4>MAIN BODY</h4>
			<table id="userTable" class="userTable table table-striped table-bordered" align="center">
				<thead>
					<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					</tr>
				</thead>
				<tfoot>
					<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>Address</th>
					</tr>
				</tfoot>
				<tbody>
					<tr>
					<td>1</td>
					<td>ABC</td>
					<td>abc@gmail.com</td>
					<td>100ft Road</td>
					</tr>

					<tr>
					<td>2</td>
					<td>PQR</td>
					<td>pqr@gmail.com</td>
					<td>60ft Road</td>
					</tr>

					<tr>
					<td>3</td>
					<td>XYZ</td>
					<td>xyz@gmail.com</td>
					<td>120ft Road</td>
					</tr>

					<tr>
					<td>1</td>
					<td>ABC</td>
					<td>abc@gmail.com</td>
					<td>100ft Road</td>
					</tr>

					<tr>
					<td>2</td>
					<td>PQR</td>
					<td>pqr@gmail.com</td>
					<td>60ft Road</td>
					</tr>

					<tr>
					<td>3</td>
					<td>XYZ</td>
					<td>xyz@gmail.com</td>
					<td>120ft Road</td>
					</tr>

					<tr>
					<td>1</td>
					<td>ABC</td>
					<td>abc@gmail.com</td>
					<td>100ft Road</td>
					</tr>

				</tbody>
			</table>
		</div>
	</div>
	
	<%@ include file="admin-footer.jsp" %>
</body>
</html>