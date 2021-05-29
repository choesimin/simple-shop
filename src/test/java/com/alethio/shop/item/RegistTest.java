package com.alethio.shop.item;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.service.ItemService;

@SpringBootTest
public class RegistTest {

	@Autowired
	private ItemService itemService;

	@Test
	void contextLoads() {
		
		Item item = new Item();
		item.setCategory_id(1);
		item.setName("순대");
		item.setStock(1000);
		
		itemService.regist(item);
		
		for (Item item_of_list : itemService.getList()) {
			System.out.println("---");
			System.out.println("item id : " + item_of_list.getId());
			System.out.println("category id : " + item_of_list.getCategory_id());
			System.out.println("item name : " + item_of_list.getName());
			System.out.println("stock : " + item_of_list.getStock());
			System.out.println("category name (joined) : " + item_of_list.getCategory_name());
		}
		
	}

}
