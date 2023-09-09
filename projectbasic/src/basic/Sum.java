package basic;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		int num1, num2;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter first number:");
		num1 =sc.nextInt();
		
		System.out.println("Enter second numbr:");
		num2 =sc.nextInt();
		
		int Sum=num1+num2;
		
		System.out.println("Sum is:" +Sum);
		
		
		
		

	}

}
