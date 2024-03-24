package com.sathya.jdbc;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductDao {
	
		// 1 . CreateProductTable Method //
	
	 public static int createproductTable() {
		Connection connection = null;
		PreparedStatement ps = null;
		
		try {
			
			connection = DbConnection.createConnection();
			
		
		
		//1 Creating the Product Table in DB //
	
		
		ps = connection.prepareStatement("Create table Product(proId number, proName varchar2(10) , proPrice number)");
		
		//3 Execute the Query //
		
		ps.executeUpdate();
		
		return 1 ;
		
	}
		catch(SQLException e ) {
			e.printStackTrace();
		}
		
    finally {
			
			try
			{
				if(connection!=null && ps!=null)
				{
					connection.close();
					ps.close();
				}
			}
			catch(SQLException s)
			{
				s.printStackTrace();
			}
          }
		return 0;
	}
}

	
	
	
	// 2 . saveProduct Method :- Inserting Values into Product table //
	
	
	/* public static int saveProduct(Product product ) {
		
		
		Connection connection = null;
		PreparedStatement ps = null;
		int count = 0;
			
			try {
				
				connection = DbConnection.createConnection();
				
				ps= connection.prepareStatement("Insert into Product values(?,?,?)");
				ps.setInt(1,product.proId);
				ps.setString(2,product.getProName());
				ps.setDouble(3,product.proPrice);
				
				count = ps.executeUpdate();	
					
			}
			
			catch(SQLException e ) {
				e.printStackTrace();
			}
			
			finally {
				
				try {
				if(connection!=null && ps!=null) {
					connection.close();
					ps.close();
					
				}
				}
				catch(SQLException s ) {
					s.printStackTrace();
				}	
			}
			
		
		return count;
		
	}   */
	
	
	/*public static int findByProdcutId(int proId) 
	{
		Product product = null;

		try(Connection connection=DbConnection.createConnection();
			PreparedStatement preparedStatement=connection.prepareStatement("select * from Product where proId=?"))
		{
			preparedStatement.setInt(1, proId);
			
			ResultSet resultset= preparedStatement.executeQuery();
			
			if(resultset.next()) {
				product  =  new  Product();
				product.setProId(resultset.getInt(1));
				product.setProName(resultset.getString(2));
				product.setproPrice(result );
				
			}
				}
		catch(SQLException e) {
			e.printStackTrace();

		}
		return product;
		
		
}	
}*/		
		
		
		
		
		
		
	
	

