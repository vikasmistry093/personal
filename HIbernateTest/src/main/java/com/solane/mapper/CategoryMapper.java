package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.solane.mapper.model.CategoryInfo;
import com.solane.model.Category;

@Component
public class CategoryMapper {

	public static List<CategoryInfo> convertIntoCategoryInfoList(List<Category> categories) {
		return categories.stream()
				.map(CategoryMapper::convertIntoCategoryInfo)
				.collect(Collectors.toList());
	}
	
	public static CategoryInfo convertIntoCategoryInfo(Category category) {
		CategoryInfo categoryInfo = new CategoryInfo();
		categoryInfo.setCategoryId(category.getCategoryId());
		categoryInfo.setName(category.getName());
		categoryInfo.setStatus(category.getStatus());
		categoryInfo.setCreatedTimestamp(category.getCreatedTimestamp());
		categoryInfo.setUpdatedTimestamp(category.getUpdatedTimestamp());
		
		return categoryInfo;
	}
	
}
