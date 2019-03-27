package com.capgemini.bankapp.model;

public class SavingAccount extends BankAccount {
	private boolean salaryAccount;
	public static final double MINIMUM_BALANCE =10000;
	
	public SavingAccount() {
		super();
		
	}
	public SavingAccount(long accountId, String accountHolderName, String accountType, double accountBalance) {
		super(accountId, accountHolderName, accountType, accountBalance);
		
	}
	public boolean isSalaryAccount() {
		return salaryAccount;
	}

	public void setSalaryAccount(boolean salaryAccount) {
		this.salaryAccount = salaryAccount;
	}
	
	@Override
	public double withdraw(double amount) {
		if(salaryAccount) {
			return super.withdraw(amount);
		}
		else {
			if(getAccountBalance() - amount >= MINIMUM_BALANCE)
				setAccountBalance(getAccountBalance() - amount); 
			else
				System.out.println("you don't have sufficient fund.");
			return getAccountBalance();
		}
	}
	
	@Override
	public void displayBankAccountDetails() {
		super.displayBankAccountDetails();
		System.out.println("Salary Account: " + salaryAccount);
	}

}



