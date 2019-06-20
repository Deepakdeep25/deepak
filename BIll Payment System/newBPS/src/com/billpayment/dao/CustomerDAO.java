package com.billpayment.dao;

import com.billpayment.model.CustomerPojo;

public interface CustomerDAO {
	public int saveCustomer(CustomerPojo cus);
	public int getByUserId(String userid,String password);
	public int updateFrequency(String userid,int frequency);
	public int checkContact(String userid);
	public int updateContact(String userid,String contact);
}
