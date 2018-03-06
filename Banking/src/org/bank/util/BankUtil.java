package org.bank.util;


import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;

import org.bank.model.Customer;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.mail.javamail.MimeMessagePreparator;

public class BankUtil {

	@SuppressWarnings("null")
	public static void sendEmailToCustomer(Customer customer) {
		
		final String emailToRecipient = customer.getEmail();
		final String emailSubject="Validation";
		final String emailMessage="hi this is test";
		final String emailFromRecipient = "akashmistry097@gmail.com";

		JavaMailSender mailSenderObj = null;
		// Reading Email Form Input Parameters
//		emailSubject = request.getParameter("subject");
//		emailMessage = request.getParameter("message");
//		emailToRecipient = request.getParameter("mailTo");

		// Logging The Email Form Parameters For Debugging Purpose
		System.out.println("\nReceipient?= " + emailToRecipient + ", Subject?= " + emailSubject + ", Message?= "
				+ emailMessage + "\n");

		mailSenderObj.send(new MimeMessagePreparator() {
			public void prepare(MimeMessage mimeMessage) throws Exception {
				MimeMessageHelper mimeMsgHelperObj = new MimeMessageHelper(mimeMessage, true, "UTF-8");
				mimeMsgHelperObj.setTo(emailToRecipient);
				mimeMsgHelperObj.setFrom(emailFromRecipient);
				mimeMsgHelperObj.setText(emailMessage);
				mimeMsgHelperObj.setSubject(emailSubject);

				// Determine If There Is An File Upload. If Yes, Attach It To The Client Email
				/*
				 * if ((attachFileObj != null) && (attachFileObj.getSize() > 0) &&
				 * (!attachFileObj.equals(""))) { System.out.println("\nAttachment Name?= " +
				 * attachFileObj.getOriginalFilename() + "\n");
				 * mimeMsgHelperObj.addAttachment(attachFileObj.getOriginalFilename(), new
				 * InputStreamSource() { public InputStream getInputStream() throws IOException
				 * { return attachFileObj.getInputStream(); } }); } else { System.out.
				 * println("\nNo Attachment Is Selected By The User. Sending Text Email!\n"); }
				 */
			}
		});
		System.out.println("\nMessage Send Successfully.... Hurrey!\n");
		// modelViewObj = new ModelAndView("home", "messageObj", "Thank You! Your Email
		// Has Been Sent!");
		// return modelViewObj;
	}

}
