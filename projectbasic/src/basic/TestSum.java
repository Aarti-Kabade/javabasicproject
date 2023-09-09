package basic;

import java.util.Scanner;

public class TestSum {

	int num1, num2;
	
	void input()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter two numbers:");
		num1 =sc.nextInt();
		num2=sc.nextInt();
	}
	
	void sum()
	{
		int s= num1+num2;
		System.out.println(s);
		
	}
	public static void main(String[] args) {
	
	    TestSum t = new TestSum();
	
	    t.input();

	    t.sum();
	}
}
