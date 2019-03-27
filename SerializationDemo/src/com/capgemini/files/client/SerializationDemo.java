package com.capgemini.files.client;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.capgemini.files.model.BankAccount;
import com.capgemini.files.model.DebitCard;

public class SerializationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		DebitCard debitCard = new DebitCard(1111222233334444L, 234, 11, 2021);
		BankAccount account = new BankAccount(101, "John Doe", "SAVING", 34000, debitCard);
		
		FileOutputStream fileOutputStream = new FileOutputStream("account.ser");
		ObjectOutputStream outputStream = new ObjectOutputStream(fileOutputStream);
		
		outputStream.writeObject(account);
		outputStream.close();

		FileInputStream fileInputStream = new FileInputStream("account.ser");
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);
		
		BankAccount account2 = (BankAccount) inputStream.readObject();
		inputStream.close();
		
		System.out.println(account2);
	}

}
