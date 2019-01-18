package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		
		WebElement slider= driver.findElement(By.xpath("//*[@id=\"slider\"]"));
		
		Actions ac = new Actions(driver);
		
		ac.moveToElement(slider).dragAndDropBy(slider, 300, 0).build().perform();

	}

}
