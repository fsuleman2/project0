package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.bank.exception.BusinessException;
import com.bank.model.Bank;
import com.bank.model.Customer;
import com.bank.service.impl.BankLoginServiceImpl;

class BankLoginServiceTest {
public  static BankLoginService service = null;
public static Bank bank = null;
public static Customer customer = null;
//private static Logger log = Logger.getLogger(BankLoginServiceTest.class);
@BeforeAll
public  static void  setup() {
	service = new BankLoginServiceImpl();
	bank = new Bank();
	customer = new Customer();
	
}
	@Test
	public void testEmployeeLoginUserNameforExisting() throws BusinessException {
		bank.setEmpUsername("syed123");
		assertTrue("syed123".equals(bank.getEmpUsername()));
		}
//	@Test
//	public void testEmployeeLoginUserNameforNotExisting() throws BusinessException {
//		bank.setEmpUsername("abcd123");
//		assertTrue("syed123".equals(bank.getEmpUsername()));	
//		}
	@Test
	public void testEmployeeLoginPasswordforExisting() throws BusinessException {
		bank.setEmpPassword("123");
		assertTrue("123".equals(bank.getEmpPassword()));			
		}
//	@Test
//	public void testEmployeePasswordforNonExisting() throws BusinessException {
//		bank.setEmpPassword("hello123");
//		assertTrue("123".equals(bank.getEmpPassword()));			
//		}

	@Test
	public void testCustomerLoginUserNameforExisting() throws BusinessException{
		customer.setCustUserName("neha5121");
		assertTrue("neha5121".equals(customer.getCustUserName()));
	}
	@Test
	public void testCustomerLoginUserNameforNonExisting() throws BusinessException{
		customer.setCustUserName("neha5121");
		assertTrue("hello5121".equals(customer.getCustUserName()));
	}
	@Test
	public void testCustomerLoginPasswordforExisting() throws BusinessException{
		customer.setCustPassword("5121");
		assertTrue("5121".equals(customer.getCustPassword()));
	}
	@Test
	public void testCustomerLoginPasswordforNonExisting() throws BusinessException{
		customer.setCustPassword("5121");
		assertTrue("nnn5121".equals(customer.getCustPassword()));
	}

}
