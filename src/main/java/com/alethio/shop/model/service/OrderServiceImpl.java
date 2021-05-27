package com.alethio.shop.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alethio.shop.model.domain.Order;
import com.alethio.shop.model.repository.OrderDAO;

@Service
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderDAO orderDAO;
	
	@Override
	public List<Order> getList() {
		return orderDAO.selectAll();
	};

	@Override
	public void regist(Order order) {
		
		order.setContact_email(order.getContact_email().trim());
		order.setContact_name(order.getContact_name().trim());
		order.setContact_mobile(order.getContact_mobile().trim());
		
		orderDAO.insert(order);
	}

	@Override
	public void delete(int id) {
		orderDAO.delete(id);
	}

}
