package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.RecommendationInfo;
import com.solane.model.Recommendation;

@Component
@Transactional
public class RecommendationMapper {
	
	public static Recommendation convertIntoRecommendation(RecommendationInfo recommendationInfo) {
		Recommendation recommendation = new Recommendation();
		recommendation.setRecommendationId(recommendationInfo.getRecommendationId());
		recommendation.setRecommendedProduct(ProductMapper.convertIntoProductList(recommendationInfo.getRecommendedProduct()));
		return recommendation;
	}
	
	public static RecommendationInfo convertIntoRecommendationInfo(Recommendation recommendation) {
		RecommendationInfo recommendationInfo = new RecommendationInfo();
		recommendationInfo.setRecommendationId(recommendation.getRecommendationId());
		recommendationInfo.setRecommendedProduct(ProductMapper.convertIntoProductInfoList(recommendation.getRecommendedProduct()));
		return recommendationInfo;
	}
	
	public static List<Recommendation> convertIntoRecommendationList(List<RecommendationInfo> recomendationInfoList) {
		return recomendationInfoList.stream()
				.map(RecommendationMapper::convertIntoRecommendation)
				.collect(Collectors.toList());
	}
	
	public static List<RecommendationInfo> convertIntoRecommendationInfoList(List<Recommendation> recommendationList) {
		return recommendationList.stream()
				.map(RecommendationMapper::convertIntoRecommendationInfo)
				.collect(Collectors.toList());
	}
	

}
