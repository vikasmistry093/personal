package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.ProductDAO;
import com.solane.mapper.model.ProductInfo;
import com.solane.model.Product;

@Component
@Transactional
public class ProductMapper {
	
	@Autowired
	private ProductDAO productDao;
	
	public static ProductInfo convertIntoProductInfo(Product product) {
		ProductInfo productInfo = new ProductInfo();
		productInfo.setProductId(product.getProductId());
		productInfo.setProductTitle(product.getProductTitle());
		productInfo.setPrice(product.getPrice());
		productInfo.setDiscount(product.getDiscount());
		productInfo.setDescription(product.getDescription());
		productInfo.setFeatures(product.getFeatures());
		productInfo.setRating(product.getRating());
		productInfo.setStatus(product.getStatus());
		productInfo.setCreatedTimestamp(product.getCreatedTimestamp());
		productInfo.setUpdatedTimestamp(product.getUpdatedTimestamp());
		product.getProductCategory();
		productInfo.setProductCategory(CategoryMapper.convertIntoCategoryInfoList(product.getProductCategory()));
		productInfo.setProuctImages(ImageMapper.convertIntoImageInfoList(product.getProuctImages()));
		return productInfo;
	}
	
	public List<ProductInfo> convertIntoProductInfoList(List<Product> products) {
		return products.stream()
				.map(ProductMapper::convertIntoProductInfo)
				.collect(Collectors.toList());
	}
	
	public List<ProductInfo> getTopProducts() {
		List<Product> products = productDao.getTopProducts();
		return convertIntoProductInfoList(products);
	}

	public ProductInfo getProductById(Long productId) {
		Product product = productDao.getProductById(productId);
		return convertIntoProductInfo(product);
	}

}
