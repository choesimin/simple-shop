package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Restock {
	private int id;
	private String company;
	private String item_name;
	private String encrypt_item_name;
	private int amount;
}
