<!DOCTYPE html>
<html lang="en">
   <head>
      <title>Home</title>
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1">
      <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet">
      <link href="https://fonts.googleapis.com/css?family=Roboto:100,300,400,500,700,900" rel="stylesheet">
      <link rel="stylesheet" href="css/bootstrap.min.css">
      <link rel="stylesheet" href="css/style.css">
      <link rel="stylesheet" href="css/responsive.css">
      <link rel="stylesheet" href="css/xzoom.css">
      <script src="js/jquery-3.2.1.min.js"></script>
      <script src="js/bootstrap.min.js"></script>
      <script src="js/jquery.bootpag.min.js"></script>
      <script src="js/xzoom.min.js"></script>
   </head>
   <body>
      <!-- header section -->
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
                     <button type="button" class="btn primary-btn" data-toggle="modal" data-target="#signup-popup">Singup</button>
                     <button type="button" class="btn secondary-btn" data-toggle="modal" data-target="#login-popup">Log In</button>
                  </div>
               </div>
               </div>
            </div>
         </section>
         <!-- logo and search section end-->
         <!-- menu part -->
         <nav class="navbar navbar-default custom-navbar">
            <div class="container">
               <!-- Brand and toggle get grouped for better mobile display -->
               <div class="navbar-header">
                  <button type="bu tton" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar-collapse-1" aria-expanded="false">
                  <span class="sr-only">Toggle navigation</span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  <span class="icon-bar"></span>
                  </button>
               </div>
               <!-- Collect the nav links, forms, and other content for toggling -->
               <div class="collapse navbar-collapse" id="navbar-collapse-1">
                  <ul class="nav navbar-nav">
                     <li class="active"><a href="#">Electronics</a></li>
                     <li><a href="#">About</a></li>
                     <li><a href="#">Contact us</a></li>
                  </ul>
               </div>
               <!-- /.navbar-collapse -->
            </div>
         </nav>
         <!-- menu part end -->
      </header>
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
                  <img src="images/logo - Copy.jpg" alt="Los Angeles" style="width:100%;">
                  <div class="carousel-caption">
                     <h3>Los Angeles</h3>
                     <p>LA is always so much fun!</p>
                  </div>
               </div>
               <div class="item">
                  <img src="images/logo - Copy.jpg" alt="Chicago" style="width:100%;">
                  <div class="carousel-caption">
                     <h3>Chicago</h3>
                     <p>Thank you, Chicago!</p>
                  </div>
               </div>
               <div class="item">
                  <img src="images/logo - Copy.jpg" alt="New York" style="width:100%;">
                  <div class="carousel-caption">
                     <h3>New York</h3>
                     <p>We love the Big Apple!</p>
                  </div>
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
                        <li>
                            <a href="#" class="text-center"> 
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="text-center">
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="text-center">
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="text-center">
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="text-center">
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
                        <li>
                            <a href="#" class="text-center">
                                <img src="images/mob-image.jpeg" class="img-responsive" />
                                <div class="m-t-20 m-b-10">
                                    <span>vivo  v7(Matte Black,)</span>
                                </div>
                                <label class="f-bold">₹10,000</label>
                            </a>
                        </li>
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
      <footer class="footer-section m-t-30 p-t-30 ">
            <div class="container-fluid">
                    <!-- footer menu first part -->
                    <div class="row m-b-35">
                       <div class="col-sm-3">
                          <a href="#"><img src="images/logo.png" alt="" class="img-responsive m-b-20"></a>
                       </div>
                       <div class="col-sm-3">
                          <div class="highlight-bar"></div>
                          <ul class="nav">
                             <li class="active"><a href="">Home</a></li>
                             <li><a href="">About</a></li>
                             <li><a href="">Contact Us</a></li>
                        </ul>
                       </div>
                       
                       
                    </div>
                    <!-- footer first menu end -->
                    
                 </div>
      </footer>
      <!-- footer start end-->
   </body>
</html>
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
                  <label for="email" class="col-sm-2 control-label">
                  Email</label>
                  <div class="col-sm-10">
                     <input type="email" class="form-control" id="email1" placeholder="Email" />
                  </div>
               </div>
            </div>
            <div class="form-group">
               <div class="row">
                  <label for="exampleInputPassword1" class="col-sm-2 control-label">
                  Password</label>
                  <div class="col-sm-10">
                     <input type="email" class="form-control" id="exampleInputPassword1" placeholder="password" />
                  </div>
               </div>
            </div>
            <div class="row">
               <div class="col-sm-2">
               </div>
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
                     <input type="text" name="firstname" value="" class="form-control input-lg" placeholder="First Name"  />                        
                  </div>
                  <div class="col-xs-6 col-md-6">
                     <input type="text" name="lastname" value="" class="form-control input-lg" placeholder="Last Name"  />                        
                  </div>
               </div>
            </div>
            <div class="form-group">
               <input type="text" name="email" value="" class="form-control input-lg" placeholder="Your Email"  />
            </div>
            <div class="form-group">
               <input type="password" name="password" value="" class="form-control input-lg" placeholder="Password"  />
            </div>
            <div class="form-group">
               <input type="password" name="confirm_password" value="" class="form-control input-lg" placeholder="Confirm Password"  />
            </div>
            <div class="form-group">                       
               <label>Birth Date</label>                    
               <div class="row">
                  <div class="col-xs-4 col-md-4">
                     <select name="month" class = "form-control input-lg">
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
                     <select name="day" class = "form-control input-lg">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                     </select>
                  </div>
                  <div class="col-xs-4 col-md-4">
                     <select name="year" class = "form-control input-lg">
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
               <label>Gender : </label>
               <label class="">
                    <input type="radio" name="gender" value="M" id=male />Male
               </label>
                <label class=""><!-- radio-inline -->
               <input type="radio" name="gender" value="F" id=female />Female
               </label>
            </div>
               <button class="btn btn-lg primary-btn btn-block signup-btn" type="submit">
               Create my account</button>
               </form>           
            </div>
         </div>
      </div>
   </div>
</div>
<!-- popup signup end-->


<script>
    
$(document).ready(function(){
    $('.demo').bootpag({
        total: 5
            }).on("page", function(event, num){
        $(".product-section").html("Page " + num); // or some ajax content loading...
     
        // ... after content load -> change total to 10
        $(this).bootpag({total: 10, maxVisible: 10});
     
    });



    // sticky header
    // $(window).scroll(function(){
    //     if ($(window).scrollTop() >= 0) {
    //     $('header').addClass('navbar-fixed-top');
    //     }
    //     else {
    //     $('header').removeClass('navbar-fixed-top');
    //     }
    // });

});
</script>