package com.simin.shop.category;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.simin.shop.model.domain.Category;
import com.simin.shop.model.service.CategoryService;

@SpringBootTest
public class RegistTest {

	@Autowired
	private CategoryService categoryService;
	
	@Test
	void contextLoads() {
		
		Category category = new Category();
		category.setName("test category");
		
		categoryService.regist(category);
		
		for (Category category_local : categoryService.getList()) {
			System.out.println("---");
			System.out.println("category id : " + category_local.getId());
			System.out.println("category name : " + category_local.getName());
		}

			
	}

}
