package com;

import java.util.*;

public class TestVowel {

	public static void main(String[] args) {
		char ch;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a character:");
		ch= sc.next().charAt(0);
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'|| ch=='A'||ch=='E' || ch=='I'||ch=='O' || ch=='U')
		{
			System.out.println("Character is vowel");
		}
		else if((ch>='a'&& ch<='z')||(ch>='A' && ch<='Z')){
				System.out.println("Character is consonant");
			
		}
			
			
	}

}
