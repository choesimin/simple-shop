package com.alethio.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alethio.shop.model.domain.Restock;
import com.alethio.shop.model.repository.RestockDAO;

@Service
public class RestockServiceImpl implements RestockService {
	
	@Autowired
	RestockDAO restockDAO;
	
	@Override
	public List<Restock> getList() {
		return restockDAO.selectAll();
	};

	@Override
	public void regist(Restock restock) {
		if (restock.getCompany().equals("amadon")) {
			restock.setEncrypt_item_name(restock.getItem_name() + 123);
		} else if (restock.getCompany().equals("coumang")) {
			restock.setEncrypt_item_name(123 + restock.getItem_name());
		}

		restockDAO.insert(restock);
	}

	@Override
	public void delete(int id) {
		restockDAO.delete(id);
	}

}
