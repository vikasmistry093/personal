package com.solane.mapper.model;

import java.io.Serializable;
import java.util.List;

public class RecommendationInfo implements Serializable{
	
	private static final long serialVersionUID = 1L;

	private Long recommendationId;
	private List<ProductInfo> recommendedProduct;
	
	public RecommendationInfo() {}

	public RecommendationInfo(Long recommendationId, List<ProductInfo> recommendedProduct) {
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

	public List<ProductInfo> getRecommendedProduct() {
		return recommendedProduct;
	}

	public void setRecommendedProduct(List<ProductInfo> recommendedProduct) {
		this.recommendedProduct = recommendedProduct;
	}

	@Override
	public String toString() {
		return "Recommendation [recommendationId=" + recommendationId + ", recommendedProduct=" + recommendedProduct
				+ "]";
	}

}
