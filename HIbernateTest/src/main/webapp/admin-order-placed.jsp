<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
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
		<div class="admin-sidebar">
			<%@ include file="admin-sidebar.jsp" %>
		</div>
		
		<div class="admin-main-body">
			<h3 class="pageTypeHeader">${type}</h3>
			<table id="userTable" class="userTable table table-striped table-bordered" align="center">
				<thead>
					<tr>
					<th>Order ID</th>
					<th>No. of Product</th>
					<th>Payment Type</th>
					<th>Amount</th>
					<th>Status</th>
					<th></th>
					</tr>
				</thead>
				<tfoot>
					<tr>
					<th>Title</th>
					<th>Description</th>
					<th>Features</th>
					<th>Price</th>
					<th>Status</th>
					<th></th>
					</tr>
				</tfoot>
				<tbody>
					<c:forEach var="order" items="${orderList}">
						<tr>
							<td>${order.orderId}</td>
							<td>${fn:length(order.orderedProduct)}</td>
							<td>${order.payment.paymentType}</td>
							<td>${order.payment.amount}</td>
							<td>${order.status}</td>
							<td><button id="${order.orderId}" class="edit-button btn btn-info" data-toggle="modal" data-target="#myModal" onclick="getModal(this.id, 'product')">Assign</button></td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
	
	<!-- Modal -->
	<div id="myModal" class="modal fade" role="dialog">
	  <div class="modal-dialog">
	
	    <!-- Modal content-->
	    <div id="modal-content" class="modal-content">
	    </div>
	
	  </div>
	</div>
	
	<%@ include file="admin-footer.jsp" %>
</body>
</html>