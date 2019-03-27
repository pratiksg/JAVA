package com.capgemini.bankapp.model;

public class BankAccount {

	
	private long accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalance;
	public BankAccount() {
		super();
		
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
	public BankAccount(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalance = accountBalance;
	}
	public double withdraw(double amount) {
		if(accountBalance >=amount)
				accountBalance=accountBalance - amount;
		else
			System.out.println("you dont have sufficient fund");
		return accountBalance;
		
	}
	public double deposit(double amount) {
		accountBalance = accountBalance + amount;
		return accountBalance;
		
	}
	public void displayBankAccountDetails() {
		System.out.println("BankAccountId:"+accountId);
		System.out.println("BankAccountHolderName:"+accountHolderName);
		System.out.println("BankAccountType:"+accountType);
		System.out.println("BankAccountbalance:"+accountBalance);
		
	}
	
}



