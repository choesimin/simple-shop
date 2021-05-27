package com.alethio.shop.model.domain;

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
	private int item_name;
	private int category_name;
}
