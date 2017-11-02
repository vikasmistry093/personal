package main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		
		System.out.println(session.isConnected());

	}

}
