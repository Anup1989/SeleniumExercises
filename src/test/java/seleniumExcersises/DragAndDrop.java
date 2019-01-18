package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		
		WebElement source = driver.findElement(By.xpath("//div[@id='box3']"));
		
		WebElement target = driver.findElement(By.xpath("//div[@id='box103']"));
		
		
		Actions ac = new Actions(driver);
		//ac.clickAndHold(source).moveToElement(target).release().build().perform();
		//System.out.println("Drag and drop is working fine");
		
		
		ac.dragAndDrop(source, target).build().perform();
		
		//Methods to use drag and drop.
		//clickAndHold
		//moveToElement
		//release
	}

}
