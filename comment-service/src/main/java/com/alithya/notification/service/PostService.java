/**
 * 
 */
package com.alithya.notification.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alithya.notification.domain.Post;
import com.alithya.notification.repository.PostRepositroy;

/**
 * @author gnaoussi
 *
 */
@Service
public class PostService {

	private PostRepositroy postRepositroy;
	
	
	
	/**
	 * @param postRepositroy
	 */
	public PostService(PostRepositroy postRepositroy) {
		this.postRepositroy = postRepositroy;
	}

	public Post save(Post post) {
		return postRepositroy.save(post);
	}
	
	public Optional<Post> findOne(Long id) {
		return postRepositroy.findById(id);
	}
	
	public List<Post> findByProductId(Long id) {
		return postRepositroy.findByProductId(id);
	}
	
	public List<Post> findByUserId(Long id) {
		return postRepositroy.findByUserId(id);
	}
	
	public List<Post> findAll(){
		return postRepositroy.findAll();
	}
	
	public void deleteById(Long id){
		postRepositroy.deleteById(id);
	}
}
