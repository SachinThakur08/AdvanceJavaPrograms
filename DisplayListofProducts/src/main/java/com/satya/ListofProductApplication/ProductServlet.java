package com.satya.ListofProductApplication;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import org.apache.commons.io.IOUtils;


@WebServlet("/ProductServlet")
@MultipartConfig

public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		
		String Proid = String.valueOf(request.getParameter("proId"));
		String Proname = String.valueOf(request.getParameter("proName"));
		String Probrand = String.valueOf(request.getParameter("proBrand"));
		 double Proprice=Double.parseDouble(request.getParameter("Proprice"));
		String PromadeIn = String.valueOf(request.getParameter("proMdin"));
		Date ProMFGdt = Date.valueOf(request.getParameter("proMdt"));
		Date ProEXPdt = Date.valueOf(request.getParameter("proExpdt"));
		
		Part part = request.getPart("proImage");
		InputStream inputStream = part.getInputStream();
		
		byte[] ProImage = IOUtils.toByteArray(inputStream);
		
		
		
		//Creating the Object Using the Above Details
		
		Product product = new Product();
		
		product.setProId(Proid);
		product.setProName(Proname);
		product.setProPrice(Proprice);
		product.setProBrand(Probrand);
		product.setProMadeIn(PromadeIn);
		product.setProMFGDt(ProMFGdt);
		product.setProEXPDt(ProEXPdt);
		product.setProImage(ProImage);
		
		
		
		
		int Result = 0;
		
		try {
			Result = ProductDAO.save(product);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		PrintWriter writer = response.getWriter();
		
		
		if(Result==1) {
		writer.println("Data Inserted Successfully");
		}
		else {
			writer.println("Data not Inserted Successfully");
		}
		
		
		
	}

}
