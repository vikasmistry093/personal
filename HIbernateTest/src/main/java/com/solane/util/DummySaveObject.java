package com.solane.util;

import java.util.List;

import com.solane.model.Category;
import com.solane.model.Product;

public class DummySaveObject {

	private List<Category> categories;
	private List<Product> products;
	
	public DummySaveObject() {};
	
	public DummySaveObject(List<Category> categories, List<Product> products) {
		super();
		this.categories = categories;
		this.products = products;
	}
	public List<Category> getCategories() {
		return categories;
	}
	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
	public List<Product> getProducts() {
		return products;
	}
	public void setProducts(List<Product> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "DummySaveObject [categories=" + categories + ", products=" + products + "]";
	}
	
	
	
}
