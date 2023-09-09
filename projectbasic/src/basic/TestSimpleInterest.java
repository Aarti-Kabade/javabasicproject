package basic;
import java.util.*;

public class TestSimpleInterest {

	double input() {
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter principal amount:");
	double p=sc.nextDouble();
	
	System.out.println("Enter rate :");
	double r=sc.nextDouble();
	
	System.out.println("Enter time :");
	double t=sc.nextDouble();
	
	double si=(p*r*t)/100;
	System.out.println("Simple interest:" +si);
	
	return si;
	
}
	 
	public static void main(String[] args) {
		TestSimpleInterest ob= new TestSimpleInterest();
		ob.input();

	}

}
