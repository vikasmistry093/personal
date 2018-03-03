package com.solane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.dao.ProductDAO;
import com.solane.mapper.ProductMapper;
import com.solane.mapper.model.ProductInfo;
import com.solane.model.Product;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDao;
	
	@Autowired
	private ProductMapper productMapper;
	
	public List<ProductInfo> getTopProducts() {
		List<ProductInfo> topProducts = productMapper.getTopProducts();
		return topProducts;
	}

	public ProductInfo getProductById(Long productId) {
		ProductInfo productInfo = productMapper.getProductById(productId);
		return productInfo;
	}

	public void saveDummyProducts(List<Product> productList) {
		productDao.saveDummyProducts(productList);
	}

}
