package com.alethio.shop.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Category;

@Repository
public class JdbcCategoryDAO implements CategoryDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;	

	@Override
	public List<Category> selectAll() {
		String sql = "select * from category order by id desc";
		List<Category> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Category>(Category.class));

		return list;
	}
	
	@Override
	public void insert(Category category) {
		String sql = "insert into category(name) values(?)";
		jdbcTemplate.update(sql, category.getName());
	}
	
	@Override
	public void delete(int id) {
		String sql = "delete from category where id = ?";
		jdbcTemplate.update(sql, id);
	}

}
