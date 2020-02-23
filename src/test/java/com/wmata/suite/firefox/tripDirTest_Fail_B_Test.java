package com.wmata.suite.firefox;

import core.BaseTest;
import com.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class tripDirTest_Fail_B_Test extends BaseTest {

  HomePage homePage;

  @Test
  public void executeTripSearch() throws InterruptedException {

    HomePage homePage = new HomePage(driver);
    driver.manage().window().setPosition(new Point(255, 600));

    homePage.searchDirections(
        "1000 Rockville Pike, Rockville, MD", "225 I Street Northeast Washington, DC");

    driver.findElement(By.cssSelector("redCherries")).click();
  }
}
