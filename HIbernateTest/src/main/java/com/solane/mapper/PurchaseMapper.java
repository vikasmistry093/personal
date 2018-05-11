package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.PurchaseInfo;
import com.solane.model.Purchase;

@Component
@Transactional
public class PurchaseMapper {
	
	public static Purchase convertIntoPurchase(PurchaseInfo purchaseInfo) {
		Purchase purchase = new Purchase();
		purchase.setPurchaseId(purchaseInfo.getPurchaseId());
		purchase.setUser(UserMapper.convertIntoUser(purchaseInfo.getUser()));
		purchase.setProducts(ProductMapper.convertIntoProductList(purchaseInfo.getProducts()));
		return purchase;
	}
	
	public static PurchaseInfo convertIntoPurchaseInfo(Purchase purchase) {
		PurchaseInfo purchaseInfo = new PurchaseInfo();
		purchaseInfo.setPurchaseId(purchase.getPurchaseId());
		purchaseInfo.setUser(UserMapper.convertIntoUserInfo(purchase.getUser()));
		purchaseInfo.setProducts(ProductMapper.convertIntoProductInfoList(purchase.getProducts()));
		return purchaseInfo;
	}
	
	public static List<Purchase> convertIntoPurchaseList(List<PurchaseInfo> purchaseInfoList) {
		return purchaseInfoList.stream()
				.map(PurchaseMapper::convertIntoPurchase)
				.collect(Collectors.toList());
	}
	
	public static List<PurchaseInfo> convertIntoPurchaseInfoList(List<Purchase> purchaseList) {
		return purchaseList.stream()
				.map(PurchaseMapper::convertIntoPurchaseInfo)
				.collect(Collectors.toList());
	}

}
