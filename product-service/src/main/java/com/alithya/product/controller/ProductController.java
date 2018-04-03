package com.alithya.product.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alithya.product.config.ProductProperties;
import com.alithya.product.microservice.UserMicroService;
import com.alithya.product.service.UserService;

import lombok.extern.slf4j.Slf4j;


/**
 * @author gnaoussi
 *
 */
@Slf4j
@RestController
@RequestMapping("/products")
public class ProductController {
	
	private final ProductProperties productProperties;
	
	private final UserService userService;
	
	/**
	 * @param productProperties
	 */
	public ProductController(ProductProperties productProperties, UserService userService) {
		this.productProperties = productProperties;
		this.userService = userService;
	}


	@GetMapping(value= {"/suppliers"})
	public List<String> listStoreWithSuppliers(){
		List<String> results = new ArrayList<>();
		List<String> suppliers = userService.getSuppliers();
		log.info("Suppliers size {}",suppliers.size());
		List<String> productInStore = productProperties.getStoreProducts();
		log.info("Product in store size {}", productInStore.size());
		
		if(suppliers.isEmpty()) {
			for (String product : productProperties.getStoreProducts()) {
				results.add(product);
			}
		}else {
			int i = 0;
			for (String product : productProperties.getStoreProducts()) {
				results.add(product+" "+suppliers.get(i));
				i++;
			}
		}
		
		return results;
	}
	
	@GetMapping(value= {"","/"})
	public List<String> listStore(){
		return  productProperties.getStoreProducts();
	}
}
