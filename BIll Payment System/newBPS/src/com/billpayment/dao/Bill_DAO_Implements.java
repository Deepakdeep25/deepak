package com.billpayment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.billpayment.model.BillPojo;
import com.billpayment.model.ConnectionFactory;

public class Bill_DAO_Implements implements Bill_DAO{
	static Connection con=null;
	public Bill_DAO_Implements() {
		con=ConnectionFactory.openConn();
	}

	@Override
	public int saveBill(BillPojo bp) {
		int status=0;
		try{
			PreparedStatement ps=con.prepareStatement("insert into bill VALUES (?,?,?,?,?,?,?,?,?)");
			System.out.println(bp.getUserId());
			ps.setString(1, bp.getElectricity());
			ps.setString(2, bp.getTelephone());
			ps.setString(3, bp.getDTH());
			ps.setString(4, bp.getInsurance());
			ps.setString(5, bp.getTax());
			ps.setString(6, bp.getCreditCard());
			ps.setString(7, bp.getLoanAccount());
			ps.setString(8, bp.getOthers());
			ps.setString(9, bp.getUserId());
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Insert bill "+e);
			status =updateBill(bp);
		}
		return status;
	}

	public int updateBill(BillPojo bp)
	{
		int update_status=0;
		try {			
			System.out.println("updating");
			PreparedStatement ps=con.prepareStatement("update bill set Electricity=?,Telephone=?,DTH=?,Insurance=?,Tax=?,Credit_Card=?,Loan_account=?,Others=? where UserId=?");
			ps.setString(1, bp.getElectricity());
			ps.setString(2, bp.getTelephone());
			ps.setString(3, bp.getDTH());
			ps.setString(4, bp.getInsurance()); 
			ps.setString(5, bp.getTax());
			ps.setString(6, bp.getCreditCard());
			ps.setString(7, bp.getLoanAccount());
			ps.setString(8, bp.getOthers());
			ps.setString(9, bp.getUserId());
			update_status=ps.executeUpdate();
		} catch (Exception e2) {
			System.out.println("Error in Update Bill Details : "+e2);
		}
		return update_status;
	}
}
