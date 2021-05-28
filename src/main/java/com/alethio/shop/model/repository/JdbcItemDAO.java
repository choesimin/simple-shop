package com.alethio.shop.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Item;

@Repository
public class JdbcItemDAO implements ItemDAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public Item select(int id) {
		String sql = "select item.id as id, item.category_id as category_id, item.name as name, item.stock as stock, category.name as category_name from item join category where category.id = item.category_id and item.id = ? order by id desc";
		
		Item item = jdbcTemplate.queryForObject(sql
			, (resultSet, rowNum) -> new Item(
				resultSet.getInt("id")
				, resultSet.getInt("category_id")
				, resultSet.getString("name")
				, resultSet.getInt("stock")
				, resultSet.getString("category_name")
			)
		, id);
		return item;
	}

	@Override
	public List<Item> selectAll() {
		String sql = "select item.id as id, item.category_id as category_id, item.name as name, item.stock as stock, category.name as category_name from item join category where category.id = item.category_id order by id";
		List<Item> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Item>(Item.class));

		return list;
	}

	@Override
	public void insert(Item item) {
		String sql = "insert into item(category_id, name, stock) values(?, ?, ?)";
		jdbcTemplate.update(sql
			, item.getCategory_id()
			, item.getName()
			, item.getStock()
		);
	}

	@Override
	public void update(Item item) {
		String sql = "update item set stock = ? where id = ?";
		jdbcTemplate.update(sql, item.getStock(), item.getId());
	}

	@Override
	public void delete(int id) {
		String sql = "delete from item where id = ?";
		jdbcTemplate.update(sql, id);
	}

}
