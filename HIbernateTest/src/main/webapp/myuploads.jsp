<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>16ane.com|Uploads</title>
</head>
<body>

    <!-- header section -->
	<%@ include file="header.jsp"%>
	<!-- header section end-->

	<!-- main content -->
	<div class="container">
		<div class="row">
			<div class="col-md-12">


				<p class="f-24 f-bold m-b-20">Upload History</p>
				<!-- order history section -->
				<c:forEach var="productHistory" items="${products }">
					<div class="panel panel-default  order-product">
						<!-- first order -->
						<div class="panel-body">
							<div class="row">
								<div class="col-md-6 col-sm-6">
									<div class="order-img">
										<img src=" images/mi-redmi.jpeg" class="img-responsive" />
									</div>
									<div class="order-detail">
										<span class="f-bold"><a href="#">${productHistory.product.productTitle }</a></span>
										<p class="f-gray m-t-10">${productHistory.product.description }</p>
									</div>
								</div>
								<div class="col-md-6 col-sm-6 text-left p-t-30">
									<span class=" display-inline f-bold m-r-20">${productHistory.product.price }</span>
								</div>
							</div>
						</div>

						<!-- first order end -->

						<div class="panel-footer">
							<div class="row">
								<div class="col-sm-6">
									<span class="f-gray m-r-10">Uploaded On</span> <span>${productHistory.product.createdTimestamp }</span>
										<span class="display-inline  f-bold">Delivery status: ${productHistory.product.status }</span>
								</div>
							</div>
						</div>
					</div>
					<!-- order history section  end-->
				</c:forEach>

			</div>
		</div>
	</div>
	<!-- main content end-->

	<!-- footer start -->
	<%@ include file="footer.jsp"%>
	<!-- footer start end-->

</body>
</html>