package com.alethio.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alethio.shop.model.domain.Category;
import com.alethio.shop.model.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/manage/category")
	public String getView() {
		return "manage/category";
	}
	
	@PostMapping("/manage/category/add")
	public String addCategory(Category category) {
		System.out.println("category name (controller) : " + category.getName());
		
		categoryService.regist(category);
		
		return "redirect:/manage/category";
	}

}
