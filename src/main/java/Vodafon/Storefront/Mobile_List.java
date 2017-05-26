package Vodafon.Storefront;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class Mobile_List extends PageObject {
    public Mobile_List(WebDriver driver) {
        super(driver);
    }


    public Mobile_List choose_mobile(String mobile) throws Exception {

        MethodHelper MH = new MethodHelper(driver);
        Actions    builder = new Actions(driver);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        List<WebElement> phonelist  =driver.findElements(By.className("device-name-row"));

        for (int i=0; i<phonelist.size();i++) {

            if (!MH.isElementPresent(By.linkText(mobile))) {
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("window.scrollBy(0,10000)", "");
            }
        }
        driver.findElement(By.linkText(mobile)).click();
        return new Mobile_List(driver);

    }
}



