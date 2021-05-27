package com.alethio.shop.model.repository;

import java.util.List;

import com.alethio.shop.model.domain.Item;
import com.alethio.shop.model.domain.Restock;

public interface RestockDAO {

	public List<Restock> selectAll();
	public void insert(Restock restock);
	public void delete(int id);

}
