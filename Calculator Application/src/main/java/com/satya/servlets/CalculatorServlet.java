package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CalculatorServlet")
public class CalculatorServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Step 1 : - Getting the data from Calculator //
		
				int num1 = Integer.parseInt(request.getParameter("num1"));
				int num2 = Integer.parseInt(request.getParameter("num2"));
				String operation = request.getParameter("operation");
				

		//Step 2 : - Processing the Data //
				
				int result = 0;
			
		switch(operation) {
		
		
		case "+" : result = num1 + num2 ;
						break;
						
		case "-" : result = num1 - num2 ;
						break;		
						
		case "*" : result = num1 * num2 ;
						break;
						
		case "/" : result = num1 / num2 ;
						break;
						
		case "%" : result = num1 % num2 ;
						break;
		}
						
	
	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.println("<body bgcolor = Aquamarine >");
	writer.println("<h1><marquee scrollamount = 10>The Result Of The Operation</marquee><h1>");
	writer.println("<em>First Number</em> = " + num1);
	writer.println("<br>" );
	writer.println("<em>Second Number</em> = " + num2);
	writer.println("<br>" );
	writer.println("<em>Operation Performed </em> =" + operation);
	writer.println("<br>" );
    writer.println("<em>The Result </em> = " + result);
    
					    
						
	
		
		
		}
	}
