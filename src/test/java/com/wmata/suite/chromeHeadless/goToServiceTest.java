package com.wmata.suite.chrome;

import com.pages.HomePage;
import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class goToServiceTest extends BaseTest {

	HomePage homepage;


	@Test
	public void goToService() {

		HomePage homepage = new HomePage(driver);
		homepage.clickServiceLink();
		WebElement header = driver.findElement(By.cssSelector("#mm-0 > div.page-wrapper.landing.inner > div" +
				".main-content > div.landing-header-wrapper > div > div.landing-header-content > h1"));
		Assert.assertTrue(header.isDisplayed());
	}
}
