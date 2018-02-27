/**
 * 
 */
package com.alithya.user.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author gnaoussi
 *
 */
@Component
@ConfigurationProperties(prefix="user")
public class UserProperties {
	
	private List<String> suppliers;
	
	private List<String> customers;

	/**
	 * @return the suppliers
	 */
	public List<String> getSuppliers() {
		return suppliers;
	}

	/**
	 * @param suppliers the suppliers to set
	 */
	public void setSuppliers(List<String> suppliers) {
		this.suppliers = suppliers;
	}

	/**
	 * @return the customers
	 */
	public List<String> getCustomers() {
		return customers;
	}

	/**
	 * @param customers the customers to set
	 */
	public void setCustomers(List<String> customers) {
		this.customers = customers;
	}
	
	
}
