/**
 * 
 */
package com.alithya.product.config;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author gnaoussi
 *
 */
@Component
@ConfigurationProperties(prefix="product")
public class ProductProperties {

	private List<String> storeProducts;

	/**
	 * @return the storeProducts
	 */
	public List<String> getStoreProducts() {
		return storeProducts;
	}

	/**
	 * @param storeProducts the storeProducts to set
	 */
	public void setStoreProducts(List<String> storeProducts) {
		this.storeProducts = storeProducts;
	}	
}
