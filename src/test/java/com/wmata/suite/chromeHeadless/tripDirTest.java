package com.wmata.suite.chrome;

import com.pages.HomePage;
import core.BaseTest;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class tripDirTest extends BaseTest {

	HomePage homePage;

	@Test
	public void executeTripSearch() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		driver.manage().window().setPosition(new Point(121, 550));

		homePage.searchDirections(
				"1000 Rockville Pike, Rockville, MD", "225 I Street Northeast Washington, DC");
	}
}
