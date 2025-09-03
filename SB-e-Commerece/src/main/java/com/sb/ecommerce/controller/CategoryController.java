package com.sb.ecommerce.controller;

import com.sb.ecommerce.entity.Category;
import com.sb.ecommerce.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {

    private CategoryService categoryService;

    public CategoryController (CategoryService categoryService) {
        this.categoryService = categoryService;
    }



    @GetMapping("/api/public/categories")
    public List<Category> getCategories() {
        return categoryService.getAllCategories();
    }

    @PostMapping("/api/admin/categories")
    public String createCategory(@RequestBody Category category){
        return categoryService.createCategory(category);
    }

    @DeleteMapping("/api/admin/deletecategory/{categoryId}")
    public String deleteCategory(@PathVariable Long categoryId){
        return categoryService.deleteCategory(categoryId);
    }
}
