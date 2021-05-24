package com.alethio.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ItemController {
	
	@GetMapping("/manage/item")
	public String getView() {
		
		return "manage/item";
	}
	
}