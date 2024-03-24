package com.satya.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/GenerateNumberServlet")
public class GenerateNumberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		// Step 1 : - Getting the data from Calculator //
		
				int num1 = Integer.parseInt(request.getParameter("num1"));
				int num2 = Integer.parseInt(request.getParameter("num2"));
				String operation = request.getParameter("operation");
				

		//Step 2 : - Processing the Data //
				ArrayList<Integer> result = new ArrayList<Integer>();
				int   i , j ;
			
		switch(operation) {
		
		
		case "even" : for(i = num1 ; i<=num2 ; i++)
					  {
						if(i%2==0) {
							result.add(i);;	
						}
					   }
	
		               break ;
			
						
		case "odd" : for(i = num1 ; i<=num2 ; i++)
		             {
			           if(i%2==1)
				          result.add(i);						
		                }
                       break ;		
						
		case "prime" : int count = 0;
			           for(i = num1; i<=num2 ; i++)
		                    {
			        	   count= 0;
			        	   for(j=1 ; j<=i ;j++) {
			             if(i%j==0) {
				            count++;	
			        	   }
			        	   }
		                      
			           if(count == 2)
			        	   result.add(i);
		                    }
                          break ;
						
		case "perfect" :   int sum = 0;
			                for(i = num1 ; i<num2 ; i++) {
			                	sum = 0;
			               for(j = 1 ; j<i ; j++) {
			            	   if(i%j==0)
			            		   sum+=j;
			               }
			               if(sum==i) {
			            	   result.add(i);
			               }
			               }
			                break ;
						
		case "Armstrong" :  
	            for (i= num1; i<=num2; i++) {
	                int count1 = 0, temp = i;
	                while (temp > 0) {
	                    temp /= 10;
	                    count1++;
	                }
	                int sum1 = 0;
	                temp = i;
	                while (temp > 0) {
	                    int digit = temp % 10;
	                    int power = 1;
	                    for ( j = 0;j < count1; j++) {
	                        power *= digit;
	                    }
	                    sum1 += power;
	                    temp /= 10;
	                }
	                if (sum1 == i) {
	                    result.add(i);
	                }
	            }
	            
			                break;
			                
			
		case "strong"	 : int rem1= 0 , fact = 0 , sum2= 0 , temp1 = 0; 
		
							for(i = num1 ; i<=num2 ; i++) {
								temp1= i;
								sum2 = 0;
								fact = 0;
								
								while(temp1>0) {
									rem1= temp1%10;
									
									if(rem1==0)
										fact = 1;
									
									else {
										fact =1;
										for(j=1 ; j<=rem1 ; j++) {
											fact = fact * j;
										}
									}
									sum2 = sum2 + fact ;
									temp1 = temp1/10;
								}
								if(sum2==i)
									result.add(i);
							}
							break;
							
			     
		}
						
	
	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.println("<body bgcolor = MistyRose >");
	writer.println("<h1><marquee scrollamount = 10>The Result Of The Operation</marquee><h1>");
	writer.println("<em>First Number</em> = " + num1);
	writer.println("<br>" );
	writer.println("<em>Second Number</em> = " + num2);
	writer.println("<br>" );
	writer.println("<em>Operation Performed </em> =" + operation);
	writer.println("<br>" );
    writer.println("<em>The Result </em> = " + result);
    
					    
						
	
		
		
		}
	}
