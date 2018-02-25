package com.solane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.dao.ProductDAO;
import com.solane.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDao;
	
	public ProductService() {
	}
	
	public List<Product> getTopProducts() {
		List<Product> topProducts = productDao.getTopProducts();
		return topProducts;
	}

	public Product getProductById(long parseLong) {
		Product product = productDao.getProductById(parseLong);
		return product;
	}

	public void saveDummyProducts(List<Product> productList) {
		productDao.saveDummyProducts(productList);
	}

}
