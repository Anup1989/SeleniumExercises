package javabasic;

public class ConditionalStatements {

	
	public static void main(String[] args) {
		
		int randomnumber = (int) (Math.random()*50);
		
		
		 if (randomnumber<25) {
			 System.out.println("The random number is less than 25");
		 }
		 else  if(randomnumber>40){
			 System.out.println("The random number is grether than 40");
		 }
		 else if(randomnumber==18){
			 System.out.println("The random number is 18");
		 }
		 else if(randomnumber!=40) {
			 System.out.println("The random number is not equal to 40");
		 }
		 System.out.println("The random number is :" +randomnumber);
	}
}
