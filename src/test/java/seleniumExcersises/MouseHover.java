package seleniumExcersises;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) {

		// mousehover()

		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/");

		driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin");
		
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
		driver.findElement(By.xpath("//input[@id='btnLogin']")).click();

		Actions ac = new Actions(driver);
		WebElement admin = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
		WebElement usermanagemrnt = driver.findElement(By.xpath("//a[@id='menu_admin_UserManagement']"));
		WebElement users = driver.findElement(By.xpath("//a[@id='menu_admin_viewSystemUsers']"));

		ac.moveToElement(admin).build().perform(); // mousehover to admin tab
		ac.moveToElement(usermanagemrnt).build().perform();
		ac.moveToElement(users).click().build().perform(); // mouseover and click
		System.out.println("Congratulations !, The user has landed on the Users page");

		// ac.moveToElement(admin).moveToElement(usermanagemrnt).moveToElement(users).click().build().perform();
		// // Can be write in one line to reduce the code.
	}

}
