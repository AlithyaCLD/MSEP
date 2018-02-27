/**
 * 
 */
package com.alithya.catalog.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author gnaoussi
 *
 */
@FeignClient("user")
public interface UserService {

	@GetMapping("/user/customers")
	List<String> getCustomers();
	
	@GetMapping("/user/customers/{id}")
	String getCustomer(@PathVariable("id") Integer customerId);
	
	@GetMapping("/user/suppliers")
	List<String> getSuppliers();
	
	@GetMapping("/user/suppliers/{id}")
	String getSupplier(@PathVariable("id") Integer supplierId);
}
