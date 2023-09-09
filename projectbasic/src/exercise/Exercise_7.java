package exercise;

import java.util.*;

public class Exercise_7 {
	
	static int calculateProduct(int a, int b) {
		return a*b;
		
		
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Product of two number is :" +calculateProduct(a,b));
		
		

	}

}
