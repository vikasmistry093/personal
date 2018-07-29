package com.solane.response;

import java.io.Serializable;
import java.util.List;

import com.solane.mapper.model.AddressInfo;
import com.solane.mapper.model.PaymentInfo;
import com.solane.mapper.model.ProductInfo;

public class UserPlaceOrder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String addressId;
	private List<String> productIds;
	private String paymentType;
	
	private AddressInfo addressInfo;
	private List<ProductInfo> productInfos;
	private PaymentInfo paymentInfo;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public List<String> getProductIds() {
		return productIds;
	}
	public void setProductIds(List<String> productIds) {
		this.productIds = productIds;
	}
	public String getPaymentType() {
		return paymentType;
	}
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	public AddressInfo getAddressInfo() {
		return addressInfo;
	}
	public void setAddressInfo(AddressInfo addressInfo) {
		this.addressInfo = addressInfo;
	}
	public List<ProductInfo> getProductInfos() {
		return productInfos;
	}
	public void setProductInfos(List<ProductInfo> productInfos) {
		this.productInfos = productInfos;
	}
	public PaymentInfo getPaymentInfo() {
		return paymentInfo;
	}
	public void setPaymentInfo(PaymentInfo paymentInfo) {
		this.paymentInfo = paymentInfo;
	}

}
