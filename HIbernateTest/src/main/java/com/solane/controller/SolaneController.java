package com.solane.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
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
		List<Product> products = productService.getTopProducts();
		
		model.addObject("products", products);
		return model;
	}

}
