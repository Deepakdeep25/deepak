package com.billpayment.model;

import java.sql.Connection;
import java.sql.DriverManager;

import com.mysql.jdbc.Driver;

public class ConnectionFactory {
	
	static Connection con;
	public static Connection openConn()
	{
		try {
			DriverManager.registerDriver(new Driver());
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/billpayment", "root", "root");
		} catch (Exception e) {
			System.out.println("Error in open Connection :"+e);
		}
		return con;
	}
	public static void closeConn()
	{
		try {
			con.close();
		} catch (Exception e) {
			System.out.println("Error in close Connection :"+e);
		}
	}

}
