package com.alethio.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RestockController {
	
	@GetMapping("/manage/restock")
	public String getView() {
		return "manage/restock";
	}

}
