package com.bank.service;

import java.util.List;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;

public interface BankSearchService {
	public List<Bank> getCustomerDetailsByUsername(String username) throws BusinessException;
	public List<Bank> getTransactionDetailsByTid(int tid) throws BusinessException;
}
