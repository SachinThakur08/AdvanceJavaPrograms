package com.jdbc;
import java.util.Scanner;
public class ClientData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 1 . Inserting values into Employee 
		int count = 0;
		System.out.println("Number of records to be inserted = ");
		int n= sc.nextInt();
		
		for(int i = 0 ; i<= n ; i++){
			System.out.println("Enter the EmpId = ");
			int EmpId= sc.nextInt();
			System.out.println("Ënter the EmpName = ");
			String EmpName = sc.next();
			System.out.println("Enter the EmpSalary =");
			double EmpSalary = sc.nextDouble();
			
		
		 count = EmployeeDao.Save(new Employee(EmpId ,EmpName , EmpSalary));
		 count++;

	}
		System.out.println(count);
	}

}
