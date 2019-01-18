package com.Exercises;

public class ReverseInteger {
	
	public static void main(String[] args) {
		
		//1 method
		int num = 12345;
		int rev =0;
		
		while(num !=0) {
			
			rev=rev*10+ num%10;
			num = num/10;
		}
		System.out.println("resrve number is :"+rev);
		
		int num1=987654;
		
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
	}
	
	
	

}
 