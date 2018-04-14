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
import com.solane.mapper.model.RecommendationInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.model.User;
import com.solane.service.CategoryService;
import com.solane.service.ProductService;
import com.solane.service.RecommendationService;
import com.solane.service.UserService;
import com.solane.service.WishListService;

@Controller
public class SolaneController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private UserService userService;
		
	private HttpSession session;
	
	@RequestMapping("/login")
	public ModelAndView login(@RequestParam(value="url", required=false) String redirectURL) {
		ModelAndView model = new ModelAndView("login");
		UserInfo user = new UserInfo();
		model.addObject("user",user);
		if(!redirectURL.isEmpty())
			model.addObject("url", redirectURL);
		
		return model;
	}
	
	@RequestMapping("/validateLoggedUser")
	public ModelAndView validateLoggedUser(@ModelAttribute(value="user") UserInfo user, 
			@RequestParam(value="url", required=false) String redirectURL) {
		String finalURL = "index";
		if(redirectURL.length() > 0)
			finalURL = redirectURL;
		
		boolean isSuccess = userService.validateLoogedUser(user);
		
		ModelAndView model = new ModelAndView(finalURL);
		return model;
	}
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("index");
		List<ProductInfo> productList = productService.getTopProducts();
		
		model.addObject("productList", productList);
		return model;
	}
	
	@RequestMapping("/product")
	public ModelAndView viewProduct(@RequestParam("id") String product_id, HttpServletRequest request) {
		UserInfo user = (UserInfo) request.getSession().getAttribute("user");
		ModelAndView model = new ModelAndView("product-info");
		ProductInfo productInfo = productService.getProductById(Long.parseLong(product_id));
		
		userService.updateRecommendationForUser(user, productInfo);
		
		model.addObject("product", productInfo);
		return model;
	}
	
	@RequestMapping("/upload")
	public ModelAndView uploadProduct() {
		ModelAndView model = new ModelAndView("product-upload");
		ProductInfo productInfo = new ProductInfo();
		List<CategoryInfo> categories = categoryService.getAllCategoryInfoList();
		model.addObject("productInfo", productInfo);
		model.addObject("categories", categories);
		return model;
	}
	
	@RequestMapping("/saveUploadProduct")
	public ModelAndView saveUploadProduct(@RequestParam(value="imageFile") MultipartFile[] files,
			@ModelAttribute ProductInfo productInfo) throws IOException {
		ModelAndView model = new ModelAndView("redirect:/");
		productService.saveUploadedProduct(productInfo, files);
		return model;
	}
	
}
