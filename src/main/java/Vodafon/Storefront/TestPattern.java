package Vodafon.Storefront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

import java.io.File;
import java.util.concurrent.TimeUnit;

/**
 * Created by wgaje_000 on 2017-05-25.
 */
public class TestPattern {
    protected static WebDriver driver;

    @Parameters({"browserID"})
    @BeforeTest
    public static void setUp(int browserID) {
        String Chrome = new String("drivers/chromedriver.exe");
        String FF = new String("drivers/geckodriver.exe");

        switch (browserID) {
            case 1:
                System.setProperty("webdriver.gecko.driver",FF);
                driver = new FirefoxDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
            case 2:
                System.setProperty("webdriver.chrome.driver",Chrome);
                driver = new ChromeDriver();
                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
                break;
        }
    }

    @AfterMethod
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

   /* @AfterClass
    public static void tearDown() {
        driver.close();
    }

    @AfterTest
    public static void destruction() {
        driver.quit();
    }*/
}
