package com.alethio.shop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.alethio.shop.model.domain.Category;
import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.domain.Order;
import com.alethio.shop.model.domain.Restock;
import com.alethio.shop.model.service.CategoryService;
import com.alethio.shop.model.service.ItemService;
import com.alethio.shop.model.service.OrderService;
import com.alethio.shop.model.service.RestockService;

@Controller
public class ManageController {
	
	@Autowired
	private ItemService itemService;
	
	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private RestockService restockService;
	
	@Autowired
	private OrderService orderService;
	
	
	
	/* Category */
	
	@GetMapping("/manage/category")
	public String getCategoryView(Model model) {
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
	public String deleteCategory(int id) {
		categoryService.delete(id);
		
		return "redirect:/manage/category";
	}
	
	
	
	/* Item */
	
	@GetMapping("/manage/item")
	public String getItemView(Model model) {
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
	
	
	
	/* Restock */
	
	@GetMapping("/manage/restock")
	public String getRestockView(Model model) {
		List<Item> item_list = itemService.getList();
		model.addAttribute("item_list", item_list);

		List<Restock> restock_list = restockService.getList();
		model.addAttribute("restock_list", restock_list);
		
		return "manage/restock";
	}
	
	@PostMapping("/manage/restock/add")
	public String addRestock(Restock restock) {
		restockService.regist(restock);
		
		return "redirect:/manage/restock";
	}
	
	@PostMapping("/manage/restock/delete")
	public String deleteRestock(int id) {
		restockService.delete(id);
		
		return "redirect:/manage/restock";
	}
	
	
	
	/* Order */
	
	@GetMapping("/manage/order")
	public String getOrderView(Model model) {
		List<Order> order_list = orderService.getList();
		model.addAttribute("order_list", order_list);
		
		return "manage/order";
	}
	
	@PostMapping("/manage/order/add")
	public String addOrder(Order order) throws Throwable {
		orderService.regist(order);
		
		return "redirect:/manage/order";
	}
	
	@PostMapping("/manage/order/delete")
	public String deleteOrder(int id) {
		orderService.delete(id);
		
		return "redirect:/manage/order";
	}
	
	
}
