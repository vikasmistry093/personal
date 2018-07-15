package com.solane.mapper.model;

import java.io.Serializable;
import java.util.Set;

public class RecommendationInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long recommendationId;
	private Set<ProductInfo> recommendedProduct;
	
	public RecommendationInfo() {}

	public RecommendationInfo(Long recommendationId, Set<ProductInfo> recommendedProduct) {
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

	public Set<ProductInfo> getRecommendedProduct() {
		return recommendedProduct;
	}

	public void setRecommendedProduct(Set<ProductInfo> recommendedProduct) {
		this.recommendedProduct = recommendedProduct;
	}

	@Override
	public String toString() {
		return "Recommendation [recommendationId=" + recommendationId + ", recommendedProduct=" + recommendedProduct
				+ "]";
	}

}
