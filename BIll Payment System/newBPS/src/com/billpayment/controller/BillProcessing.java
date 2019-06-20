package com.billpayment.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class BillProcessing
 */
@WebServlet("/BillProcessing")
public class BillProcessing extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BillProcessing() {
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
		String pay=request.getParameter("pay");
		switch(pay)
		{
		case "card":RequestDispatcher rd=request.getRequestDispatcher("payMode\\card.html");
					rd.forward(request,response);
					break;
		case "ib":RequestDispatcher ri=request.getRequestDispatcher("payMode\\ib.html");
					ri.forward(request,response);
					break;
		case "paytm":RequestDispatcher rp=request.getRequestDispatcher("payMode\\pt.html");
					rp.forward(request,response);
					break;
		case "gpay":RequestDispatcher gp=request.getRequestDispatcher("payMode\\gp.html");
					gp.forward(request,response);
					break;
		case "eWallet":RequestDispatcher ew=request.getRequestDispatcher("payMode\\ew.html");
						ew.forward(request,response);
						break;
		default:System.out.println("Ivalid radio input");break;
		}
	}

}
