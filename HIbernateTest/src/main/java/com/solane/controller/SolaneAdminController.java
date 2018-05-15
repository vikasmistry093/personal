package com.solane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.solane.constants.SolaneConstants;
import com.solane.mapper.model.AdminUserInfo;
import com.solane.mapper.model.OrderInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.ProductProcessingHistoryInfo;
import com.solane.model.Product;
import com.solane.service.AdminUserService;
import com.solane.service.OrderService;
import com.solane.service.ProductProcessHistoryService;
import com.solane.service.ProductService;
import com.solane.util.SolaneUtils;

@Controller
public class SolaneAdminController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private AdminUserService adminUserService;
	
	@Autowired
	private ProductProcessHistoryService productProcessHistoryService;
	
	@RequestMapping("/saveDummy")
	public ModelAndView saveDummy() {
		ModelAndView model = new ModelAndView("redirect:/");
		List<Product> productList = SolaneUtils.setProduct();
		productService.saveDummyProducts(productList);
		return model;
	}
	
	@RequestMapping(value= {"/registeredProduct", "/admin"})
	public ModelAndView registeredProducts() {
		ModelAndView model = new ModelAndView("admin-registered-product");
		List<ProductInfo> products = productService.getProductByStatus(SolaneConstants.REGISTERED);
		model.addObject("type", SolaneConstants.REGISTERED_PRODUCT_TYPE);
		model.addObject("productList", products);
		return model;
	}
	
	@RequestMapping("/assignedProducts")
	public ModelAndView assignedProducts() {
		ModelAndView model = new ModelAndView("admin-assigned-product");
		List<ProductInfo> products = productService.getProductByStatus(SolaneConstants.PICKUP);
		model.addObject("type", SolaneConstants.ASSIGNED_PICK_UP_PRODUCTS);
		model.addObject("productList", products);
		return model;
	}
	
	@RequestMapping("/orderPlaced")
	public ModelAndView orderPlaced() {
		ModelAndView model = new ModelAndView("admin-order-placed");
		List<OrderInfo> orders = orderService.getOrdersByStatus(SolaneConstants.ORDER_PLACED);
		model.addObject("type", SolaneConstants.ORDER_PLACED);
		model.addObject("orderList", orders);
		return model;
	}
	
	@RequestMapping("/productAssignment")
	public ModelAndView productType(@RequestParam("id") String id, @RequestParam("type") String type) {
		System.out.println(id + type);
		ModelAndView model = new ModelAndView("admin-modals");
		ProductInfo product = productService.getProductById(Long.parseLong(id));
		List<AdminUserInfo> adminUsers = adminUserService.getAdminUserByStatus(SolaneConstants.FREE);
		ProductProcessingHistoryInfo productProcess = new ProductProcessingHistoryInfo();
		
		model.addObject("product", product);
		model.addObject("productProcess", productProcess);
		model.addObject("adminUsers", adminUsers);
		model.addObject("type", type);
		return model;
	}
	
	@RequestMapping("/assignProduct")
	public ModelAndView assignProduct(@ModelAttribute("productProcess") ProductProcessingHistoryInfo processingProduct) {
		ModelAndView model = new ModelAndView("redirect:/adminPanel");
		ProductInfo product = productService.getProductById(processingProduct.getProduct().getProductId());
		
		AdminUserInfo user = adminUserService.getAdminUserById(processingProduct.getAdminUserId());
		processingProduct.setUser(user);
		processingProduct.setProduct(product);
		
		productProcessHistoryService.saveorUpdate(processingProduct);
		
		product.setStatus(SolaneConstants.PICKUP);
		productService.saveorUpdate(product);
		
		AdminUserInfo userInfo = processingProduct.getUser();
		userInfo.setStatus(SolaneConstants.PICKUP);
		adminUserService.saveorupdate(userInfo);
		
		return model;
	}
}
