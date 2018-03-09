/**
 * 
 */
package com.alithya.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.alithya.product.microservice.UserMicroService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * @author gnaoussi
 *
 */
@Service
public class UserService {

	private final UserMicroService userMicroService;
		
	/**
	 * @param userMicroService
	 */
	public UserService(UserMicroService userMicroService) {
		this.userMicroService = userMicroService;
	}

	public List<String> getCustomers(){
		return userMicroService.getCustomers();
	}
	
	public String getCustomer(@PathVariable("id") Integer customerId){
		return userMicroService.getCustomer(customerId);
	}
	
	@HystrixCommand(fallbackMethod="getSuppliersFallBack")
	public List<String> getSuppliers(){
		return userMicroService.getSuppliers();
	}
	
	public List<String> getSuppliersFallBack(){
		return new ArrayList<>();
	}
	
	public String getSupplier(@PathVariable("id") Integer supplierId){
		return userMicroService.getSupplier(supplierId);
	}
}
