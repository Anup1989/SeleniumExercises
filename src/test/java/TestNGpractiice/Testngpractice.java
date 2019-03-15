package TestNGpractiice;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngpractice {
	
	@Test
	public void test() {
		System.out.println("test");
	}
	@Test
	public void test1() {
		System.out.println("test1");

	
		
		
	}

	@BeforeTest
	public void before() {
		System.out.println("Before Test");
	}
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Before mehtod");
	}
	
	@AfterTest
	public void aftertest() {
		System.out.println("After test");
	}
	
	@Test
	public void test3() {
		System.out.println("test3");
	}
	@Test
	public void test4() {
		System.out.println("test4");
	}
	@Test 
	public void test5() {
		System.out.println("test5");
	}
	@AfterMethod
	public void Aftermethod() {
		System.out.println("After method");
	}
	
	@BeforeClass
	public void beforeclass() {
		System.out.println("Before class");
	}
	
	@AfterClass
	public void afterclass() {
		System.out.println("after class");
	}
	
	@BeforeSuite
	public void beforesuite() {
		System.out.println("Before suite");
	}
	
	@AfterSuite
	public void afteresuite() {
		System.out.println("After suite");
	}
}
