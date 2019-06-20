package com.billpayment.dao;
	
	import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.billpayment.model.CustomerPojo;
import com.billpayment.model.ConnectionFactory;

	public class CustomerDAO_Impliments implements CustomerDAO {

		Connection con=null;
		public CustomerDAO_Impliments() {
			
		}
		
		@Override
		public int saveCustomer(CustomerPojo cus) {
			int status=0;
			try {
				con=ConnectionFactory.openConn();
				PreparedStatement ps=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?,?,?)");
				ps.setString(1, cus.getFirstName());
				ps.setString(2, cus.getLastName());
				ps.setInt(3, cus.getAge());
				ps.setString(4, cus.getGender());
				ps.setString(5, cus.getContactNumber());
				ps.setString(6, cus.getPan());
				ps.setString(7, cus.getAadharNumber());
				ps.setString(8, cus.getUserId());
				ps.setString(9, cus.getPassword());
				status=ps.executeUpdate();
			}catch (Exception e) {
				System.out.println("Error in Insert customer "+e);
			}
			finally{ConnectionFactory.closeConn();}	
			return status;
			
		}

		@Override
		public int getByUserId(String userid,String password) {
			// TODO Auto-generated method stub
			int status=0;
			try {		
				con=ConnectionFactory.openConn();
				PreparedStatement ps=con.prepareStatement("select * from customer where UserId=? and Password=?");
				ps.setString(1, userid);
				ps.setString(2, password);
				ResultSet rs=ps.executeQuery();			
				if(rs.next())
				{
						status=1;			
				}
				else
				{
					status=0;
				}
			} catch (Exception e) {
				System.out.println("Error in getByID "+e);
			}
			finally{ConnectionFactory.closeConn();}	
			return status;
		}

		@Override
		public int updateFrequency(String userid,int frequency) {
			// TODO Auto-generated method stub
			
			int status=0;
			try {
				con=ConnectionFactory.openConn();
				PreparedStatement ps=con.prepareStatement("insert into frequency values(?,?)");
				ps.setInt(1, frequency);
				ps.setString(2, userid);
				status=ps.executeUpdate();
			}
				catch (Exception e) {
					System.out.println("Error in Inserting Frequency details "+e);
					try {
						System.out.println("executing update");
						PreparedStatement psa=con.prepareStatement("update frequency set Frequency=? where UserId=?");
						psa.setInt(1, frequency);
						psa.setString(2, userid);
						status=psa.executeUpdate();
					}
						catch (Exception ea) {
							System.out.println("Error in updating Frequency details "+ea);
						}			
				}
			finally{ConnectionFactory.closeConn();}	
			return status;
		}
		@Override
		public int checkContact(String userid) {
			int contact=0;
			try {
				con=ConnectionFactory.openConn();
			PreparedStatement ps1=con.prepareStatement("select Contact_Number from customer where userId=?");
			ps1.setString(1, userid);
			ResultSet rs=ps1.executeQuery();
			while (rs.next()) 
			{
				if(rs.getString(1).isEmpty())
				{
					System.out.println("contact is null");
					contact=0;
				}
				else
				{
					System.out.println("contact is not null");
					contact=1;					
				}
			}
			}
			catch(Exception q)
					{
				System.out.println("Error in Inserting Contact number details "+q);
					}
			finally{ConnectionFactory.closeConn();}	
			return contact;
		}
		public int updateContact(String userid,String contact)
		{
			int status=0;
		try {
			con=ConnectionFactory.openConn();
			PreparedStatement pds=con.prepareStatement("update customer set Contact_Number=? where UserId=?");
			pds.setString(1, contact);
			pds.setString(2, userid);
			status=pds.executeUpdate();
		}
		catch(Exception k)
		{
			System.out.println("Error in updating contact in Dao"+k);
		}
		finally{ConnectionFactory.closeConn();}	
			return status;
		}
	}
