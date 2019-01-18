package seleniumExcersises;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class TakeScreenshot {

	
	public static void main(String[] args) {
		
		WebDriver driver;
		
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();
		
		driver.get("https://www.google.com");
		
		//Take screenshot 
		
		TakesScreenshot srcShot = ((TakesScreenshot)driver);
		File srcFile =srcShot.getScreenshotAs(OutputType.FILE);
		File Destfile= new File("/Users/anupkapale/Documents/workspace/Exercises/Screenshots/test.jpg");
		
		try {
			Files.copy(srcFile, Destfile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Screenshot is taken");
		
		driver.close();
	}
}
