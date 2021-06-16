package com.simin.shop.model.service;

import java.util.List;

import com.simin.shop.model.domain.Restock;

public interface RestockService {

	public List<Restock> getList();
	public void regist(Restock restock);
	public void delete(int id);

}
