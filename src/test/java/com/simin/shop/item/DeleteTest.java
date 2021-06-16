package com.simin.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simin.shop.model.domain.Item;
import com.simin.shop.model.service.ItemService;

@SpringBootTest
public class DeleteTest {

	@Autowired
	private ItemService itemService;

	@Test
	void contextLoads() {
		
		itemService.delete(1);
		
		for (Item item : itemService.getList()) {
			System.out.println("---");
			System.out.println("item id : " + item.getId());
			System.out.println("category id : " + item.getCategory_id());
			System.out.println("item name : " + item.getName());
			System.out.println("stock : " + item.getStock());
			System.out.println("category name (joined) : " + item.getCategory_name());
		}
		
	}

}
