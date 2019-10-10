package com.zensar.daos;

import java.util.List;


import com.zensar.entities.Product;

/**
 * @author Prachi Gaikwad
 * @creation_date 4th Oct 2019 10:07AM
 * @modification_date 10th Oct 2019 4.04PM
 * @version 2.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Product Dao Interface used in Persistent layer.
 *				
 */

public interface ProductDao {
	List<Product> getAll();
	Product getById(int productId);
	void insert(Product product);
	void update(Product product);
	void delete(Product product);
}
