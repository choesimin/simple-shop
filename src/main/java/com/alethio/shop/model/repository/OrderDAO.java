package com.alethio.shop.model.repository;

import java.util.List;

import com.alethio.shop.model.domain.Order;

public interface OrderDAO {

	public List<Order> selectAll();
	public void insert(Order order);
	public void delete(int id);

}
