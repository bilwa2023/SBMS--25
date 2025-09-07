package com.sb.ecommerce.controller;

import com.sb.ecommerce.entity.Category;
import com.sb.ecommerce.service.CategoryService;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

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
    public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId){
    	try {
        String status=categoryService.deleteCategory(categoryId);
        	return new ResponseEntity<>(status,HttpStatus.OK);
    	}catch(ResponseStatusException e) {
    		return new ResponseEntity<>(e.getReason(),e.getStatusCode());
    	}
    }
}
