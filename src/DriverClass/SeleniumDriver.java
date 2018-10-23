package DriverClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;

public class SeleniumDriver {

	public static WebDriver driver;

	public WebDriver createDriver() {
		if (driver != null) {
			return driver;
		}
		String driverPath = "C:\\Users\\Sanket\\Desktop\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();

		driver.get("https://www.realtor.com");
		//validate URL is realtor.com
		System.out.println(driver.getCurrentUrl());
		driver.manage().window().maximize();

		return driver;
	}

	/*
	@AfterTest
	public void afterTest1() {

		driver.quit();
	}
	*/
}
