package com.billpayment.model;

public class CustomerBill {
	String Electricity;
	String Telephone;
	String DTH;
	String Insurance;
	String Tax;
	String CreditCard;
	String LoanAccount;
	String Others;
	String UserId;
	
	
	public String getElectricity() {
		return Electricity;
	}
	public String getTelephone() {
		return Telephone;
	}
	public String getDTH() {
		return DTH;
	}
	public String getInsurance() {
		return Insurance;
	}
	public String getTax() {
		return Tax;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public String getLoanAccount() {
		return LoanAccount;
	}
	public String getOthers() {
		return Others;
	}
	public void setElectricity(String electricity) {
		this.Electricity = electricity;
	}
	public void setTelephone(String telephone) {
		this.Telephone = telephone;
	}
	public void setDTH(String dTH) {
		this.DTH = dTH;
	}
	public void setInsurance(String insurance) {
		this.Insurance = insurance;
	}
	public void setTax(String tax) {
		this.Tax = tax;
	}
	public void setCreditCard(String creditCard) {
		this.CreditCard = creditCard;
	}
	public void setLoanAccount(String loanAccount) {
		this.LoanAccount = loanAccount;
	}
	public void setOthers(String others) {
		this.Others = others;
	}
	
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String UserId) {
		this.UserId = UserId;
	}
	public CustomerBill(String electricity, String telephone, String dTH, String insurance, String tax,
			String creditCard, String loanAccount, String others,String userId) {
		super();
		Electricity = electricity;
		Telephone = telephone;
		DTH = dTH;
		Insurance = insurance;
		Tax = tax;
		CreditCard = creditCard;
		LoanAccount = loanAccount;
		Others = others;
		UserId=userId;
	}
	public CustomerBill(String electricity, String telephone, String dTH, String insurance, String tax,
			String creditCard, String loanAccount, String others) {
		super();
		Electricity = electricity;
		Telephone = telephone;
		DTH = dTH;
		Insurance = insurance;
		Tax = tax;
		CreditCard = creditCard;
		LoanAccount = loanAccount;
		Others = others;
	}
}
