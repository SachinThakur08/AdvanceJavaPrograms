package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/EmployeeServlet")
public class EmployeeServlet extends HttpServlet {
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
	// Step 1 : - Getting the data from Employee //
		
		int EmpId = Integer.parseInt(request.getParameter("EmpId"));
		String EmpName = request.getParameter("EmpName");
		double BasicSalary = Double.parseDouble(request.getParameter("EmpSalary"));
		
		//Step 2 : - Processing the Data //
		double HRA=0 , DA = 0 , PF = 0 , GrossSalary = 0;
		if(BasicSalary >=50000) {
			      
			HRA = BasicSalary*0.3;
			DA = BasicSalary*0.1;
			PF = BasicSalary*0.06;	
		}
		
		else if(BasicSalary >25000 && BasicSalary < 50000) {
			HRA = BasicSalary*0.2;
			DA = BasicSalary*0.05;
			PF = BasicSalary*0.03;
		}
		else {
			HRA = BasicSalary*0.1;
			DA = BasicSalary*0.03;
			PF = BasicSalary*0.02;
		}
		
		GrossSalary = BasicSalary + HRA + DA - PF ;
		
		// Step 3 : - Rendering the response to the Client //
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
	    writer.println("<body bgcolor = Aquamarine >");
		writer.println("<h1><marquee scrollamount = 10>Employee Details</marquee><h1>");
	    writer.println("<em>Employee Id</em> = " + EmpId);
	    writer.println("<br>" );
	    writer.println("<em>Employee Name </em> =" + EmpName);
	    writer.println("<br>" );
	    writer.println("<em>Employee Basic Salary</em> = " + BasicSalary);
	    writer.println("<br>" );
	    writer.println("<em>Employee HRA</em>  = " + HRA);
	    writer.println("<br>" );
	    writer.println("<em>Employee DA</em> = " + DA);
	    writer.println("<br>" );
	    writer.println("<em>Employee PF</em> = " + PF);
	    writer.println("<br>" );
	    writer.println("<em>Employee Gross Salary</em> = " + GrossSalary); 
	    writer.println("<br>" );
	    writer.println("</body>" );

	
		
 }
}