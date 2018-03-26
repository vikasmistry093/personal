<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<div class="modal-header">
	<button type="button" class="close" data-dismiss="modal">&times;</button>
	<h4 class="modal-title">Modal Header</h4>
</div>
<c:if test="${type == 'product'}">
	<div class="modal-body">
		<form:form action="assignProduct" method="POST" modelAttribute="productProcess">
			
			<div class="row form-group">
					<label class="control-label col-sm-2">Product ID</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="product.productId" value="${product.productId}" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Product ID</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="product.productTitle" value="${product.productTitle}" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Previous Description</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="previousHistory" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Description</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="description" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Assign To</label>
					<div class="col-sm-8">
						<form:select class="form-control" path="adminUserId">
							<c:forEach var="user" items="${adminUsers}">
								<form:option class="form-control" value="${user.userId}">${user.name}</form:option>
							</c:forEach>
						</form:select>
					</div>
			</div>
			<div class="row form-group">
				<div class="col-sm-12">
					<input class="btn btn-success" type="submit" value="Submit" />
				</div>
			</div>
		</form:form>
	</div>
</c:if>

<div class="modal-footer">
	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
</div>
