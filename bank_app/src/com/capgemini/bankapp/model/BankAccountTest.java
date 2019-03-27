package com.capgemini.bankapp.model;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class BankAccountTest {

	private BankAccount account;
	@Before
	public void setUp() {
		BankAccount account = new BankAccount(101,"John Doe","SAVING",35000);
	}
	
	@Test
	public void testBankAccountObjectIsCreatedWithDefaultConstructor() {
		
		BankAccount account= new BankAccount();
		assertNotNull(account);
		
		}
	public void testBankAccountObjectIsCreatedWithParameterisedConstructor() {
		
			BankAccount account= new BankAccount(101,"John Doe","SAVING",4500);
			assertNotNull(account);
			assertEquals(101,account.getAccountId());
			assertEquals("John Doe",account.getAccountHolderName());
			assertEquals("SAVING", account.getAccountType());
			assertEquals(4500, account.getAccountBalance(),0.01);
		
		}
	@Test
	public void testBankAccountCurrentBalance() {
			assertEquals(35000,account.getAccountBalance(),0.01);
		
	}
	@Test
	public void testWithdrawWithSufficientFund() {
		account.withdraw(5000);
		assertEquals(30000,account.getAccountBalance(),0.01);
		
		
		
	}
	@Test
	public void testWithdrawWithInsufficientFund() {
		account.withdraw(45000);
		assertEquals(35000,account.getAccountBalance(),0.01);
		
	}
	@Test
	public void testDeposit() {
		account.deposit(5000);
		assertEquals(40000,account.getAccountBalance());
	}
}