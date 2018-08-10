package com.solane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.ProductProcessingHistoryMapper;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.ProductProcessingHistoryInfo;
import com.solane.mapper.model.UserInfo;

@Service
public class ProductProcessHistoryService {
	
	@Autowired
	private ProductProcessingHistoryMapper productProcessingHistoryMapper;

	public void saveorUpdate(ProductProcessingHistoryInfo processingProduct) {
		productProcessingHistoryMapper.saveorUpdate(processingProduct);
	}

	public void saveUploadProductHistory(UserInfo user, ProductInfo productInfo) {
		ProductProcessingHistoryInfo productHistoryInfo = new ProductProcessingHistoryInfo();
		productHistoryInfo.setDescription("Upload Product");
		productHistoryInfo.setPreviousHistory(null);
		productHistoryInfo.setProduct(productInfo);
		productHistoryInfo.setUserInfo(user);
		productHistoryInfo.setUser(null);
		productHistoryInfo.setAdminUserId(null);
		
		productProcessingHistoryMapper.saveorUpdate(productHistoryInfo);
	}

	public List<ProductProcessingHistoryInfo> getProductByUser(UserInfo user) {
		List<ProductProcessingHistoryInfo> products = productProcessingHistoryMapper.getProductByUser(user);
		return products;
	}

	public List<ProductProcessingHistoryInfo> getProductsByProductIdAndStatus(List<Long> productIds, String pickup) {
		List<ProductProcessingHistoryInfo> products = productProcessingHistoryMapper.getProductsByProductIdAndStatus(productIds, pickup);
		return products;
	}

}
