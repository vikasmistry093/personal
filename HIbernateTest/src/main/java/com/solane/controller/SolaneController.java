package com.solane.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.solane.mapper.model.CategoryInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.mapper.model.WishListInfo;
import com.solane.response.UserPlaceOrder;
import com.solane.service.CategoryService;
import com.solane.service.ProductService;
import com.solane.service.UserService;


@Controller
public class SolaneController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private UserService userService;
		
	@Autowired
	private HttpSession session;
	
	@RequestMapping("/")
	public ModelAndView indexPage(HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("index");
		List<ProductInfo> productList = productService.getTopProducts();
		model.addObject("user", user != null? user : null);
		model.addObject("productList", productList);
		return model;
	}
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="url", defaultValue="") String redirectURL) {
		ModelAndView model = new ModelAndView("login");
		UserInfo user = new UserInfo();
		model.addObject("user",user);
		if(!redirectURL.isEmpty())
			model.addObject("url", redirectURL);
		
		return model;
	}
	
	@RequestMapping("/signup")
	public ModelAndView signup(@RequestParam(value="url", defaultValue="") String redirectURL) {
		ModelAndView model = new ModelAndView("signup");
		UserInfo user = new UserInfo();
		model.addObject("user",user);
		if(!redirectURL.isEmpty())
			model.addObject("url", redirectURL);
		
		return model;
	}
	
	@RequestMapping("/validateLoggedUser")
	public ModelAndView validateLoggedUser(@ModelAttribute(value="user") UserInfo user, 
			@RequestParam(value="url", required=false) String redirectURL, HttpServletRequest request) {
		String finalURL = "";
		if(redirectURL.length() > 0)
			finalURL = redirectURL;
		
		UserInfo userInfo = userService.getUserByLoggedUser(user);
		if(userInfo != null) {
			session.setAttribute("user", userInfo);
		}
		ModelAndView model = new ModelAndView("redirect:/"+finalURL);
		return model;
	}
	
	@RequestMapping("/registerUser")
	public ModelAndView registerUser(@ModelAttribute(value="user") UserInfo user, 
			@RequestParam(value="url", required=false) String redirectURL, HttpServletRequest request) {
		String finalURL = "";
		if(redirectURL.length() > 0)
			finalURL = redirectURL;
		
		userService.saveOrUpdate(user);
		
		ModelAndView model = new ModelAndView("redirect:/"+finalURL);
		return model;
	}
	
	@RequestMapping("/product")
	public ModelAndView viewProduct(@RequestParam("id") String product_id, HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("product-info");
		ProductInfo productInfo = productService.getProductById(Long.parseLong(product_id));
		
		userService.updateRecommendationForUser(user, productInfo);
		model.addObject("user", user != null ? user : null);
		model.addObject("product", productInfo);
		return model;
	}
	
	@RequestMapping("/addtoCart")
	public ModelAndView addtoCart(@RequestParam("id") String product_id, HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login?url=addtoCart?id="+product_id);
		if(user != null) {
			model = new ModelAndView("redirect:/index");
			model.addObject("user", user);
			List<ProductInfo> wishedProducts = user.getWishList().getProducts();
			if(wishedProducts == null)
				wishedProducts = new ArrayList<>();
			ProductInfo sproduct = productService.getProductById(Long.parseLong(product_id));
			wishedProducts.add(sproduct);
			
			
		}
		return model;
	}
	
	@RequestMapping("/buyNow")
	public ModelAndView buyNow(@RequestParam("id") String product_id, HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login?url=buyNow?id="+product_id);
		if(user != null) {
			model = new ModelAndView("buy-product");
			ProductInfo sproduct = productService.getProductById(Long.parseLong(product_id));
			if(user.getWishList() == null) {
				user.setWishList(new WishListInfo());
				user.getWishList().setProducts(new ArrayList<ProductInfo>() {{add(sproduct);}});
			} else {
				user.getWishList().getProducts().add(sproduct);
			}
			UserPlaceOrder orders = new UserPlaceOrder();
			model.addObject("order", orders);
			model.addObject("sproduct", sproduct);
			model.addObject("user",user);
		}
		return model;
	}
	
	@RequestMapping("/placeOrder")
	public void orderPlaced(@ModelAttribute("order") UserPlaceOrder orders, HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		System.out.println(orders);
	}
	
	@RequestMapping("/upload")
	public ModelAndView uploadProduct(HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login?url=upload");
		if(user != null) {
			model = new ModelAndView("product-upload");
			ProductInfo productInfo = new ProductInfo();
			List<CategoryInfo> categories = categoryService.getAllCategoryInfoList();
			model.addObject("productInfo", productInfo);
			model.addObject("categories", categories);
		}
		return model;
	}
	
	@RequestMapping("/saveUploadProduct")
	public ModelAndView saveUploadProduct(@RequestParam(value="imageFile") MultipartFile[] files,
			@ModelAttribute ProductInfo productInfo, HttpServletRequest request) throws IOException {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/");
		productService.saveUploadedProduct(productInfo, files);
		return model;
	}
	
}
