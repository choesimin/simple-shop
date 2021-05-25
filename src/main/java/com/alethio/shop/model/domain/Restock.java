package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Restock {
	private int restock_id;
	private int item_id;
	private String company;
	private String encrypt_name;
	private int amount;
}
