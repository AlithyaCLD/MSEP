/**
 * 
 */
package com.alithya.notification.domain;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;

import lombok.Data;

/**
 * @author gnaoussi
 *
 */
@Document
@Data
public class Post {

	@Id
	private Long id;
	
	private Long productId;
	
	private Long userId;
	
	private String content;
	
	private Long postId;
	
	private Integer note;
	
	
}
