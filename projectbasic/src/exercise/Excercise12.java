package exercise;

import java.util.*;

public class Excercise12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle:");
		double r= sc.nextDouble();
		double perimeter = 2*Math.PI*r;
		double area = Math.PI*r*r;
		System.out.println("Perimeter is :" + perimeter);
		System.out.println("Area is :"+ area);
		

	}

}
