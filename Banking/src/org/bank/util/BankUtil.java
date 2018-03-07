package org.bank.util;


import javax.mail.internet.MimeMessage;

import org.bank.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
public class BankUtil {
	
	/*static String emailToRecipient ="akashmistry097@gmailcom", emailSubject ="testing" , emailMessage ="hey ! the mail is send";
	static final String emailFromRecipient = "mistrykaushal097@gmail.com";
*/
	@Autowired
	static JavaMailSender mailSenderObj;
	
	public static boolean isMailSendToCustomer(Customer customer) {
		// TODO Auto-generated method stub
		final String emailToRecipient ="akashmistry097@gmailcom", emailSubject ="testing" , emailMessage ="hey ! the mail is send";
		 final String emailFromRecipient = "mistrykaushal097@gmail.com";

	
//		 final JavaMailSender mailSenderObj;

		
		
		System.out.println("\nReceipient?= " + emailToRecipient + ", Subject?= " + emailSubject + ", Message?= "
				+ emailMessage + "\n");

		mailSenderObj.send(new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setFrom(emailFromRecipient);
				mimeMsgHelperObj.setText(emailMessage);
				mimeMsgHelperObj.setSubject(emailSubject);
				
			}
		});
		System.out.println("\nMessage Send Successfully.... Hurrey!\n");
		
		return true;
	}

	


}
