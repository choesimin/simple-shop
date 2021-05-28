package com.alethio.shop.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Restock;

@Repository
public class JdbcRestockDAO implements RestockDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;	

	@Override
	public List<Restock> selectAll() {
		String sql = "select id, item_id, company_name, encrypt_item_name, amount from restock order by id desc";
		List<Restock> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Restock>(Restock.class));

		return list;
	}
	
	@Override
	public void insert(Restock restock) {
		String sql = "insert into restock(item_id, company_name, encrypt_item_name, amount) values(?, ?, ?, ?)";
		jdbcTemplate.update(sql
			, restock.getItem_id()
			, restock.getCompany_name()
			, restock.getEncrypt_item_name()
			, restock.getAmount()
		);
	}
	
	@Override
	public void delete(int id) {
		String sql = "delete from restock where id = ?";
		jdbcTemplate.update(sql, id);
	}

}
