package com.alethio.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alethio.shop.model.domain.Category;
import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.service.CategoryService;
import com.alethio.shop.model.service.ItemService;

@Controller
public class ItemController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private CategoryService categoryService;
	
	@GetMapping("/manage/item")
	public String getView(Model model) {
		List<Category> category_list = categoryService.getList();
		model.addAttribute("category_list", category_list);
		
		List<Item> item_list = itemService.getList();
		model.addAttribute("item_list", item_list);
		
		return "manage/item";
	}
	
	@PostMapping("/manage/item/add")
	public String addItem(Item item) {
		itemService.regist(item);
		
		return "redirect:/manage/item";
	}

	@PostMapping("/manage/item/update")
	public String updateItem(Item item) {
		itemService.update(item);
		
		return "redirect:/manage/item";
	}
	
	@PostMapping("/manage/item/delete")
	public String deleteItem(int id) {
		itemService.delete(id);
		
		return "redirect:/manage/item";
	}
	
}
