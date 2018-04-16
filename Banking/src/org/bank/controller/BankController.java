package org.bank.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.bank.model.Account;
import org.bank.model.BankTransaction;
import org.bank.model.Customer;
import org.bank.model.Loan;
import org.bank.model.User;
import org.bank.service.BankServices;
import org.bank.service.IBankServices;
import org.bank.util.BankUtil;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BankController {
	
	private static HttpSession session;
	private IBankServices bankService = new BankServices();
	private BankUtil bankutility = new BankUtil();
	final String msg = null;
	
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
	
	@RequestMapping("/checkuser")
	public ModelAndView checkuser(@ModelAttribute("user") @Valid User user , BindingResult result , HttpServletRequest request) {
		
		System.out.println("Validate User Login :" + user.getUserName());
		ModelAndView model = new ModelAndView("login");
		
		session = request.getSession();
		User userDetail = bankService.isValidUser(user);
		
		if(userDetail == null ){
			result.hasErrors();
			return model;
		}
			model = new ModelAndView("redirect:/home");

			if (user.getUserName() != null)
				session.setAttribute("user", user);
			else
				user = (User) session.getAttribute("user");

			session.setAttribute("user", userDetail);
		return model;
	}
	
	@RequestMapping("/home")
	public ModelAndView home(){
		System.out.println("In Home");
		
		User user = (User) session.getAttribute("user");
		
		System.out.println("In Controller: " + user.getUserName());
		ModelAndView model = new ModelAndView("login");
	
		User userDetail = bankService.isValidUser(user);
		
		if (userDetail != null) {
			model = new ModelAndView("home");
			Customer customer = bankService.getCustomerByUser(userDetail);
			
			model.addObject("customer", customer);
		}

		return model;
	}
	
	@RequestMapping("/myprofile")
	public ModelAndView myprofile() {
		System.out.println("in myprofile");
		User user = (User) session.getAttribute("user");
		
		ModelAndView model=new ModelAndView("login");
		
		if(user != null){
			model=new ModelAndView("myprofile");
			
			Customer customer = bankService.getCustomerByUser(user);
			System.out.println(customer.getFirstName());
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
	public ModelAndView transaction() {
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
		ModelAndView model = new ModelAndView("login");
		
		if (user != null) {
			model = new ModelAndView("redirect:/home");

			boolean checkCustomerByAccountNumber = bankService.getCustomerByAccountNumber(transaction);
			if (checkCustomerByAccountNumber) {
				boolean checkBalance = bankService.checkBalanceByAccount(transaction);
				if (checkBalance) {
					boolean donetransaction = bankService.performtransaction(transaction);
					
					if (donetransaction == false)
						model = new ModelAndView("redirect:/error");
				} else
					model = new ModelAndView("redirect:/error");
			} else
				model = new ModelAndView("redirect:/error");

		}
		return model;
	
	}
	
	@RequestMapping("/completedthrecharge")
	public ModelAndView completedthrecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete dth recharge");
	User user = (User) session.getAttribute("user");
	Customer customer = bankService.getCustomerByUser(user);
	ModelAndView model = new ModelAndView("login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		
			boolean checkBalance = bankService.checkBalanceByAccount(transaction);
			if (checkBalance == true) {
				boolean donetransaction = bankService.performdthrecharge(transaction);
				String msg ="dthrecharge";
				bankutility.sendCustomerEmail(customer , transaction , msg);
				if (donetransaction == false)
					model = new ModelAndView("redirect:/error");
			} else
				model = new ModelAndView("redirect:/error");

		}
		return model;
	}
	
	@RequestMapping("/completeelectricrecharge")
	public ModelAndView completeelectricrecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete gas recharge");
	User user = (User) session.getAttribute("user");
	Customer customer = bankService.getCustomerByUser(user);
	
	ModelAndView model = new ModelAndView("login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		boolean checkBalance = bankService.checkBalanceByAccount(transaction);
			if (checkBalance == true) {
				String msg ="electricityrecharge";
				bankutility.sendCustomerEmail(customer, transaction, msg);
				boolean donetransaction = bankService.performgasrecharge(transaction);
				if (donetransaction == false)
					model = new ModelAndView("redirect:/error");
			} else
				model = new ModelAndView("redirect:/error");

		}
		return model;
	}
	
	@RequestMapping("/completemobilerecharge")
	public ModelAndView completemobilerecharge(@ModelAttribute("transaction") BankTransaction transaction , HttpServletRequest request) {
	System.out.println("complete mobile recharge");
	User user = (User) session.getAttribute("user");
	Customer customer = bankService.getCustomerByUser(user);
	ModelAndView model = new ModelAndView("login");
	 
	if(user != null){
		model = new ModelAndView("redirect:/home");
		
		
			boolean checkBalance = bankService.checkBalanceByAccount(transaction);
			if (checkBalance == true) {
				String msg ="mobilerecharge";
				bankutility.sendCustomerEmail(customer, transaction, msg);
				boolean donetransaction = bankService.performmobilerecharge(transaction);
				if (donetransaction == false)
					model = new ModelAndView("redirect:/error");
			} else
				model = new ModelAndView("redirect:/error");

		}
		return model;
	}
	
	@RequestMapping("/recharge")
	public ModelAndView recharge() {
		System.out.println("in recharge");
		ModelAndView model = new ModelAndView("login");
		
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
		model=new ModelAndView("recharge");
		}
		return model;
	}
	
	@RequestMapping("/dthrecharge")
	public ModelAndView dthrecharge() {
		System.out.println("in DTH transaction");
	
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("dthrecharge");
			BankTransaction transaction = new BankTransaction();
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
			model.addObject("transaction" , transaction);
		}
		
		return model;
	}
	
	@RequestMapping("/mobilerecharge")
	public ModelAndView mobilerecharge() {
		System.out.println("in mobile transaction");
		
		
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			BankTransaction transaction = new BankTransaction();
			model=new ModelAndView("mobilerecharge");
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
			model.addObject("transaction",transaction);
		}
		
		return model;
	}
	
	@RequestMapping("/electricityrecharge")
	public ModelAndView electricityrecharge() {
		System.out.println("in electricity transaction");
		
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			BankTransaction transaction = new BankTransaction();
			model=new ModelAndView("electricityrecharge");
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
			model.addObject("transaction",transaction);
		}
		
		return model;
	}
	
	
	@RequestMapping("/addresssetting")
	public ModelAndView addresssetting() {
		System.out.println("in address setting");
		
		User user = (User) session.getAttribute("user");
		ModelAndView model=new ModelAndView("login");
		
		if(user != null) {
		model=new ModelAndView("addresssetting");
		
		Customer customer = bankService.getCustomerByUser(user);
		model.addObject("customer", customer);
		}
		return model;
	}
	
	@RequestMapping("/updateaddress")
	public ModelAndView updateaddress(@ModelAttribute("customer") Customer customer,HttpServletRequest request) {
		
		System.out.println("in update address");
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login");
		
		if(user != null) {
			model = new ModelAndView("redirect:/home");
			boolean isAddressUpadated = bankService.isAddressUpdated(user , customer);
			String msg = "addressupdated";
			bankutility.sendCustomerEmail(customer, msg);
			if(isAddressUpadated == false) 
				model = new ModelAndView("redirect:/error");
		}
		return model;
	}
	
	
	@RequestMapping("/emailsetting")
	public ModelAndView emailsetting(HttpServletRequest request) {
		System.out.println("in email setting");
		
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");
		if(user != null) {
		
			model=new ModelAndView("emailsetting");
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
		}
		return model;
	}
	
	@RequestMapping("/updateemail")
	public ModelAndView upadateemail(@ModelAttribute("customer") Customer customers , HttpServletRequest request) {
		System.out.println("in update email");
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("redirect:/login");
		
		if(user != null) {
			model = new ModelAndView("redirect:/home");
			boolean isEmailUpadated = bankService.isEmailUpdated(user , customers); 
			String msg = "emailupdated";
			bankutility.sendCustomerEmail(customers, msg);
			if(isEmailUpadated == false) 
				model = new ModelAndView("redirect:/error");
		}
		return model;
	}
	
	
	@RequestMapping("/mobilesetting")
	public ModelAndView mobilesetting() {
		System.out.println("in moblie number setting");
		
		ModelAndView model = new ModelAndView("redirect:/login");
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
		model = new ModelAndView("mobilesetting");
		Customer customer = bankService.getCustomerByUser(user);
		model.addObject("customer", customer);
		}
		return model;
	}
	
	
	@RequestMapping("/updatemobilenumber")
	public ModelAndView updatemobilenumber(@ModelAttribute("customer") Customer customers , HttpServletRequest request) {
		System.out.println("in update mobile number");
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login"); 
		if(user != null) {
			model = new ModelAndView("redirect:/home");
			boolean isMobileUpadated = bankService.isMobileUpadated(user , customers);
			String msg = "mobilenoupdate";
			bankutility.sendCustomerEmail(customers, msg);
			if(isMobileUpadated == false) 
				model = new ModelAndView("redirect:/error");
		}
		return model;
	}
	
	
	@RequestMapping("/passwordsetting")
	public ModelAndView passwordsetting() {
		System.out.println("in password setting");
		
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login"); 
		
		if(user != null) {
			
			model=new ModelAndView("passwordsetting");
			Customer customer = bankService.getCustomerByUser(user);
			model.addObject("customer", customer);
			model.addObject("user", user);
		 }
		
		return model;
	}
	
	@RequestMapping("/updatepassword")
	public ModelAndView updatepassword(@ModelAttribute("user") User users , HttpServletRequest request) {
		System.out.println("in update password");
		ModelAndView model = new ModelAndView("redirect:/login");
		
		User user = (User) session.getAttribute("user");
		Customer customer = bankService.getCustomerByUser(user);
		
		if (user != null) {
			model = new ModelAndView("redirect:/error");
			User newUser = bankService.isValideOldUser(user, users);
			if (newUser != null) {
				model = new ModelAndView("redirect:/home");
				boolean isPasswordUpadted = bankService.isPasswordUpdated(user , users);
				String msg = "passwordupdate";
				bankutility.sendCustomerEmail(customer, msg);
				if(isPasswordUpadted == false)
					model = new ModelAndView("redirect:/error");
			}
		}
		return model;
		
	}
	
	@RequestMapping("/generalsetting")
	public ModelAndView generalsetting() {
		System.out.println("in general setting");
		
		User user = (User) session.getAttribute("user");
		Customer customer = bankService.getCustomerByUser(user);
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model=new ModelAndView("generalsetting");	
			model.addObject("customer", customer);
		}
		
		return model;
	}
	
	@RequestMapping("/notificationsetting")
	public ModelAndView notificationsetting() {
		System.out.println("in notification setting");

		User user = (User) session.getAttribute("user");
		Customer customer = bankService.getCustomerByUser(user);
		ModelAndView model = new ModelAndView("login");
		
		if (user != null) {
			model = new ModelAndView("notificationsetting");
			model.addObject("customer", customer);
		}
		return model;
	}
	
	@RequestMapping("/setting")
	public ModelAndView setting() {
		System.out.println("in setting");
		
		User user = (User) session.getAttribute("user");
		Customer customer = bankService.getCustomerByUser(user);
		ModelAndView model = new ModelAndView("login");
		
		if(user != null) {
			model = new ModelAndView("setting");
			model.addObject("customer", customer);
		}
			return model;
	}
	
	
	
	@RequestMapping("/transactionsummary")
	public ModelAndView transactionsummary(HttpServletRequest request) {
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
		System.out.println("in transacti Details =" + accountNumber);

            ModelAndView model = new ModelAndView("transactionDetail");
			List<BankTransaction> transaction = bankService.getTrasactionByAccountNumber(accountNumber);
			if (transaction.size() != 0) {
				model.addObject("transactionDetails", transaction);
		}
		return model;
	}
	
	@RequestMapping("/loan")
	public ModelAndView loan() {
		System.out.println("in loan");
		ModelAndView model = new ModelAndView("login");
		User user = (User) session.getAttribute("user");
		Customer customer = bankService.getCustomerByUser(user);
		
		if (user != null) {
			Loan loan = new Loan();
			model = new ModelAndView("loan");
			model.addObject("loan", loan);
			model.addObject("customer", customer);
		}
		return model;
	}
	
	@RequestMapping("/applyforloan")
	public ModelAndView applyforloan(@ModelAttribute("loan") Loan loan) {
		System.out.println("In Apply for loan");
		ModelAndView model = new ModelAndView("login");
		
		User user = (User) session.getAttribute("user");
		if(user != null) {
		
		Customer customer = bankService.getCustomerByUser(user);
		boolean isRequestedForLoan = bankService.isRequestedForLoan(customer , loan);	
		
		if(isRequestedForLoan)
			model = new ModelAndView("redirect:/home");
		else
			model = new ModelAndView("redirect:/error");
		}
		
		return model;
	}
	
	@RequestMapping("/registration")
	public ModelAndView registration(@ModelAttribute("customer") @Valid Customer customer , BindingResult result ) {
		System.out.println("in registration");
		System.out.println(customer.getFirstName());
		ModelAndView model;
		
		if(result.hasErrors()) {
			model = new ModelAndView("signup");
		}
		
		boolean isSuccess = bankService.registerNewCustomer(customer);
		System.out.println("user sign up successfully "+isSuccess);
		if(isSuccess) {
			String msg ="successfullyRegistered";
			bankutility.sendCustomerEmail(customer , msg);
			model = new ModelAndView("redirect:/succ_registration");
		}
		else
			model = new ModelAndView("redirect:/error");
		
		return model;
	}
	
	@RequestMapping("/succ_registration")
	public ModelAndView succ_registration(){
		System.out.println("in succ_registration");
		
       ModelAndView	model = new ModelAndView("succ_registration");
		
		return model;
	}
	
	@RequestMapping("/newaccount")
	public ModelAndView newaccount() {
		System.out.println("in create account for new user");
		
		User user = (User) session.getAttribute("user");
		ModelAndView model = new ModelAndView("login");

		if(user != null){
			Customer customer = bankService.getCustomerByUser(user);
			System.out.println(customer.getFirstName());
			model=new ModelAndView("newaccount");
			model.addObject("customer",customer);
			Account account = new Account();
			model.addObject("account", account);
			
		}
		return model;
	}
	
	
	@RequestMapping("/createaccount")
	public ModelAndView createaccount(@ModelAttribute("account") Account account) {
		System.out.println("Creating new account of existing user");
		ModelAndView model = new ModelAndView("login");
		
		User user = (User) session.getAttribute("user");
		
		if(user != null) {
			
			Customer customer = bankService.getCustomerByUser(user);
			boolean isUserValideToCreateAccount = bankService.isUserValideToCreateAccount(customer);
			
			if(isUserValideToCreateAccount) {
			boolean isNewAccountCreated = bankService.isNewAccountCreated(customer , account);
		
			if(isNewAccountCreated) {
				model = new ModelAndView("redirect:/home");
				String msg = "createnewacc";
				bankutility.sendCustomerEmail(customer, account , msg);
			}
			else
				model = new ModelAndView("redirect:/error");
			}else
				model = new ModelAndView("redirect:/error");
			
		}
		
		return model;
	}
	
	@RequestMapping("/forgetpassword")
	public ModelAndView forgetpassword() {
		System.out.println("In forget Password");
		User user = new User();
		ModelAndView model = new ModelAndView("forgetpassword");
		model.addObject("user", user);
		return model;
	}
	
	@RequestMapping("/forgottenUser")
	public ModelAndView forgottenUser(@ModelAttribute("user") User user) {
		System.out.println("In forgotten Password");
		ModelAndView model = new ModelAndView("login");
		
		User isPasswordRegained = bankService.isPasswordRegained(user);
		Customer customer = bankService.getCustomerByUser(isPasswordRegained);
		if(isPasswordRegained != null) {
			String msg ="forgotuser";
			bankutility.sendCustomerEmail(customer , msg);
			model = new ModelAndView("redirect:/succ_registration");
		}
		else 
			model = new ModelAndView("redirect:/error");
		
		return model;
		
	}
	
    
}
	

