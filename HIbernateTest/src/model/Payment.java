package model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="PAYMENT")
public class Payment {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PAYMENT_ID")
	private long paymentId;

	@Column(name="PAYMENT_TYPE")
	private String paymentType;
	
	@Column(name="AMOUNT")
	private double amount;
	
	@CreationTimestamp
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;

}
