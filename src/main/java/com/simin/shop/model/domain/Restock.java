package com.simin.shop.model.domain;

import lombok.Data;

@Data
public class Restock {
	private int id;
	private int item_id;
	private String company_name;
	private String encrypt_item_name;
	private int amount;

	/* Join Elements */
	private String category_name;
	
	/* Temporary Value Storing Elements */
	private String item_name;
}
