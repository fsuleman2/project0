package com.bank.service;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Transaction;

public interface BankSearchService {
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException;
	
	public List<Transaction> getTransactionDetailsByTid(int tid) throws BusinessException;
	public Account getBalanceByUserName(String custUserName) throws BusinessException;
	/*Future Improvising
	 * 1) public List<Bank> getCustomerDetailsByFirstName(String fname) throws BusinessException;
	 * 2) public List<Bank> getCustomerDetailsByCity(String city) throws BusinessException;
	 * */
}
