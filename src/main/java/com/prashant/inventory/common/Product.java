package com.prashant.inventory.common;

import java.math.BigDecimal;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

	private String name;
	private BigDecimal price;
	private String description;
	private String largeDescription;
	private List<String> tags;
	private Category category;
	private Rating rating;
	private List<Comment> comments;

}
