package com.solane.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.solane.model.Product;
import com.solane.service.ProductService;
import com.solane.util.SolaneUtils;

@Controller
public class SolaneController {
	
	@Autowired
	private ProductService productService;
	
	public SolaneController() {
		System.out.println("In SolaneController.");
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
		Product product = productService.getProductById(Long.parseLong(product_id));
		System.out.println(product);
		return model;
	}
	
	@RequestMapping("/saveDummy")
	public ModelAndView saveDummy() {
		ModelAndView model = new ModelAndView("redirect:/");
		List<Product> productList = SolaneUtils.setProduct();
		productService.saveDummyProducts(productList);
		return model;
	}

}
