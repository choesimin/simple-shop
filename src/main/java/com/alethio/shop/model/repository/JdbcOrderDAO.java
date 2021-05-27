package com.alethio.shop.model.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.alethio.shop.model.domain.Order;

@Repository
public class JdbcOrderDAO implements OrderDAO {
	
	@Autowired
    private JdbcTemplate jdbcTemplate;	

	@Override
	public List<Order> selectAll() {
		String sql = "select * from orders order by id desc";
		List<Order> list = jdbcTemplate.query(sql, new BeanPropertyRowMapper<Order>(Order.class));

		return list;
	}
	
	@Override
	public void insert(Order order) {
		String sql = "insert into orders(item_id, amount, contact_email, contact_name, contact_mobile) values(?, ?, ?, ?, ?)";
		jdbcTemplate.update(sql
			, order.getItem_id()
			, order.getAmount()
			, order.getContact_email()
			, order.getContact_name()
			, order.getContact_mobile());
	}
	
	@Override
	public void delete(int id) {
		String sql = "delete from orders where id = ?";
		jdbcTemplate.update(sql, id);
	}

}
