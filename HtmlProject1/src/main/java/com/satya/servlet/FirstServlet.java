package com.satya.servlet;

import java.io.*;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet(value = "/Check")

public class FirstServlet extends HttpServlet {
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		PrintWriter writer = response.getWriter();
		
		
		writer.println("<title>HTML Classes</title>");
		writer.println("<h1>Welocme to Sathya Technologies</h1><marquee>HI Welcome To Ratan Sir Classes</marquee>");
		writer.println("<h2>Welcome to Advance java Classes</h2>");
		writer.println("<h3>Heading 1</h3>");
		writer.println("<h4>Heading 2</h4>");
		writer.println("<h5>Heading 3</h5>");
		writer.println("<h6>Heading 4</h6>");
		

		
	}
}
