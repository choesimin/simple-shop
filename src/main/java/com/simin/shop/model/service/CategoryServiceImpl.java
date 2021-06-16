package com.simin.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simin.shop.model.domain.Category;
import com.simin.shop.model.repository.CategoryDAO;

@Service
public class CategoryServiceImpl implements CategoryService {
	
	@Autowired
	CategoryDAO categoryDAO;
	
	@Override
	public List<Category> getList() {
		return categoryDAO.selectAll();
	};

	@Override
	public void regist(Category category) {
		categoryDAO.insert(category);
	}

	@Override
	public void delete(int id) {
		categoryDAO.delete(id);
	}


}
