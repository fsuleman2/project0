package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;

import com.bank.dao.BankDAO;
import com.bank.dao.impl.BankDAOImpl;
import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.service.impl.BankLoginServiceImpl;

class BankLoginServiceTest {
	private static BankLoginService bankLoginService;
	private static Logger log = Logger.getLogger(Bank.class);
	public static void setup() {
		bankLoginService = new BankLoginServiceImpl();
		
	}
	@Test
	void testEmployeeLoginForExisting() {
		String empUserName = "syed123";
		String empPassword = "123";
		Bank bank = new Bank(empUserName,empPassword);
		//bank.setEmpUsername(empUserName);
		//bank.setPassword(empPassword);
		try {
			
			assertEquals(bank,bankLoginService.employeeLogin(bank));
		}
		catch(BusinessException e) {
			log.warn(e.getMessage());
			fail("Not yet implemented");
		}
	}
	@Test
	void testCustomerLogin() {
		//fail("Not yet implemented");
	}

}
