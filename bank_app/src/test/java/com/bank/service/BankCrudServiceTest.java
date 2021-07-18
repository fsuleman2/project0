package com.bank.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.bank.exception.BusinessException;
import com.bank.model.Transaction;
import com.bank.service.impl.BankCrudServiceImpl;

class BankCrudServiceTest {
private static BankCrudService service;
public void setup() {
	service=new BankCrudServiceImpl();
}
	@Test
	void testforGetCustomerTransactionByUserName() {
		try {
			service.getCustomerTransactionByUserName("saif123");
			
		}
		catch(BusinessException e) {
			assertEquals("Invalid UserId or Password ", e.getMessage());
		}
		
	}

}
