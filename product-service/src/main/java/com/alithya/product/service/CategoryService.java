package com.alithya.product.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.alithya.product.domain.Category;
import com.alithya.product.repository.CategoryRepository;

@Service
public class CategoryService {

	private final CategoryRepository categoryRepository;
	
	public CategoryService(CategoryRepository categoryRepository) {
		// TODO Auto-generated constructor stub
		this.categoryRepository = categoryRepository;
	}
	
	public Category save(Category category) {
		return categoryRepository.save(category);
	}
	
	public Category update(Category category) {
		return categoryRepository.save(category);
	}
	
	public List<Category> getAllCategories(){
		return categoryRepository.findAll();
	}
	
	public Category findOneById(Long categoryId) {
		return categoryRepository.findOne(categoryId);
	}
	
	public void delete(Long id) {
		categoryRepository.delete(id);
	}
}
