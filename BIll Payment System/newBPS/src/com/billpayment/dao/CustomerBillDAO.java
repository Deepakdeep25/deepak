package com.billpayment.dao;

import com.billpayment.model.CustomerBill;

public interface CustomerBillDAO {
	public int saveCustomerBill(CustomerBill cusbill);
	public int updateBill(CustomerBill cusbill);
	public int totalBill_Amount( CustomerBill temp, CustomerBill pojo);
	public 	String retrived(String a,int z); 
	public int paid(String a,String n);
}
