/**
 * 
 */
package com.alithya.product.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import lombok.Data;

/**
 * @author gnaoussi
 *
 */

@Entity
@Data
@Table(name="stock",uniqueConstraints=@UniqueConstraint(columnNames={"product_id", "supplier_id"}))
public class Stock {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	private Long quantity;
	
	private Long quantityThreshold;
	
	@Column(name="supplier_id")
	private Long supplierId;
	
	@NotNull
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
}
