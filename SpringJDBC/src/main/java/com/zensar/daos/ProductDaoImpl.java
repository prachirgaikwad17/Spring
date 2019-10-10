package com.zensar.daos;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.zensar.entities.Product;

/**
 * @author Prachi Gaikwad
 * @creation_date 4th Oct 2019 10:23AM
 * @modification_date 10th Oct 2019 4.04PM
 * @version 2.0
 * @copyright Zensar Technologies.All rights reserved.
 * @description It is Dao Class of Product used in Persistent layer.
 *				
 */

@Repository          //for repository class
public class ProductDaoImpl implements ProductDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		String sql="select * from product1";
		return jdbcTemplate.query(sql, new ResultSetExtractor<List<Product>>() {

			@Override
			public List<Product> extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				List<Product> products=new ArrayList<Product>();
				while(rs.next())
				{
					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					products.add(product);
				}
				return products;
			}
		});
	}

	@Override
	public Product getById(int productId) {
		// TODO Auto-generated method stub
		String sql="select * from product1 where id=?";
		return jdbcTemplate.query(sql, new Object[] {productId}, new ResultSetExtractor<Product>() {

			@Override
			public Product extractData(ResultSet rs) throws SQLException, DataAccessException {
				// TODO Auto-generated method stub
				if(rs.next())
				{

					Product product=new Product();
					product.setProductId(rs.getInt(1));
					product.setName(rs.getString(2));
					product.setBrand(rs.getString(3));
					product.setPrice(rs.getFloat(4));
					return product;
				}
				else
				{
					return null;
				}
			}
		});
	}

	@Override
	public void insert(Product product) {
		// TODO Auto-generated method stub
		/*String sql="insert into product1 values(?,?,?,?)";
		jdbcTemplate.update(sql, product.getProductId(),product.getName(),product.getBrand(),product.getPrice());
		System.out.println("New product is inserted");*/
	}

	@Override
	public void update(Product product) {
		// TODO Auto-generated method stub
		/*String sql="update product1 set name=?,brand=?,price=? where id=?";
		jdbcTemplate.update(sql, product.getName(),product.getBrand(),product.getPrice(),product.getProductId());
		System.out.println("Product is updated");*/
		
	}

	@Override
	public void delete(Product product) {
		// TODO Auto-generated method stub
		String sql="delete from product1 where id=?";
		jdbcTemplate.update(sql, product.getProductId());
		System.out.println("Product is deleted");
	}

	}





/*
 select query:
 Working Directory: D:\Prachi\Assignments\spring\SpringJDBC
Gradle user home: C:\Users\Zensar123\.gradle
Gradle Distribution: Gradle wrapper from target build
Gradle Version: 5.6.1
Java Home: C:\Program Files\Java\jdk1.8.0_111
JVM Arguments: None
Program Arguments: None
Build Scans Enabled: false
Offline Mode Enabled: false
Gradle Tasks: run

> Task :compileJava
> Task :processResources UP-TO-DATE
> Task :classes

> Task :run
Product [productId=1001, name=LED TV, brand=Sony, price=45000.0]
Product [productId=1002, name=Laptop, brand=HP, price=50000.0]
Product [productId=1003, name=Mobile, brand=Samsung, price=19900.0]
Product [productId=1004, name=Speaker, brand=Boat, price=1002.0]
Product [productId=1005, name=Tablet, brand=iBall, price=1000.0]
Product [productId=1006, name=TV, brand=Sony, price=45000.0]
Product [productId=1007, name=AC, brand=BlueStar, price=30000.0]
Product [productId=1008, name=PC, brand=Dell, price=40000.0]

BUILD SUCCESSFUL in 2s
3 actionable tasks: 2 executed, 1 up-to-date
 
 
 
 


getById query:
Product [productId=1001, name=LED TV, brand=Sony, price=45000.0]




insertProduct:
mysql> select * from product1;
+------+---------+----------+-------+
| id   | name    | brand    | price |
+------+---------+----------+-------+
| 1001 | LED TV  | Sony     | 45000 |
| 1002 | Laptop  | HP       | 50000 |
| 1003 | Mobile  | Samsung  | 19900 |
| 1004 | Speaker | Boat     |  1002 |
| 1005 | Tablet  | iBall    |  1000 |
| 1006 | TV      | Sony     | 45000 |
| 1007 | AC      | BlueStar | 30000 |
| 1008 | PC      | Dell     | 40000 |
+------+---------+----------+-------+
8 rows in set (0.05 sec)

New product is inserted

mysql> select * from product1;
+------+-----------------+----------+-------+
| id   | name            | brand    | price |
+------+-----------------+----------+-------+
| 1001 | LED TV          | Sony     | 45000 |
| 1002 | Laptop          | HP       | 50000 |
| 1003 | Mobile          | Samsung  | 19900 |
| 1004 | Speaker         | Boat     |  1002 |
| 1005 | Tablet          | iBall    |  1000 |
| 1006 | TV              | Sony     | 45000 |
| 1007 | AC              | BlueStar | 30000 |
| 1008 | PC              | Dell     | 40000 |
| 1009 | Washing Machine | Wirpool  | 40000 |
+------+-----------------+----------+-------+
9 rows in set (0.00 sec)





update query:

mysql> select * from product1;
+------+-----------------+----------+-------+
| id   | name            | brand    | price |
+------+-----------------+----------+-------+
| 1001 | LED TV          | Sony     | 45000 |
| 1002 | Laptop          | HP       | 50000 |
| 1003 | Mobile          | Samsung  | 19900 |
| 1004 | Speaker         | Boat     |  1002 |
| 1005 | Tablet          | iBall    |  1000 |
| 1006 | TV              | Sony     | 45000 |
| 1007 | AC              | BlueStar | 30000 |
| 1008 | PC              | Dell     | 40000 |
| 1009 | Washing Machine | Wirpool  | 40000 |
+------+-----------------+----------+-------+
9 rows in set (0.00 sec)


Product is updated


mysql> select * from product1;
+------+-----------------+----------+-------+
| id   | name            | brand    | price |
+------+-----------------+----------+-------+
| 1001 | LED TV          | Sony     | 50000 |
| 1002 | Laptop          | HP       | 50000 |
| 1003 | Mobile          | Samsung  | 19900 |
| 1004 | Speaker         | Boat     |  1002 |
| 1005 | Tablet          | iBall    |  1000 |
| 1006 | TV              | Sony     | 45000 |
| 1007 | AC              | BlueStar | 30000 |
| 1008 | PC              | Dell     | 40000 |
| 1009 | Washing Machine | Wirpool  | 50000 |
+------+-----------------+----------+-------+
9 rows in set (0.00 sec)






delete query:


mysql> select * from product1;
+------+-----------------+----------+-------+
| id   | name            | brand    | price |
+------+-----------------+----------+-------+
| 1001 | LED TV          | Sony     | 50000 |
| 1002 | Laptop          | HP       | 50000 |
| 1003 | Mobile          | Samsung  | 19900 |
| 1004 | Speaker         | Boat     |  1002 |
| 1005 | Tablet          | iBall    |  1000 |
| 1006 | TV              | Sony     | 45000 |
| 1007 | AC              | BlueStar | 30000 |
| 1008 | PC              | Dell     | 40000 |
| 1009 | Washing Machine | Wirpool  | 50000 |
+------+-----------------+----------+-------+
9 rows in set (0.00 sec)


Product is deleted

mysql> select * from product1;
+------+-----------------+----------+-------+
| id   | name            | brand    | price |
+------+-----------------+----------+-------+
| 1002 | Laptop          | HP       | 50000 |
| 1003 | Mobile          | Samsung  | 19900 |
| 1004 | Speaker         | Boat     |  1002 |
| 1005 | Tablet          | iBall    |  1000 |
| 1006 | TV              | Sony     | 45000 |
| 1007 | AC              | BlueStar | 30000 |
| 1008 | PC              | Dell     | 40000 |
| 1009 | Washing Machine | Wirpool  | 50000 |
+------+-----------------+----------+-------+
8 rows in set (0.00 sec)





BUILD SUCCESSFUL in 2s
3 actionable tasks: 2 executed, 1 up-to-date

 */
