package com.simin.shop.model.service;

import java.util.List;

import com.simin.shop.model.domain.Item;

public interface ItemService {

	public List<Item> getList();
	public void regist(Item item);
	public void update(Item item);
	public void delete(int id);
	public int countById(int id);

}
