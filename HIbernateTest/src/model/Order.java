package model;

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="ORDERS")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private long orderId;

	@CreationTimestamp
	@Column(name="CREATED_TIMESTAMP")
	private Timestamp createdTimestamp;
	
	@UpdateTimestamp
	@Column(name="UPATED_TIMESTAMP")
	private Timestamp updatedTimestamp;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ORDERED_PRODUCT", joinColumns={@JoinColumn(name="ORDER_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> orderedProduct;
	
	@JoinColumn(name="PAYMENT")
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;
	
	@Column(name="STATUS")
	private String status;
	
}
