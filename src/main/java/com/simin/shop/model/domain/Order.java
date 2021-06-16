package com.simin.shop.model.domain;

import lombok.Data;

@Data
public class Order {
	private int id;
	private int item_id;
	private int amount;
	private String contact_email;
	private String contact_name;
	private String contact_mobile;

	/* Join Elements */
	private String item_name;
	private String category_name;
}
