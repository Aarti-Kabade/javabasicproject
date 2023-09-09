package basic;

import java.util.Scanner;

public class RecordofStudents {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name of students:");
		String n =sc.nextLine();
	
		System.out.println("Enter Roll no of student:");
		int r= sc.nextInt();
		
		System.out.println("Enter marks of student:");
		float m = sc.nextFloat();
		
		System.out.println("Enter fees of student:");
	    double f= sc.nextDouble();
	    
	    System.out.println("Enter gender of student:");
	    char g= sc.next().charAt(0);
	    
	    System.out.println("*** Students Details ***");
	    System.out.println("Name:" + n);
	    System.out.println("Roll no :"+r);
	    System.out.println("Marks:"+m);
	    System.out.println("Fees :" +f);
	    System.out.println("Gender:" +g);
	    
	    
		
		
		
		

	}

}
