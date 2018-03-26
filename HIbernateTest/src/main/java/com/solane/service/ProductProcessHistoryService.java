package com.solane.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.ProductProcessingHistoryMapper;
import com.solane.mapper.model.ProductProcessingHistoryInfo;

@Service
public class ProductProcessHistoryService {
	
	@Autowired
	private ProductProcessingHistoryMapper productProcessingHistoryMapper;

	public void saveorUpdate(ProductProcessingHistoryInfo processingProduct) {
		productProcessingHistoryMapper.saveorUpdate(processingProduct);
	}

}
