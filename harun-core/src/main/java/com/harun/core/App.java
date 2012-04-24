package com.harun.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.harun.core.service.CategoryService;

public class App {
	
	private static final Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("appContext-core.xml");
		CategoryService categoryService = context.getBean("categoryService", CategoryService.class);
//		CategoryService categoryService = context.getBean(CategoryService.class);
		logger.debug("{}",categoryService.loadCategories());
	}
}
