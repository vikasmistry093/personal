package com.solane.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.solane.mapper.model.CategoryInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.service.CategoryService;
import com.solane.service.ProductService;

@Controller
public class SolaneController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping("/")
	public ModelAndView indexPage() {
		ModelAndView model = new ModelAndView("index");
		List<ProductInfo> productList = productService.getTopProducts();
		
		model.addObject("productList", productList);
		return model;
	}
	
	@RequestMapping("/product")
	public ModelAndView viewProduct(@RequestParam("id") String product_id) {
		ModelAndView model = new ModelAndView("product-info");
		ProductInfo productInfo = productService.getProductById(Long.parseLong(product_id));
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
	public void saveUploadProduct(@RequestParam(value="imageFile") MultipartFile[] files,
			@ModelAttribute ProductInfo productInfo) throws IOException {
			productService.saveUploadedProduct(productInfo, files);
	}
	
}
