package com.billpayment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.billpayment.model.ConnectionFactory;
import com.billpayment.model.VendorPojo;

public class VendorDAO_Impliments implements VendorDAO{
	Connection con=null;
	public VendorDAO_Impliments() {
		con=ConnectionFactory.openConn();
	}
	
	@Override
	public int saveVendor(VendorPojo ven) {
		int status=0;
		try {
			
			PreparedStatement ps=con.prepareStatement("insert into vendor values(?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1, ven.getVendorName());
			ps.setString(2, ven.getRegNo());
			ps.setString(3, ven.getType());
			ps.setString(4, ven.getAddress());
			ps.setString(5, ven.getCountry());
			ps.setString(6, ven.getState());
			ps.setString(7, ven.getEmailAddress());
			ps.setString(8, ven.getContactNumber());
			ps.setString(9, ven.getWebsite());
			ps.setString(10, ven.getCertificateIssuedDate());
			ps.setString(11, ven.getCertificateValidityDate());
			ps.setString(12, ven.getYearOfEstablishment());
			ps.setString(13, ven.getPaymentGateway());
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Insert vendor "+e);
		}
		finally{ConnectionFactory.closeConn();}	
		return status;
	}
	
	public int updateVendor(VendorPojo ven) {
		int status=0;
		try {
			PreparedStatement ps=con.prepareStatement("update vendor set vendorName=?,regNo=?,type=?,address=?,country=?,state=?,contactNumber=?,website=?,certificateIssuedDate=?,certificateValidityDate=?,yearOfEstablishment=?,PaymentGateway=? where emailAddress=?");
			ps.setString(1, ven.getVendorName());
			ps.setString(2, ven.getRegNo());
			ps.setString(3, ven.getType());
			ps.setString(4, ven.getAddress());
			ps.setString(5, ven.getCountry());
			ps.setString(6, ven.getState());
			ps.setString(13, ven.getEmailAddress());
			ps.setString(7, ven.getContactNumber());
			ps.setString(8, ven.getWebsite());
			ps.setString(9, ven.getCertificateIssuedDate());
			ps.setString(10, ven.getCertificateValidityDate());
			ps.setString(11, ven.getYearOfEstablishment());
			ps.setString(12, ven.getPaymentGateway());
						
			status=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println("Error in Update Vendor "+e);
		}
		finally{ConnectionFactory.closeConn();}	
		return status;
}

}
