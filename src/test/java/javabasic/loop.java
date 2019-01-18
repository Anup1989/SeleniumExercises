package javabasic;

public class loop {
	
	public static void main(String[] args) {
		
		//1.while loop
		//disadvanatge of while -ioop
		
		
		int i=1;  //initialization
		while(i<=10) { //condition
			System.out.println(i);
			i=i+1;   //incremental or decremental
		}
		System.out.println("========================");
		//2. For loop
		
		for(int j =1; j<=10;j++) {
			System.out.println(j);
		}
		
		System.out.println("========================");
		//print reverse 10 to 1
		
		for (int k=10;k>=1;k--) {
			System.out.println(k);
		}
		
	
	}

}
