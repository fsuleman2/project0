package com.bank.service.impl;

import com.bank.dao.BankDAO;
import com.bank.dao.impl.BankDAOImpl;
import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.service.BankLoginService;

public class BankLoginServiceImpl implements BankLoginService{
	private BankDAO bankDAO=new BankDAOImpl();
	@Override
	public boolean isValidEmployeeCredentials(Bank bank) throws BusinessException{
		boolean b = false;
		if(bank!=null && bank.getEmpUsername()!=null && bank.getEmpPassword()!=null) {
			b = bankDAO.isValidEmployeeCredentials(bank);
		}
		else {
			throw new BusinessException("Invalid3 Username and Password");
		}
		return b;
	}
	@Override
	public boolean isValidCustomerCredentials(Customer customer) throws BusinessException{
		boolean b = false;
		if(customer.getCustUserName()!=null && customer.getCustPassword()!=null) {
			b = bankDAO.isValidCustomerCredentials(customer);
		}
		else {
			throw new BusinessException("Invalid Details...");
		}
		return b;
	}
}
