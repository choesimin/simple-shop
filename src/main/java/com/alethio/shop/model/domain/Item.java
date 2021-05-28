package com.alethio.shop.model.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Item {
	private int id;
	private int category_id;
	private String name;
	private int stock;

	/* Join Elements */
	private String category_name;
}
