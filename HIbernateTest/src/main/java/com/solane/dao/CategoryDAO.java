package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.Category;

@Repository
@Transactional
public class CategoryDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }

	@SuppressWarnings("unchecked")
	public List<Category> getAllCategory() {
		List<Category> categories = getSession().createQuery("from Category").list();
		return categories;
	}

	@SuppressWarnings("unchecked")
	public List<Category> getCategoriesByNames(String[] category) {
		Criteria critreia = getSession().createCriteria(Category.class);
		critreia.add(Restrictions.in("name", category));
		return critreia.list();
	}

	public void saveOrUpdate(Category cat) {
		getSession().saveOrUpdate(cat);
	}
	
}
