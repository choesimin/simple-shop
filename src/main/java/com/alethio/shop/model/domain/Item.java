package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Item {
	private int id;
	private int category_id;
	private String name;
	private int stock;

	private int category_name;
}
