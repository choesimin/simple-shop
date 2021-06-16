package com.simin.shop.model.service;

import java.util.List;

import com.simin.shop.model.domain.Order;

public interface OrderService {

	public List<Order> getList();
	public void regist(Order order) throws Throwable;
	public void delete(int id);

}
