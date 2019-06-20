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

/**
 * Servlet implementation class BillProcessed
 */
@WebServlet("/BillProcessed")
public class BillProcessed extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillProcessed() {
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
		PrintWriter pw=response.getWriter();
		HttpSession hs=request.getSession();
		String userid=(String)hs.getAttribute("id");
		CustomerBillDAO cusbilldao=new CustomerBillDAO_Implements();
		String u=(String)hs.getAttribute("type");
		int status=cusbilldao.paid(userid,u);
		if(status==1)
		{
		pw.println("<span style=color:green;font-size:20px;>Payment done Successfully</span><br><br>Next Bill To Be Paid<br>");
		RequestDispatcher rd=request.getRequestDispatcher("Payment_type.html");
		rd.include(request, response);
		}
		else
		{
			pw.println("<center><h2>Payment Failed</h2></center>");
			request.getRequestDispatcher("Payment.jsp").include(request, response);
		}
	}

}
