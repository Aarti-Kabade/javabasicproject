package com;

import java.util.*;

public class MenuDri
{
	int CountDigit(int num)
	{
		int cnt = 0;
		while(num >0)
		{
			
			num=num/10;
			cnt++;
		}	
			
		return cnt;
		
	}
	

     int powerDigit(int num,int p)
       {
		int product=1;
		for (int i=1;i<=p;i++)
		{
			product=product*num;
			
		}
		return product;
	} 
        int findFact(int num3)
        {
        	int fact=1;
        	for (int i=1;i<=num3; i++)
        	{
        		fact=fact*i;
        	}
        return fact;
        }
public static void main(String[] args)
{
		Scanner sc= new Scanner(System.in);
		MenuDri m= new MenuDri();
		String str=null;
		do {
			System.out.println("1.Count how many digits in a number:");
			System.out.println("2.Calculate Power of given number:");
			System.out.println("3.Factorial of given number:");
			System.out.println("Enter your choice:");
			int c=sc.nextInt();
			switch (c) 
			
			{
			case 1:
				System.out.println("Enter num1:");
				int num1=sc.nextInt();
				int count=m.CountDigit(num1);
			    System.out.println("No of digits=" +count);
			    break;
			  
			case 2:
				System.out.println("Enter num2:");
				int num2=sc.nextInt();
				System.out.println("Enter power:");
				int p=sc.nextInt();
				int power=m.powerDigit(num2,p);
				System.out.println("power of num="+power);
				break;
				
			case 3:
				System.out.println("Enter num3:");
				int num3=sc.nextInt();
				int factorial=m.findFact(num3);
				System.out.println("Factorial="+factorial);
				break;
				
		    default:
		    	System.out.println("wrong input:");
				
				
				
			}
			System.out.println("Do you want to continue if yes");
			str=sc.next();
			
		} while(str.equals("yes"));
		
	}

}
