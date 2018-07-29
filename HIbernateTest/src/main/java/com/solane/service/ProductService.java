package com.solane.service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.solane.constants.SolaneConstants;
import com.solane.dao.AdminUserDAO;
import com.solane.dao.ProductDAO;
import com.solane.mapper.CategoryMapper;
import com.solane.mapper.ProductMapper;
import com.solane.mapper.model.CategoryInfo;
import com.solane.mapper.model.ImageInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.model.AdminUser;
import com.solane.model.Product;
import com.solane.util.SolaneUtils;

@Service
public class ProductService {
	
	@Autowired
	private ProductDAO productDao;
	
	@Autowired
	private AdminUserDAO adminUserDAO;
	
	@Autowired
	private ProductMapper productMapper;
	
	@Autowired
	private CategoryMapper categoryMapper;
	
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
		AdminUser adminUser = new AdminUser();
		adminUser.setName("Vikas");
		adminUser.setContact("9594349005");
		adminUser.setEmail("vikasmistry9@gmail.com");
		adminUser.setStatus("FREE");
	
		adminUserDAO.saveDummyUsers(adminUser);
	}

	public void saveUploadedProduct(ProductInfo productInfo, MultipartFile[] files) throws IOException {
		productInfo.setStatus(SolaneConstants.REGISTERED);
		productInfo.setCreatedTimestamp(SolaneConstants.TIMESTAMP);
		productInfo.setUpdatedTimestamp(SolaneConstants.TIMESTAMP);
		
		List<CategoryInfo> categoryInfos = categoryMapper.getCategoriesByNames(productInfo.getCategory());
		productInfo.setProductCategory(categoryInfos);
		
		List<ImageInfo> images = new ArrayList<>();
		for(MultipartFile file: files) {
			if(!file.getOriginalFilename().isEmpty()) {
				SolaneUtils.uploadImageFile(productInfo, file);
				ImageInfo image = new ImageInfo();
				image.setImageTitle(file.getName());
				image.setImageURL(file.getOriginalFilename());
				image.setStatus(SolaneConstants.REGISTERED);
				images.add(image);
			}
		}
		productInfo.setProuctImages(images);
		productMapper.save(productInfo);
	}

	public List<ProductInfo> getProductByStatus(String registered) {
		List<ProductInfo> productInfos = productMapper.getProductInfoByStatus(registered);
		return productInfos;
	}
	
	public void save(ProductInfo product) {
		productMapper.save(product);
	}

	public void saveorUpdate(ProductInfo product) {
		productMapper.saveorUpdate(product);
	}

	public ProductInfo getProductByProduct(ProductInfo productInfo) {
		ProductInfo product = productMapper.getProductByProduct(productInfo);
		return product;
	}

}
