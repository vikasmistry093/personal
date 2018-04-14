package org.bank.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.bank.model.Customer;

public class BankUtil {
	
	public void sendCustomerEmail(Customer customer , String msg) {
		
		
		final String fromEmail = "akashmistry097@gmail.com"; //requires valid gmail id
		final String password = "cout<<\"Akash\";"; // correct password for gmail id
		final String toEmail = customer.getEmail();
		//final String toEmail = "vikasmistry93@gmail.com"; // can be any email id 
		String emailMsg = null;
		
		System.out.println("TLSEmail Start");
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com"); //SMTP Host
		props.put("mail.smtp.port", "587"); //TLS Port
		props.put("mail.smtp.auth", "true"); //enable authentication
		props.put("mail.smtp.starttls.enable", "true"); //enable STARTTLS
		
                //create Authenticator object to pass in Session.getInstance argument
		Authenticator auth = new Authenticator() {
			//override the getPasswordAuthentication method
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(fromEmail, password);
			}
		};
		Session session = Session.getInstance(props, auth);

		switch (msg) {
		case "successfullyRegistered":
			emailMsg = "welcome to AAPKA BANK,"
					+ "Your is successfully registered to our bank."
					+ "Your Login details are given below:"
					+ "Your User Name :" + customer.getUser().getUserName() 
					+ "Your Password :" + customer.getUser().getUserPassword();
			break;

		default:System.out.println("---- Default in switch case ----");
			break;
		}
		
		EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", emailMsg );
		
		
	}

	

}
