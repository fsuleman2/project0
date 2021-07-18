package com.bank.dao;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.model.Transaction;

public interface BankDAO {
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException;
	///Bank crud service
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails()throws BusinessException;
	//Bank login service
	public Bank employeeLogin(Bank bank) throws BusinessException;
	//Bank Customer service
	public Customer customerLogin(Customer customer) throws BusinessException;
	//deposit
	public Transaction depositAmount(Transaction transaction) throws BusinessException;
	public Customer getPasswordByUserId(String userId) throws BusinessException;
	
	public Account getBalanceByUserName(String custUserName) throws BusinessException;
	public List<Account> getAllCustomerAccountDetails()throws BusinessException;
	//withdrawl
	public Transaction withDrawAmount(Transaction transaction) throws BusinessException;
	//view statement
	public List<Transaction> getCustomerTransactionByUserName(String custUserName) throws BusinessException;
	//get all transaction details
	public List<Transaction> getAllCustomerTransactionDetails() throws BusinessException;
	//transfer amount
	public Transaction transferAmountByCustDetails(String creditorUsername)throws BusinessException;
}
