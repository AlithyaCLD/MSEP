/**
 * 
 */
package com.alithya.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alithya.product.domain.Product;

/**
 * @author gnaoussi
 *
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
