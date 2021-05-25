package com.alethio.shop.model.repository;

import com.alethio.shop.model.domain.Category;

public interface CategoryDAO {
	
	public void insert(Category category);
	public void delete();
	
}
