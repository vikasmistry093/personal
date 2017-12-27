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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PURCHASE")
public class Purchase {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="PURCHASE_ID")
	private long purchaseId;
	
	@ManyToOne(cascade=CascadeType.ALL)
	private User user;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="PURCHASED_PRODUCT", joinColumns={@JoinColumn(name="PURCHASE_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> products;

	
}
