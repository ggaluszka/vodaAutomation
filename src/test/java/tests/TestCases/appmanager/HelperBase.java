package tests.TestCases.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by g on 2017-05-17.
 */
public class HelperBase {
    protected WebDriver wd;

    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public void click(By locator) {
        wd.findElement(locator).click();
    }

    /**
     * Some Java-doc.
     * @param locator Some locator.
     * @param text
     */
    protected void type(By locator, String text) {
        click(locator);
        wd.findElement(locator).click();
        if (text !=null) {
            String existingText = wd.findElement(locator).getAttribute("value");
        if (! text.equals(existingText)) {
            wd.findElement(locator).clear();
            wd.findElement(locator).sendKeys(text);
        }
        }

    }
    public boolean isAlertPresent() {
        try {
        wd.switchTo().alert();
        return true; }
        catch (NoAlertPresentException e){
            return false;
            }
        }

    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true; }
            catch (NoSuchElementException ex) {
                return false;

        }
    }




}

