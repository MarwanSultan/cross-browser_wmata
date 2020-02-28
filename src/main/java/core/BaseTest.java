package core;

import com.pages.HomePage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class BaseTest {
	public WebDriver driver;//  @BeforeSuite public void initializeDriver() { WebDriverManager.chromedriver().setup();
	//    WebDriverManager.iedriver().setup();
	//    WebDriverManager.firefoxdriver().setup();
	/*  }*/

	@BeforeMethod(alwaysRun = true)
	@Parameters("browser")
	public void setup(String browser) throws InterruptedException {

		if (browser.equalsIgnoreCase("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

			System.out.println("/////////INITIALIZE CHROME SUITE/////////");

		}
    if (browser.equalsIgnoreCase("chromeHeadless")) {
	    WebDriverManager.chromedriver().setup();
	    System.out.println(
			    "/////////////////////////////////INITIALIZE CHROME-HEADLESS SUITE/////////////////////////////////");
	    ChromeOptions options =
			    new ChromeOptions().addArguments("headless");
      driver = new ChromeDriver(options);

    }
    if (browser.equalsIgnoreCase("ie")) {
	    WebDriverManager.iedriver().arch32().setup();
	    System.out.println(
			    "/////////////////////////////////INITIALIZE IE SUITE/////////////////////////////////");
	    driver = new InternetExplorerDriver();
	    driver.manage().window().maximize();
    }
		if (browser.equalsIgnoreCase("ff")) {
			WebDriverManager.firefoxdriver().setup();
			System.out.println(
					"/////////////////////////////////INITIALIZE FIREFOX SUITE/////////////////////////////////");
			driver = new FirefoxDriver();

		}

		if (browser.equalsIgnoreCase("opera")) {
			WebDriverManager.operadriver().setup();
			System.out.println(
					"/////////////////////////////////INITIALIZE FIREFOX SUITE/////////////////////////////////");
			driver = new OperaDriver();

		}
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		HomePage homePage = new HomePage(driver);
		homePage.openURL();
		driver.manage().window().maximize();
		/* homePage.getMetroLogo();*/
		String actualTitle = driver.getTitle();
		driver.navigate().refresh();
		driver.navigate().refresh();

		System.out.println("Site Title is: " + actualTitle);
	}


  @AfterMethod(alwaysRun = true)
  public void teardown() {
	  driver.manage().window().setPosition(new Point(900, 500));
	  System.out.println("////////////////////////////------CLOSE BROWSER-------////////////////////////////////////");
	  driver.quit();
    }
  }

