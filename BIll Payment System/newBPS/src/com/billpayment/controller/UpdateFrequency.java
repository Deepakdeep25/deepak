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

import com.billpayment.dao.CustomerDAO;
import com.billpayment.dao.CustomerDAO_Impliments;

/**
 * Servlet implementation class UpdateContact
 */
@WebServlet("/UpdateFrequency")
public class UpdateFrequency extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateFrequency() {
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
		String Frequency=request.getParameter("Frequency");
		String userId=(String)hs.getAttribute("id");
		CustomerDAO cudao=new CustomerDAO_Impliments();
		int status=cudao.updateFrequency(userId,Integer.parseInt(Frequency));
		int contact=cudao.checkContact(userId);
		
		if(status==1)
		{
			if(contact==1){
			pw.println("<span style=color:green;font-size:20px;>Frequency Details Updated Successfully</span><br>");
			RequestDispatcher rd=request.getRequestDispatcher("BillMapping.jsp");
			rd.include(request, response);
			}
			if(contact==0)
			{
				pw.println("<span style=color:red;size:20px>Contact Number Not Found ..Please update your Contact Number</span>");
				RequestDispatcher rd=request.getRequestDispatcher("Update_contact.jsp");
				rd.include(request, response);
			}
		}
		
		else
		{
			System.out.println("Failed updating Frequency and contact details");
			RequestDispatcher rd=request.getRequestDispatcher("BillMapping.jsp");
			rd.include(request, response);
		}
	}

}
