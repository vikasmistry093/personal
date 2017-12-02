package org.bank.controller;

import org.bank.model.User;
import org.bank.service.BankServices;
import org.bank.service.IBankServices;
import org.bank.util.HibernateUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	private IBankServices bankService;
	
	
	public BankController() {
		bankService = new BankServices();
		HibernateUtil.getSession().isOpen();
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
	public ModelAndView home(@ModelAttribute("user") User user){
		System.out.println("In Home");
		System.out.println("In Controller: " + user.getUserName());
		ModelAndView model;
		
		//boolean isValidUser = bankService.isValidUser(user);
		//if(isValidUser)
			 model = new  ModelAndView("home");
	//	else 
		//	model = new ModelAndView("newuser");
		return model;
	}
	
	@RequestMapping("/newuser")
	public ModelAndView newuser() {
		System.out.println("in new user");
		ModelAndView model=new ModelAndView("newuser");
		return model;
	}
	@RequestMapping("/error")
	public ModelAndView error() {
		System.out.println("in error ");
		ModelAndView model=new ModelAndView("error");
		return model;
	}

	@RequestMapping("/newtable")
	public ModelAndView newtable() {
		System.out.println("in new table");
		ModelAndView model=new ModelAndView("newtable");
		return model;
	}
	
	@RequestMapping("/selection")
	public ModelAndView selection() {
		System.out.println("in selection");
		ModelAndView model=new ModelAndView("selection");
		return model;
	}
	
	@RequestMapping("/transfer")
	public ModelAndView transfer() {
		System.out.println("in transfer");
		ModelAndView model=new ModelAndView("transfer");
		return model;
	}
	
	@RequestMapping("/dthrecharge")
	public ModelAndView dthrecharge() {
		System.out.println("in DTHrecharge");
		ModelAndView model=new ModelAndView("dthrecharge");
		return model;
	}
	
	@RequestMapping("/mobilerecharge")
	public ModelAndView mobilerecharge() {
		System.out.println("in mobilerecharge");
		ModelAndView model=new ModelAndView("mobilerecharge");
		return model;
	}
}
