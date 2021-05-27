package com.alethio.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.domain.Restock;
import com.alethio.shop.model.service.ItemService;
import com.alethio.shop.model.service.RestockService;

@Controller
public class RestockController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private RestockService restockService;
	
	@GetMapping("/manage/restock")
	public String getView(Model model) {
		List<Item> item_list = itemService.getList();
		model.addAttribute("item_list", item_list);

		List<Restock> restock_list = restockService.getList();
		model.addAttribute("restock_list", restock_list);
		
		return "manage/restock";
	}
	
	@PostMapping("/manage/restock/add")
	public String add(Restock restock) {
		restockService.regist(restock);
		
		return "redirect:/manage/restock";
	}
	
	@PostMapping("/manage/restock/delete")
	public String deleteRestock(int id) {
		restockService.delete(id);
		
		return "redirect:/manage/restock";
	}
}
