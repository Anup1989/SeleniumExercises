package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {
	
	static WebDriver driver;
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		WebDriverManagerDemo demo = new WebDriverManagerDemo();
		demo.launchurl();
		
	}
	
	public void launchurl() {
		driver.get("https://www.google.com");
		Point location= driver.findElement(By.xpath("//input[@name='btnK']")).getLocation();
		System.out.println("Location is :"+ location);
	//	driver.findElement(By.xpath("//input[@name='btnK']")).getScreenshotAs("/Users/anupkapale/Documents/workspace/Exercises/Screenshots/test.jpg");
		driver.findElement(By.xpath("//input[@name='btnK']")).click();
	}
	

}
