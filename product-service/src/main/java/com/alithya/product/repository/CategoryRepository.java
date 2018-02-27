/**
 * 
 */
package com.alithya.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alithya.product.domain.Category;

/**
 * @author gnaoussi
 *
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
