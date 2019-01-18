package com.Exercises;

public class RemoveJunk {
	
	public static void main(String[] args) {
		
		
		String s = "%^##$$^&& test ^^(^*^(*^ " ;
		
		s = s.replaceAll("[^a-zA-Z0-9]", ""); //to remove junk characters use repleaceall method.
		
		System.out.println(s);
	}
	

}
