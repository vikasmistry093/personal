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
            <div class="col-sm-8">
               <!-- about product -->
               <div class="wrapper center-block">
                  <div class="panel-group" id="accordion">
                     <div class="panel panel-default">
                        <div class="panel-heading active" role="tab" id="headingOne">
                           <h4 class="panel-title">
                              <a role="button" class="f-bold" data-toggle="collapse" data-parent="#accordion" href="#login-state" aria-expanded="true" aria-controls="collapseOne">
                              Login
                              </a>
                           </h4>
                        </div>
                        <div id="login-state" class="panel-collapse collapse in" role="tabpanel" aria-labelledby="headingOne">
                           <div class="panel-body">
                              <div class="row">
								<div class="col-md-6 col-xs-12">
									<div class="form-group">
										<label for="email" class="control-label m-b-5 ">
										Email</label>
										<input type="email" class="form-control m-b-10" id="email1" placeholder="Email">
										<label for="exampleInputPassword1" class="control-label m-b-5">
										Password</label>
										<input type="email" class="form-control m-b-10" id="exampleInputPassword1" placeholder="password">
										<button type="submit" class="btn primary-btn btn-sm">
										Login</button>
										<a href="javascript:;">Forgot your password?</a>
									</div>
								</div>
                              </div>
                           </div>
                        </div>
                        <div class="panel panel-default">
                           <div class="panel-heading" role="tab" id="headingTwo">
                              <h4 class="panel-title">
                                 <a class="collapsed f-bold" role="button" data-toggle="collapse" data-parent="#accordion" href="#deliveryAdd-state" aria-expanded="false" aria-controls="collapseTwo">
								 Delivery Address
                                 </a>
                              </h4>
                           </div>
                           <div id="deliveryAdd-state" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingTwo">
                              <div class="panel-body">
								  <form> 
										<div class="row">
											<div class=" col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Customer name</span>
												<p class="m-t-10">Customer addresss 1</p>
												</label>
												
											</div>
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Customer name</span>
												<p class="m-t-10">Customer addresss 2</p>
												</label>
											</div>
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Customer name</span>
												<p class="m-t-10">Customer addresss 3</p>
												</label>
											</div>
										</div>
									</form>
							  </div>
							  <div class="panel-footer">
									<button type="button" class="btn btn-orange">Deliver Here</button>
							  </div>
                           </div>
                        </div>
                        <div class="panel panel-default">
                           <div class="panel-heading" role="tab" id="headingThree">
                              <h4 class="panel-title">
                                 <a class="collapsed f-bold" role="button" data-toggle="collapse" data-parent="#accordion" href="#summary-state" aria-expanded="false" aria-controls="collapseThree">
                                 Order Summary
                                 </a>
                              </h4>
                           </div>
                           <div id="summary-state" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingThree">
                              <div class="panel-body ">
								  <div class="row product-summary">
										<div class="col-sm-3 text-center">
											<img class="" src="images/mob-image.jpeg">
										</div>
										<div class="col-sm-9">
											<p class="f-18 m-b-20 f-normal">vivo  v7(Matte Black, 64 GB)  (4 GB RAM)</p>
											<p class="f-bold f-16">₹ 7,999</p>
										</div>
								  </div>
							  </div>
							  <div class="panel-footer ">
									<button type="button" class="btn btn-orange">Next</button>
							  </div>
                           </div>
                        </div>
                        <div class="panel panel-default">
                           <div class="panel-heading" role="tab" id="headingfour">
                              <h4 class="panel-title">
                                 <a class="collapsed f-bold" role="button" data-toggle="collapse" data-parent="#accordion" href="#collapsefour" aria-expanded="false" aria-controls="collapseThree">
                                 Payment Option
                                 </a>
                              </h4>
                           </div>
                           <div id="collapsefour" class="panel-collapse collapse" role="tabpanel" aria-labelledby="headingfour">
                              <div class="panel-body">
									<div class="row">
											<div class=" col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Net Banking</span>
												<p class="m-t-10">Payment mode</p>
												</label>
												
											</div>
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Debit/Credit/ATM card</span>
												<p class="m-t-10">Payment mode</p>
												</label>
											</div>
											<div class="col-xs-12">
												<label class="radio-inline m-b-10 ">
												<input type="radio" name="optradio"><span class="f-bold">Cash on Delivery</span>
												<p class="m-t-10">Payment mode</p>
												</label>
											</div>
										</div>
                              </div>
                           </div>
                        </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>
      </div>
      <!-- main content end-->
      
      <!-- footer start -->
      <%@ include file="footer.jsp" %>
      <!-- footer start end-->
   </body>
</html>