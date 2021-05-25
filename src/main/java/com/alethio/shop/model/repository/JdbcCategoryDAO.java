package com.alethio.shop.model.repository;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Category;

@Repository
public class JdbcCategoryDAO implements CategoryDAO {
	
	@Autowired
    DataSource dataSource;
	
	@Autowired
    JdbcTemplate jdbcTemplate;	

	public void insert(Category category) {
		
		try {
			Connection connection = dataSource.getConnection();
		} catch (SQLException e) {
			e.printStackTrace();
		}

		jdbcTemplate.execute("insert into category(name) values('" + category.getName() + "')");
		
	}
	
	public void delete() {
		
	}
	
}
