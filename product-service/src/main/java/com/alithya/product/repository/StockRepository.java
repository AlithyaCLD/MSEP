/**
 * 
 */
package com.alithya.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alithya.product.domain.Stock;

/**
 * @author gnaoussi
 *
 */
public interface StockRepository extends JpaRepository<Stock, Long> {

}
