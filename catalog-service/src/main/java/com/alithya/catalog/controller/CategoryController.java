/**
 * 
 */
package com.alithya.catalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alithya.catalog.config.CatalogProperties;
import com.alithya.catalog.service.UserService;


/**
 * @author gnaoussi
 *
 */

@RestController
public class CategoryController {

	private final CatalogProperties catalogProperties;
	
	private final UserService userService;
	
	/**
	 * @param catalogProperties
	 * @param userService
	 */
	public CategoryController(CatalogProperties catalogProperties, UserService userService) {
		this.catalogProperties = catalogProperties;
		this.userService = userService;
	}

	@Value("${category}")
	private String nom;
	
	@GetMapping("/category")
	public List<String> getCategories() {
		return catalogProperties.getCategories();
	}
	
	@GetMapping("/category/{id}")
	public String getCategory(@PathVariable Integer id) {
		return catalogProperties.getCategories().get(id);
	}
	
	@GetMapping("/category/nom")
	public String getNom() {
		return nom;
	}
	
	@GetMapping("/customers")
	public List<String> getCustomers(){
		return userService.getCustomers();
	}
}
