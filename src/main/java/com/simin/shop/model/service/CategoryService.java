package com.simin.shop.model.service;

import java.util.List;

import com.simin.shop.model.domain.Category;

public interface CategoryService {

	public List<Category> getList();
	public void regist(Category category);
	public void delete(int id);

}
