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
	public Bank employeeLogin(Bank bank) throws BusinessException {
		if(bank.getEmpUsername()!=null && bank.getEmpPassword()!=null) {
			bank = bankDAO.employeeLogin(bank);
		}
		else {
			throw new BusinessException("Invalid3 Details...");
		}
		return bank;
	}
	@Override
	public Customer customerLogin(Customer customer) throws BusinessException {
		if(customer.getCustUserName()!=null && customer.getCustPassword()!=null) {
			customer = bankDAO.customerLogin(customer);
		}
		else {
			throw new BusinessException("Invalid Details...");
		}
		return customer;
	}
	

	

}
