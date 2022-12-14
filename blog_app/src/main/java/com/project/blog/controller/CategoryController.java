package com.project.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.blog.payroll.ApiResponse;
import com.project.blog.payroll.CategoryDto;
import com.project.blog.service.CategoryService;


@RestController
@RequestMapping("/api/categorise")
public class CategoryController {
	
	@Autowired
	CategoryService categoryService;
	
	@PostMapping("/")
	public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto)
	{
		CategoryDto createCategoty = this.categoryService.createCategory(categoryDto);
	    return new ResponseEntity<CategoryDto>(createCategoty, HttpStatus.CREATED);
	    
	}
	
	@PutMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable("categoryId")  Integer categoryId)
	{
		 CategoryDto updateCategoty = this.categoryService.updateCategory(categoryDto, categoryId);
		return ResponseEntity.ok(updateCategoty);
	}
	
	@DeleteMapping("/{categoryId}")
	public  ResponseEntity<ApiResponse> deleteCategory(@PathVariable("categoryId") Integer categoryId)
	{
	    this.categoryService.deleteCategory(categoryId);
	    return new ResponseEntity<ApiResponse>(new ApiResponse("category is delete", true), HttpStatus.OK);
	}
	
	
	@GetMapping("/{categoryId}")
	public ResponseEntity<CategoryDto> getSingleUser(@PathVariable("categoryId") Integer categoryId)
	{
		
		return ResponseEntity.ok(this.categoryService.getCategoryById(categoryId));
		//return ResponseEntity.ok(new ApiResponse("Category not found ", true), HttpStatus.OK);
	}

	@GetMapping("/")
	public ResponseEntity<List<CategoryDto>> getAlluser()
	{
		return ResponseEntity.ok(this.categoryService.getCategories());
	}
}
