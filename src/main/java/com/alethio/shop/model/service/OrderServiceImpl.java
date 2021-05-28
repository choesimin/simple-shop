package com.alethio.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alethio.shop.exception.ItemNotEnoughException;
import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.domain.Order;
import com.alethio.shop.model.domain.Restock;
import com.alethio.shop.model.repository.ItemDAO;
import com.alethio.shop.model.repository.OrderDAO;
import com.alethio.shop.model.repository.RestockDAO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDAO;
	
	@Autowired
	private ItemDAO itemDAO;
	
	@Autowired
	private RestockDAO restockDAO;
	
	@Override
	public List<Order> getList() {
		return orderDAO.selectAll();
	};

	@Override
	public void regist(Order order) throws Throwable {
		
		Item item = itemDAO.select(order.getItem_id());
		int stock = 0;
		
		if (item != null) {
				
			/* Caluate item stock */
			stock = item.getStock() - order.getAmount();
			
			if (stock >= 0) {
				/* Order set and insert to table */
				order.setContact_email(order.getContact_email().trim());
				order.setContact_name(order.getContact_name().trim());
				order.setContact_mobile(order.getContact_mobile().trim());
				orderDAO.insert(order);	
				
				/* Set Order and insert to table */
				item.setStock(stock);
				itemDAO.update(item);

				/* Request restock */
				if (stock < 10) {
					Restock restock = new Restock();
					restock.setItem_id(item.getId());
					restock.setAmount(10);
				
					if (item.getCategory_name().equals("food")) {
						restock.setCompany_name("amadon");
						restock.setEncrypt_item_name(item.getName() + 123);
					} else if (item.getCategory_name().equals("clothes")) {
						restock.setCompany_name("coumang");
						restock.setEncrypt_item_name(123 + item.getName());
					} else {
						restock.setCompany_name(".");
						restock.setEncrypt_item_name(item.getName());
					}

					restockDAO.insert(restock);
				}

			} else {
				throw new ItemNotEnoughException("Item is not enough");
			}

		} else {
			throw new ItemNotEnoughException("Item is not exist");
		}
	}

	@Override
	public void delete(int id) {
		orderDAO.delete(id);
	}

}
