package com;

import java.util.Scanner;

public class MenuDriven {

	public static void main(String[] args) {
		int ch;
	    int n1, n2;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		n1= sc.nextInt();
		n2=sc.nextInt();
		int s=0;
		
		
		do {
			 System.out.println("1.Addition");
			 System.out.println("2.Multiplication");
			 System.out.println("3.Substraction");
			 System.out.println("4.Division");
			 System.out.println("Enter your choice");
			 ch=sc.nextInt();
			
			 switch (ch)
			 {
			 case 1: 
				 System.out.println(n1+n2);
				 break;
				 
			 case 2:
				 System.out.println(n1*n2);
				 break;			 
				 
			 case 3:
				 System.out.println(n1-n2);
				 break;	
				 
			 case 4:
				 System.out.println(n1/n2);
				 break;	
				 
		     default:
		    	 System.out.println("if you want to continue");
		}
		
		
		

	}while(s==1);
		
	}
}
