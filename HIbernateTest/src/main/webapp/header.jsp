<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<%@ include file="importer.jsp" %>
</head>
<body>

<header class="navbar-fixed-top">
         <!-- logo and search section -->
         <section class="logo-section">
            <div class="container">
               <div class="row  p-t-10 p-b-5">
                  <div class="col-xs-4 col-sm-2">
                     <img src="images/logo.png" class="img-responsive logo" />
                  </div>
                  <div class="col-xs-4 col-sm-1 col-sm-push-7">
                     <i class="fa fa-shopping-cart m-t-20" aria-hidden="true"></i>
                  </div>
                  <div class="col-xs-10 col-sm-7 col-sm-pull-1">
                     <div class="form-group search-feild m-t-15">
                        <label for="search-input" class="fa fa-search"></label>
                        <input type="text" class="form-control search-area" aria-label="..." id="search-input">
                     </div>
                  </div>
                  <div class="col-xs-4 col-sm-2">
                  <div class="pull-right">
                     <button type="button" class="btn primary-btn" onclick="signUp()">Sing Up</button>
                     <button type="button" class="btn secondary-btn" onclick="login()">Log In</button>
                  </div>
               </div>
               </div>
            </div>
         </section>
         <!-- logo and search section end-->
         <!-- menu part -->
        <!--  <nav class="navbar navbar-default custom-navbar">
            <div class="container">
               Brand and toggle get grouped for better mobile display
               <div class="navbar-header">
                  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1" aria-expanded="false">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  </button>
               </div>
               Collect the nav links, forms, and other content for toggling
               <div class="collapse navbar-collapse" id="navbar-collapse-1">
                  <ul class="nav navbar-nav">
                     <li class="active"><a href="#">Home</a></li>
                     <li><a href="#">About</a></li>
                     <li><a href="#">Contact us</a></li>
                  </ul>
               </div>
               /.navbar-collapse
            </div>
         </nav> -->
         <!-- menu part end -->
      </header>

</body>
</html>