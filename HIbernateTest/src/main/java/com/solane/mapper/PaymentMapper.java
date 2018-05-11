package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.PaymentInfo;
import com.solane.model.Payment;

@Component
@Transactional
public class PaymentMapper {
	
	public static Payment convertIntoPayment(PaymentInfo paymentInfo) {
		Payment payment = new Payment();
		payment.setPaymentId(paymentInfo.getPaymentId());
		payment.setAmount(paymentInfo.getAmount());
		payment.setCreatedTimestamp(paymentInfo.getCreatedTimestamp());
		payment.setPaymentType(paymentInfo.getPaymentType());
		return payment;
	}
	
	public static PaymentInfo convertIntoPaymentInfo(Payment payment) {
		PaymentInfo paymentInfo = new PaymentInfo();
		paymentInfo.setPaymentId(payment.getPaymentId());
		paymentInfo.setAmount(payment.getAmount());
		paymentInfo.setCreatedTimestamp(payment.getCreatedTimestamp());
		paymentInfo.setPaymentType(payment.getPaymentType());
		return paymentInfo;
	}
	
	public static List<Payment> convertIntoPaymentList(List<PaymentInfo> paymentInfoList) {
		return paymentInfoList.stream()
				.map(PaymentMapper::convertIntoPayment)
				.collect(Collectors.toList());
	}
	
	public static List<PaymentInfo> convertIntoPaymentInfoList(List<Payment> paymentList) {
		return paymentList.stream()
				.map(PaymentMapper::convertIntoPaymentInfo)
				.collect(Collectors.toList());
	}

}
