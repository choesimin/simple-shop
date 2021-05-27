package com.alethio.shop.model.service;

import java.util.List;

import com.alethio.shop.model.domain.Restock;

public interface RestockService {

	public List<Restock> getList();
	public void regist(Restock restock);
	public void delete(int id);

}
