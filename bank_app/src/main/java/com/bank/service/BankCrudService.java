package com.bank.service;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Transaction;

public interface BankCrudService {
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails()throws BusinessException;
	public List<Account> getAllCustomerAccountDetails()throws BusinessException;
	public Transaction depositAmount(Transaction transaction) throws BusinessException;
	public Transaction withDrawAmount(Transaction transaction)throws BusinessException;
	public List<Transaction> getCustomerTransactionByUserName(String custUserName) throws BusinessException;
	public List<Transaction> getAllCustomerTransactionDetails() throws BusinessException;
	
	
	public Transaction transferAmountByCustDetails(String creditorUsername)throws BusinessException;
	
	
	/*Future Improvising
	 * 1) public Transaction transferAmountByCustDetails(String creditorUserName,long customerMoblileNo, float creditAmount) throws BusinessException; 
	 * 2) public List<Bank> getCustomerDetailsByCity(String city) throws BusinessException;
	 * */
}
