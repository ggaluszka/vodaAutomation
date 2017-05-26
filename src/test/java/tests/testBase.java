package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;
import pages.signUpForm;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by fts on 02.03.2017.
 */
public class testBase {
    protected static WebDriver driver;

    @Parameters({"browserID"})
    @BeforeTest
    public static void setUp(int browserID) {

        switch (browserID) {
            case 1:
                System.setProperty("webdriver.gecko.driver","C:\\eclipse wrkspace\\vodaAutomation\\drivers\\geckodriver.exe");
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case 2:
                System.setProperty("webdriver.chrome.driver","C:\\eclipse wrkspace\\vodaAutomation\\drivers\\chromedriver.exe");
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    @AfterMethod
    public void cleanUp() {
        //driver.manage().deleteAllCookies();
    }

    @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @AfterTest
    public static void destruction() {
        driver.quit();
    }

}
