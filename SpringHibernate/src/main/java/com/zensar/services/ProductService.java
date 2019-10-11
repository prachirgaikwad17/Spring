package com.zensar.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.zensar.entities.Product;

/**
 * @author Prachi Gaikwad
 * @creation_date 4th Oct 2019 11:39AM
 * @modification_date 10th Oct 2019 5:20PM
 * @version 2.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Service Interface of Product used in Business layer.
 *				
 */

public interface ProductService {
	List<Product> findAllProducts();
	Product findProductById(int productId);
	void add(Product product);
	void update(Product product);
	void remove(Product product);
	List<Product> findProductsByPriceRange(float minPrice,float maxPrice);
	List<Product> findProductByName(String name);
	List<Product> findProductByBrand(String brand);
	long getProductCount();
}
