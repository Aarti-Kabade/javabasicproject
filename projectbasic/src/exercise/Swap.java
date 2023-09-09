package exercise;

import java.util.*;

public class Swap {

	public static void main(String[] args) {
		
		int x,y,z;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter number 1:");
		x=sc.nextInt();
		
		System.out.println("Enter number 2:");
		y=sc.nextInt();
		
		
	    z=x;
	    x=y;
	    y=z;
	    
	    System.out.println("Swapped values are:" + x +  "and"    +y);
			
	}

}
