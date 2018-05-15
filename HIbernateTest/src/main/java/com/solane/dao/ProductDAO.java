package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.ScrollableResults;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
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
		Query query = getSession().createQuery("from Product where status='ACTIVE'");
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

	public void save(Product product) {
		getSession().save(product);
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductByStatus(String registered) {
		Criteria critreia = getSession().createCriteria(Product.class);
		critreia.add(Restrictions.eq("status", registered));
		critreia.addOrder(Order.asc("createdTimestamp"));
		return critreia.list();
	}

	public void saveorUpdate(Product product) {
		getSession().saveOrUpdate(product);
	}

	@SuppressWarnings("unchecked")
	public List<Product> getProductsByIdandStatus(List<Long> productIdList, String active) {
		Criteria critreia = getSession().createCriteria(Product.class);
		critreia.add(Restrictions.in("productId", productIdList));
		critreia.add(Restrictions.eq("status", active));
		return critreia.list();
	}

	public void updateProductsStatusById(List<Long> productIdList, String old_status, String new_status) {
		Criteria critreia = getSession().createCriteria(Product.class);
		critreia.add(Restrictions.in("productId", productIdList));
		critreia.add(Restrictions.eq("status", old_status));
		ScrollableResults items = critreia.scroll();
        int count=0;
        while ( items.next() ) {
            Product product = (Product)items.get(0);
            product.setStatus(new_status);
            getSession().saveOrUpdate(product);
            if ( ++count % 100 == 0 ) {
            	getSession().flush();
            	getSession().clear();
            }
        }
	}

}
