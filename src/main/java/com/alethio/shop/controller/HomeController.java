package com.alethio.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.domain.Order;
import com.alethio.shop.model.service.ItemService;
import com.alethio.shop.model.service.OrderService;

@Controller
public class HomeController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private OrderService orderService;
	
	
	/* Home page */
	
	@GetMapping()
	public String getHome(Model model) {
		List<Item> item_list = itemService.getList();
		model.addAttribute("item_list", item_list);
		
		return "home";
	}
	
	

	/* Order */
	
	@PostMapping("/order")
	public String order(Order order) throws Throwable {
		orderService.regist(order);
		
		return "redirect:/";
	}
	

}
