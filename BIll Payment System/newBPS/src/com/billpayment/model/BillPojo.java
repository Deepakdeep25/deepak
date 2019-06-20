package com.billpayment.model;

public class BillPojo {
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
	public void setElectricity(String electricity) {
		this.Electricity = electricity;
	}
	public String getTelephone() {
		return Telephone;
	}
	public void setTelephone(String telephone) {
		this.Telephone = telephone;
	}
	public String getDTH() {
		return DTH;
	}
	public void setDTH(String dTH) {
		this.DTH = dTH;
	}
	public String getInsurance() {
		return Insurance;
	}
	public void setInsurance(String insurance) {
		this.Insurance = insurance;
	}
	public String getTax() {
		return Tax;
	}
	public void setTax(String tax) {
		this.Tax = tax;
	}
	public String getCreditCard() {
		return CreditCard;
	}
	public void setCreditCard(String creditCard) {
		this.CreditCard = creditCard;
	}
	public String getLoanAccount() {
		return LoanAccount;
	}
	public void setLoanAccount(String loanAccount) {
		this.LoanAccount = loanAccount;
	}
	public String getOthers() {
		return Others;
	}
	public void setOthers(String others) {
		this.Others = others;
	}
	public String getUserId() {
		return UserId;
	}
	public void setUserId(String userId) {
		this.UserId = userId;
	}
	public BillPojo(String electricity, String telephone, String dTH,
			String insurance, String tax, String creditCard,
			String loanAccount, String others, String userId) {
		super();
		Electricity = electricity;
		Telephone = telephone;
		DTH = dTH;
		Insurance = insurance;
		Tax = tax;
		CreditCard = creditCard;
		LoanAccount = loanAccount;
		Others = others;
		UserId = userId;
	}

	
}
