package com.alethio.shop.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alethio.shop.model.domain.Category;
import com.alethio.shop.model.repository.CategoryDAO;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;

	public void regist(Category category) {
		categoryDAO.insert(category);
	}

	public void delete() {
		
	};

}
