package com.solane.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="RECOMMENDATION")
public class Recommendation implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RECOMMENDATION_ID")
	private Long recommendationId;
	
	@ManyToMany
	@JoinTable(name="RECOMMENDED_PRODUCT", joinColumns={@JoinColumn(name="RECOMMENDATION_ID")}, inverseJoinColumns={@JoinColumn(name="PRODUCT_ID")})
	private List<Product> recommendedProduct;
	
	public Recommendation() {}

	public Recommendation(Long recommendationId, List<Product> recommendedProduct) {
		super();
		this.recommendationId = recommendationId;
		this.recommendedProduct = recommendedProduct;
	}

	public Long getRecommendationId() {
		return recommendationId;
	}

	public void setRecommendationId(Long recommendationId) {
		this.recommendationId = recommendationId;
	}

	public List<Product> getRecommendedProduct() {
		return recommendedProduct;
	}

	public void setRecommendedProduct(List<Product> recommendedProduct) {
		this.recommendedProduct = recommendedProduct;
	}

	@Override
	public String toString() {
		return "Recommendation [recommendationId=" + recommendationId + ", recommendedProduct=" + recommendedProduct
				+ "]";
	}

}
