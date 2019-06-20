package com.billpayment.model;

public class VendorPojo {
	String vendorName;
	String regNo;
	String type;
	String address;
	String country;
	String state;
	String emailAddress;
	String contactNumber;
	String website;
	String certificateIssuedDate;
	String certificateValidityDate;
	String yearOfEstablishment;
	String PaymentGateway;
	public String getVendorName() {
		return vendorName;
	}
	public String getRegNo() {
		return regNo;
	}
	public String getType() {
		return type;
	}
	public String getAddress() {
		return address;
	}
	public String getCountry() {
		return country;
	}
	public String getState() {
		return state;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public String getWebsite() {
		return website;
	}
	public String getCertificateIssuedDate() {
		return certificateIssuedDate;
	}
	public String getCertificateValidityDate() {
		return certificateValidityDate;
	}
	public String getYearOfEstablishment() {
		return yearOfEstablishment;
	}
	public String getPaymentGateway() {
		return PaymentGateway;
	}
	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public void setState(String state) {
		this.state = state;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public void setCertificateIssuedDate(String certificateIssuedDate) {
		this.certificateIssuedDate = certificateIssuedDate;
	}
	public void setCertificateValidityDate(String certificateValidityDate) {
		this.certificateValidityDate = certificateValidityDate;
	}
	public void setYearOfEstablishment(String yearOfEstablishment) {
		this.yearOfEstablishment = yearOfEstablishment;
	}
	public void setPaymentGateway(String paymentGateway) {
		PaymentGateway = paymentGateway;
	}
	public VendorPojo(String vendorName, String regNo, String type, String address, String country, String state,
			String emailAddress, String contactNumber, String website, String certificateIssuedDate,
			String certificateValidityDate, String yearOfEstablishment, String paymentGateway) {
		super();
		this.vendorName = vendorName;
		this.regNo = regNo;
		this.type = type;
		this.address = address;
		this.country = country;
		this.state = state;
		this.emailAddress = emailAddress;
		this.contactNumber = contactNumber;
		this.website = website;
		this.certificateIssuedDate = certificateIssuedDate;
		this.certificateValidityDate = certificateValidityDate;
		this.yearOfEstablishment = yearOfEstablishment;
		PaymentGateway = paymentGateway;
	}
	
}
