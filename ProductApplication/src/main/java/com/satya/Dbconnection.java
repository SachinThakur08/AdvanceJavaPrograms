package com.satya;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class  Dbconnection {
	
	
		 public static Connection createconnection() {
		    	
		    	Connection c=null;
			try {
				     Class.forName("oracle.jdbc.driver.OracleDriver");
					c = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","sachin","sachin");
				} 
				catch (ClassNotFoundException | SQLException e)
				{
					e.printStackTrace();
				}
		        return c;
		    }

	  

}
