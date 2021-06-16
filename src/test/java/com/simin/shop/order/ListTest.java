package com.simin.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simin.shop.model.domain.Order;
import com.simin.shop.model.service.OrderService;

@SpringBootTest
public class ListTest {

	@Autowired
	private OrderService orderService;

	@Test
	void contextLoads() {
		
		for (Order order : orderService.getList()) {
			System.out.println("---");
			System.out.println("order id : " + order.getId());
			System.out.println("item id : " + order.getItem_id());
			System.out.println("amount : " + order.getAmount());
			System.out.println("contact email : " + order.getContact_email());
			System.out.println("contact name : " + order.getContact_name());
			System.out.println("contact mobile : " + order.getContact_mobile());
			System.out.println("item name (joined) : " + order.getItem_name());
			System.out.println("category name (joined) : " + order.getCategory_name());
		}
		
	}

}
