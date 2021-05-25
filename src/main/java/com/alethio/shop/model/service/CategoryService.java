package com.alethio.shop.model.service;

import java.util.List;

import com.alethio.shop.model.domain.Category;

public interface CategoryService {

	public List<Category> getList();
	public void regist(Category category);
	public void delete(int Category_id);

}
