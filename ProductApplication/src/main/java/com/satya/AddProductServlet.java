package com.satya;


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

@WebServlet("/AddProductServlet")
@MultipartConfig

public class AddProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String ProdId = null;


   			protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
   				
   				 // read form data
   				
   				  String ProId=request.getParameter("proId");
   				  String ProName=request.getParameter("proName");
   				  double ProPrice=Double.parseDouble(request.getParameter("proPrice"));
   				  String ProBrand=request.getParameter("ProBrand");
   				  String MadeIn=request.getParameter("MadeIn");
   				  Date ProMfgDate=Date.valueOf(request.getParameter("mfgdate"));
   				  Date ProExpDate=Date.valueOf(request.getParameter("expdate"));
   				  
   				  Part part=request.getPart("ProImage");  // holding binarey formate data(image)
   				  InputStream inputStream=part.getInputStream(); //convertionbinary to narmaldata (decoding)    
   				  
   			     	byte[] proImage = IOUtils.toByteArray(inputStream);
   				   // Using above details to create a product object
   				  
   				  Product pro=new Product();
   				      pro.setProId(ProId);
   				      pro.setProName(ProName);
   				      pro.setProPrice(ProPrice);
   				      pro.setProBrand(ProBrand);
   				      pro.setProMadeIn(MadeIn);
    				  pro.setPromfgdate(ProMfgDate);
   				      pro.setProexpdate(ProExpDate);
   				      pro.setProBrand(ProBrand);
   				      pro.setProImage(proImage);
   				      
   				      
   				      
   				// Giving the product object to Dao layer save() method
   				      
   				     int res= Dao.save(pro); //here pro is reference variale
   				  response.setContentType("text/html");
   				  
   				PrintWriter writer=response.getWriter();
   				writer.println("<html>");
   				writer.println("<body bgcolor='yellow'>");
   				writer.println("<h2>Product saved Successfully into database..."+res+"</h2>");
	            writer.println("</body>");
   				writer.println("</html>");
   				
   				      
   				 
   				
   				 			}

   		

   		        
   	                   
   	}


