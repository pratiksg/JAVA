package com.capgemini.files.model;

import java.io.Serializable;

public class BankAccount implements Serializable {
	private int accountId;
	private String accountHolderName;
	private String accountType;
	private double accountBalace;
	private transient DebitCard debitCard;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
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
	public double getAccountBalace() {
		return accountBalace;
	}
	public void setAccountBalace(double accountBalace) {
		this.accountBalace = accountBalace;
	}
	public DebitCard getDebitCard() {
		return debitCard;
	}
	public void setDebitCard(DebitCard debitCard) {
		this.debitCard = debitCard;
	}
	@Override
	public String toString() {
		return "BankAccount [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", accountType="
				+ accountType + ", accountBalace=" + accountBalace + ", debitCard=" + debitCard + "]";
	}
	public BankAccount(int accountId, String accountHolderName, String accountType, double accountBalace,
			DebitCard debitCard) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.accountType = accountType;
		this.accountBalace = accountBalace;
		this.debitCard = debitCard;
	}
	public BankAccount() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
