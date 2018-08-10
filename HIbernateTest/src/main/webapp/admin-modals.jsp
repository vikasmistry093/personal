<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div class="modal-header">
	<button type="button" class="close" data-dismiss="modal">&times;</button>
	<h4 class="modal-title">Product Information</h4>
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

<c:if test="${type == 'view'}">
	<div class="modal-body">
			<div class="row form-group">
					<div class="col-sm-12">
						<div id="myCarousel" class="carousel slide" data-ride="carousel">
						  <!-- Indicators -->
						  <ol class="carousel-indicators">
						    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
						    <li data-target="#myCarousel" data-slide-to="1"></li>
						    <li data-target="#myCarousel" data-slide-to="2"></li>
						  </ol>
						
						  <!-- Wrapper for slides -->
						  <div class="carousel-inner">
						    <div class="item active">
						      <img class="center" src="uploadedImages/${product.prouctImages[0].imageURL}" alt="${product.prouctImages[0].imageTitle}">
						    </div>
						  </div>
						
						  <!-- Left and right controls -->
						  <a class="left carousel-control" href="#myCarousel" data-slide="prev">
						    <span class="glyphicon glyphicon-chevron-left"></span>
						    <span class="sr-only">Previous</span>
						  </a>
						  <a class="right carousel-control" href="#myCarousel" data-slide="next">
						    <span class="glyphicon glyphicon-chevron-right"></span>
						    <span class="sr-only">Next</span>
						  </a>
						</div>
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Product ID</label>
					<div class="col-sm-10">
						<input class="form-control" readonly="readonly" value="${product.productId}" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Product Title</label>
					<div class="col-sm-10">
						<input class="form-control" readonly="readonly" value="${product.productTitle}" />
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Description</label>
					<div class="col-sm-10">
						<input class="form-control" readonly="readonly" value="${product.description}"/>
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Features</label>
					<div class="col-sm-10">
						<input class="form-control" readonly="readonly" value="${product.features}"/>
					</div>
			</div>
			<div class="row form-group">
					<label class="control-label col-sm-2">Price</label>
					<div class="col-sm-10">
						<input class="form-control" readonly="readonly" value="${product.price}"/>
					</div>
			</div>
	</div>
</c:if>


<div class="modal-footer">
	<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
</div>
