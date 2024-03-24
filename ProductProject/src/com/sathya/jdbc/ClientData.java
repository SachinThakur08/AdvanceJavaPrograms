package com.sathya.jdbc;
import java.util.*;
public class ClientData {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		
		// 1. CreateTable 
		int result = ProductDao.createproductTable();
		
		if(result == 1)
			System.out.println("Product Table Created Successfully");
		else
			System.out.println("Table Not Created");
			
		
		// 2 . Save method :- inserting Records in the table 
		
	/*	System.out.println("Enter the Records to be inserted = ");
		int n= sc.nextInt();
		for(int i = 0 ; i<n ; i++) {
		System.out.println("Enter the Product ID = ");
		int ProId =sc.nextInt();
		System.out.println("Enter the Product Name = ");
		String ProName = sc.next();
		System.out.println("Enter the Prodcut Price = ");
		double ProPrice = sc.nextDouble();
		
		int result = ProductDao.saveProduct(new Product(ProId ,ProName , ProPrice));
	   System.out.println(result);
		}
		
		*/
		
		
		//3.
	}

}
