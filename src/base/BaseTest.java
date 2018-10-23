package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DriverClass.SeleniumDriver;


public class BaseTest {

	public static WebDriver driver;
    SeleniumDriver selenium=new SeleniumDriver();	
    public BaseTest() {
		driver=selenium.createDriver();
		PageFactory.initElements(driver,this);
		
	}

}
