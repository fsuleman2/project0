package com.bank.dao;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;

public interface BankDAO {
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException;
	public List<Bank> getTransactionDetailsByTid(int tid) throws BusinessException;
	///Bank crud service
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails(Bank bank)throws BusinessException;
	//Bank login service
	public Bank employeeLogin(Bank bank) throws BusinessException;
	//Bank Customer service
	public Customer customerLogin(Customer customer) throws BusinessException;
}
