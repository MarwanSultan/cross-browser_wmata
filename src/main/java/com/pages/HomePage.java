package com.pages;

import core.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.Assertions.assertThat;

public class HomePage extends BasePage {

  // '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  @CacheLookup
  @FindBy(xpath = "//*[@id=\"mm-0\"]/div[2]/header/imp/div[1]/div/div[1]/a/span[2]/span[2]")
  private WebElement metroLogo;
  @CacheLookup
  @FindBy(id = "typeahead-from-trip-planner")
  private WebElement tripPlanner;
  @FindBy(xpath = "//*[@id=\"mm-0\"]/div[2]/header/imp/div[2]/div/nav/ul/li[1]/a")
  private WebElement getServiceLink;
  @FindBy(linkText = "Schedules & Maps")
  private WebElement schedMap;
  @FindBy(id = "typeahead-from-trip-planner")
  private WebElement fromAddressField;
  @FindBy(id = "typeahead-to-trip-planner")
  private WebElement toAddressField;
  @FindBy(id = "submit-trip")
  private WebElement getPlanMyTrip_Button;

  // '''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''
  public HomePage(WebDriver driver) {
    super(driver);
  }

  @Step("Open the WMATA homepage")
  public void openURL() throws InterruptedException {
	  driver.get("https://www.wmata.com");
	  Thread.sleep(1000);
	  driver.navigate().refresh();
  }

  public void isLoaded() throws Error {
    assertThat(driver.getTitle()).isEqualTo("Home | WMATA");
  }

  public void getMetroLogo() {
    metroLogo.isDisplayed();
  }

  @Step("Get logo")
  public void verifyMetroHome() {
    getMetroLogo();
  }

	public void clickPLANMYTRIP() {
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);

		getPlanMyTrip_Button.click();
		//    getPlanMyTrip_Button.sendKeys(Keys.TAB);
		//    getPlanMyTrip_Button.sendKeys(Keys.TAB);
		//    getPlanMyTrip_Button.sendKeys(Keys.ENTER);
	}

  public void getFromAdd(String from) {
    fromAddressField.clear();
    fromAddressField.sendKeys(from);
  }

  public void getToAdd(String to) {

    toAddressField.clear();
    toAddressField.sendKeys(to);
    toAddressField.sendKeys(Keys.ESCAPE);
  }

  public void searchDirections(String from, String to) throws InterruptedException {

    getFromAdd(from);
    getToAdd(to);
    clickPLANMYTRIP();
  }

  public void clickSchedulesMaps() {
    schedMap.click();
  }

  public void clickServiceLink() {
    getServiceLink.click();
  }

  @Step("Get slogan text")
  public String getSloganText() {
    return metroLogo.getText();
  }
}
