package com.simin.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.simin.shop.model.domain.Item;
import com.simin.shop.model.domain.Restock;
import com.simin.shop.model.repository.ItemDAO;
import com.simin.shop.model.repository.RestockDAO;

@Service
public class RestockServiceImpl implements RestockService {
	
	@Autowired
	ItemDAO itemDAO;
	
	@Autowired
	RestockDAO restockDAO;
	
	@Override
	public List<Restock> getList() {
		return restockDAO.selectAll();
	};

	@Override
	public void regist(Restock restock) {
		Item item = itemDAO.select(restock.getItem_id());
		
		if (restock.getCompany_name().equals("amadon")) {
			restock.setEncrypt_item_name(item.getName() + 123);
		} else if (restock.getCompany_name().equals("coumang")) {
			restock.setEncrypt_item_name(123 + item.getName());
		} else {
			restock.setEncrypt_item_name(".");
		}

		restockDAO.insert(restock);
	}

	@Override
	public void delete(int id) {
		restockDAO.delete(id);
	}

}
