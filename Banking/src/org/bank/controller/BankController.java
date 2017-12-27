package org.bank.controller;


import javax.validation.Valid;

import org.bank.model.Customer;
import org.bank.model.Transaction;
import org.bank.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	//private IBankServices bankService;
	
	
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
	public ModelAndView home(@ModelAttribute("user") @Valid User user, BindingResult result){
		System.out.println("In Home");
		System.out.println("In Controller: " + user.getUserName());
		ModelAndView model;
		if(result.hasErrors()) {
			model = new ModelAndView("login");
			model.addObject("user", user);
			return model;
			
		}
		
		
		//boolean isValidUser = bankService.isValidUser(user);
		//if(isValidUser)
			 model = new  ModelAndView("home");
	//	else 
		//	model = new ModelAndView("newuser");
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
	public ModelAndView transaction() {
		System.out.println("in transaction");
		Transaction transaction=new Transaction();
		ModelAndView model=new ModelAndView("transaction");
		model.addObject("transaction",transaction);
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
		System.out.println("in DTHrecharge");
		Transaction transaction=new Transaction();
		ModelAndView model=new ModelAndView("dthrecharge");
		model.addObject("transaction", transaction);
		return model;
	}
	
	@RequestMapping("/mobilerecharge")
	public ModelAndView mobilerecharge() {
		System.out.println("in mobilerecharge");
		Transaction transaction=new Transaction();
		ModelAndView model=new ModelAndView("mobilerecharge");
		model.addObject("transaction", transaction);
		return model;
	}
	
	@RequestMapping("/gasrecharge")
	public ModelAndView gasrecharge() {
		System.out.println("in gasrecharge");
		Transaction transaction=new Transaction();
		ModelAndView model=new ModelAndView("gasrecharge");
		model.addObject("transaction", transaction);
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
	
	@RequestMapping("/myprofile")
	public ModelAndView myprofile() {
		System.out.println("in myprofile");
		ModelAndView model=new ModelAndView("myprofile");
		return model;
	}
}
