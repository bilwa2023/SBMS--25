package com.sb.ecommerce.service;

import com.sb.ecommerce.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;


public interface CategoryService {
    public List<Category> getAllCategories();
    public String createCategory(Category category);
    public String deleteCategory(Long id);
}
