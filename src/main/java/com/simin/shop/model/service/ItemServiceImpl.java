package com.simin.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simin.shop.model.domain.Item;
import com.simin.shop.model.repository.ItemDAO;

@Service
public class ItemServiceImpl implements ItemService {
	
	@Autowired
	ItemDAO itemDAO;

	@Override
	public List<Item> getList() {
		return itemDAO.selectAll();
	}

	@Override
	public void regist(Item item) {
		itemDAO.insert(item);
	}

	@Override
	public void update(Item item) {
		itemDAO.update(item);
	}

	@Override
	public void delete(int id) {
		itemDAO.delete(id);
	}

	@Override
	public int countById(int id) {
		return itemDAO.countById(id);
	}
	


}
