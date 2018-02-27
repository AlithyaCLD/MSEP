/**
 * 
 */
package com.alithya.notification.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.alithya.notification.domain.Post;
import com.alithya.notification.exception.EntityNotFoundException;
import com.alithya.notification.service.PostService;

/**
 * @author gnaoussi
 *
 */
@RestController
public class PostController {

	private PostService postservice;
	
	/**
	 * @param postservice
	 */
	public PostController(PostService postservice) {
		this.postservice = postservice;
	}

	@GetMapping("/comments/product/{id}")
	public ResponseEntity<List<Post>> getAllPostByProductId(@PathVariable Long id){
		return ResponseEntity.ok().body(postservice.findByProductId(id));
	}
	
	@GetMapping("/comments/user/{id}")
	public ResponseEntity<List<Post>> getAllPostByUserId(@PathVariable Long id){
		return ResponseEntity.ok().body(postservice.findByUserId(id));
	}
	
	@GetMapping("/comments/{id}")
	public ResponseEntity<Post> getPostById(@PathVariable Long id) throws EntityNotFoundException{
		Post post = postservice.findOne(id).orElseThrow(()-> new EntityNotFoundException());
		return ResponseEntity.ok().body(post);
	}
	
	@PostMapping("/comments/")
	public ResponseEntity<Post> save(@RequestBody Post post){
		return ResponseEntity.ok().body(postservice.save(post));
	}
	
	@PutMapping("/comments/")
	public ResponseEntity<Post> update(@RequestBody Post post){
		return ResponseEntity.ok().body(postservice.save(post));
	}
	
	@DeleteMapping("/comments/{id}")
	public ResponseEntity<Post> save(@PathVariable Long id){
		postservice.deleteById(id);
		return ResponseEntity.ok().build();
	}
}
