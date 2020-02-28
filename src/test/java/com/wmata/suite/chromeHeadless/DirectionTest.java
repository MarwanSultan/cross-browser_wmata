package com.wmata.suite.chromeHeadless;

import com.pages.HomePage;
import core.BaseTest;
import org.testng.annotations.Test;

public class DirectionTest extends BaseTest {

	HomePage homePage;

	@Test
	public void executeTripSearch() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.searchDirections(
				"1000 Rockville Pike, Rockville, MD", "225 I Street Northeast Washington, DC");
	}
}
