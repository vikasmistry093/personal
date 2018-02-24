package com.solane.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.solane.model.Product;
import com.solane.service.ProductService;

@Controller
public class SolaneController {
	
	private ProductService productService;
	
	public SolaneController() {
		System.out.println("In SolaneController.");
		this.productService = new ProductService();
	}
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("index");
		List<Product> productList = productService.getTopProducts();
		System.out.println(productList.size());
		
		model.addObject("productList", productList);
		return model;
	}
	
	@RequestMapping("/product")
	public ModelAndView viewProduct(@RequestParam("id") String product_id) {
		ModelAndView model = new ModelAndView("product-info");
//		List<Product> productList = productService.getTopProducts();
//		System.out.println(productList.size());
		
//		model.addObject("productList", productList);
		return model;
	}

}
