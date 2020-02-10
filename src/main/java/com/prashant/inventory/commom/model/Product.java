package com.prashant.inventory.commom.model;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {

	@Id
	private String productId;
	private String name;
	private BigDecimal price;
	private String description;
	private String largeDescription;
	private List<Attribute> attributes;
	private List<String> tags;
	private List<Category> categories;
	private Long rating;
	private List<Comment> comments;

}
