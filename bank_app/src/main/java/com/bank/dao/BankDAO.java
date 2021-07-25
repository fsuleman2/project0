package com.bank.dao;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Account;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.model.Transaction;

public interface BankDAO {
	/*************************************From BANKCRUDSERVICE STARTS********************************/
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails()throws BusinessException;
	public List<Account> getAllCustomerAccountDetails()throws BusinessException;
	public Transaction depositAmount(Transaction transaction) throws BusinessException;
	public Transaction withDrawAmount(Transaction transaction)throws BusinessException;
	public List<Transaction> getCustomerTransactionByUserName(String custUserName) throws BusinessException;
	public List<Transaction> getAllCustomerTransactionDetails() throws BusinessException;
	public Transaction transferAmountByCustDetails(String creditorUsername)throws BusinessException;
	/*************************************From BANKCRUDSERVICE ENDS*********************************/
	
	/*********************************From LOGINSERVICE STARTS******************************/
	public boolean isValidEmployeeCredentials(Bank bank) throws BusinessException;
	public boolean isValidCustomerCredentials(Customer customer) throws BusinessException;
	/*********************************From LOGINSERVICE ENDS******************************/
	
	/*********************************From BANKSEARCHSERVICE STARTS******************************/
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException;
	public List<Transaction> getTransactionDetailsByTid(int tid) throws BusinessException;
	public Account getBalanceByUserName(String custUserName) throws BusinessException;
	/*********************************From BANKSEARCHSERVICE ENDS******************************/
}
