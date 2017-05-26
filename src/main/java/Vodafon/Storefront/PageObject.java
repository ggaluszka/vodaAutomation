package Vodafon.Storefront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageObject {

    public WebDriver driver;
    public WebDriverWait wait;

    public PageObject(WebDriver driver) {
        this.driver=driver;

        PageFactory.initElements(driver,this);
    }
}
