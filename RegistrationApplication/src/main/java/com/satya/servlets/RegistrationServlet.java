package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String userName = request.getParameter("userName");
		String password = request.getParameter("password");
		long Number = Long.parseLong(request.getParameter("number"));
		String Gender = request.getParameter("gender");
		String Email = request.getParameter("email");
		String DOB = request.getParameter("date");
		String [ ] quals = request.getParameterValues("qualification");
		String Country = request.getParameter("country");
		String lang[ ] = request.getParameterValues("languages");
		String Comments = request.getParameter("comments");
		
		
		//Process the Data //
		
		String q = String.join(",", quals);
		String l = String.join("-", lang);
		
		// Render the response
		
		response.setContentType("text/html");		
		PrintWriter writer = response.getWriter();
		writer.println("<html>");
		writer.println("<body bgcolor =aquamarine>");
		writer.println("<h1>Registration Form Details </h1>");
		writer.println("Your Username = " + userName + "<br>");
		writer.println("Your password = " + password+ "<br>");
		writer.println("Your Number = " + Number + "<br>");
		writer.println("Your Gender = " + Gender+ "<br>");
		writer.println("Your Email = " + Email + "<br>");
		writer.println("Your DOB= " + DOB + "<br>");
		writer.println("Your Qualifications  = " + q + "<br>");
		writer.println("Your Country= " + Country + "<br>");
		writer.println("Your Languages = " + l + "<br>");
		writer.println("Your Comments= " + Comments+ "<br>");
		
		writer.println("</body>");
		writer.println("</html>");












		

		
		
		
		
		
		
}
}