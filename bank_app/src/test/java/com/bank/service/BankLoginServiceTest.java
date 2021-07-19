package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.service.impl.BankLoginServiceImpl;

class BankLoginServiceTest {
public  static BankLoginService service = null;
public static Bank bank = null;
//private static Logger log = Logger.getLogger(BankLoginServiceTest.class);
@BeforeAll
public  static void  setup() {
	service = new BankLoginServiceImpl();
	bank = new Bank();
}
	@Test
	public void testEmployeeLoginforExisting() throws BusinessException {
		bank.setEmpUsername("syed123");
		assertTrue("syed123".equals(bank.getEmpUsername()));
		}
//	@Test
//	public void testEmployeeLoginforNotExisting() throws BusinessException {
//		bank.setEmpUsername("abcd123");
//		assertTrue("syed123".equals(bank.getEmpUsername()));	
//		}
	@Test
	public void testEmployeePasswordforExisting() throws BusinessException {
		bank.setEmpPassword("123");
		assertTrue("123".equals(bank.getEmpPassword()));			
		}
//	@Test
//	public void testEmployeePasswordforNonExisting() throws BusinessException {
//		bank.setEmpPassword("hello123");
//		assertTrue("123".equals(bank.getEmpPassword()));			
//		}


}
