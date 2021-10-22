package com.example.examprepwithchocho.service;

import com.example.examprepwithchocho.model.entity.Category;
import com.example.examprepwithchocho.model.entity.CategoryNameEnum;

public interface CategoryService {
    void initCategories();

    Category findByCategoryNameEnum(CategoryNameEnum categoryNameEnum);
}
