package com.alethio.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	
	@GetMapping()
	public String getHome() {
		// Item List를 가져와서 보내주기
		
		return "home";
	}
	
}
