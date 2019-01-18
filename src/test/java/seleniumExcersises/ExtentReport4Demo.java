package seleniumExcersises;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReport4Demo {

	public WebDriver driver;

	public ExtentHtmlReporter htmlreporter;
	public ExtentReports extent;
	public ExtentTest test;

	@BeforeTest
	public void SetExtent() {

		htmlreporter = new ExtentHtmlReporter("/Users/anupkapale/Documents/workspace/Exercises/test-output/My_ReportsUpdated.html");

		htmlreporter.config().setDocumentTitle("Automation Report"); // Title of the report
		htmlreporter.config().setReportName("Functional Report"); // Name of the report
		htmlreporter.config().setTheme(Theme.DARK);

		extent = new ExtentReports(); // instanceciation

		extent.attachReporter(htmlreporter);
		extent.setSystemInfo("HostName", "LocalHost");
		extent.setSystemInfo("Operating system", "MAC");
		extent.setSystemInfo("QA Name", "Anup kapale");
		extent.setSystemInfo("Browser", "Chrome");

	}

	@AfterTest
	public void EndReport() {
		extent.flush();
	}

	@BeforeMethod
	public void Setup() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://demo.nopcommerce.com/");
	}

	@Test
	public void nocommerceTitleTest() {
		test = extent.createTest("nocommerceTitleTest");

		String title = driver.getTitle();
		System.out.println(title);

		Assert.assertEquals(title, "nopCommerce demo store");
	}

	@Test
	public void nocommerceLogoTest() {
		test = extent.createTest("nocommerceLogoTest");

		Boolean status = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		Assert.assertTrue(status);
	}

	@AfterMethod
	public void TearDown(ITestResult result) throws IOException {

		if (result.getStatus() == ITestResult.FAILURE) {
			test.log(Status.FAIL, "Test Case Failed is :" + result.getName());
			test.log(Status.FAIL, "Test Case Failed is :" + result.getThrowable());

			String screenshotPath = ExtentReport4Demo.getScreenshot(driver, result.getName());
			test.addScreenCaptureFromPath(screenshotPath);

		} else if (result.getStatus() == ITestResult.SKIP) {

			test.log(Status.SKIP, "Test Case Skipped is :" + result.getName());
		} else if (result.getStatus() == ITestResult.SUCCESS) {

			test.log(Status.PASS, "Test Case Passed is :" + result.getName());
		}

		driver.quit();
	}

	public static String getScreenshot(WebDriver driver, String screenShotname) throws IOException {
		String datneName = new SimpleDateFormat("yyMMddhhmmss").format(new Date());

		TakesScreenshot ts = ((TakesScreenshot) driver);

		File source = ts.getScreenshotAs(OutputType.FILE);
 
		String destination = "/Users/anupkapale/Documents/workspace/Exercises/New Screenshots" + screenShotname + datneName + ".jpg";

		File finaldestination = new File(destination);

		FileUtils.copyFile(source, finaldestination);

		return destination;
	}
}
