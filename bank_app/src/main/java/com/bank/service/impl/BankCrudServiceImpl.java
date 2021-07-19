package com.bank.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bank.dao.BankDAO;
import com.bank.dao.impl.BankDAOImpl;
import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Transaction;
import com.bank.service.BankCrudService;

public class BankCrudServiceImpl implements BankCrudService {
	private BankDAO bankDAO=new BankDAOImpl();
	@Override
	public Bank registerCustomer(Bank bank) throws BusinessException {
		if(bank.getName()!=null && bank.getEmail()!=null && bank.getUsername()!=null && bank.getPassword()!=null) {
			bank = bankDAO.registerCustomer(bank);
		}
		else {
			throw new BusinessException("Invalid Details...");
		}
		
		return bank;
	}

	@Override
	public Bank openCustomerAccount(Bank bank) throws BusinessException {
		if(bank.getCustUserName()!=null && bank.getCustFname()!=null && bank.getCustLname()!=null
				&& bank.getCustGender()!=null && bank.getCustDob()!=null && bank.getCustMobileno()!=0
				&& bank.getCustPan()!=null && bank.getCustCity()!=null && bank.getCustState()!=null && bank.getOpeningBalance()>=0.0) {
			bank = bankDAO.openCustomerAccount(bank);
		}
		else {
			throw new BusinessException("Invalid Details...");
		}
		return bank;
	}

	@Override
	public List<Bank> getAllCustomerDetails() throws BusinessException {
		List<Bank> bankList = new ArrayList<>();
		bankList = bankDAO.getAllCustomerDetails();
		return bankList;
	}

	@Override
	public Transaction depositAmount(Transaction transaction) throws BusinessException {
		
		transaction =bankDAO.depositAmount(transaction);
		return transaction;
	}

	

	@Override
	public List<Account> getAllCustomerAccountDetails() throws BusinessException {
		List<Account> accountList = null;
		accountList = bankDAO.getAllCustomerAccountDetails();
		return accountList;
	}

	@Override
	public List<Transaction> getAllCustomerTransactionDetails() throws BusinessException {
		List<Transaction> transactionList = null;
		transactionList = bankDAO.getAllCustomerTransactionDetails();
		return transactionList;
	}

	@Override
	public Transaction withDrawAmount(Transaction transaction) throws BusinessException {
		transaction =bankDAO.withDrawAmount(transaction);
		return transaction;
	}

	@Override
	public List<Transaction> getCustomerTransactionByUserName(String custUserName) throws BusinessException {
		List<Transaction> transactionList = null;
		if(custUserName != null && custUserName.length()>=0) {
			transactionList = bankDAO.getCustomerTransactionByUserName(custUserName);
		}
		return transactionList;
	}

	@Override
	public Transaction transferAmountByCustDetails(String creditorUsername) throws BusinessException {
		// TODO Auto-generated method stub
		return null;
	}

}
