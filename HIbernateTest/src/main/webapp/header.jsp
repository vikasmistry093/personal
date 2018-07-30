<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="importer.jsp"%>
</head>
<body>

	<header class="navbar-fixed-top"> <!-- logo and search section -->
	<section class="logo-section">
	<div class="container">
		<div class="row  p-t-10 p-b-5">
			<div class="col-xs-4 col-sm-2">
				<img src="images/logo.png" class="img-responsive logo"
					onclick="home()" />
			</div>
			<div class="col-xs-4 col-sm-1 col-sm-push-7">
				<i class="fa fa-shopping-cart m-t-20" aria-hidden="true"></i>
			</div>
			<div class="col-xs-10 col-sm-7 col-sm-pull-1">
				<div class="form-group search-feild m-t-15">
					<label for="search-input" class="fa fa-search"></label> <input
						type="text" class="form-control search-area" aria-label="..."
						id="search-input">
				</div>
			</div>
			<div class="col-xs-4 col-sm-2">
				<div class="pull-right">
					<c:choose>
						<c:when test="${empty user}">
							<div class="dropdown" onclick="login()">
								<button class="dropbtn">Hello, Sign In</button>
								<div class="dropdown-content">
									<a href="/login">Sign In</a>
									<a href="/signup">Sign Up</a>
								</div>
							</div>
						</c:when>
						<c:otherwise>
							<c:choose>
								<c:when test="${empty username}">
								</c:when>
								<c:otherwise>
									<div class="dropdown">
										<button class="dropbtn">Hello, ${username}</button>
										<div class="dropdown-content">
											<!-- <a href="#">My Acount</a> -->
											<a href="/orders">My Orders</a>
											<a href="/myuploads">My Uploads</a>
											<a href="/mycart">My WishList</a>
											<a href="/upload">Upload</a>
											<a href="/logout">Logout</a>
										</div>
									</div>
								</c:otherwise>
							</c:choose>
						</c:otherwise>
					</c:choose>
				</div>
			</div>
		</div>
	</div>
	</section> </header>

</body>
</html>