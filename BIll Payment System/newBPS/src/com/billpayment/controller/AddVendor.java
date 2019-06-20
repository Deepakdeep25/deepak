package com.billpayment.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.billpayment.dao.VendorDAO;
import com.billpayment.dao.VendorDAO_Impliments;
import com.billpayment.model.VendorPojo;

/**
 * Servlet implementation class AddVendor
 */
@WebServlet("/AddVendor")
public class AddVendor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddVendor() {
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
		String vendorName=request.getParameter("vendorName");
		String regNo=request.getParameter("regNo");
		String type=request.getParameter("type");
		String address=request.getParameter("address");
		String country=request.getParameter("country");
		String state=request.getParameter("state");
		String emailAddress=request.getParameter("emailAddress");
		String contactNumber=request.getParameter("contactNumber");
		String website=request.getParameter("website");
		String certificateIssuedDate=request.getParameter("certificateIssuedDate");
		String certificateValidityDate=request.getParameter("certificateValidityDate");
		String yearOfEstablishment=request.getParameter("yearOfEstablishment");
		String PaymentGateway=request.getParameter("PaymentGateway");
		
		VendorPojo ven=new VendorPojo(vendorName,regNo,type,address,country,state,emailAddress,contactNumber,website,certificateIssuedDate,certificateValidityDate,yearOfEstablishment,PaymentGateway);
		VendorDAO vendao=new VendorDAO_Impliments();
		
		int status=vendao.saveVendor(ven);
		
		
		if(status==1)
		{
			RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
			pw.println("<span style=color:green;font-size:20px;>vendor Added Successfully</span>");
			rd.include(request, response);
		}
		else
		{
			RequestDispatcher rd=request.getRequestDispatcher("UpdateVendor.jsp");
			pw.println("<span style=color:red;size:20px>Failed Adding vendor </span>");
			rd.include(request, response);
		}
		
	}

}
