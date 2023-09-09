package com;

import java.util.Scanner;

public class TestGrade {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter marks of student:");
		
		int marks =sc.nextInt();
		
		if(marks>=90)
		{
			System.out.println("Grade is A.");
			
		}
		else if (marks>=80 && marks<90)
		{
			System.out.println("Grade is B.");
			
		}
		else if (marks <80)
		{
			System.out.println("Grade is C.");
		}
		else
		{
			System.out.println("Fail");
		}
	}
	
}
