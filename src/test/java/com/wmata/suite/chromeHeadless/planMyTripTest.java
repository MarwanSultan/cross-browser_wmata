package com.wmata.suite.chromeHeadless;

import com.pages.HomePage;
import core.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class planMyTripTest extends BaseTest {

  HomePage homePage;

  @Test
  public void letsMetro() throws InterruptedException {
    HomePage homePage = new HomePage(driver);
    driver.manage().window().setPosition(new Point(255, 600));
    homePage.clickPLANMYTRIP();

    WebElement pmtLogo = driver.findElement(By.linkText("Trip Planner"));
    Assert.assertTrue(pmtLogo.isDisplayed());
  }
}
