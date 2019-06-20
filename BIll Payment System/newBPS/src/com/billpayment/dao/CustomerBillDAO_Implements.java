package com.billpayment.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.billpayment.model.ConnectionFactory;
import com.billpayment.model.CustomerBill;
import com.mysql.jdbc.ResultSet;

public class CustomerBillDAO_Implements implements CustomerBillDAO
{
	
	static Connection con=null;
	CustomerBill CustomerBill_temp=null;
	public CustomerBillDAO_Implements() {
		con=ConnectionFactory.openConn();
	}
	
	
	
	@Override
	public int saveCustomerBill(CustomerBill cusbill) {
		int insert_status=0;
		try{
			
		PreparedStatement ps=con.prepareStatement("insert into customer_bill (Electricity,Telephone,DTH,Insurance,Tax,Credit_Card,Loan_account,Others,UserId) VALUES (?,?,?,?,?,?,?,?,?)");
		ps.setString(1, cusbill.getElectricity());
		ps.setString(2, cusbill.getTelephone());
		ps.setString(3, cusbill.getDTH());
		ps.setString(4, cusbill.getInsurance());
		ps.setString(5, cusbill.getTax());
		ps.setString(6, cusbill.getCreditCard());
		ps.setString(7, cusbill.getLoanAccount());
		ps.setString(8, cusbill.getOthers());
		ps.setString(9, cusbill.getUserId());
		insert_status=ps.executeUpdate();
		
		}
		catch(Exception qa)
		{
			System.out.println(qa);
			insert_status=updateBill(cusbill);
		}
		
		System.out.println("Status value in insert"+insert_status);
		
		return insert_status;
		
	}

	/*@Override
	public int checkBill(CustomerBill chkbill) {
		// Program to check the entry in the database and return the respective value
		return 0;
	}*/
	public String retrived(String a,int z){
		String m="";
	try {
		
		PreparedStatement st = con.prepareStatement("select * from customer_bill  where UserId=?" );
        st.setString(1, a);  
        ResultSet rs = (ResultSet) st.executeQuery();
        
        if(rs.next())
        	CustomerBill_temp = new CustomerBill(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6),rs.getString(7),rs.getString(8));
        //System.out.println("EXISTING VALUES IN DATABASE"+rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+rs.getString(8));
        	
        switch(z)
        {
	case 0:m="";
	break;
	case 1:if(CustomerBill_temp.getElectricity().length()>0)
	          m=CustomerBill_temp.getElectricity();
	        else
	          m="";
	break;
	case 2:if(CustomerBill_temp.getTelephone().length()>0)//if(.length()>0)
	          m=CustomerBill_temp.getTelephone();
	        else
	          m="";
	break;
	case 3:if(CustomerBill_temp.getDTH().length()>0)
	          m=CustomerBill_temp.getDTH();
	        else
	          m="";
	break;
	case 4:if(CustomerBill_temp.getInsurance().length()>0)
	         m=CustomerBill_temp.getInsurance();
	        else
	       	 m="";
	break;
	case 5:if(CustomerBill_temp.getTax().length()>0)
	         m=CustomerBill_temp.getTax();
	        else
	         m="";
	break;
	case 6:if(CustomerBill_temp.getCreditCard().length()>0)
	         m=CustomerBill_temp.getCreditCard();
	       else
	       	 m="";
	break;
	case 7:if(CustomerBill_temp.getLoanAccount().length()>0)
	         m=CustomerBill_temp.getLoanAccount();
	        else
		 m="";
	break;
	case 8:if(CustomerBill_temp.getOthers().length()>0)
	           m=CustomerBill_temp.getOthers();
	        else
	      	   m="";
	break;
default:System.out.println("invalid input");break;
        }	
        
        
       
		} catch (Exception e3) {
			System.out.println("Error in Retriving customer Bill Details : "+e3);
		}
	 return m;
	}
	
	public int updateBill(CustomerBill cusbill)
	{
		int update_status=0;
		try {
			
			retrived(cusbill.getUserId(),0);
			PreparedStatement ps=con.prepareStatement("update customer_bill set Electricity=?,Telephone=?,DTH=?,Insurance=?,Tax=?,Credit_Card=?,Loan_account=?,Others=? where UserId=?");
			ps.setString(1, cusbill.getElectricity());
			ps.setString(2, cusbill.getTelephone());
			ps.setString(3, cusbill.getDTH());
			ps.setString(4, cusbill.getInsurance()); 
			ps.setString(5, cusbill.getTax());
			ps.setString(6, cusbill.getCreditCard());
			ps.setString(7, cusbill.getLoanAccount());
			ps.setString(8, cusbill.getOthers());
			ps.setString(9, cusbill.getUserId());
			update_status=ps.executeUpdate();
			
			update_status=totalBill_Amount(CustomerBill_temp,cusbill);
		} catch (Exception e2) {
			System.out.println("Error in Update Bill Details : "+e2);
		}
		System.out.println("Status value in update"+update_status);
		return update_status;
	}

	@Override
	public int totalBill_Amount(CustomerBill temp, CustomerBill pojo)  {
		// TODO Auto-generated method stub
		int final_status = 0;
		try{
		String Electricity;
		String Telephone;
		String DTH;
		String Insurance;
		String Tax;
		String CreditCard;
		String LoanAccount;
		String Others;
		
		Electricity=checkStrings(temp.getElectricity(),pojo.getElectricity());

		Telephone=checkStrings(temp.getTelephone(),pojo.getTelephone());

		DTH=checkStrings(temp.getDTH(),pojo.getDTH());

		Insurance=checkStrings(temp.getInsurance(),pojo.getInsurance());

		Tax=checkStrings(temp.getTax(),pojo.getTax());

		CreditCard=checkStrings(temp.getCreditCard(),pojo.getCreditCard());

		LoanAccount=checkStrings(temp.getLoanAccount(),pojo.getLoanAccount());

		Others=checkStrings(temp.getOthers(),pojo.getOthers());
		
		PreparedStatement psx=con.prepareStatement("update customer_bill set Electricity=?,Telephone=?,DTH=?,Insurance=?,Tax=?,Credit_Card=?,Loan_account=?,Others=? where UserId=?");
		psx.setString(1, Electricity);
		psx.setString(2, Telephone);
		psx.setString(3, DTH);
		psx.setString(4, Insurance);
		psx.setString(5, Tax);
		psx.setString(6, CreditCard);
		psx.setString(7, LoanAccount);
		psx.setString(8, Others);
		psx.setString(9, pojo.getUserId());
		final_status=psx.executeUpdate();
		}
		catch(Exception x)
		{
			System.out.println(x);
		}
		System.out.println("Status value in final update"+final_status);
		return final_status;
	}
	public String checkStrings(String new_input,String existing)
	{
		String output;
		
		if(existing!=null && new_input!=null)
		{
			output=Double.toString(Double.parseDouble(new_input)+Double.parseDouble(existing));
			System.out.println("output"+output);
			return output;
		}
		else
		{
			if(new_input!=null)
			{
				System.out.println("existing "+new_input);
				return new_input;
			}
			else
			{
				System.out.println("new_input "+existing);
				return existing;
			}
		}
	}
	public int paid(String a,String n){
		int paid_status=0;
	
		try{
		
		switch(n)
		{
		case "Electricity":
			PreparedStatement pse=con.prepareStatement("update customer_bill set Electricity=? where UserId=?");
			pse.setString(1, "0");
			pse.setString(2, a);
			paid_status=pse.executeUpdate();
			break;
			
		case "Telephone":
			PreparedStatement pst=con.prepareStatement("update customer_bill set Telephone=?where UserId=?");
			pst.setString(2, "0");
			pst.setString(2, a);
			paid_status=pst.executeUpdate();
			break;
		case "DTH":
			PreparedStatement psd=con.prepareStatement("update customer_bill set DTH=? where UserId=?");
			psd.setString(3, "0");
			psd.setString(2, a);
			paid_status=psd.executeUpdate();
			break;
		case "Insurance":
			PreparedStatement psi=con.prepareStatement("update customer_bill set Insurance=? where UserId=?");
			psi.setString(4, "0");
			psi.setString(2, a);
			paid_status=psi.executeUpdate();
			break;
		case "Tax":
			PreparedStatement ps=con.prepareStatement("update customer_bill set Tax=? where UserId=?");
			ps.setString(5, "0");
			ps.setString(2, a);
			paid_status=ps.executeUpdate();
			break;
		case "Credit_Card":
			PreparedStatement psc=con.prepareStatement("update customer_bill set Credit_Card=? where UserId=?");
			psc.setString(6, "0");
			psc.setString(2, a);
			paid_status=psc.executeUpdate();
			break;
		case "Loan_Account":
			PreparedStatement psl=con.prepareStatement("update customer_bill set Loan_account=? where UserId=?");
			psl.setString(7, "0");
			psl.setString(2, a);
			paid_status=psl.executeUpdate();
			break;
		case "Others":
			PreparedStatement pso=con.prepareStatement("update customer_bill set Others=? where UserId=?");
			pso.setString(8, "0");
			pso.setString(2, a);
			paid_status=pso.executeUpdate();
			break;
		default:System.out.println("Invalid input from user");break;
		}
		}
		catch(Exception f)
		{
			System.out.println("piad status upadte error"+f);
		}
		return paid_status;
	}
}
