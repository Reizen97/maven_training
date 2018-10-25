package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void setUp() {
       // System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
       // driver = new ChromeDriver();
        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void quit() throws InterruptedException {

        driver.close();
    }
}
