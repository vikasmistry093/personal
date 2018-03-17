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
		productInfo.setProductCategory(CategoryMapper.convertIntoCategoryInfoList(product.getProductCategory()));
		productInfo.setProuctImages(ImageMapper.convertIntoImageInfoList(product.getProuctImages()));
		return productInfo;
	}
	
	public static Product convertIntoProduct(ProductInfo productInfo) {
		Product product = new Product();
		product.setProductId(productInfo.getProductId());
		product.setProductTitle(productInfo.getProductTitle());
		product.setPrice(productInfo.getPrice());
		product.setDiscount(productInfo.getDiscount() != null ? productInfo.getDiscount() : 0D);
		product.setDescription(productInfo.getDescription());
		product.setFeatures(productInfo.getFeatures());
		product.setRating(productInfo.getRating() != null ? productInfo.getRating() : 0);
		product.setStatus(productInfo.getStatus());
		product.setCreatedTimestamp(productInfo.getCreatedTimestamp());
		product.setUpdatedTimestamp(productInfo.getUpdatedTimestamp());
		product.setProductCategory(CategoryMapper.convertIntoCategoryList(productInfo.getProductCategory()));
		product.setProuctImages(ImageMapper.convertIntoImageList(productInfo.getProuctImages()));
		return product;
	}
	
	public List<ProductInfo> convertIntoProductInfoList(List<Product> products) {
		return products.stream()
				.map(ProductMapper::convertIntoProductInfo)
				.collect(Collectors.toList());
	}
	
	public List<Product> convertIntoProductList(List<ProductInfo> products) {
		return products.stream()
				.map(ProductMapper::convertIntoProduct)
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

	public void saveProductInfo(ProductInfo productInfo) {
		Product product = convertIntoProduct(productInfo);
		productDao.save(product);
		
	}

	public List<ProductInfo> getProductInfoByStatus(String registered) {
		List<Product> products = productDao.getProductByStatus(registered);
		return convertIntoProductInfoList(products);
	}

}
