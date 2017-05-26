package Vodafon.Storefront;


import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class MethodHelper extends PageObject {
    public MethodHelper(WebDriver driver) {super(driver);}

    public boolean  isElementPresent(By locator){

        try {
            driver.findElement(locator);
            return true;
        } catch (NoSuchElementException ex) {
            return false;
        }
    }

}
