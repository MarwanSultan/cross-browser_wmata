package com.wmata.suite.chromeHeadless;

import core.BaseTest;
import com.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.testng.annotations.Test;

public class planMyTrip_Fail_A_Test extends BaseTest {

  HomePage homePage;

  @Test
  public void letsMetro() throws InterruptedException {

    HomePage homePage = new HomePage(driver);
    driver.manage().window().setPosition(new Point(255, 600));

    homePage.clickPLANMYTRIP();
    driver.findElement(By.cssSelector("redCherries")).click();
  }
}
