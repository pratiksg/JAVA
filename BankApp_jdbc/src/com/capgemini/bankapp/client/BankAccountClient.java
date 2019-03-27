package com.capgemini.bankapp.client;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import com.capgemini.bankapp.exception.LowBalanceException;
import com.capgemini.bankapp.model.BankAccount;
import com.capgemini.bankapp.service.impl.BankAccountServiceImpl;
import com.capgemini.service.BankAccountService;

public class BankAccountClient {
	public static void main(String[] args) throws IOException, LowBalanceException {
		int choice;
		long accountId;
		String accountHolderName;
		String accountType;
		double accountBalance;
		double balance;
		double amount;
		BankAccountService bankService = new BankAccountServiceImpl();
		try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
			while (true) {
				System.out.println("1. Add New BankAccount\n2. Withdraw\n3. Deposit\n4. Fund Transfer");
				System.out.println("5. Delete BankAccount\n6. Display All BankAccount Details");
				System.out.println("7. Search BankAccount\n8. Check Balance\n9. Exit\n");

				System.out.print("Please enter your choice = ");
				choice = Integer.parseInt(reader.readLine());

				switch (choice) {

				case 1:

					System.out.println("enter account holder name:");
					accountHolderName = reader.readLine();
					System.out.println("enter account Type: ");
					accountType = reader.readLine();
					System.out.println("enter account Balance: ");
					accountBalance = Double.parseDouble(reader.readLine());
					BankAccount account = new BankAccount(accountHolderName, accountType, accountBalance);

					if (bankService.addNewBankAccount(account))
						System.out.println("Account created successfully...\n");
					else
						System.out.println("failed to create new account...\n");
					break;
				case 2:
					System.out.println("enter Account id");
					accountId=Long.parseLong(reader.readLine());
					System.out.println("enter amount");
					amount=Double.parseDouble(reader.readLine());
					bankService.withdraw(accountId, amount);
				case 3:
					System.out.println("enter Account id");
					accountId=Long.parseLong(reader.readLine());
					System.out.println("enter amount");
					amount=Double.parseDouble(reader.readLine());
					bankService.deposit(accountId, amount);
				case 4:
					System.out.println("enter account number from which account to transfer");
					accountId=Long.parseLong(reader.readLine());
					
					System.out.println("enter account number to which account transfer");
					accountId=Long.parseLong(reader.readLine());
					System.out.println("enter amount");
					accountId=Long.parseLong(reader.readLine());
					
					amount=Double.parseDouble(reader.readLine());
					bankService.fundTransfer(accountId, accountId, amount);
					break;
					
				case 5:
					System.out.println("enter account id to delete");
					accountId=Long.parseLong(reader.readLine());
					bankService.deleteBankAccount(accountId);
					break;
				case 6:
					
					List<BankAccount> accounts =new ArrayList<>(); 
					accounts =bankService.findAllBankAccounts();
					for (BankAccount account1 : accounts) {
						System.out.println(account1);
					}
					
					break;
				case 7:
					System.out.println("enter id for serach");
					accountId=Long.parseLong(reader.readLine());
					bankService.searchBankAccount();
					System.out.println("account found");
					break;
				case 8:
					System.out.println("enter id to check balance");
					accountId=Long.parseLong(reader.readLine());
					bankService.checkBalance(accountId);
					System.out.println("balance of account is:"+bankService.checkBalance(accountId));
					
				case 9:

					System.out.println("Thanks for banking with us.");
					System.exit(0);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
