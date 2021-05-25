package com.alethio.shop.model.repository;

import java.util.List;

import com.alethio.shop.model.domain.Category;

public interface CategoryDAO {
	
	public List<Category> selectAll();
	public void insert(Category category);
	public void delete(int category_id);
	
}
