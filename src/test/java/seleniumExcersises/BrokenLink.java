package seleniumExcersises;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {

	WebDriver driver;

	public void CheckBrokenLink() throws MalformedURLException {

		System.setProperty("webdriver.chrome.driver", "/Users/anupkapale/Downloads/chromedriver");

		driver = new ChromeDriver();

		driver.get("http://newtours.demoaut.com/");

		List<WebElement> Links = driver.findElements(By.tagName("a"));

		System.out.println(Links);

		for (int i = 0; i < Links.size(); i++) {
			WebElement element = Links.get(i);
			// System.out.println(element);
			String url = element.getAttribute("href");

			URL link = new URL(url);

			try {
				HttpURLConnection httpconnection = (HttpURLConnection) link.openConnection();
				// HttpsURLConnection httpconnection = (HttpsURLConnection)
				// link.openConnection();
				httpconnection.setConnectTimeout(2000);
				httpconnection.connect();

				if (httpconnection.getResponseCode() >= 400) {
					System.out.println(url + " : is broken Link");
				} else {
					System.out.println(url + " : is valid Link");
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	public static void main(String[] args) throws IOException {
		BrokenLink bl = new BrokenLink();
		bl.CheckBrokenLink();
	}

}
