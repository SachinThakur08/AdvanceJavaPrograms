package com.satya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FullNameServlet")
public class FullNameServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String firstname = request.getParameter("FirstName");
		String middlename = request.getParameter("MiddleName");
		String lastname = request.getParameter("LastName");
		
		String fullname;
		if(firstname.equals("Mahindra")&&middlename.equals("Singh")&&lastname.equals("Dhoni")) {
			fullname = firstname+" "+middlename+" "+lastname;
		}
		else {
			fullname = "Enter the name Correctly";
		}
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1> FullName :-<h1>"+fullname);
		writer.println("</html>");


	}
}
