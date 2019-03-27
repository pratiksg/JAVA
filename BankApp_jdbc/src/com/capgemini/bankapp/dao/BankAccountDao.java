package com.capgemini.bankapp.dao;



import java.sql.SQLException;
import java.util.List;

import com.capgemini.bankapp.dao.impl.accountNotFoundException;
import com.capgemini.bankapp.model.BankAccount;

public interface BankAccountDao {
	public double getBalance(long accountId);
	public void updateBalance(long accountId,double newBalance);
	public boolean deleteBankAccount(long accountId);
	//public boolean deleteBankAccount(long accountId);
	public boolean addNewBankAccount1(BankAccount account);
	//public boolean addNewBankAccount1(BankAccount account);
	public List<BankAccount> findAllBankAccounts();
	//public boolean addNewBankAccount(BankAccount account);
	public BankAccount searchBankAccount(Long accountId) throws SQLException, accountNotFoundException;

}
