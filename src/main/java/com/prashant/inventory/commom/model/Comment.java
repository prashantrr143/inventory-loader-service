package com.prashant.inventory.commom.model;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Comment {

	private String text;
	private LocalDate commentTimestamp;
	private String commentedBy;
	private Long upvote;
	private Long downVote;
}
