package test;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import page.HomeSearchPage;

public class HomeSearchTest extends BaseTest {

	HomeSearchPage home= new HomeSearchPage();
	
	@Test(priority=1)
	public void openWebsite()
	{
		// Scenario 1

				// Scenario 1
				// HomePage hp = new HomePage(driver);
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				home.searchField.sendKeys("Morgantown, WV" + "\n");
				//driver.findElement(By.xpath("//*[@id=\"downshift-2-input\"]")).sendKeys("Morgantown, WV" + "\n");
				// hp.enterHouseName("Morgantown, WV");
				// hp.clickSearchButton();
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@Test(priority=2)
	public void searchResultCount()
	{
		// Scenario 2
		String text = driver.findElement(By.xpath(".//span[@id='search-result-count']")).getText();
		String[] new_text = text.split(" ", 0);
		String onlyint = new_text[0].replaceAll(",", "");

		int fetched_number = Integer.parseInt(onlyint);

		Assert.assertTrue((fetched_number > 0), "The search results is 0");

		System.out.println("Search Results is Greater than 0");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	
	@Test(priority=3)
	public void searchHomes() throws InterruptedException {
		//Scenario 3 & Scenario 4 included since it compares two house value 
		
		home.searchHome();
	}

	
	
	
}
