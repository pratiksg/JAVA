package com.capgemini.files.model;

import java.io.Serializable;

public class DebitCard{
	public long cardNumber;
	private int cvv;
	private int expiratyMonth;
	private int expirayYear;
	public DebitCard() {
		super();
		
	}
	@Override
	public String toString() {
		return "DebitCard [cardNumber=" + cardNumber + ", cvv=" + cvv + ", expiratyMonth=" + expiratyMonth
				+ ", expirayYear=" + expirayYear + "]";
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public int getCvv() {
		return cvv;
	}
	public void setCvv(int cvv) {
		this.cvv = cvv;
	}
	public int getExpiratyMonth() {
		return expiratyMonth;
	}
	public void setExpiratyMonth(int expiratyMonth) {
		this.expiratyMonth = expiratyMonth;
	}
	public int getExpirayYear() {
		return expirayYear;
	}
	public void setExpirayYear(int expirayYear) {
		this.expirayYear = expirayYear;
	}
	public DebitCard(long cardNumber, int cvv, int expiratyMonth, int expirayYear) {
		super();
		this.cardNumber = cardNumber;
		this.cvv = cvv;
		this.expiratyMonth = expiratyMonth;
		this.expirayYear = expirayYear;
	}
	
}
