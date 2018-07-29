package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.ProductProcessingHistoryDAO;
import com.solane.mapper.model.ProductProcessingHistoryInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.model.ProductProcessingHistory;

@Component
@Transactional
public class ProductProcessingHistoryMapper {
	
	@Autowired
	private ProductProcessingHistoryDAO productProcessingHistoryDAO;
	
	public static ProductProcessingHistory convertIntoProductProcessingHistory(ProductProcessingHistoryInfo productInfo) {
		ProductProcessingHistory product = new ProductProcessingHistory();
		product.setDescription(productInfo.getDescription());
		product.setPreviousHistory(productInfo.getPreviousHistory());
		product.setProduct(ProductMapper.convertIntoProduct(productInfo.getProduct()));
		product.setAdmin_user(productInfo.getUser() != null ? AdminUserMapper.convertIntoAdminUser(productInfo.getUser()) : null);
		product.setUser(productInfo.getUserInfo() != null ? UserMapper.convertIntoUser(productInfo.getUserInfo()) : null);
		return product;
	}
	
	public static ProductProcessingHistoryInfo convertIntoProductProcessingHistoryInfo(ProductProcessingHistory product) {
		ProductProcessingHistoryInfo productInfo = new ProductProcessingHistoryInfo();
		productInfo.setDescription(product.getDescription());
		productInfo.setPreviousHistory(product.getPreviousHistory());
		productInfo.setProduct(ProductMapper.convertIntoProductInfo(product.getProduct()));
		productInfo.setUser(product.getAdmin_user() != null ? AdminUserMapper.convertIntoAdminUserInfo(product.getAdmin_user()) : null);
		productInfo.setUserInfo(product.getUser() != null ? UserMapper.convertIntoUserInfo(product.getUser()) : null);
		return productInfo;
	}

	public void saveorUpdate(ProductProcessingHistoryInfo processingProduct) {
		productProcessingHistoryDAO.saveorUpdate(convertIntoProductProcessingHistory(processingProduct));
	}

	public List<ProductProcessingHistoryInfo> getProductByUser(UserInfo user) {
		List<ProductProcessingHistory> productInfos = productProcessingHistoryDAO.getProductByUser(user);
		return convertIntoProductProcessingHistoryInfoList(productInfos);
	}

	private List<ProductProcessingHistoryInfo> convertIntoProductProcessingHistoryInfoList(List<ProductProcessingHistory> productInfos) {
		return productInfos.stream().map(ProductProcessingHistoryMapper::convertIntoProductProcessingHistoryInfo)
				.collect(Collectors.toList());
	}

}
