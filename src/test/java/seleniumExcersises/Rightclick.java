package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Rightclick {
	
	public static void main(String[] args) {
		// mousehover()

				WebDriver driver;
				System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

				driver = new ChromeDriver();

				driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");

				Actions ac = new Actions(driver);
				
				WebElement button =driver.findElement(By.xpath("/html/body/div/section/div/div/div/p/span"));
				ac.contextClick(button).build().perform();
				
				driver.findElement(By.xpath("/html/body/ul/li[3]/span")).click();
				
				String text =driver.switchTo().alert().getText();
				System.out.println("The text is :"+ text);
				driver.switchTo().alert().accept();
				
				//Right click method
				// contextClick
	}

}
