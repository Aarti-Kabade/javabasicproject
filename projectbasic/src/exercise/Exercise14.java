//program to print the area and perimeter of a rectangle.
package exercise;

import java.util.*;

public class Exercise14 {
	
	
	int areaofrect() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter length and breadth of rectangle:");
		double l= sc.nextDouble();
		double b=sc.nextDouble();
		double area=l*b;
		double perimeter=(l+b)*2;
		System.out.println("Area of rectangle is:" +area);
		System.out.println("\nPerimeter of rectangle is:" +perimeter);
		return areaofrect();
	}

	public static void main(String[] args) {
		
		Exercise14 ob= new Exercise14();
		ob.areaofrect();
		
	}

}
