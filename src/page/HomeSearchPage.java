package page;

import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import base.BasePage;

public class HomeSearchPage extends BasePage {

	@FindBy(xpath = "//*[@id=\"downshift-2-input\"]")
	public WebElement searchField;
// if kept has a separate entity and based on random house choice
	public int random() {
		Random rand = new Random();
        int  num = rand.nextInt(6);
		return num;
	
	}
	
	public void scrollingToElementofAPage(WebElement element)
	{

		( ( JavascriptExecutor ) driver ).executeScript( "arguments[0].scrollIntoView();", element );
	}
	
	public void searchHome()
	{
		//houseNumber=1 because second image needs to be selected
		int houseNumber=1;
		if(houseNumber == 1 || houseNumber >5)
		{
			WebElement searchItem=driver.findElement(By.xpath(".//ul[@class='srp-list-marginless list-unstyled prop-list']/li[2]"));
			scrollingToElementofAPage(searchItem);
		}
		//used classname for selecting the houses and can be modified for any houses in future since it is stored in list
        List <WebElement>listingDetailsPagePrices =driver.findElements(By.className("data-price"));
		
        //second house value
		String listingDetailsPagePrice = listingDetailsPagePrices.get(houseNumber).getText();// xpath - driver.findElement(By.xpath("//div[@class='data-price']/li[2]")).getText();
		
		//Scenario 3 click the second house
		List<WebElement>searchResult=driver.findElements(By.className("js-component_property-card"));//(".//ul[@class='srp-list-marginless list-unstyled prop-list']/li"));
		searchResult.get(houseNumber).click();
		// Scenario 3 xpath
		
		//driver.findElement(By.xpath(".//ul[@class='srp-list-marginless list-unstyled prop-list']/li[2]")).click();

		// Scenario 4
		//get the second house marketprice and compare the value with first page
		String searchResultsPagePrice = driver.findElement(By.xpath(".//*[@id='aj-qv-sec-property-header']/div/div[2]/div[1]/div/span")).getText();

		System.out.println("The first string is " + listingDetailsPagePrice);
		System.out.println("The second string is " + searchResultsPagePrice);
		
		//compare prices
		int value = listingDetailsPagePrice.compareTo(searchResultsPagePrice);

		if (value == 0) {

			System.out.println("The prices match");
		}

		else {
			Assert.assertTrue(false, "The prices do not match");

		}

	}

}