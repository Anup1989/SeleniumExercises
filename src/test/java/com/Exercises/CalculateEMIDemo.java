package com.Exercises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;



public class CalculateEMIDemo {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
	
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");
		 driver = new ChromeDriver();
		 
		 driver.get("https://emicalculator.net/");
		 
		 Actions ac =new Actions(driver);
		 
		 WebElement locationsslider = driver.findElement(By.cssSelector("#loanamountslider>span"));

		 WebElement Inrestlocationsslider = driver.findElement(By.cssSelector("#loaninterestslider>span"));

		 WebElement Tenurelocationsslider = driver.findElement(By.cssSelector("#loantermslider>span"));
		 
		 //Drog and drop
		 
		 
}
}
