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
import javax.persistence.Table;

@Entity
@Table(name="RECOMMENDATION")
public class Recommendation {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RECOMMENDATION_ID")
	private long recommendationId;
	
	@OneToMany(cascade=CascadeType.ALL)
	@JoinTable(name="RECOMMENDED_PRODUCT", joinColumns={@JoinColumn(name="RECOMMENDATION_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> recommendedProduct;

}
