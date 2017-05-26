package tests.TestCases.appmanager;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;

/**
 * Created by g on 2017-05-17.
 */
public class Methods extends HelperBase {


    public Methods(WebDriver wd) {
        super(wd);
    }


    protected boolean isElementPresent(By locator) {
        try {
            wd.findElement(locator);
            return true; }
        catch (NoSuchElementException ex) {
            return false;

        }
    }



    public void choose_mobile(String mobile) throws Exception {
        // while (isElementPresent(By.xpath("//div[contains(@outerText,'"+mobile+"')and (@outerText='"+price+"')]"))==false) <- jesli sie pojawia dwa te same
        Actions builder = new Actions(wd);
        WebDriverWait wait = new WebDriverWait(wd, 10);
        if (isElementPresent(By.linkText(mobile))==false)
        {
            JavascriptExecutor js = (JavascriptExecutor) wd;
            js.executeScript("window.scrollBy(0,10000)", "");
        }
        click(By.linkText(mobile));
    }


    public void choose_tariff(String tariff, String price) throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(wd, 60);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"content\"]/div[8]/div[3]/p")));
        List<WebElement> lista = wd.findElements(By.cssSelector("div.chevron.js-accordion-heading.accordion__heading"));
        List<WebElement> lista1 = wd.findElements(By.xpath("//div[@aria-expanded='true']"));

        if (lista1.get(0).getAttribute("innerText").contains(tariff)&&lista1.get(0).getAttribute("innerText").contains(price)) {
            wd.findElement(By.linkText("Megrendelem")).click();
        }
        else {
            for(int i=0;i<lista.size();i++){
                if (lista.get(i).getAttribute("outerText").contains(tariff)&&lista.get(i).getAttribute("outerText").contains(price)) {
                    lista.get(i).click();
                    wd.findElement(By.linkText("Megrendelem")).click();
                }
            }
        }
    }


    public void kosaram_proceed() throws InterruptedException {



        click(By.xpath("//div[10]/div[7]/div[6]/div[1]/div[2]/div/form/div/div[3]/div/div[4]/div[1]/div[2]/div[3]/div[1]/h3/span[1]"));
        Actions builder = new Actions(wd);
        Thread.sleep(500);
        click(By.xpath("//*[@id=\"bundlename-10pcx_PWS_ROAMING_AO1\"]/span[1]/label" +
                ""));
        click(By.id("carttopersonalinfo"));
    }

    public void fill_details_form() {
        type(By.id("mobileNumber"),"701234567" );
        type(By.id("contactEmailAddress"), "testergg@test.test");
        type(By.id("lastName"), "dupa");
        type(By.id("firstName"), "el dupa");
        type(By.id("birthPlace"), "buda");
        type(By.name("DOB"), "1989/01/01");
        type(By.id("mothersMaidenName"), "lisica");
        click(By.className("js-form-label form__label form__label--checkable"));

        type(By.id("idNumber"), "AB1234567");
        type(By.id("home_postcode"), "1241");
        type(By.name("home_townCity"), "buda");
        type(By.id("home_streetName"),"pszeniczna");
        type(By.id("home_streetType"), "utca");
        type(By.id("home_houseNo"), "4");
        SelectIdType("IDENTITY");
        click(By.id("personalinfoConfirm"));












    }

    private void SelectIdType(String IDType) {
        Select select = new Select(wd.findElement(By.id("id=\"identification_select\"")));
        select.deselectAll();
        select.selectByVisibleText("IDType");

    }

    public void goToKosaram() throws InterruptedException {
        click(By.linkText("My Vodafone"));
        click(By.id("basketTab"));

        //WebDriverWait wait = new WebDriverWait(wd, 60);
        //wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Kosaram")));
        Actions builder = new Actions(wd);
        Thread.sleep(500);
        click(By.id("minicart_btn"));
    }
}
