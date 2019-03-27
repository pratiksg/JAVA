package com.capgemini.bankapp.model;

import static org.junit.Assert.*;

import org.junit.Test;

public class SavingAccountTest extends BankAccount {

	private SavingAccountTest account;
	@Test(expected=lowBalanceException.class)
	public void testWithdrawWithSalaryAAcountAndSufficientBalance() throws LowBalanceException,DebitLimitException

	 account= new SavingAccountException(101,"John Doe","SAVING",4500);
	account.withdraw();
}
	