package com.harun.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.harun.core.service.CategoryService;
import com.harun.core.service.ProductService;

@Service("myProductService")
public class ProductServiceImpl implements ProductService {

	@Autowired
	private CategoryService categoryService;
	
	@Override
	public void saveProduct() {
		categoryService.save();
	}

}
