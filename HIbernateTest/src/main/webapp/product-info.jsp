<!DOCTYPE html>
<html lang="en">
<head>
<title>Info</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="importer.jsp"%>
</head>
<body>
	<!-- header section -->
	<%@ include file="header.jsp"%>
	<!-- header section end-->

	<!-- main content -->
	<div class="container-fluid m-t-30">
		<div class="row">
			<div class="col-sm-4">
				<div class="sticky-gallery">
					<img class="img-responsive"
						src="images/${product.prouctImages[0].imageURL }" />
				</div>
				<c:choose>
				<c:when test="${product.status eq 'NOT AVAILABLE' }">
				<div class="m-t-20 text-center">
					<button type="button" disabled="disabled"
						class="btn primary-btn btn-lg btn-block pull-left" onclick="addtoCart(${product.productId})">Add To
						Cart</button>
					<button type="button" disabled="disabled"
						class="btn btn-orange btn-lg btn-block pull-right" onclick="buyNow(${product.productId})">Buy
						Now</button>
					<div class="clear-float"></div>
				</div>
				</c:when>
				<c:otherwise>
				<div class="m-t-20 text-center">
					<button type="button"
						class="btn primary-btn btn-lg btn-block pull-left" onclick="addtoCart(${product.productId})">Add To
						Cart</button>
					<button type="button"
						class="btn btn-orange btn-lg btn-block pull-right" onclick="buyNow(${product.productId})">Buy
						Now</button>
					<div class="clear-float"></div>
				</div>
				</c:otherwise>
				</c:choose>
				
				
			</div>
			<div class="col-sm-8">
				<p class="f-18">${product.productTitle}</p>
				<div class="form-group m-t-20">
					<label class="f-bold f-gray productSpec-title">Warranty</label>
					<div class="product-feature">
						<span>Brand Warranty of 1 Year Available for Mobile and 6
							Months for Accessories</span>
					</div>
					<div class="clear-float"></div>
				</div>
				<div class="form-group">
					<label class="f-bold f-gray productSpec-title">Highlights</label>
					<div class="product-feature">
						<span>${product.features}</span>
					</div>
					<div class="clear-float"></div>
				</div>
				<div class="form-group m-t-20">
					<label class="f-bold f-gray productSpec-title">Description</label>
					<div class="product-feature">
						<span>${product.features}</span>
					</div>
					<div class="clear-float"></div>
				</div>

				<!-- about product -->
				<div class="wrapper center-block m-t-30">
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel-heading active" role="tab" id="headingOne">
								<h4 class="panel-title">
									<a role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseOne"
										aria-expanded="true" aria-controls="collapseOne"> General
									</a>
								</h4>
							</div>
							<div id="collapseOne" class="panel-collapse collapse in"
								role="tabpanel" aria-labelledby="headingOne">
								<div class="panel-body">${product.description }</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingTwo">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseTwo"
										aria-expanded="false" aria-controls="collapseTwo"> Display
										Features </a>
								</h4>
							</div>
							<div id="collapseTwo" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingTwo">
								<div class="panel-body">${product.features }</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingThree">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapseThree"
										aria-expanded="false" aria-controls="collapseThree"> OS and
										Processor Features </a>
								</h4>
							</div>
							<div id="collapseThree" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingThree">
								<div class="panel-body">${product.description }</div>
							</div>
						</div>
						<div class="panel panel-default">
							<div class="panel-heading" role="tab" id="headingfour">
								<h4 class="panel-title">
									<a class="collapsed" role="button" data-toggle="collapse"
										data-parent="#accordion" href="#collapsefour"
										aria-expanded="false" aria-controls="collapseThree">
										Memory and Storage Features </a>
								</h4>
							</div>
							<div id="collapsefour" class="panel-collapse collapse"
								role="tabpanel" aria-labelledby="headingfour">
								<div class="panel-body">${product.description }</div>
							</div>
						</div>
					</div>
				</div>

			</div>
		</div>
	</div>
	<!-- main content end-->

	<!-- footer start -->
	<%@ include file="footer.jsp"%>
	<!-- footer start end-->
</body>
</html>
