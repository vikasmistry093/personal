package com.solane.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.solane.model.User;

@Repository
@Transactional
public class UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	private Session getSession() {
        return sessionFactory.getCurrentSession();
    }
	
	@SuppressWarnings("unchecked")
	public List<User> getAllUsers() {
		Query query = getSession().createQuery("from User");
		query.setMaxResults(9);
		
		return (List<User>)query.list();
	}

	public void saveOrUpdate(User user) {
		getSession().saveOrUpdate(user);
	}

	public boolean validateUserByEmailandPassword(String email, String password) {
		Criteria critreia = getSession().createCriteria(User.class);
		critreia.add(Restrictions.eq("email", email));
		critreia.add(Restrictions.eq("password", password));
		return critreia.uniqueResult() != null ? true : false;
	}
	
	public User getUserByEmailandPassword(String email, String password) {
		Criteria critreia = getSession().createCriteria(User.class);
		critreia.add(Restrictions.eq("email", email));
		critreia.add(Restrictions.eq("password", password));
		return (User) critreia.uniqueResult();
	}

	public User getUserByUserId(Long userId) {
		User user = getSession().get(User.class, userId);
		return user;
	}

}
