package com.arwizon.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.arwizon.model.ProductDetails;

public class ServiceInterfaceImp implements ServiceInterface {
	Connection con = ConnectionClass.Connectiondb();
	@Override
	public void addProduct(String name, String description, String manufacturerName, int price, int discount,
			String imgUrl, int noOfUnits, String category) {
		ProductDetails p=new ProductDetails();
		
		try {

			String sql = "insert into ProductList values(?,?,?,?,?,?,?,?,?)";

			PreparedStatement stmt = con.prepareStatement(sql);
		
			stmt.setInt(1, ProductDetails.getCount());
			stmt.setString(2, name);
			stmt.setString(3, description);
			stmt.setString(4, manufacturerName);
			stmt.setInt(5, price);
			stmt.setInt(6, discount);
			stmt.setString(7, imgUrl);
			stmt.setInt(8, noOfUnits);
			stmt.setString(9, category);
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public Set<ProductDetails> displayProduct(){
		
		Set<ProductDetails> m1 = new HashSet<ProductDetails>();
	
		try {

			String sql = "select * from ProductList";
			PreparedStatement stmt = con.prepareStatement(sql);
		   
			
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				ProductDetails pd1=new ProductDetails();
				pd1.setProductId(rs.getInt(1));
				pd1.setName(rs.getString(2));
				pd1.setDescription(rs.getString(3));
				pd1.setManufacturerName(rs.getString(4));
				pd1.setPrice(rs.getInt(5));
				pd1.setDiscount(rs.getInt(6));
				pd1.setImgUrl(rs.getString(7));
				pd1.setNoOfUnits(rs.getInt(8));
				pd1.setCategory(rs.getString(9));
				m1.add(pd1);	             
			}
		} catch (SQLException e) {
			e.printStackTrace();

		}
		
		return m1;
		
	}


	public Set <ProductDetails> searchProduct(String name) {

		Set<ProductDetails> m2 = new HashSet<ProductDetails>();
		try {

			String sql = "select * from ProductList where name=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setString(1, name);
			ResultSet rs=stmt.executeQuery();
			
			while(rs.next()) {
				ProductDetails pd1=new ProductDetails();
				pd1.setProductId(rs.getInt(1));
				pd1.setName(rs.getString(2));
				pd1.setDescription(rs.getString(3));
				pd1.setManufacturerName(rs.getString(4));
				pd1.setPrice(rs.getInt(5));
				pd1.setDiscount(rs.getInt(6));
				pd1.setImgUrl(rs.getString(7));
				pd1.setNoOfUnits(rs.getInt(8));
				pd1.setCategory(rs.getString(9));
				m2.add( pd1);	
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return m2;

	}
		/*	Set<Integer> s = li.keySet();
		for (Integer p : s) {
			if (p == productId) {
				l1.put(p, li.get(p));
			}
		}
*/
			

	@Override
	public void deleteProduct(int productId) {

     try {
    	 String sql="delete from ProductList where productId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(1, productId);
			stmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}
	}

	@Override
	public void updateProduct(int productId, int noOfUnits) {
		
		
		try {
			String sql="update ProductList set noOfUnits=? where productId=?";
			PreparedStatement stmt = con.prepareStatement(sql);
			stmt.setInt(2, productId);
			stmt.setInt(1,noOfUnits );
			stmt.executeUpdate();

			} catch (SQLException e) {
				e.printStackTrace();
			}


			

		}
	}
	

// @Override
// public ProductDetails[] searchProduct(String name, ProductDetails[] arr) {
// ProductDetails[] arr1 = new ProductDetails[arr.length];
// int j = 0;

// for (int i = 0; i < arr.length; i++) {
// if (name.equals(arr[i].getName())) {
// arr1[j] = arr[i];
// j++;

// }
// }

// return arr1;
// }
