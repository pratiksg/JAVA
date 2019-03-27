package com.capgemini.bankapp.model;

public class CureentBankAccount extends BankAccount {
	private double debitLimit;
	private double borrowedAmount;

	public void CurrentAccount() {

	}

	

	public CureentBankAccount(double debitLimit, double borrowedAmount) {
		super();
		this.debitLimit = debitLimit;
		this.borrowedAmount = borrowedAmount;
	}



	public double getDebitLimit() {
		return debitLimit;
	}

	public void setDebitLimit(double debitLimit) {
		this.debitLimit = debitLimit;
	}

	public double getBorrowedAmount() {
		return borrowedAmount;
	}

	public void setBorrowedAmount(double borrowedAmount) {
		this.borrowedAmount = borrowedAmount;
	}
	
	@Override
	public double withdraw(double amount) {
		double temp = getAccountBalance() - amount;
		if(temp >= 0)
			setAccountBalance(temp);
		else if(Math.abs(temp) <= (debitLimit - borrowedAmount)) {
			setAccountBalance(0);
			borrowedAmount = borrowedAmount + Math.abs(temp);
		}
		else
			System.out.println("Debit Limit exceeded.");
		
		return getAccountBalance();
	}
	
	@Override
	public double deposit(double amount) {
		if(borrowedAmount == 0)
			return super.deposit(amount);
		else if(amount >= borrowedAmount) {
			setAccountBalance(amount - borrowedAmount);
			borrowedAmount = 0;			
		}
		else {
			borrowedAmount = borrowedAmount - amount;
		}
		return getAccountBalance();
	}
	
	@Override
	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Debit Limit: " + debitLimit);
		System.out.println("Borrowed amount : " + borrowedAmount);
	}

}












