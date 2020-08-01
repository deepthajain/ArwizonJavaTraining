package com.arwizon.service;

import java.util.*;

import com.arwizon.model.ProductDetails;

public interface ServiceInterface {

	public void addProduct(String name, String description, String manufacturerName, int price, int discount,
			String imgUrl, int noOfUnits, String category);

	public Set<ProductDetails> displayProduct();

	public Set<ProductDetails> searchProduct(String name);

	void updateProduct(int productId, int noOfUnits1);

	void deleteProduct(int productId);

	// public List<ProductDetails> searchProduct(String name,List<ProductDetails> li
	// );

	// public void updateProduct(int productId, int noOfUnits1, Set<ProductDetails>
	// li);

	// public Map<Integer, ProductDetails> deleteProduct(int productId, Map<Integer,
	// ProductDetails> li);

	// Map<Integer, ProductDetails> updateProduct(int productId, int noOfUnits1,
	// Map<Integer, ProductDetails> li);

	// public ProductDetails[] searchProduct(String name, ProductDetails[] arr);

}
