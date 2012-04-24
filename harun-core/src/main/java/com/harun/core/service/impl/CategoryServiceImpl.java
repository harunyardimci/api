package com.harun.core.service.impl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.harun.core.domain.Category;
import com.harun.core.service.CategoryService;

@Service("categoryService")
public class CategoryServiceImpl implements CategoryService
{

    private List<Category> categories = new ArrayList<Category>();

    private static final Logger logger = LoggerFactory.getLogger(CategoryServiceImpl.class);

    @PostConstruct
    public void init()
    {
        //TODO mongo
        categories.add(new Category(0, "Alisveris"));
        categories.add(new Category(1, "Bilgisayar"));
        categories.add(new Category(2, "Cep telefonu"));
    }

    @Override
    public void save()
    {
        System.out.println("kaydediyoruz");
    }

    @Override
    public List<Category> loadCategories()
    {
        logger.info("{} categories found", categories.size());
        return categories;
    }

    @Override
    public Category getCategory(int categoryId)
    {
        logger.info("Category requested with id: {}", categoryId);
        return categories.get(categoryId);
    }

}
