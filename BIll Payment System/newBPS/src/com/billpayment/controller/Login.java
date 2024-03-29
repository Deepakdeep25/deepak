package com.billpayment.controller;

import java.io.IOException;
import java.io.PrintWriter;
//import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.billpayment.dao.CustomerDAO;
import com.billpayment.dao.CustomerDAO_Impliments;


/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
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
		String userid=request.getParameter("userid");
		String password=request.getParameter("password");
	
		CustomerDAO cd=new CustomerDAO_Impliments();
		int status=cd.getByUserId(userid,password);
		
		//System.out.println(status);
		
		HttpSession hs=request.getSession();		
		if(status==1)
		{
			hs.setAttribute("id", userid);
			hs.setAttribute("password", password);
			hs.setAttribute("type", "");
			//hs.setAttribute("logintime", new Date());
			//hs.setMaxInactiveInterval(10);			
			request.getRequestDispatcher("BillMapping.jsp").forward(request, response);
		}
		else
		{
			pw.println("<center><h2>Invalid Userid or password</h2></center>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

}
