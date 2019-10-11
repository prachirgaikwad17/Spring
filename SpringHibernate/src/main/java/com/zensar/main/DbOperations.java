package com.zensar.main;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.zensar.entities.Product;
import com.zensar.services.ProductService;

public class DbOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("dbconfig.xml");
		ProductService productService=ctx.getBean("productServiceImpl", ProductService.class);
		List<Product> products=productService.findAllProducts();
		for(Product p:products)
		{
			System.out.println(p);
		}
		
		//Product p1=productService.findProductById(1001);
		/*if(p1!=null)
		{
			p1.setPrice(50000);
			productService.update(p1);
		}
		else
		{
			System.out.println("Product not found");
		}*/
		
		
		/*if(p1!=null)
		{
			productService.remove(p1);
		}
		else
		{
			System.out.println("Product not found");
		}*/
		
		//System.out.println("\n"+p1);
		
		//Product product=new Product(1009,"Washing Machine","Wirpool",40000); 
		//productService.add(product);
		

	}

}
