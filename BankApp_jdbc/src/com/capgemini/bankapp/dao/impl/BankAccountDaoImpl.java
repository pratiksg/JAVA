package com.capgemini.bankapp.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.dao.BankAccountDao;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.util.DbUtil;

public class BankAccountDaoImpl implements BankAccountDao 
{

	@Override
	public double getBalance(long accountId) 
	{
		String query = "SELECT account_balance FROM bankappaccounts WHERE account_id=" + accountId;
		double balance = 0;
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(query);
				ResultSet result = preparedstatement.executeQuery()) 
		{
			if(result.next())
			balance = result.getDouble(1);
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}

		return balance;
	}

	@Override
	public void updateBalance(long accountId, double newBalance) 
	{
		String query="UPDATE bankappaccounts SET account_balance=? WHERE account_id=?";
		try(Connection connection=DbUtil.getConnection();
				PreparedStatement preparedstatement=connection.prepareStatement(query))
		{
					
			preparedstatement.setDouble(1,newBalance);
			preparedstatement.setLong(2,accountId);
			int result=preparedstatement.executeUpdate();
			System.out.println("NO.of rows updated"+result);
		}
			
		catch(SQLException e) 
		{
			e.printStackTrace();
		}

	}

	@Override
	public boolean deleteBankAccount(long accountId) 
	{
		String query="Delete FROM bankappaccounts WHERE  account_id="+accountId;
		int result;
		try (Connection connection =DbUtil.getConnection();
				PreparedStatement preparedstatement =connection.prepareStatement(query))
		{
			
			result=preparedstatement.executeUpdate();
			if(result==1) 
			
				return true;
				
		}
			catch(SQLException e) 
		{
				e.printStackTrace();
		}
			return false;
	}

	@Override
	public boolean addNewBankAccount1(BankAccount account) {
		String query="INSERT INTO bankappaccounts(customer_name,account_type,account_balance) VALUES(?,?,?)";
		try(Connection connection =DbUtil.getConnection();
				PreparedStatement preparedstatement = connection.prepareStatement(query)) {
				preparedstatement.setString(1, account.getAccountName());
					preparedstatement.setString(2, account.getAccountType());
					preparedstatement.setDouble(3, account.getAccountBalance());
					int result= preparedstatement.executeUpdate();
					if(result==1)
						return true;
				}catch(SQLException e) {
				e.printStackTrace();
	}
		return false;
	}
	@Override
	public List<BankAccount> findAllBankAccounts() {
		String query = "SELECT * FROM bankappaccounts";
		List<BankAccount> accounts = new ArrayList<>();
		try (Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery();) {

			while (result.next()) {
				long id = result.getLong(1);
				String name = result.getString(2);
				String type = result.getString(3);
				Double amount = result.getDouble(4);
				BankAccount account = new BankAccount(id,name,type,amount);
				accounts.add(account);
			}

			}
		 catch (SQLException e) {
			e.printStackTrace();
		}
		return accounts;
	}

	
	
	/*
	 * public BankAccount searchBankAccount(long accountId) throws
	 * accountNotFoundException, SQLException { String
	 * query="SELECT * FROM bankAccounts WHERE  account_id="; BankAccount account =
	 * new BankAccount(); try(Connection connection = DbUtil.getConnection();
	 * PreparedStatement statement = connection.prepareStatement(query); ResultSet
	 * result = statement.executeQuery()) { if(!result.next()) { String
	 * accountHolderName = result.getString(2); String accountType =
	 * result.getString(3); double accountBalance = result.getDouble(4); account =
	 * new BankAccount( accountId, accountHolderName, accountType, accountBalance);
	 * 
	 * throw new accountNotFoundException("record not found");} else {
	 * System.out.println("Record doesn't exist"); }
	 * 
	 * }return account;
	 * 
	 * 
	 * }
	 */
	@Override
	public BankAccount searchBankAccount(Long accountId) throws SQLException, accountNotFoundException {
		String query="SELECT * FROM bankappaccounts WHERE  account_id=";
		BankAccount account = new BankAccount();
		try(Connection connection = DbUtil.getConnection();
				PreparedStatement statement = connection.prepareStatement(query);
				ResultSet result = statement.executeQuery()) 
		{
			if(!result.next()) {
				String accountHolderName = result.getString(2);
				String accountType = result.getString(3);
				double accountBalance = result.getDouble(4);
				account = new BankAccount( accountId, accountHolderName, accountType, accountBalance);
								
			 throw new accountNotFoundException("account not found");}
			 else {
				 System.out.println("Account doesn't exist");
			 }
				 
				 
			 
			
			}catch(SQLException e) {
				e.printStackTrace();
			}
		return account;
			
	}

	
		
		
	}




