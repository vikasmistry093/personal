<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Product Upload</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="admin-importer.jsp"%>
</head>
<body>
	<!-- header section -->
	<%@ include file="header.jsp"%>
	<!-- header section end-->

<div class="container-fluid m-t-30">
	<div class="main-container">
		<div class="uploadProductForm">
			<h3 class="uploadProductHeader">Products Details :</h3>
			<form:form class="form-horizontal" action="saveUploadProduct" modelAttribute="productInfo" enctype="multipart/form-data">

				<div class="form-group">
					<label class="control-label col-sm-2">Product Title</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="productTitle" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2">Expected Price</label>
					<div class="col-sm-10">
						<form:input class="form-control" path="price" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2">Description</label>
					<div class="col-sm-10">
						<form:textarea class="form-control" path="description" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2">Features</label>
					<div class="col-sm-10">
						<form:textarea class="form-control" path="features" />
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2">Product Primary</label>
					<div class="col-sm-10">
						<form:select class="form-control" path="category"
							multiple="true">
							<c:forEach var="cat" items="${categories}">
								<form:option class="form-control" value="${cat.name}">${cat.name}</form:option>
							</c:forEach>
						</form:select>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-sm-2" for="email">Product Image</label>
					<div class="col-sm-10">
    					<input type="file" name="imageFile" class="btn btn-primary" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2"></label>
					<div class="col-sm-10">
    					<input type="file" name="imageFile" class="btn btn-primary" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2"></label>
					<div class="col-sm-10">
    					<input type="file" name="imageFile" class="btn btn-primary" />
					</div>
				</div>
				<div class="form-group">
					<label class="control-label col-sm-2"></label>
					<div class="col-sm-10">
    					<input type="file" name="imageFile" class="btn btn-primary" />
					</div>
				</div>
				
				<input type="submit" value="Submit" />
			</form:form>
		</div>
	</div>
	</div>

	<!-- footer start -->
	<%@ include file="footer.jsp"%>
	<!-- footer start end-->
</body>
</html>