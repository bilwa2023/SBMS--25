package com.sb.ecommerce.service;

import com.sb.ecommerce.entity.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService{

    private List<Category> categories= new ArrayList<Category>();
    private Long categoryid=1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public String createCategory(Category category) {
//        for(Category c:categories){
//            if(category.getCategoryId()==c.getCategoryId()){
//                return "Category already exists";
//            }
//        }

        if(category.getCategoryId()==0){

            category.setCategoryId(categoryid++);
        }
        categories.add(category);
        return category.toString();
    }

    @Override
    public String deleteCategory(Long id) {
        Category category=categories.stream()
                .filter(c-> c.getCategoryId()==id)
                .findFirst().get();

        categories.remove(category);
        return "Category removed with category id "+id+" successfullly";
    }


}
