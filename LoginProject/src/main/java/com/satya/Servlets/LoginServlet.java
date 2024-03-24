package com.satya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	//Read the data from form //
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		//Process the data //
		String Status;
		
		if(username.equals("Sathya12")&&password.equals("sathya@123")) {
			Status = "Login Succesful";
		}
		
		else {
			Status = "Login Fail";
			
		}
		
		//Render the response to the client //
		
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		writer.println("<html>");
		writer.println("<h1>LoginStatus =</h1> " + Status);
		writer.println("</html>");

	
	
	
	}
	
}
