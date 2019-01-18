package com.Exercises;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);
		
		System.out.println("Input a number: ");
		
		int num1 =input.nextInt();
		
		for(int i=0; i<10;i++)
		{
			System.out.println(num1 + " x " + (i+1) + " = " + 
				     (num1 * (i+1)));
		}
		*/
		
		//another way to write a code.
		
		  Scanner in = new Scanner(System.in);
  System.out.println("Input the Number: ");
  int n = in .nextInt();
  for (int i = 1; i <= 10; i++) {
   System.out.println(n + "*" + i + " = " + (n * i));
		 
		
		
	}
	}
}
