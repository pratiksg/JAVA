package com.capgemini.exception.main;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;


class BankAccountTest {

	private BankAccount account;
	@Before

	public void setUp() {
		try {
			account=new BankAccount(101,"John Doe","SAVING",35000);
		} catch (LowBalaceException e) {
			
			e.printStackTrace();
		}
	}
	
	
}
