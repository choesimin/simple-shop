package com.simin.shop.model.repository;

import java.util.List;

import com.simin.shop.model.domain.Restock;

public interface RestockDAO {

	public List<Restock> selectAll();
	public void insert(Restock restock);
	public void delete(int id);

}
