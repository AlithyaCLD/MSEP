/**
 * 
 */
package com.alithya.product.controller;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alithya.product.domain.Category;
import com.alithya.product.exception.EntityNotFoundException;
import com.alithya.product.service.CategoryService;

/**
 * @author gnaoussi
 *
 */
@RestController
@RequestMapping("/categories")
public class CategoryController {
	
	private CategoryService categoryService;
	
	

	/**
	 * @param categoryService
	 */
	public CategoryController(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	@GetMapping(value= {"","/"})
	public ResponseEntity<List<Category>> getAllCategories() {
		return new ResponseEntity<List<Category>>(categoryService.getAllCategories(), null, HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable Long id) throws EntityNotFoundException {
		Category category = categoryService.findOneById(id);
		if (category == null) {
			throw new EntityNotFoundException();
		}
		return new ResponseEntity<Category>(category, HttpStatus.OK);
	}
	
	@PostMapping("/")
	public ResponseEntity<Category> saveCategory(@RequestBody Category category) throws URISyntaxException {
		category = categoryService.save(category);
		return ResponseEntity.created(new URI("/category/"+category.getId()))
				.body(category);
	}
	
	@PutMapping("/")
	public ResponseEntity<Category> updateCategory(@RequestBody Category category) {
		category = categoryService.save(category);
		return ResponseEntity.ok()
				.body(category);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Category> deleteCategory(@PathVariable Long id) {
		categoryService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	
}
