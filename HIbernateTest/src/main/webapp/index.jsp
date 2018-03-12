<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Home</title>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file="importer.jsp"%>
</head>
<body>
	<!-- header section -->
	<%@ include file="header.jsp"%>
	<!-- header section end-->
	<!-- banner section -->
	<div class="banner-carousel">
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
					<img src="images/logo - Copy.jpg" alt="Los Angeles"
						style="width: 100%;">
					<div class="carousel-caption">
						<h3>Los Angeles</h3>
						<p>LA is always so much fun!</p>
					</div>
				</div>
				<div class="item">
					<img src="images/logo - Copy.jpg" alt="Chicago"
						style="width: 100%;">
					<div class="carousel-caption">
						<h3>Chicago</h3>
						<p>Thank you, Chicago!</p>
					</div>
				</div>
				<div class="item">
					<img src="images/logo - Copy.jpg" alt="New York"
						style="width: 100%;">
					<div class="carousel-caption">
						<h3>New York</h3>
						<p>We love the Big Apple!</p>
					</div>
				</div>
			</div>
			<!-- Left and right controls -->
			<a class="left carousel-control" href="#myCarousel" data-slide="prev">
				<span class="glyphicon glyphicon-chevron-left"></span> <span
				class="sr-only">Previous</span>
			</a> <a class="right carousel-control" href="#myCarousel"
				data-slide="next"> <span
				class="glyphicon glyphicon-chevron-right"></span> <span
				class="sr-only">Next</span>
			</a>
		</div>
	</div>
	<!-- banner section end-->

	<!-- main content -->
	<div class="container-fluid m-t-30">
		<div class="row">
			<div class="col-sm-3">
				<ul class="nav summary-list">
					<li><a href="#">Reset</a></li>
					<li><a href="#">Extra</a></li>
				</ul>
			</div>
			<div class="col-sm-9">
				<div class="row">
					<div class="col-xs-12">
						<ul class="nav navbar-nav product-section">
							<c:forEach var="product" items="${productList}">
								<li><a href="/product?id=${product.productId}"
									class="text-center"> <img
										src="images/${product.prouctImages[0].imageURL}"
										class="img-responsive" />
										<div class="m-t-20 m-b-10">
											<span>${product.productTitle}</span>
										</div> <label class="f-bold">&#8377 ${product.price}</label>
								</a></li>
							</c:forEach>
						</ul>
						<ul class="pagination demo">

						</ul>
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
<!-- popup login -->
<div class="modal fade" id="login-popup" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Login</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<div class="row">
						<label for="email" class="col-sm-2 control-label"> Email</label>
						<div class="col-sm-10">
							<input type="email" class="form-control" id="email1"
								placeholder="Email" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<div class="row">
						<label for="exampleInputPassword1" class="col-sm-2 control-label">
							Password</label>
						<div class="col-sm-10">
							<input type="email" class="form-control"
								id="exampleInputPassword1" placeholder="password" />
						</div>
					</div>
				</div>
				<div class="row">
					<div class="col-sm-2"></div>
					<div class="col-sm-10">
						<button type="submit" class="btn primary-btn btn-sm">
							Submit</button>
						<a href="javascript:;">Forgot your password?</a>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- popup login end -->
<!-- popup signup -->
<div class="modal fade" id="signup-popup" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
				<h4 class="modal-title">Signup</h4>
			</div>
			<div class="modal-body">
				<div class="form-group">
					<div class="row">
						<div class="col-xs-6 col-md-6">
							<input type="text" name="firstname" value=""
								class="form-control input-lg" placeholder="First Name" />
						</div>
						<div class="col-xs-6 col-md-6">
							<input type="text" name="lastname" value=""
								class="form-control input-lg" placeholder="Last Name" />
						</div>
					</div>
				</div>
				<div class="form-group">
					<input type="text" name="email" value=""
						class="form-control input-lg" placeholder="Your Email" />
				</div>
				<div class="form-group">
					<input type="password" name="password" value=""
						class="form-control input-lg" placeholder="Password" />
				</div>
				<div class="form-group">
					<input type="password" name="confirm_password" value=""
						class="form-control input-lg" placeholder="Confirm Password" />
				</div>
				<div class="form-group">
					<label>Birth Date</label>
					<div class="row">
						<div class="col-xs-4 col-md-4">
							<select name="month" class="form-control input-lg">
								<option value="01">Jan</option>
								<option value="02">Feb</option>
								<option value="03">Mar</option>
								<option value="04">Apr</option>
								<option value="05">May</option>
								<option value="06">Jun</option>
								<option value="07">Jul</option>
								<option value="08">Aug</option>
								<option value="09">Sep</option>
								<option value="10">Oct</option>
								<option value="11">Nov</option>
								<option value="12">Dec</option>
							</select>
						</div>
						<div class="col-xs-4 col-md-4">
							<select name="day" class="form-control input-lg">
								<option value="1">1</option>
								<option value="2">2</option>
								<option value="3">3</option>
								<option value="4">4</option>
							</select>
						</div>
						<div class="col-xs-4 col-md-4">
							<select name="year" class="form-control input-lg">
								<option value="1989">1989</option>
								<option value="1990">1990</option>
								<option value="1991">1991</option>
								<option value="1992">1992</option>
								<option value="1993">1993</option>
								<option value="1994">1994</option>
								<option value="1995">1995</option>
								<option value="1996">1996</option>
								<option value="1997">1997</option>
								<option value="1998">1998</option>
							</select>
						</div>
					</div>
				</div>
				<div class="form-group">
					<label>Gender : </label> <label class=""> <input
						type="radio" name="gender" value="M" id=male />Male
					</label> <label class="">
						<!-- radio-inline --> <input type="radio" name="gender" value="F"
						id=female />Female
					</label>
				</div>
				<button class="btn btn-lg primary-btn btn-block signup-btn"
					type="submit">Create my account</button>
			</div>
		</div>
	</div>
</div>
<!-- popup signup end-->
</html>