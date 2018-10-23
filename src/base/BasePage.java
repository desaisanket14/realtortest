package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import DriverClass.SeleniumDriver;


public class BasePage {

	public static WebDriver driver;
    SeleniumDriver selenium=new SeleniumDriver();	

	public BasePage() {
		driver=selenium.createDriver();
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
		
		
	}
	


}
