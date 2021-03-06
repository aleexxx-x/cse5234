package edu.osu.cse5234.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PAYMENT_INFO")

public class PaymentInfo implements Serializable {
	private static final long serialVersionUID = 8303689956774972575L;

	@Column(name="CARD_NUM")
	private String creditCardNumber;
	
	@Column(name="EXP_DATE")
	private String expirationDate;
	
	@Column(name="CVV")
	private String cvvCode;
	
	@Column(name="HOLDER_NAME")
	private String cardHolderName;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	
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
