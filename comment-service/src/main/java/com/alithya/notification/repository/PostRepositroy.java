/**
 * 
 */
package com.alithya.notification.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.alithya.notification.domain.Post;

/**
 * @author gnaoussi
 *
 */
public interface PostRepositroy extends MongoRepository<Post, Long> {
	
	List<Post> findByProductId(Long productId);
	
	List<Post> findByUserId(Long userId);
}
