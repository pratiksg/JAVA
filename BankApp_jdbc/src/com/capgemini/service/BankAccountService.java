package com.capgemini.service;

import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountService {
	public double withdraw(long accountId, double amount) throws LowBalanceException;

	public double deposit(long accountId, double amount);

	public boolean deleteBankAccount(long accountId);

	double fundTransfer(long fromAccount, long toAccount, double amount) throws LowBalanceException;

	boolean addNewBankAccount(BankAccount account);

	public double checkBalance(long accountId);

	public void searchBankAccount();

	public List<BankAccount> findAllBankAccounts();

	public void searchBankAccount(Long accountId);

}
