package com.solane.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.constants.SolaneConstants;
import com.solane.mapper.OrderMapper;
import com.solane.mapper.ProductMapper;
import com.solane.mapper.UserMapper;
import com.solane.mapper.model.OrderInfo;
import com.solane.mapper.model.PaymentInfo;
import com.solane.mapper.model.ProductInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.response.UserPlaceOrder;
import com.solane.util.SolaneUtils;

@Service
public class OrderService {
	
	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private OrderMapper orderMapper;
	
	@Autowired
	private ProductMapper productMapper;
	
	@SuppressWarnings("serial")
	public boolean placeOrder(UserInfo user, UserPlaceOrder orders) {
		boolean flag = true;
		try {
			UserInfo userInfo = userMapper.getUserByUserId(user.getUserId());
			List<ProductInfo> orderProducts = productMapper.getProductsByIdandStatus(orders.getProductIds(), SolaneConstants.ACTIVE);
			Double amount = SolaneUtils.getTotalAmountOfProducts(orderProducts);
			PaymentInfo paymentInfo = new PaymentInfo();
			paymentInfo.setAmount(amount);
			paymentInfo.setPaymentType(orders.getPaymentType());
			paymentInfo.setCreatedTimestamp(SolaneUtils.getCurrentTimeStamp());
			
			OrderInfo orderInfo = new OrderInfo();
			orderInfo.setOrderedProduct(orderProducts);
			orderInfo.setPayment(paymentInfo);
			orderInfo.setStatus(SolaneConstants.ORDER_PLACED);
			orderInfo.setCreatedTimestamp(SolaneUtils.getCurrentTimeStamp());
			orderInfo.setUpdatedTimestamp(SolaneUtils.getCurrentTimeStamp());
			
			if (userInfo.getOrders() == null) {
				userInfo.setOrders(new ArrayList<OrderInfo>() {{add(orderInfo);}});
			} else {
				userInfo.getOrders().add(orderInfo);
			}
			userMapper.saveOrUpdate(userInfo);
		} catch (Exception e) {
			flag = false;
			e.printStackTrace();
		}
		return flag;
	}
	
	public void updateProductStatus(UserInfo user, UserPlaceOrder orders) {
		productMapper.updateProductsStatusById(orders.getProductIds(), SolaneConstants.ACTIVE, SolaneConstants.NOT_AVAILABLE);
	}

	public List<OrderInfo> getOrdersByStatus(String status) {
		List<OrderInfo> orderInfos = orderMapper.getOrdersByStatus(status);
		return orderInfos;
	}

}
