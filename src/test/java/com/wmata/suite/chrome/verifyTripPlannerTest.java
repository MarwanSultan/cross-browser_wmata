package com.wmata.suite.chrome;

import core.BaseTest;
import com.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class verifyTripPlannerTest extends BaseTest {

  @Test
  public void validateTripPlanner() {
    HomePage homePage = new HomePage(driver);
    homePage.openURL();
    driver.manage().window().setPosition(new Point(255, 600));
    WebElement planner = driver.findElement(By.id("typeahead-from-trip-planner"));
    assertThat(planner.isDisplayed());
  }
}
