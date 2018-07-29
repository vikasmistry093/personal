package com.solane.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.solane.mapper.CategoryMapper;
import com.solane.mapper.model.CategoryInfo;
import com.solane.model.Category;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryMapper categoryMapper;
	
	public List<CategoryInfo> getAllCategoryInfoList() {
		List<CategoryInfo> categories = categoryMapper.getAllCategory();
		return categories;
	}

	public void saveDummyCategories(List<Category> categories) {
		for(Category cat: categories)
			categoryMapper.save(cat);
		
	}

}
