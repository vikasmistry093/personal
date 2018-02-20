package com.solane.service;

import java.util.List;

import com.solane.dao.ProductDAO;
import com.solane.model.Product;

public class ProductService {
	
	private ProductDAO productDao;
	
	public ProductService() {
		this.productDao = new ProductDAO();
	}
	
	public List<Product> getTopProducts() {
		List<Product> topProducts = productDao.getTopProducts();
		return topProducts;
	}

}
