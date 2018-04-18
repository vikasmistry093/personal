package org.bank.util;

import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;

import org.bank.model.Account;
import org.bank.model.BankTransaction;
import org.bank.model.Customer;

public class BankUtil {
	
	public void sendCustomerEmail(Customer customer , String msg ) {
		
		
		final String fromEmail = "akashmistry097@gmail.com"; //requires valid gmail id
		final String password = "cout<<\"Akash\";"; // correct password for gmail id
		final String toEmail = customer.getEmail();
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
			emailMsg = "Welcome, " + customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + "to MY BANK,\n"
					+ "Your is successfully registered to our bank.\n"
					+ "Your Login details are given below:\n"
					+ "Your User Name :" + customer.getUser().getUserName() + "\n" 
					+ "Your Password :" + customer.getUser().getUserPassword();
			break;
			
		case "addressupdated":
			emailMsg = "Welcome, " + customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + "to MY BANK.\n"
					+ "Your is successfully upadated your address. " ;
			break;
			
		case "emailupdated":
			emailMsg = "Welcome, "+ customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + "to MY BANK.\n"
					+ "Your is successfully upadated your Email address. " ;
			break;
			
		case "mobilenoupdate":
			emailMsg = "Welcome, "+ customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + " to MY BANK.\n"
					+ "You have successfully upadated your Mobile Number. " ;
			break;
			
		case "passwordupdate":
			emailMsg = "Welcome, "+ customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + "to MY BANK.\n"
					+ "You have successfully upadated your Password. " ;
			break;
		case "forgotuser":	
			emailMsg = "Welcome, "+ customer.getFirstName()  +" "+ customer.getMiddleName() +" "+ customer.getLastName() + "to MY BANK.\n"
					+ "You have successfully changed your password.\n"
					+ "Your new password is :" + customer.getUser().getUserPassword() ;
			break;
		
		default:System.out.println("---- Default in switch case ----");
			break;
		}
		
		EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", emailMsg );
		
		
	}

	public void sendCustomerEmail(Customer customer, BankTransaction transaction, String msg) {
		// TODO Auto-generated method stub
		final String fromEmail = "akashmistry097@gmail.com"; //requires valid gmail id
		final String password = "cout<<\"Akash\";"; // correct password for gmail id
		final String toEmail = customer.getEmail();
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
			
		case "dthrecharge":
			emailMsg = "Welcome, "+ customer.getFirstName()+ " " +customer.getMiddleName() + " " +customer.getLastName() + " to MY BANK.\n"
					+ "Your is successfully recharged your DTH service.\n"
					+ "Your details about DTH recharge are mentioned below :\n"
					+ "Your Account Number : " +transaction.getAccount().getAccountNumber() +"\n"
					+ "Your DTH provider : " +transaction.getBenificiaryName() +"\n"
					+ "Your recharge amount : " + transaction.getTransactionAmount();
			break;
			
		case "electricityrecharge":
			emailMsg = "Welcome, " + customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName() + " to MY BANK.\n"
					+ "Your is successfully recharged your Electricity service. \n"
					+ "Your details about Electricity recharge are mentioned below :\n"
					+ "Your Account Number : " +transaction.getAccount().getAccountNumber() +"\n" 
					+ "Your Electricity provider : " +transaction.getBenificiaryName() +"\n"
					+ "Your recharge amount : " + transaction.getTransactionAmount();
			break;

		case "mobilerecharge":
			emailMsg = "Welcome ," + customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName() + " to MY BANK.\n"
					+ "Your is successfully recharged your Mobile service. \n"
					+ "Your details about Mobile recharge are mentioned below :\n"
					+ "Your Account Number : " +transaction.getAccount().getAccountNumber() +"\n"
					+ "Your Mobile provider : " +transaction.getBenificiaryName() +"\n"
					+ "Your recharge amount : " + transaction.getTransactionAmount();
			break;

		default:System.out.println("---- Default in switch case ----");
			break;
		}
		
		EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", emailMsg );
	}

	
	
	public void sendCustomerEmail(Customer customer, Account account, String msg) {
		// TODO Auto-generated method stub
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
			
		case "createnewacc":
			emailMsg = "Welcome, "+ customer.getFirstName() + " " + customer.getMiddleName() + " " + customer.getLastName() + " to MY BANK.\n"
					+ "Your is successfully created your new account.\n"
					+ "Your Account type is : " +account.getAccountType() + "\n" 
					+ "Your Account Number is :" +account.getAccountNumber();
			break;

		default:System.out.println("---- Default in switch case ----");
			break;
		}
		
		EmailUtil.sendEmail(session, toEmail,"TLSEmail Testing Subject", emailMsg );
	}

	
		
	}

	


