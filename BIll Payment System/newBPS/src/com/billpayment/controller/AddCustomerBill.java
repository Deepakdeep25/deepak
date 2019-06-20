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

import com.billpayment.dao.CustomerBillDAO;
import com.billpayment.dao.CustomerBillDAO_Implements;
import com.billpayment.model.CustomerBill;


/**
 * Servlet implementation class AddCustomerBill
 */
@WebServlet("/AddCustomerBill")
public class AddCustomerBill extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCustomerBill() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		String id=(String)hs.getAttribute("id");
		String electricity=request.getParameter("Electricity");
		String telephone=request.getParameter("Telephone");
		String dTH=request.getParameter("DTH");
		String insurance=request.getParameter("Insurance");
		String tax=request.getParameter("Tax");
		String creditCard=request.getParameter("CreditCard");
		String loanAccount=request.getParameter("LoanAccount");
		String others=request.getParameter("Others");
		
		CustomerBill cusbill=new CustomerBill(electricity,telephone,dTH,insurance,tax,creditCard,loanAccount,others,id);
		CustomerBillDAO cusbilldao=new CustomerBillDAO_Implements();
		
		int status=cusbilldao.saveCustomerBill(cusbill);
		
		
		if(status==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("Remainder.jsp");
			pw.println("<span style=color:green;font-size:20px;>Data Saved Successfully</span><br><br>"
					+ "<a href=\"Payment_type.html\">Pay Bill</a><br><br>");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("BillMapping.jsp");
			pw.println("<span style=color:red;size:20px>Failed Adding data </span>");
			rd.include(request, response);
		}
	}

}
