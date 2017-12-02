package org.bank.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {

	private static Session session = buildSession();

	private static Session buildSession() {
		try {
			Configuration configuration = new Configuration();
		    configuration.configure();
		    ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(
		            configuration.getProperties()).build();
		    SessionFactory sessionFactory = configuration.buildSessionFactory(serviceRegistry);
		    return sessionFactory.openSession();
		} catch (Throwable ex) {
			System.err.println("Initial SessionFactory creation failed." + ex);
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static Session getSession() {
		return session;
	}

	public static void shutdown() {
		getSession().close();
	}
}