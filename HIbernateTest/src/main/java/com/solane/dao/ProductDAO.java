package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.Product;

@Repository
@Transactional
public class ProductDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	@SuppressWarnings("unchecked")
	public List<Product> getTopProducts() {
		Query query = getSession().createQuery("from Product");
		query.setMaxResults(9);
		
		return (List<Product>)query.list();
	}

	public Product getProductById(long parseLong) {
		Product product = getSession().get(Product.class, parseLong);
		return product;
	}

	public void saveDummyProducts(List<Product> productList) {
		for(Product p: productList)
			getSession().save(p);
	}

}
