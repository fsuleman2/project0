package com.bank.service;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;

public interface BankLoginService{
	public boolean isValidEmployeeCredentials(Bank bank) throws BusinessException;
	public boolean isValidCustomerCredentials(Customer customer) throws BusinessException;
}
