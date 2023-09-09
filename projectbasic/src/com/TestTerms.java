package com;

import java.util.*;


public class TestTerms {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of terms:");
		int terms = sc.nextInt();
		int temp=1;
		
		int sum=0;
		while(terms>0)
		{
			System.out.println(temp+",");
			
			sum =sum+temp;
			temp=(temp*10)+1;
			--terms;
		}
	    System.out.println("\n"+sum); 	

	}

}
