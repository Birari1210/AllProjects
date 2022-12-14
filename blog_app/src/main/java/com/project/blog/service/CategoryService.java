package com.project.blog.service;

import java.util.List;

import com.project.blog.payroll.CategoryDto;

public interface CategoryService {
	
	
	CategoryDto createCategory(CategoryDto categoryDto);
	
	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);
	
    void deleteCategory(Integer categoryId);
     
    CategoryDto getCategoryById(Integer categoryId);
    
    List<CategoryDto> getCategories();

}
