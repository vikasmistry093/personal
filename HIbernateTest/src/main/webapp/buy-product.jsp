<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Buy Now</title>
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
			<form:form action="/placeOrder" modelAttribute="order" >
			<div class="col-sm-8">
				<!-- about product -->
				<div class="wrapper center-block">
					<div class="panel-group" id="accordion">
						<div class="panel panel-default">
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingOne">
									<h4 class="panel-title">
										<a class="collapsed f-bold" role="button"
											data-toggle="collapse" data-parent="#accordion"
											href="#deliveryAdd-state" aria-expanded="false"
											aria-controls="collapseTwo"> Delivery Address </a>
									</h4>
								</div>
								<div id="deliveryAdd-state" class="panel-collapse collapse"
									role="tabpanel" aria-labelledby="headingTwo">
									<div class="panel-body">
										<form>
											<div class="row">
												<c:forEach items="${user.userAddress}" var="address">
													<div class=" col-xs-12">
													<label class="radio-inline m-b-10 "> <form:radiobutton
														name="optradio" path="addressId" value="${address}" /><span class="f-bold">${user.name}</span>
														<p class="m-t-10">${address.street}</p>
													</label>
													</div>
												</c:forEach>
											</div>
										</form>
									</div>
									<div class="panel-footer">
										<button type="button" class="btn btn-orange">Deliver Here</button>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingTwo">
									<h4 class="panel-title">
										<a class="collapsed f-bold" role="button"
											data-toggle="collapse" data-parent="#accordion"
											href="#summary-state" aria-expanded="false"
											aria-controls="collapseThree"> Order Summary </a>
									</h4>
								</div>
								<div id="summary-state" class="panel-collapse collapse"
									role="tabpanel" aria-labelledby="headingThree">
									<div class="panel-body ">
										<c:forEach items="${user.wishList.products}" var="product">
											<form:hidden path="productIds" value="${product.productId }"/>
											<div class="row product-summary">
												<div class="col-sm-3 text-center">
													<img class="" src="images/${product.prouctImages[0].imageURL}">
												</div>
												<div class="col-sm-9">
													<p class="f-18 m-b-20 f-normal">${product.productTitle }</p>
													<p class="f-bold f-16">₹ ${product.price }</p>
												</div>
											</div>
										</c:forEach>
									</div>
									<div class="panel-footer ">
										<button type="button" class="btn btn-orange">Next</button>
									</div>
								</div>
							</div>
							<div class="panel panel-default">
								<div class="panel-heading" role="tab" id="headingThree">
									<h4 class="panel-title">
										<a class="collapsed f-bold" role="button"
											data-toggle="collapse" data-parent="#accordion"
											href="#collapsefour" aria-expanded="false"
											aria-controls="collapseThree"> Payment Option </a>
									</h4>
								</div>
								<div id="collapsefour" class="panel-collapse collapse"
									role="tabpanel" aria-labelledby="headingfour">
									<div class="panel-body">
										<div class="row">
											<!-- <div class=" col-xs-12">
												<label class="radio-inline m-b-10 "> <input
													type="radio" name="optradio"><span class="f-bold">Net
														Banking</span>
													<p class="m-t-10">Payment mode</p>
												</label>

											</div>
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 "> <input
													type="radio" name="optradio"><span class="f-bold">Debit/Credit/ATM
														card</span>
													<p class="m-t-10">Payment mode</p>
												</label>
											</div> -->
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 "> <form:radiobutton
													name="optradio" path="paymentType" value="COD" /><span class="f-bold">Cash
														on Delivery</span>
													<p class="m-t-10">Payment mode</p>
												</label>
											</div>
										</div>
									</div>
								</div>
								<button class="btn btn-orange" type="submit">Place Order</button>
							</div>
						</div>
					</div>
				</div>
			</div>
			</form:form>
		</div>
	</div>
	<!-- main content end-->

	<!-- footer start -->
	<%@ include file="footer.jsp"%>
	<!-- footer start end-->
</body>
</html>