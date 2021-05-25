package com.alethio.shop.model.repository;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Category;

@Repository
public class JdbcCategoryDAO implements CategoryDAO {
	@Autowired
    DataSource dataSource;
	
	@Autowired
    JdbcTemplate jdbcTemplate;	

	@Override
	public List<Category> selectAll() {
		String sql = "select * from category order by category_id";
		List<Category> category_list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));

		return category_list;
	}
	
	@Override
	public void insert(Category category) {
		String sql = "insert into category(name) values(?)";
		jdbcTemplate.update(sql, category.getName());
	}
	
	@Override
	public void delete(int category_id) {
		String sql = "delete from category where category_id = ?";
		jdbcTemplate.update(sql, category_id);
	}

}
