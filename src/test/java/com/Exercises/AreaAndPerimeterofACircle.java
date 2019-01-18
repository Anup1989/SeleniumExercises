package com.Exercises;

import java.util.Scanner;

public class AreaAndPerimeterofACircle {

	public static void main(String[] args) {
		
		/*Scanner input = new Scanner(System.in);

		input.nextInt();
		
		double radius;
		
		*/
		
		double diameter = 15;

		double radius = diameter / 2;

		System.out.println(2 * Math.PI * radius + " is the perimeter.");

		System.out.println(Math.PI * Math.pow(radius,2) + " is the area.");
	}

}
