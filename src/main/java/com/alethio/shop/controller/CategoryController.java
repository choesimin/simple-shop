package com.alethio.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.alethio.shop.model.domain.Category;
import com.alethio.shop.model.service.CategoryService;

@Controller
public class CategoryController {
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/manage/category")
	public String getView(Model model) {
		List<Category> category_list = categoryService.getList();
		model.addAttribute("category_list", category_list);

		return "manage/category";
	}
	
	@PostMapping("/manage/category/add")
	public String addCategory(Category category) {
		categoryService.regist(category);
		
		return "redirect:/manage/category";
	}
	
	@PostMapping("/manage/category/delete")
	public String deleteCategory(int category_id) {
		categoryService.delete(category_id);
		
		return "redirect:/manage/category";
	}

}
