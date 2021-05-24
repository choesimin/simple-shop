package com.alethio.shop.model.domain;

import lombok.Data;

@Data
public class Order {
	private int order_id;
	private int item_id;
	private String email;
	private String name;
	private String mobile;
}
