package basic;

import java.util.Scanner;

public class TestCompoundInterest {
	double input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter principal amount:");
	double p=sc.nextDouble();
	
	System.out.println("Enter rate :");
	double r=sc.nextDouble();
	
	System.out.println("Enter time :");
	double t=sc.nextDouble();
	
	System.out.println("Enter the number of times that interest is compounded per unit t");
	double n= sc.nextDouble();
	
	double amount=p*Math.pow(1+(r/n), n*t);
	double cinterest=amount-p;
	System.out.println("Compound Interest after " +t+" years:"+cinterest);
	System.out.println("Amount after"+t+" years:" +amount);
	
	return cinterest;
	}
	public static void main(String[] args) {
		TestCompoundInterest ob= new TestCompoundInterest();
		ob.input();

	}

}
