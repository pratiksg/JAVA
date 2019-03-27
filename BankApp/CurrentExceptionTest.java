package com.capgemini.BankApp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.BankApp.model.CurrentException;

public class CurrentExceptionTest {
private CurrentException account;
	
	@Before
	public void setUp()
	{
		account =  new CurrentException(101,"John Don",35000, 0);
	}
	
	
	
	@Test(expected=DebitLimitExceeded.class)
	public void testWithdrawWithDebitLimitExceeded()
	{
		account.withdraw(65000);
		account.withdraw(5000);
	}

}
