package tests.TestCases.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.BrowserType;

import java.util.concurrent.TimeUnit;

/**
 * Created by g on 2017-05-17.
 */
public class ApplicationManager extends HelperBase  {


    private Methods methods;
    private SessionHelper sessionHelper;
    private NavigationHelper navigationHelper;

    public ApplicationManager(WebDriver wd) {
        super(wd);
        init();
    }

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public static ApplicationManager create(String browser) {
        WebDriver wd = null;
        if (browser.equals(BrowserType.FIREFOX)) {

            wd = new FirefoxDriver();
        }  else if (browser.equals(BrowserType.CHROME)) {

            wd = new ChromeDriver() ;
        } else if (browser.equals(BrowserType.IE)) {
            wd = new InternetExplorerDriver();
        }else {
            throw new IllegalArgumentException(browser);
        }
        return new ApplicationManager(wd);
    }

    public void init() {


        wd.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        sessionHelper= new SessionHelper(wd);
        navigationHelper= new NavigationHelper(wd);
        methods = new Methods(wd);

    }


    public void stop() {
        wd.quit();
    }



    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }

    public NavigationHelper getNavigationHelper() {
        return navigationHelper;
    }




    public Methods getMethods() {
        return methods;
    }
}
