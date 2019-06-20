package com.billpayment.controller;

import java.io.IOException;
import java.io.PrintWriter;



import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.billpayment.dao.Bill_DAO;
import com.billpayment.dao.Bill_DAO_Implements;
import com.billpayment.dao.CustomerBillDAO;
import com.billpayment.dao.CustomerBillDAO_Implements;
import com.billpayment.model.BillPojo;

/**
 * Servlet implementation class Payment
 */
@WebServlet("/Payment")
public class Payment extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Payment() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession hs=request.getSession();
		String id=(String)hs.getAttribute("id");
		String bill_Type=request.getParameter("BillToPay");
		hs.setAttribute("type", bill_Type);
		
		CustomerBillDAO cusbilldao_retrive=new CustomerBillDAO_Implements();
		PrintWriter pw=response.getWriter();

		String ele="",tele="", dth="", ins="", tax="", cc="",la="", others="";
			
		 try{ele=cusbilldao_retrive.retrived(id,1);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{tele=cusbilldao_retrive.retrived(id,2);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{dth=cusbilldao_retrive.retrived(id,3);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{ins=cusbilldao_retrive.retrived(id,4);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{tax=cusbilldao_retrive.retrived(id,5);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{cc=cusbilldao_retrive.retrived(id,6);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{la=cusbilldao_retrive.retrived(id,7);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		 try{others=cusbilldao_retrive.retrived(id,8);}
		 catch(NullPointerException x){System.out.println("Handled exception");}
		
		BillPojo bp=new BillPojo(ele,tele,dth,ins,tax,cc,la,others,id);
		Bill_DAO billdao=new Bill_DAO_Implements();
		int status=billdao.saveBill(bp);
		System.out.println(bp.getElectricity());
		
		if(status==1)
		{
			System.out.println("Inserted sucessfully");
		}
		else
		{
			System.out.println("Inserted unsucessfully");
		}
		switch(bill_Type)
		{
		case "Electricity":
			if(ele.isEmpty())
			{
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Electricity.html");
				rd.forward(request, response);
				
			}
			
			else
				{
				pw.println("Pending amount to be paid for Electricity is "+ele);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
				}
		break;
		case "Telephone":
			if(tele.isEmpty())
				{
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Telephone.html");
				rd.forward(request, response);
				
				}
			
			else
			{
				pw.println("Pending amount to be paid for Telephone is "+tele);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "DTH":
			if(dth.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\DTH.html");
				rd.forward(request, response);
				
			}
			
			else
			{
				pw.println("Pending amount to be paid for DTH is "+dth);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "Insurance":
			if(ins.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Insurance.html");
				rd.forward(request, response);
				
			}
			else
			{
				pw.println("Pending amount to be paid for Insurance is "+ins);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "Tax":
			if(tax.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Tax.html");
				rd.forward(request, response);
				
			}
			else
			{
				
				pw.println("Pending amount to be paid for Tax is "+tax);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "Credit_Card":
			if(cc.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Credit_Card.html");
				rd.forward(request, response);
				
			}
			else
			{
				pw.println("Pending amount to be paid for Credit Card is "+cc);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "Loan_Account":
			if(la.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Loan_Account.html");
				rd.forward(request, response);
				
				}
			
			else
			{
				pw.println("Pending amount to be paid for Loan Account is "+la);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		case "Others":
			if(others.isEmpty()){
				RequestDispatcher rd=request.getRequestDispatcher("Bill\\Others.html");
				rd.forward(request, response);
				
				}
			
			else
			{
				pw.println("Pending amount to be paid for Others is "+others);
				RequestDispatcher rx=request.getRequestDispatcher("Payment.jsp");
				rx.include(request, response);
			}
		break;
		default:System.out.println("Invalid input from user");break;
		}
		
	}

}
