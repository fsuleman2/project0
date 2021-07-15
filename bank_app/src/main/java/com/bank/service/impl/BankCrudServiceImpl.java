package com.bank.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.bank.dao.BankDAO;
import com.bank.dao.impl.BankDAOImpl;
import com.bank.exception.BusinessException;
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
				&& bank.getCustPan()!=null && bank.getCustCity()!=null && bank.getCustState()!=null && bank.getInitialAmount()>=0.0) {
			bank = bankDAO.openCustomerAccount(bank);
		}
		else {
			throw new BusinessException("Invalid Details...");
		}
		return bank;
	}

	@Override
	public List<Bank> getAllCustomerDetails() throws BusinessException {
		Bank bank =new Bank();
		List<Bank> bankList = new ArrayList<>();
//		if(bank.getCustUserName()!=null && bank.getCustFname()!=null && bank.getCustLname()!=null
//				&& bank.getCustGender()!=null && bank.getCustDob()!=null && bank.getCustMobileno()!=0
//				&& bank.getCustPan()!=null&& bank.getCustCity()!=null && bank.getCustState()!=null && bank.getInitialAmount()!=0.0) {
				bankList = bankDAO.getAllCustomerDetails();
			//bankList = bankDAO.getAllCustomerDetails();
		//}
		//else {
			//throw new BusinessException("Invalid Details...");
		//}
		return bankList;
	}

	@Override
	public Transaction depositAmount(Transaction transaction) throws BusinessException {
		transaction =bankDAO.depositAmount(transaction);
		return transaction;
	}

	@Override
	public Transaction withDrawAmount(Transaction transaction1) {
		// TODO Auto-generated method stub
		return null;
	}

}
