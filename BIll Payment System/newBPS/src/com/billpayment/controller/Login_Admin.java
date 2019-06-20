package com.billpayment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


/**
 * Servlet implementation class Login_Admin
 */
@WebServlet("/Login_Admin")
public class Login_Admin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login_Admin() {
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
		String userid=request.getParameter("username");
		String password=request.getParameter("userpass");
	
		/*CustomerDAO cd=new CustomerDAO_Impliments();
		int status=cd.getByUserId(userid,password);*/
		int status=0;
		if(userid.equals("admin")&&password.equals("admin"))
		{
			status=1;
		}
		//System.out.println(status);
		
		HttpSession hs=request.getSession();		
		if(status==1)
		{
			hs.setAttribute("username", userid);
			hs.setAttribute("userpass", password);
			
			//hs.setAttribute("logintime", new Date());
			//hs.setMaxInactiveInterval(10);			
			request.getRequestDispatcher("UserRegistration.html").forward(request, response);
		}
		else
		{
			pw.println("<center><h2>Invalid Userid or password</h2></center>");
			request.getRequestDispatcher("index.jsp").include(request, response);
		}
	}

}
