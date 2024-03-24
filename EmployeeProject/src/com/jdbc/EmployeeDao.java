package com.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EmployeeDao
{

	public static int Save(Employee e ) {
		
		int count = 0 ; 
		
		try(Connection connection = Dbconnection.createConnection() ; PreparedStatement preparedStatement = connection.prepareStatement("insert into Employee values(?,?,?)"))
				{
		
			preparedStatement.setInt(1, e.getEmpId());
			preparedStatement.setString(2, e.getEmpName());
			preparedStatement.setDouble(3, e.getEmpSalary());
			
			count = preparedStatement.executeUpdate();

		}
		catch(SQLException e1 ) {
			e1.printStackTrace();
		}
		
		return count ;
		
		
	}

	
	
}
