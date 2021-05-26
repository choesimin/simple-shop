package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Order {
	private int id;
	private String item_name;
	private String email;
	private String name;
	private String mobile;
}
