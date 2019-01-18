package com.Exercises;

import java.util.Scanner;

public class ReserveString {

	public static void main(String[] args) {

		// 1 method
		System.out.println("Enter string to reverse:");

		Scanner read = new Scanner(System.in);
		String str = read.nextLine();

		StringBuilder sb = new StringBuilder(str);

		System.out.println("Reversed string is:");
		System.out.println(sb.reverse().toString());

		// System.out.println("Enter string to reserve");

		// 2 method

		String s1 = "Selenium";

		StringBuffer sb1 = new StringBuffer(s1);
		System.out.println(sb1.reverse().toString());
	}

}
