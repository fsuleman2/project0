package com.bank.service;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.model.Transaction;

public interface BankCrudService {
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails()throws BusinessException;
	public List<Account> getAllCustomerAccountDetails()throws BusinessException;
//	public List<Bank> getAllCustomerTransactionDetails(Bank bank)throws BusinessException;
	//for deposit
	public Transaction depositAmount(Transaction transaction) throws BusinessException;
	public Transaction withDrawAmount(Transaction transaction1);

}
