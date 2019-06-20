package com.billpayment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.billpayment.dao.CustomerDAO;
import com.billpayment.dao.CustomerDAO_Impliments;
import com.billpayment.model.CustomerPojo;

/**
 * Servlet implementation class AddCus
 */
@WebServlet("/AddCus")
public class AddCus extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCus() {
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
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		int age=Integer.parseInt(request.getParameter("age"));
		String gender=request.getParameter("gender");
		String contactNumber=request.getParameter("contactNumber");
		String pan=request.getParameter("pan");
		String aadharNumber=request.getParameter("aadharNumber");
		String userId=request.getParameter("userId");
		String password=request.getParameter("password");
		
		CustomerPojo cus=new CustomerPojo(firstName,lastName,age,gender,contactNumber,pan,aadharNumber,userId,password);
		CustomerDAO cudao=new CustomerDAO_Impliments();
		
		int status=cudao.saveCustomer(cus);
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
		
		if(status==1)
		{
			pw.println("<span style=color:green;font-size:20px;>Customer Added Successfully</span><br><br>");
			rd.include(request, response);
		}
		else
		{
			pw.println("<span style=color:red;size:20px>Failed Adding customer </span>");
			rd.include(request, response);
		}
	}

}
