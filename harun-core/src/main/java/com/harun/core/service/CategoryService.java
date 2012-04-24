package com.harun.core.service;

import java.util.List;

import com.harun.core.domain.Category;

public interface CategoryService {

	void save();
	
	List<Category> loadCategories();
	
	Category getCategory(int categoryId);
}
