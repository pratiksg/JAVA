package com.capgemini.BankApp.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.capgemini.BankApp.model.BankAccount;

public class BankAccountTest {
	private BankAccount account;

	@Before
	public void setUp() {
		account = new BankAccount(101, "John Don", "SAVING", 35000);

	}

	@Test
	public void testBankAccountobjectCreatedWithDefaultConstructor() {

		BankAccount account = new BankAccount();
		assertNotNull(account);

	}

	@Test
	public void testBankAccountobjectCreatedWithParameterisedConstructor() {

		BankAccount account = new BankAccount(101, "John Don", "SAVING", 35000);
		assertNotNull(account);
		assertEquals(101, account.getAccountId());
		assertEquals("John Don", account.getAccountHolderName());
		assertEquals("SAVING", account.getAccountType());
		assertEquals(35000.0, account.getAccountBalance(), 0.01);

	}

	@Test
	public void testBankAccountCurrentBalance() {
		assertEquals(35000, account.getAccountBalance(), 0.01);
	}

	@Test
	public void testWithdrawWithSufficientFund() {
		account.withdraw(5000);
		assertEquals(30000, account.getAccountBalance(), 0.01);

	}

	public void testDeposit() {
		account.deposit(5000);
		assertEquals(4000, account.getAccountBalance(), 0.01);

	}
}
