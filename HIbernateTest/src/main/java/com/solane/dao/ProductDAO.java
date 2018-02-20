package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Query;

import com.solane.model.Product;
import com.solane.util.HibernateUtil;

@Transactional
public class ProductDAO extends HibernateUtil {
	
	@SuppressWarnings("unchecked")
	public List<Product> getTopProducts() {
		Query query = session.createQuery("from Product");
		query.setMaxResults(10);
		
		return (List<Product>)query.list();
	}

}
