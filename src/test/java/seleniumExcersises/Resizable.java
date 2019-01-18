package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	
	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/resizable/");
		
		driver.switchTo().frame(0);
		
		WebElement resize= driver.findElement(By.xpath("//*[@id=\"resizable\"]/div[3]"));
		
		Actions ac = new Actions(driver);
		ac.moveToElement(resize).dragAndDropBy(resize, 50, 50).build().perform();
	}

}
