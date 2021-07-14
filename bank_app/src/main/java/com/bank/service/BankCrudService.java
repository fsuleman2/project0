package com.bank.service;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;

public interface BankCrudService {
	public Bank registerCustomer(Bank bank) throws BusinessException;
	public Bank openCustomerAccount(Bank bank) throws BusinessException;
	public List<Bank> getAllCustomerDetails(Bank bank)throws BusinessException;
//	public List<Bank> getAllCustomerTransactionDetails(Bank bank)throws BusinessException;
}
