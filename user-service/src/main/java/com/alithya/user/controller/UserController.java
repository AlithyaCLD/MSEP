/**
 * 
 */
package com.alithya.user.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.alithya.user.config.UserProperties;

/**
 * @author gnaoussi
 *
 */
@RestController
public class UserController {

	private final UserProperties userProperties;
	
	/**
	 * @param userProperties
	 */
	public UserController(UserProperties userProperties) {
		this.userProperties = userProperties;
	}

	@GetMapping("/customers")
	public List<String> getCustomers(){
		return userProperties.getCustomers();
	}
	
	@GetMapping("/suppliers")
	public List<String> getSuppliers(){
		return userProperties.getSuppliers();
	}
	
	@GetMapping("/customers/{id}")
	public String getCustomer(@PathVariable("id") Integer index){
		if (index < userProperties.getCustomers().size()) {
			return userProperties.getCustomers().get(index);
		}else {
			return "Nothing found";
		}
	}
	
	@GetMapping("/suppliers/{id}")
	public String getSupplier(@PathVariable("id") Integer index){
		if (index < userProperties.getSuppliers().size()) {
			return userProperties.getSuppliers().get(index);
		}else {
			return "Nothing found";
		}
		
	}
}
