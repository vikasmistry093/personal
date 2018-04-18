package org.bank.service;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

import org.bank.dao.BankDao;
import org.bank.dao.IBankDao;
import org.bank.model.Account;
import org.bank.model.BankTransaction;
import org.bank.model.Customer;
import org.bank.model.Loan;
import org.bank.model.RateOfInterest;
import org.bank.model.User;

public class BankServices implements IBankServices {
	
	private IBankDao dao = new BankDao();
//	private BankUtil bankUtil = new BankUtil();
	
	@Override
	public User isValidUser(User user) {
		User user_detail = dao.getUserByUserNameAndPassword(user.getUserName(),user.getUserPassword());
		
		if(user_detail != null)
			return user_detail;
		
		return null;
	}

	@Override
	public void saveUser(User user) {

		user.setUserName("akash");
		user.setUserPassword("password");
		user.setUserType("ADMIN");
		dao.saveUser(user);
	}

	@Override
	public boolean registerNewCustomer(Customer customer) {
		// TODO Auto-generated method stub
		List<Account> accs = new ArrayList<>();
		RateOfInterest roi = new RateOfInterest();
		roi.setDescription("The type of account user is holding is : " + customer.getAccount().getAccountType() );
		roi.setName(customer.getAccount().getAccountType());
		
		if(customer.getAccount().getAccountType() == "saving")
			roi.setInterestRate(7);
		else
			roi.setInterestRate(5);
			
		Account acc = customer.getAccount();
		acc.setAccountNumber(isNewAccount());
		
		
		acc.setRateOfInterest(roi);
		acc.setBalance(100);
		accs.add(acc);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		customer.setCreatedTimestamp(currentTime);
		customer.setUpdateTimestamp(currentTime);
		User user = new User();
		user.setUserName(isNewUserName(customer));
		user.setUserPassword("newUser");
		user.setUserType("user");
		user.setForgetEmail(customer.getEmail());
		
		customer.setUser(user);
		
		customer.setAccounts(accs);
		boolean isSuccess = dao.saveCustomer(customer);
		return isSuccess;
	}

	@Override
	public Customer getCustomerByUser(User user) {
		// TODO Auto-generated method stub
		Customer customer_Details = dao.getCustomerByUser(user);
		
		if (customer_Details != null)
			return customer_Details;
		
		return null;
	}

	@Override
	public String isNewUserName(Customer customer) {
		// TODO Auto-generated method stub
		String newUserName = "";
		int firstletter = 3 , lastletter = 3, aadharno =3;
		
		while(true) {
			if(customer.getFirstName().length() > 2 && customer.getLastName().length() > 2)
				newUserName = customer.getFirstName().substring(0, firstletter).toLowerCase() + customer.getLastName().substring(0, lastletter).toLowerCase();
			
			User newUser = dao.getNewUserName(newUserName);
			if(newUser == null) {
				return newUserName;
			}else {
				newUserName = customer.getFirstName().substring(0, firstletter).toLowerCase() + customer.getLastName().substring(0, lastletter).toLowerCase()
						+ customer.getAadharcard().substring(0, aadharno);
				return newUserName;
			}
		
		}
		
		
	}

	@Override
	public List<Account> getAccountByCustomer(Customer customer) {
		// TODO Auto-generated method stub
		 List<Account> accountDetails = dao.getAccountByCustomer(customer);
		
	if(accountDetails != null)
			return accountDetails;
		
	return null;
	}

	@Override
	public boolean performtransaction(BankTransaction transactions) {
		// TODO Auto-generated method stub
		
		long senderAccountNumber = transactions.getAccount().getAccountNumber();
		String senderDescription = transactions.getDescription();
		float senderTransactionAmount = transactions.getTransactionAmount();
		
		boolean isMoneyTransferedToCustomer = isMoneyTransferedToCustomer(transactions);
		
		if(isMoneyTransferedToCustomer) {
			
			BankTransaction transaction = new BankTransaction();
			Account account = dao.getAccountByAccountNumber(senderAccountNumber);
			transaction.setAccount(account);
			
			Timestamp currentTime = new Timestamp(System.currentTimeMillis());
			transaction.setTransactionDate(currentTime);
			transaction.setTransactionTimestamp(currentTime);
			transaction.setBenificiaryName(transactions.getBenificiaryName());
			transaction.setBenificiaryAccNo(senderAccountNumber);
			transaction.setDescription(senderDescription);
			transaction.setTransactionAmount(senderTransactionAmount);
			transaction.setBenificiaryType("transaction");
			transaction.setTransactionType("debit");
			
		boolean isCompleteTransaction = dao.isCompleteTransaction(transaction);
		
		System.out.println("money transfered from customers account ="+isCompleteTransaction);
		
		return isCompleteTransaction;
		}
		return false;
	}
	
	private boolean isMoneyTransferedToCustomer(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getBenificiaryAccNo();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		
		float closingAccount = account.getBalance() + transactions.getTransactionAmount();
		account.setBalance(closingAccount);
		
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		transactions.setBenificiaryType("transaction");
		transactions.setTransactionType("credit");
		
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		System.out.println("money transfered to Benificiary customer account ="+isCompleteTransaction);
		
		return isCompleteTransaction;
		
	}

	@Override
	public boolean getCustomerByAccountNumber(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long benificiaryAccountNumber = transactions.getBenificiaryAccNo();
		Account benificiaryAccount = dao.getAccountByAccountNumber(benificiaryAccountNumber);
		long senderAccountNumber = transactions.getAccount().getAccountNumber();
		
		if( senderAccountNumber != benificiaryAccountNumber)
			if(benificiaryAccount != null )
			return true;
		else
			return false;
		
		return false;
	}

	@Override
	public boolean performdthrecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("DTH recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public boolean performgasrecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("Gas recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public boolean performmobilerecharge(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber);
		transactions.setAccount(account);
		Timestamp currentTime = new Timestamp(System.currentTimeMillis());
		transactions.setTransactionDate(currentTime);
		transactions.setTransactionTimestamp(currentTime);
		
		transactions.setBenificiaryType("Mobile recharge");
		transactions.setTransactionType("debit");
		boolean isCompleteTransaction = dao.isCompleteTransaction(transactions);
		
		return isCompleteTransaction;
	}

	@Override
	public List<BankTransaction> getTrasactionByAccountNumber(String accountNumber) {
		List<BankTransaction> transaction = dao.getTrasactionByAccountNumber(accountNumber);
		return transaction;
	}

	@Override
	public boolean checkBalanceByAccount(BankTransaction transactions) {
		// TODO Auto-generated method stub
		long accountNumber = transactions.getAccount().getAccountNumber();
		Account account = dao.getAccountByAccountNumber(accountNumber); 
		float accountBalance = account.getBalance(); 
		float transactionBalance = transactions.getTransactionAmount();
		
		if(accountBalance > transactionBalance) {
			
			float closingBalance = accountBalance - transactionBalance;
			account.setBalance(closingBalance);
			return true;
		}
		else
			return false;
	}

	@Override
	public User isValideOldUser(User user, User users) {
		// TODO Auto-generated method stub
		User newUserDetail = dao.getUserByUserNameAndPassword(user.getUserName() , users.getOldUserPassword());
		
		if(newUserDetail != null) {
			return newUserDetail;
		}
		
		return null;
		
	}

	@Override
	public boolean isNewAccountCreated(Customer customer , Account account) {
		// TODO Auto-generated method stub
		List<Account> accounts = customer.getAccounts();
		Account newAccount = new Account();
		newAccount.setAccountNumber(isNewAccount());
		newAccount.setBalance(100);
		newAccount.setAccountType(account.getAccountType());
		accounts.add(newAccount);
		customer.setAccounts(accounts);
		
		boolean isSuccess = dao.saveCustomer(customer);
		return isSuccess;
	}
	
	
	@Override
	public boolean isRequestedForLoan(Customer customer, Loan loan) {
		// TODO Auto-generated method stub
		List<Loan> loans = new ArrayList<>();
		Loan newLoan = new Loan();
		RateOfInterest roi = new RateOfInterest();
		roi.setDescription("Type of loan : " + loan.getLoanType());
		roi.setName(loan.getLoanType());
		
		if(loan.getLoanType() == "personalloan")
			roi.setInterestRate(8);
		else 
			if(loan.getLoanType() == "carloan")
				roi.setInterestRate(9);
		
		newLoan.setLoanEmi(roi.getInterestRate());
		newLoan.setLoanType(loan.getLoanType());
		newLoan.setLoanStatus("Requested");
		newLoan.setStatus("false");
		newLoan.setLoanAmount(loan.getLoanAmount());
		newLoan.setLoanPeriod(loan.getLoanPeriod());
		loans.add(newLoan);
		customer.setLoans(loans);
		boolean isSuccess = dao.saveCustomer(customer);
		
		return isSuccess;
	}
	

	private long isNewAccount() {
		// TODO Auto-generated method stub
		long newAccountNumber;
		while(true) {
			 newAccountNumber = ThreadLocalRandom.current().nextLong(1000,9999);
			boolean isValidAccountNumber = dao.isValidAccountNumber(newAccountNumber);
			if(isValidAccountNumber == false) {
				break;
			}
		}
		
		return newAccountNumber;
	}

	@Override
	public boolean isAddressUpdated(User user, Customer customer) {
		// TODO Auto-generated method stub
		Customer oldCustomer = getCustomerByUser(user);
		if(oldCustomer != null) {
			oldCustomer.setAddress(customer.getAddress());
			return true;
		}
		return false;
	}

	@Override
	public boolean isEmailUpdated(User user, Customer customers) {
		// TODO Auto-generated method stub
		Customer oldCustomer = getCustomerByUser(user);
		if(oldCustomer != null) {
			oldCustomer.setEmail(customers.getEmail());
			return true;
		}
		return false;
	}

	@Override
	public boolean isMobileUpadated(User user, Customer customers) {
		// TODO Auto-generated method stub
		Customer oldCustomer = getCustomerByUser(user);
		if(oldCustomer != null) {
			oldCustomer.setMobileNumber(customers.getMobileNumber());
			return true;
		}
		return false;
	}

	@Override
	public boolean isPasswordUpdated(User user, User users) {
		// TODO Auto-generated method stub
		user.setOldUserPassword(user.getUserPassword());
		user.setUserPassword(users.getUserPassword());
		return true;
	}

	@Override
	public boolean isUserValideToCreateAccount(Customer customer) {
		// TODO Auto-generated method stub
		List<Account> Accounts = customer.getAccounts();
		int numberOfAccount = Accounts.size();
		
		if(numberOfAccount<3)
			return true;
		
		return false;
	}

	@Override
	public User isPasswordRegained(User user) {
		// TODO Auto-generated method stub
		User isValidForgottenUser = dao.isValidForgottenUser(user.getUserName() , user.getForgetEmail()); 
		
		if(isValidForgottenUser != null) {
			isValidForgottenUser.setOldUserPassword(user.getUserPassword());
			isValidForgottenUser.setUserPassword("newPassword");
			return isValidForgottenUser;
		}
			
		
		return null;
	}

	
	
}