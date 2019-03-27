package com.capgemini.BankApp.model;

public class BankException {
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;

	public BankException() {
		super();

	}

	public BankException(long accountId, String accountHolderName,
			String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}

	public double getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}

	public double withdraw(double amount) {
		if (accountBalance >= amount)
			accountBalance = accountBalance - amount;
		else
			System.out.println("You don't have sufficient fund");
		return accountBalance;

	}

	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		return accountBalance;
	}

	public void displayBankAccountDetails() {
		System.out.println("BankAccount Id: " + accountId);
		System.out.println("BankAccount Holder name: " + accountHolderName);
		System.out.println("BankAccount Type: " + accountType);
		System.out.println("BankAccount balance: " + accountBalance);

	}

}
