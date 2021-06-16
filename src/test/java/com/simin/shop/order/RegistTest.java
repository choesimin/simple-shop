package com.simin.shop.order;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simin.shop.model.domain.Order;
import com.simin.shop.model.service.OrderService;

@SpringBootTest
public class RegistTest {

	@Autowired
	private OrderService orderService;

	@Test
	void contextLoads() throws Throwable {
		
		Order order = new Order();
		order.setItem_id(1);
		order.setAmount(10);
		order.setContact_email("test@test.com");
		order.setContact_name("김철수");
		order.setContact_mobile("01023456789");

		orderService.regist(order);
		
		for (Order order_of_list : orderService.getList()) {
			System.out.println("---");
			System.out.println("order id : " + order_of_list.getId());
			System.out.println("item id : " + order_of_list.getItem_id());
			System.out.println("amount : " + order_of_list.getAmount());
			System.out.println("contact email : " + order_of_list.getContact_email());
			System.out.println("contact name : " + order_of_list.getContact_name());
			System.out.println("contact mobile : " + order_of_list.getContact_mobile());
			System.out.println("item name (joined) : " + order_of_list.getItem_name());
			System.out.println("category name (joined) : " + order_of_list.getCategory_name());
		}
		
	}

}
