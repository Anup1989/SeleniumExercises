package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
	
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/dropdown");
		
		//driver.switchTo().frame(/html//body);
		
		WebElement myelement = driver.findElement(By.id("dropdown"));
		
		Select dropdown = new Select(myelement);
		dropdown.selectByIndex(0);
		System.out.println("Selected value is"+ dropdown);
		
		//dropdown.selectByValue("Option 2");
		//System.out.println("Selected value is"+ dropdown);
		
		//dropdown.selectByVisibleText("Option 1");
		//System.out.println("Selected value is"+ dropdown);

		
	}

}
