package com.billpayment.model;

public class CustomerPojo {
	String firstName;
	String lastName;
	int age;
	String gender;
	String contactNumber;
	String pan;
	String aadharNumber;
	String userId;
	String password;
	String frequency;
	public String getFrequency() {
		return frequency;
	}
	public void setFrequency(String frequency) {
		this.frequency = frequency;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public CustomerPojo(String firstName, String lastName, int age, String gender, String contactNumber, String pan,
			String aadharNumber, String userId, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gender = gender;
		this.contactNumber = contactNumber;
		this.pan = pan;
		this.aadharNumber = aadharNumber;
		this.userId = userId;
		this.password = password;
	}
	public CustomerPojo() {}
	/*public CustomerPojo(String contactNumber,String userId) {
		this.contactNumber = contactNumber;
		this.userId = userId;
	}*/
}
