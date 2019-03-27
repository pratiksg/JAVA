package com.capgemini.BankApp.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.capgemini.BankApp.model.SavingException;

public class SavingExceptionTest {

private SavingException account;
	
	@Test(expected=LowBalanceException.class)
	public void testWithdrawWithSalaryAccountAndInsufficientbalance() throws LowBalanceException,DebitLimitExceeded{
	
	account = new SavingException(101,"John Don",35000,true);
	account.withdraw(50000);
}

@Test(expected=LowBalanceException.class)
public void testWithdrawWithNotSalaryAccountAndInsufficientbalance() throws LowBalanceException,DebitLimitExceeded{

account = new SavingException(101,"John Don",35000,false);
account.withdraw(5000);

}
}