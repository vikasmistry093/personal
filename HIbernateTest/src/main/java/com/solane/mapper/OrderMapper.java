package com.solane.mapper;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.OrderDAO;
import com.solane.mapper.model.OrderInfo;
import com.solane.mapper.model.UserInfo;
import com.solane.model.Order;

@Component
@Transactional
public class OrderMapper {
	
	@Autowired
	private OrderDAO orderDAO;
	
	public static Order convertIntoOrder(OrderInfo orderInfo) {
		Order order = new Order();
		order.setOrderId(orderInfo.getOrderId());
		order.setPayment(PaymentMapper.convertIntoPayment(orderInfo.getPayment()));
		order.setOrderedProduct(ProductMapper.convertIntoProductList(new LinkedHashSet<>(orderInfo.getOrderedProduct())));
		order.setCreatedTimestamp(orderInfo.getCreatedTimestamp());
		order.setStatus(orderInfo.getStatus());
		order.setUpdatedTimestamp(orderInfo.getUpdatedTimestamp());
		return order;
	}
	
	public static OrderInfo convertIntoOrderInfo(Order order) {
		OrderInfo orderInfo = new OrderInfo();
		orderInfo.setOrderId(order.getOrderId());
		orderInfo.setPayment(PaymentMapper.convertIntoPaymentInfo(order.getPayment()));
		orderInfo.setOrderedProduct(ProductMapper.convertIntoProductInfoList(order.getOrderedProduct()));
		orderInfo.setCreatedTimestamp(order.getCreatedTimestamp());
		orderInfo.setStatus(order.getStatus());
		orderInfo.setUpdatedTimestamp(order.getUpdatedTimestamp());
		return orderInfo;
	}
	
	public static List<Order> convertIntoOrderList(List<OrderInfo> orderInfoList) {
		return orderInfoList.stream()
				.map(OrderMapper::convertIntoOrder)
				.collect(Collectors.toList());
	}
	
	public static List<OrderInfo> convertIntoOrderInfoList(List<Order> orderList) {
		return orderList.stream()
				.map(OrderMapper::convertIntoOrderInfo)
				.collect(Collectors.toList());
	}

	public List<OrderInfo> getOrdersByStatus(String status) {
		List<Order> orders = orderDAO.getOrdersByStatus(status);
		return convertIntoOrderInfoList(orders);
	}
}
