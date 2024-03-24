package com.satya.ListofProductApplication;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;



public class ProductDAO {
	
	public static  int save(Product Prod) {
	 int Result = 0;
		try (Connection con =DBConnection.createConnection();PreparedStatement pr = con.prepareStatement("Insert into Product_data values(?,?,?,?,?,?,?,?)"))
		{
		
        
		   pr.setString(1, Prod.getProId());
		   pr.setString(2, Prod.getProName());
		   pr.setDouble(3, Prod.getProPrice());
		   pr.setString(4, Prod.getProBrand()); 
		   pr.setString(5, Prod.getProMadeIn());
		    pr.setDate(6,   Prod.getProMFGDt());
		    pr.setDate(7,   Prod.getProEXPDt());	  
           pr.setBytes(8,  Prod.getProImage());
    
		  Result= pr.executeUpdate();
		     
        }
		catch (Exception e) 
		{
	
		  e.printStackTrace();
		}

	return Result;
	     }
	
	
	public static List<Product> findAll()
	  {
		  List<Product> p=new ArrayList<Product>();
		  
		    try(Connection c=DBConnection.createConnection();
		    		PreparedStatement pr=c.prepareStatement("Select * from Product_data")){
		    	
		    	 ResultSet s =pr.executeQuery();
		    	 
		    	 while (s.next()) 
		    	  {
		    		Product ps=new Product();
		    		  
		    		 ps.setProId(s.getString(1));
		    		 ps.setProName(s.getString(2));
		    		 ps.setProPrice(s.getDouble(3));
		    		 ps.setProBrand(s.getString(4));
		    		 ps.setProMadeIn(s.getString(5));
		    		 ps.setProMFGDt(s.getDate(6));
		    		 ps.setProEXPDt(s.getDate(7));
		    		 ps.setProImage(s.getBytes(8) );
			    	  
		    		 p.add(ps);
		    		 		    		 
		    		
			  		}
		    	 
		    	 for(Product pt:p) {
		    		 
		    		 System.out.println(pt.getProId());
		    		 
		    	 }
		    	
		    }
		    catch (SQLException e) {
				e.printStackTrace();
			}
		  
		  
		  return  p;
		  
	  }
}
