/**
 * 
 */
package com.alithya.product.microservice;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gnaoussi
 *
 */
@FeignClient("user")
public interface UserMicroService {

	@GetMapping("/customers")
	List<String> getCustomers();
	
	@GetMapping("/customers/{id}")
	String getCustomer(@PathVariable("id") Integer customerId);
	
	@GetMapping("/suppliers")
	List<String> getSuppliers();
	
	@GetMapping("/suppliers/{id}")
	String getSupplier(@PathVariable("id") Integer supplierId);
}
