package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	
	//Step 1 //
		
		int ProId= Integer.parseInt(request.getParameter("proId"));
		String ProName =request.getParameter("proName");
		double ProPrice =Double.parseDouble(request.getParameter("ProPrice"));
		int ProQuantity = Integer.parseInt(request.getParameter("ProQuantity"));

	//Step 2//
		
		double Bill = ProPrice * ProQuantity;
		double Discount = 0 ;
		
		if(Bill < 1000) {
			System.out.println("No Discount");
		}
		
		else if(Bill > 1000 && Bill < 5000) {
			System.out.println(" 5 % Discount");
			Discount = Bill*0.05 ;
		}

		else if(Bill > 5000 && Bill < 10000) {
			System.out.println(" 10 % Discount");
			Discount =Bill * 0.10 ;
		}

		else {
			System.out.println(" 15% Discount");
			Discount  = Bill * 0.15 ;
		}
	
		double NetBill = Bill - Discount ;
		
		
		//Step 3 //
		response.setContentType("text/html");
		PrintWriter writer  = response.getWriter();
		writer.println("<h1>Product Bill Details<h1> ");
		writer.println("<body bgcolor = Red> ");

		writer.println("<br>");
		writer.println("Product Id  = " + ProId);
		writer.println("<br>");

		writer.println("Product Name  = " + ProName);
		writer.println("<br>");

		writer.println("Product Price  = $ " + ProPrice);
		writer.println("<br>");

		writer.println("Product Quantity= " + ProQuantity);
		writer.println("<br>");

		writer.println("Product Bill = $ " + Bill);
		writer.println("<br>");

		writer.println("Product Discount = $ " + Discount);
		writer.println("<br>");

		writer.println("Product Net BIll= $ " + NetBill);
		writer.println("<br>");

		writer.println("</body>");
		

	






		
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
}