package com.capgemini.bankapp.model;

public class BankAccount {
	private long accountId;
	private String accountName;
	private String accountType;
	private double accountBalance;

	

	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BankAccount(long accountId, String accountName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	public BankAccount(String accountName, String accountType, double accountBalance) {
		super();
		this.accountName = accountName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}

	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountName=" + accountName + ", accountType=" + accountType
				+ ", accountBalance=" + accountBalance + "]";
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
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

	public String getAccountHolderName() {

		return null;
	}

	

}
