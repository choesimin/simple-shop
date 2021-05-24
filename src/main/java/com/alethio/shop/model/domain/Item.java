package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Item {
	private int item_id;
	private String name;
	private int stock;
}
