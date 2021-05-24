package com.alethio.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CategoryController {
	
	@GetMapping("/manage/category")
	public String getView() {
		return "manage/category";
	}

}
