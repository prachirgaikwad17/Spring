package com.zensar.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.daos.ProductDao;
import com.zensar.daos.ProductDaoImpl;
import com.zensar.entities.Product;

/**
 * @author Prachi Gaikwad
 * @creation_date 4th Oct 2019 11:45AM
 * @modification_date 10th Oct 2019 5:20PM
 * @version 2.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Service Interface of Product used in Business layer.
 *				
 */

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductDao productDao;
	
	
	@Override
	public List<Product> findAllProducts() {
		// TODO Auto-generated method stub
		return productDao.getAll();
	}

	@Override
	public Product findProductById(int productId) {
		// TODO Auto-generated method stub
		Product product=productDao.getById(productId);
		return product;
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
			productDao.insert(product);
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		productDao.update(product);
	}

	@Override
	public void remove(Product product) {
		// TODO Auto-generated method stub
		productDao.delete(product);
	}

	@Override
	public List<Product> findProductsByPriceRange(float minPrice, float maxPrice) {
		// TODO Auto-generated method stub
		List<Product> allProducts=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:allProducts)
		{
			if(p.getPrice()>=minPrice&&p.getPrice()<=maxPrice)
			{
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public List<Product> findProductByName(String name) {
		// TODO Auto-generated method stub
		List<Product> allProducts=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:allProducts)
		{
			if(p.equals(name))
			{
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public List<Product> findProductByBrand(String brand) {
		// TODO Auto-generated method stub
		List<Product> allProducts=productDao.getAll();
		List<Product> list=new ArrayList<Product>();
		for(Product p:allProducts)
		{
			if(p.equals(brand))
			{
				list.add(p);
			}
		}
		return list;
	}

	@Override
	public long getProductCount() {
		// TODO Auto-generated method stub
		List<Product> allProducts=productDao.getAll();
		return (long) (allProducts.size());
		
	}

}
