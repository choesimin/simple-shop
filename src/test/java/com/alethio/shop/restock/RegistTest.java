package com.alethio.shop.restock;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simin.shop.model.domain.Restock;
import com.simin.shop.model.service.RestockService;

@SpringBootTest
public class RegistTest {

	@Autowired
	private RestockService restockService;

	@Test
	void contextLoads() {
		
		Restock restock = new Restock();
		restock.setItem_id(1);
		restock.setCompany_name("amadon");
		restock.setAmount(200);
		
		restockService.regist(restock);
		
		for (Restock restock_of_list : restockService.getList()) {
			System.out.println("---");
			System.out.println("restock id : " + restock_of_list.getId());
			System.out.println("item id : " + restock_of_list.getItem_id());
			System.out.println("company name : " + restock_of_list.getCompany_name());
			System.out.println("encrypt item name : " + restock_of_list.getEncrypt_item_name());
			System.out.println("amount : " + restock_of_list.getAmount());
			System.out.println("category name (joined) : " + restock_of_list.getCategory_name());
		}
		
	}

}
