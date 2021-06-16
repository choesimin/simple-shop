package com.simin.shop.model.repository;

import java.util.List;

import com.simin.shop.model.domain.Category;

public interface CategoryDAO {
	
	public List<Category> selectAll();
	public void insert(Category category);
	public void delete(int id);
	
}
