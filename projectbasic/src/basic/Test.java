package basic;

import java.util.Scanner;

public class Test {
	int num;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		num=sc.nextInt();
		
	}
	
	void display() {
		System.out.println(num);
	}

	
	public static void main(String[] args) {
		
		Test ob= new Test();
		ob.input();
		ob.display();
		
		

	}

}
