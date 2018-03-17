package com.solane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.solane.constants.SolaneConstants;
import com.solane.mapper.model.AdminUserInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.ProductProcessingHistoryInfo;
import com.solane.model.Product;
import com.solane.service.AdminUserService;
import com.solane.service.CategoryService;
import com.solane.service.ProductService;
import com.solane.util.SolaneUtils;

@Controller
public class SolaneAdminController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private AdminUserService adminUserService;
	
	@RequestMapping("/saveDummy")
	public ModelAndView saveDummy() {
		ModelAndView model = new ModelAndView("redirect:/");
		List<Product> productList = SolaneUtils.setProduct();
		productService.saveDummyProducts(productList);
		return model;
	}
	
	@RequestMapping("/adminPanel")
	public ModelAndView adminPanel() {
		ModelAndView model = new ModelAndView("admin-registered-product");
		List<ProductInfo> products = productService.getProductByStatus(SolaneConstants.REGISTERED);
		model.addObject("type", SolaneConstants.REGISTERED_PRODUCT_TYPE);
		model.addObject("productList", products);
		return model;
	}
	
	@RequestMapping("/assignProduct")
	public ModelAndView productType(@RequestParam("id") String id, @RequestParam("type") String type) {
		System.out.println(id + type);
		ModelAndView model = new ModelAndView("admin-modals");
		ProductInfo products = productService.getProductById(Long.parseLong(id));
		List<AdminUserInfo> adminUsers = adminUserService.getAdminUserByStatus(SolaneConstants.FREE);
		ProductProcessingHistoryInfo productProcess = new ProductProcessingHistoryInfo();
		productProcess.setProduct(products);
		
		model.addObject("productProcess", productProcess);
		model.addObject("adminUsers", adminUsers);
		model.addObject("type", type);
		return model;
	}
}
