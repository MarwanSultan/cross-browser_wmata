package com.wmata.suite.ie;

import com.pages.HomePage;
import core.BaseTest;
import org.testng.annotations.Test;

public class DirectionsTest extends BaseTest {

	HomePage homePage;

	@Test
	public void executeTripSearch() throws InterruptedException {

		HomePage homePage = new HomePage(driver);

		homePage.searchDirections(
				"1000 Rockville Pike, Rockville, MD", "225 I Street Northeast Washington, DC");
	}
}
