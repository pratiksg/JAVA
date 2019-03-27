package com.capgemini.BankApp.model;

public class SavingBankAccount extends BankAccount {

	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE = 10000;

	public SavingBankAccount() {

	}

	public SavingBankAccount(long accountId, String accountHolderName,
			double accountBalance, boolean salaryAccount) {
		super(accountId, accountHolderName, "SAVING", accountBalance);
		this.salaryAccount = salaryAccount;
	}

	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}

	@Override
	public double withdraw(double amount) {
		if (salaryAccount) {
			return super.withdraw(amount);
		} else {
			if (getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount);
			else
				System.out.println("you don't have sufficient fund.");
			return getAccountBalance();
		}
	}

	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Salary Account: " + salaryAccount);
	}

}
