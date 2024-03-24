package com.satya;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;





public class Dao {
	

	public static  int save(Product Prod) {
		 int count = 0;
		 Connection c=null;
		PreparedStatement pr=null;
		try {
		 c=Dbconnection.createconnection();
		  pr=c.prepareStatement("insert into Product_data values(?,?,?,?,?,?,?,?)");
         
		   pr.setString(1, Prod.getProId());
		   pr.setString(2, Prod.getProName());
		   pr.setDouble(3, Prod.getProPrice());
		   pr.setString(4, Prod.getProBrand()); 
		   pr.setString(5, Prod.getProMadeIn());
		   pr.setDate(6,   Prod.getPromfgdate());
		   pr.setDate(7,   Prod.getProexpdate());	  
           pr.setBytes(8,  Prod.getProImage());
      
		  count= pr.executeUpdate();
		     

		  
		   }
		catch (Exception e) {
	
		  e.printStackTrace();
		}
	finally {
		            try {
		                   if(pr!=null)
			 	             pr.close();
				           if(c!=null)
			                 c.close();
			              } 
		            catch(SQLException e) {	
		            	
		                e.printStackTrace();
		                
		                }
		   
		          }
	         return count;
	     }
	
	public static List<Product> findAll()
	  {
		  List<Product> p=new ArrayList<Product>();
		  
		    try(Connection c=Dbconnection.createconnection();
		    		PreparedStatement pr=c.prepareStatement("select * from Product_data ");){
		    	
		    	 ResultSet s =pr.executeQuery();
		    	 
		    	 while (s.next()) 
		    	  {
		    		Product ps=new Product();
		    		  
		    		 ps.setProId(s.getString("PROID"));
		    		 ps.setProName(s.getString("proName"));
		    		 ps.setProPrice(s.getDouble("PROPRICE"));
		    		 ps.setProBrand(s.getString("PROBRAND"));
		    		 ps.setProMadeIn(s.getString("PROMADEIN"));
		    		 ps.setPromfgdate(s.getDate("PROMFGDATE"));
		    		 ps.setProexpdate(s.getDate("PROEXPDATE"));
		    		 ps.setProImage(s.getBytes("PROIMAGE") );
			    	    
			    	    p.add(ps);			    	    
			  		}
		    	
		    }
		    catch (SQLException e) {
				e.printStackTrace();
			}
		  
		  
		  return  p;
		  
	  }
	  


}
