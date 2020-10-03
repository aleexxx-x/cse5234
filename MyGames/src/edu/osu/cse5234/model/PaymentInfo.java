package edu.osu.cse5234.model;

public class PaymentInfo {
	private String creditCardNumber;
	private String expirationDate;
	private String cvvCode;
	private String cardHolderName;
	
	
	public PaymentInfo() {
	}
	/**
	 * @return the creditCardNumber
	 */
	public String getCreditCardNumber() {
		return creditCardNumber;
	}
	/**
	 * @param creditCardNumber the creditCardNumber to set
	 */
	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	/**
	 * @return the expirationDate
	 */
	public String getExpirationDate() {
		return expirationDate;
	}
	/**
	 * @param expirationDate the expirationDate to set
	 */
	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}
	/**
	 * @return the cvvCode
	 */
	public String getCvvCode() {
		return cvvCode;
	}
	/**
	 * @param cvvCode the cvvCode to set
	 */
	public void setCvvCode(String cvvCode) {
		this.cvvCode = cvvCode;
	}
	/**
	 * @return the cardHolderName
	 */
	public String getCardHolderName() {
		return cardHolderName;
	}
	/**
	 * @param cardHolderName the cardHolderName to set
	 */
	public void setCardHolderName(String cardHolderName) {
		this.cardHolderName = cardHolderName;
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "PaymentInfo [creditCardNumber=" + creditCardNumber + ", expirationDate=" + expirationDate + ", cvvCode="
				+ cvvCode + ", cardHolderName=" + cardHolderName + "]";
	}
	
	

}
