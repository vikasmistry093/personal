package com.solane.mapper;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.ProductProcessingHistoryDAO;
import com.solane.mapper.model.ProductProcessingHistoryInfo;
import com.solane.model.ProductProcessingHistory;

@Component
@Transactional
public class ProductProcessingHistoryMapper {
	
	@Autowired
	private ProductProcessingHistoryDAO productProcessingHistoryDAO;
	
	public static ProductProcessingHistory convertIntoProductProcessingHistory(ProductProcessingHistoryInfo productInfoo) {
		ProductProcessingHistory product = new ProductProcessingHistory();
		product.setDescription(productInfoo.getDescription());
		product.setPreviousHistory(productInfoo.getPreviousHistory());
		product.setProduct(ProductMapper.convertIntoProduct(productInfoo.getProduct()));
		product.setUser(AdminUserMapper.convertIntoAdminUser(productInfoo.getUser()));
		return product;
	}
	
	public static ProductProcessingHistoryInfo convertIntoProductProcessingHistoryInfo(ProductProcessingHistory product) {
		ProductProcessingHistoryInfo productInfo = new ProductProcessingHistoryInfo();
		productInfo.setDescription(product.getDescription());
		productInfo.setPreviousHistory(product.getPreviousHistory());
		productInfo.setProduct(ProductMapper.convertIntoProductInfo(product.getProduct()));
		productInfo.setUser(AdminUserMapper.convertIntoAdminUserInfo(product.getUser()));
		return productInfo;
	}

	public void saveorUpdate(ProductProcessingHistoryInfo processingProduct) {
		productProcessingHistoryDAO.saveorUpdate(convertIntoProductProcessingHistory(processingProduct));
	}

}
