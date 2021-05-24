package com.alethio.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OrderController {
	
	@GetMapping("/manage/order")
	public String getView() {
		return "manage/order";
	}

}
