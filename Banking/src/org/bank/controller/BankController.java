package org.bank.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.bank.model.Account;
import org.bank.model.Customer;
import org.bank.model.Loan;
import org.bank.model.BankTransaction;
import org.bank.model.User;
import org.bank.service.BankServices;
import org.bank.service.IBankServices;
import org.hibernate.Hibernate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	private static HttpSession session;
	private IBankServices bankService = new BankServices();
	
	
	public BankController() {
		//bankService = new BankServices();
		//HibernateUtil.getSession().isOpen();
	}
	
	@RequestMapping("/")
	public ModelAndView login(){
		System.out.println("In login");
		User user = new User();
		//bankService.saveUser(new User());
		ModelAndView model = new  ModelAndView("login");
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/home")
	public ModelAndView home(@ModelAttribute("user") User user, HttpServletRequest request){
		System.out.println("In Home");
		System.out.println("In Controller: " + user.getUserName());
		ModelAndView model = new ModelAndView("login");
		session = request.getSession();
		
		if(user.getUserName() != null)
			session.setAttribute("user", user);
		else
			user = (User) session.getAttribute("user");
		
		User userDetail = bankService.isValidUser(user);
		if(userDetail != null) {
			model = new  ModelAndView("home");
			session.setAttribute("user", userDetail);
			
			Customer customer = bankService.getCustomerByUser(userDetail);
			model.addObject("customer", customer);
		}
		
		return model;
	}
	
	@RequestMapping("/myprofile")
	public ModelAndView myprofile( HttpServletRequest request) {
		System.out.println("in myprofile");
		User user = (User) session.getAttribute("user");
		
		ModelAndView model=new ModelAndView("login");
		
		if(user != null){
			Customer customer = bankService.getCustomerByUser(user);
			System.out.println(customer.getFirstName());
			model=new ModelAndView("myprofile");
			model.addObject("customer",customer);
		}

		return model;
	}
	
	@RequestMapping("/error")
	public ModelAndView error() {
		System.out.println("in error ");
		ModelAndView model=new ModelAndView("error");
		return model;
	}

	@RequestMapping("/signup")
	public ModelAndView newtable() {
		System.out.println("in signup");
		Customer customer = new Customer();
		ModelAndView model=new ModelAndView("signup");
		model.addObject("customer", customer);
		return model;
	}
	
	
	
	@RequestMapping("/transaction")
	public ModelAndView transaction(HttpServletRequest request) {
		System.out.println("in transaction");
		BankTransaction transaction = new BankTransaction();
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("transaction");
			
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
		}
		model.addObject("transaction",transaction);
		return model;
	}
	
	@RequestMapping("/completetransaction")
	public ModelAndView completetransaction( @ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
		System.out.println("completetransaction ");
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login");
		
		if(user != null) {
			model = new ModelAndView("redirect:/home");
			boolean donetransaction = bankService.performtransaction(transaction);
				if(donetransaction == false)
					model = new ModelAndView("redirect:/error");
					
		}
		return model;
	
	}
	
	@RequestMapping("/completedthrecharge")
	public ModelAndView completedthrecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete dth recharge");
	User user = (User) session.getAttribute("user");
	ModelAndView model = new ModelAndView("redirect:/login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		boolean donedthrecharge = bankService.performdthrecharge(transaction);
			if(donedthrecharge == false)
				model = new ModelAndView("redirect:/error");
		
		}
		return model;
	}
	
	@RequestMapping("/completegasrecharge")
	public ModelAndView completegasrecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete gas recharge");
	User user = (User) session.getAttribute("user");
	ModelAndView model = new ModelAndView("redirect:/login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		boolean donegasrecharge = bankService.performgasrecharge(transaction);
			if(donegasrecharge == false)
				model = new ModelAndView("redirect:/error");
		
		}
		return model;
	}
	
	@RequestMapping("/completemobilerecharge")
	public ModelAndView completemobilerecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete gas recharge");
	User user = (User) session.getAttribute("user");
	ModelAndView model = new ModelAndView("redirect:/login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		boolean donemobilerecharge = bankService.performmobilerecharge(transaction);
			if(donemobilerecharge == false)
				model = new ModelAndView("redirect:/error");
		
		}
		return model;
	}
	
	@RequestMapping("/recharge")
	public ModelAndView recharge() {
		System.out.println("in recharge");
		ModelAndView model=new ModelAndView();
		return model;
	}
	
	@RequestMapping("/dthrecharge")
	public ModelAndView dthrecharge() {
		System.out.println("in DTH transaction");
		BankTransaction transaction = new BankTransaction();
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("dthrecharge");
			
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
		}
		model.addObject("transaction",transaction);
		return model;
	}
	
	@RequestMapping("/mobilerecharge")
	public ModelAndView mobilerecharge() {
		System.out.println("in mobile transaction");
		BankTransaction transaction = new BankTransaction();
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("mobilerecharge");
			
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
		}
		model.addObject("transaction",transaction);
		return model;
	}
	
	@RequestMapping("/gasrecharge")
	public ModelAndView gasrecharge() {
		System.out.println("in Gas transaction");
		BankTransaction transaction = new BankTransaction();
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("gasrecharge");
			
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
		}
		model.addObject("transaction",transaction);
		return model;
	}
	
	@RequestMapping("/addresssetting")
	public ModelAndView addresssetting() {
		System.out.println("in address setting");
		Customer customer=new Customer();
		ModelAndView model=new ModelAndView("addresssetting");
		model.addObject("customer", customer);
		return model;
	}
	
	@RequestMapping("/emailsetting")
	public ModelAndView emailsetting() {
		System.out.println("in email setting");
		Customer customer=new Customer();
		ModelAndView model=new ModelAndView("emailsetting");
		model.addObject("customer", customer);
		return model;
	}
	
	@RequestMapping("/mobilesetting")
	public ModelAndView mobilesetting() {
		System.out.println("in moblie number setting");
		Customer customer=new Customer();
		ModelAndView model=new ModelAndView("mobilesetting");
		model.addObject("customer", customer);
		return model;
	}
	
	@RequestMapping("/passwordsetting")
	public ModelAndView passwordsetting() {
		System.out.println("in password setting");
		User user=new User();
		ModelAndView model=new ModelAndView("passwordsetting");
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/generalsetting")
	public ModelAndView generalsetting() {
		System.out.println("in general setting");
		ModelAndView model=new ModelAndView("generalsetting");
		return model;
	}
	
	@RequestMapping("/notificationsetting")
	public ModelAndView notificationsetting() {
		System.out.println("in notification setting");
		ModelAndView model=new ModelAndView("notificationsetting");
		return model;
	}
	
	@RequestMapping("/setting")
	public ModelAndView setting() {
		System.out.println("in setting");
		ModelAndView model=new ModelAndView("setting");
		return model;
	}
	
	
	
	@RequestMapping("/transactionsummary")
	public ModelAndView transactionsummary() {
		System.out.println("in transactionsummary");
		User user = (User) session.getAttribute("user");
		
		ModelAndView model=new ModelAndView("login");
		
		if(user != null){
			model=new ModelAndView("transactionsummary");
			Customer customer = bankService.getCustomerByUser(user);
			System.out.println(customer.getFirstName());
			
			model.addObject("customer",customer);
		}
		return model;
	}
	
	@RequestMapping("/transactionDetails")
	public ModelAndView transactionDetails(@RequestParam("accNumber") String accountNumber) {
		System.out.println(accountNumber);
		ModelAndView model=new ModelAndView("transactionDetail");
		List<BankTransaction> transaction = bankService.getTrasactionByAccountNumber(accountNumber);
		if(transaction.size() != 0) {
			model.addObject("transactionDetails", transaction);
		}
		return model;
	}
	
	@RequestMapping("/loan")
	public ModelAndView loan() {
		System.out.println("in loan");
		Loan loan=new Loan();
		ModelAndView model=new ModelAndView("loan");
		model.addObject("loan",loan);
		return model;
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration(@ModelAttribute("customer") Customer customer) {
		System.out.println("in registration");
		System.out.println(customer.getFirstName());
		ModelAndView model;
		
		boolean isSuccess = bankService.registerNewCustomer(customer);
		System.out.println(isSuccess);
		if(isSuccess)
			model = new ModelAndView("succ_registration");
		else
			model = new ModelAndView("error");
		return model;
	}
	
	@RequestMapping("/succ_registration")
	public ModelAndView succ_registration(){
		System.out.println("in succ_registration");
		ModelAndView model = new ModelAndView("succ_registration");
		return model;
	}
	
	@RequestMapping("/createaccount")
	public ModelAndView createaccount(HttpServletRequest request) {
		System.out.println("in create account");
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");

		if(user != null){
			Customer customer = bankService.getCustomerByUser(user);
			System.out.println(customer.getFirstName());
			model=new ModelAndView("createaccount");
			model.addObject("customer",customer);
			Account account = new Account();
			model.addObject("account", account);
		}
		return model;
	}
	
}
	

