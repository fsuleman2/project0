package com.bank.service;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;

public interface BankLoginService{
	public  Bank employeeLogin(Bank bank) throws BusinessException;
	public Customer customerLogin(Customer customer) throws BusinessException;
}
