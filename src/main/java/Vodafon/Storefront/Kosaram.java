package Vodafon.Storefront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by Grzegorz Gałuszka on 25.05.2017.
 */
public class Kosaram extends PageObject {
    public Kosaram(WebDriver driver) {super(driver);}


    @FindBy(xpath = "//div[10]/div[7]/div[6]/div[1]/div[2]/div/form/div/div[3]/div/div[4]/div[1]/div[2]/div[3]/div[1]/h3/span[1]")
    private WebElement dropdown_EU_Roaming;

    @FindBy(xpath = "//*[@id=\"bundlename-10oac_{18_ROAMING_AO1\"]/span[2]/label/span")
    private WebElement EU_Roaming;

    @FindBy(xpath = "//button[@id='carttopersonalinfo']")
    private WebElement Proceed_Button;

    @FindBy(linkText = "My Vodafone")
    private WebElement myVodafoneButton;

    @FindBy(id = "basketTab" )
    private WebElement basketTab;

    @FindBy(id = "minicart_btn" )
    private WebElement minicart_btn;




    public void kosaram_proceed() throws InterruptedException {

        dropdown_EU_Roaming.click();
            Thread.sleep(500);
        EU_Roaming.click();
        WebDriverWait wait = new WebDriverWait(driver, 60);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='carttopersonalinfo']")));

        Thread.sleep(500);
        Proceed_Button.click();
    }

    public  void goToKosaram() throws InterruptedException {

        myVodafoneButton.click();
        basketTab.click();
        Thread.sleep(500);
        minicart_btn.click();



    }









}
