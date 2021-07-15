package com.bank.service.impl;

import java.util.List;

import com.bank.dao.BankDAO;
import com.bank.dao.impl.BankDAOImpl;
import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Transaction;
import com.bank.service.BankSearchService;

public class BankSearchServiceImpl implements BankSearchService{

	@Override
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transaction> getTransactionDetailsByTid(int tid) throws BusinessException {
		
		return null;
	}

	@Override
	public Account getBalanceByAccountNumber(float accno) throws BusinessException {
		Account account = new Account();
		BankDAO bankDAO = new BankDAOImpl();
		if(accno!=0) {
			account = bankDAO.getBalanceByAccountNumber(accno);
		}
		return account;
	}



}
