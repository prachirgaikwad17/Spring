package com.zensar.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

/**
 * @author Prachi Gaikwad
 * @creation_date 4th Oct 2019 10:07AM
 * @modification_date 11th Oct 2019 10:52AM
 * @version 4.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is a persistent class.
 * 				It represents database table PRODUCT1.
 * 				It is POJO class.
 *
 */

@Component
@Entity
@Table(name = "product1")
public class Product {
	@Id
	@Column(name = "id")
	private int productId;
	private String name;
	private String brand;
	private float price;
	
	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Product(int productId, String name, String brand, float price) {
		super();
		this.productId = productId;
		this.name = name;
		this.brand = brand;
		this.price = price;
	}


	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", name=" + name + ", brand=" + brand + ", price=" + price + "]";
	}


	public Product setPrice(double d) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
