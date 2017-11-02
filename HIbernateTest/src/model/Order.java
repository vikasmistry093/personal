package model;

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

@Entity
@Table(name="ORDER")
public class Order {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ORDER_ID")
	private long orderId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="ORDERED_PRODUCT", joinColumns={@JoinColumn(name="ORDER_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> orderedProduct;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Payment payment;

	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public List<Product> getOrderedProduct() {
		return orderedProduct;
	}

	public void setOrderedProduct(List<Product> orderedProduct) {
		this.orderedProduct = orderedProduct;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
