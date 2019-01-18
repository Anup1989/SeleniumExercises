package javabasic;

public class StaticandNonStaticConcept {
	
	String name = "Anup";  //non-static global variable
	
	static int age = 29;   //static global variable
	
	
	
	//non-static method
	public void Sendmail() {
		System.out.println("This is a non- static method.");
	}
	
	//static method
	public static void Sum() {
		System.out.println("This is a static method.");
	}
	public static void main(String[] args) {
		
		//how to call static and non static method
		
		//1) direct calling.
		//2) calling by class name
		
		Sum();
		StaticandNonStaticConcept st = new StaticandNonStaticConcept();
		st.Sendmail();
		
		
		System.out.println(age);
		
		System.out.println(st.name);
		

	}

}
