package com.solane.mapper;

import java.util.List;
import java.util.stream.Collectors;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.solane.dao.CategoryDAO;
import com.solane.mapper.model.CategoryInfo;
import com.solane.model.Category;

@Component
@Transactional
public class CategoryMapper {
	
	@Autowired
	private CategoryDAO categoryDAO;

	public static CategoryInfo convertIntoCategoryInfo(Category category) {
		CategoryInfo categoryInfo = new CategoryInfo();
		categoryInfo.setCategoryId(category.getCategoryId());
		categoryInfo.setName(category.getName());
		categoryInfo.setStatus(category.getStatus());
		categoryInfo.setCreatedTimestamp(category.getCreatedTimestamp());
		categoryInfo.setUpdatedTimestamp(category.getUpdatedTimestamp());
		
		return categoryInfo;
	}
	
	public static Category convertIntoCategory(CategoryInfo categoryInfo) {
		Category category = new Category();
		category.setCategoryId(categoryInfo.getCategoryId());
		category.setName(categoryInfo.getName());
		category.setStatus(categoryInfo.getStatus());
		category.setCreatedTimestamp(categoryInfo.getCreatedTimestamp());
		category.setUpdatedTimestamp(categoryInfo.getUpdatedTimestamp());
		return category;
	}

	public static List<Category> convertIntoCategoryList(List<CategoryInfo> productCategories) {
		return productCategories.stream()
				.map(CategoryMapper::convertIntoCategory)
				.collect(Collectors.toList());
	}
	
	public static List<CategoryInfo> convertIntoCategoryInfoList(List<Category> categories) {
		return categories.stream()
				.map(CategoryMapper::convertIntoCategoryInfo)
				.collect(Collectors.toList());
	}

	public List<CategoryInfo> getAllCategory() {
		List<Category> categories = categoryDAO.getAllCategory();
		return convertIntoCategoryInfoList(categories);
	}

	public List<CategoryInfo> getCategoriesByNames(String[] category) {
		List<Category> categories = categoryDAO.getCategoriesByNames(category);
		return convertIntoCategoryInfoList(categories);
	}

	public void save(Category cat) {
		categoryDAO.saveOrUpdate(cat);
	}
	
}
