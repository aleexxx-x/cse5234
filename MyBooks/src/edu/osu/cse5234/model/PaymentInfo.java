package edu.osu.cse5234.model;

public class PaymentInfo {
	private String creditCardNumber;
	private String expirationDate;
	private String cvvCode;
	private String cardHolderName;
	
	public PaymentInfo() {
	}
	
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	public String getexpirationDate() {
		return expirationDate;
	}
	
	public void setexpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	
	public String getcvvCode() {
		return cvvCode;
	}
	
	public void setcvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	
	public String getCardHolderName() {
		return cardHolderName;
	}
	
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	

}
