package com.solane.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	private SessionFactory sessionFactory;
	public Session session = buildSessionFactory().openSession();
	
	public SessionFactory buildSessionFactory() {
		Configuration configuration = new Configuration();
		sessionFactory = configuration.configure().buildSessionFactory();
		return sessionFactory;
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void shutDown() {
		sessionFactory.close();;
	}
}
