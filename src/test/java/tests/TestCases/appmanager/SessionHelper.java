package tests.TestCases.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by g on 2017-05-17.
 */
public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void UserLogin() throws Exception {
        Actions builder = new Actions(wd);
        WebDriverWait wait = new WebDriverWait(wd, 60);
        click(By.id("user-out-popover"));


        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Bejelentkezés")));
        click(By.xpath("//*[@data-js='gotoemailLogin']"));

        Thread.sleep(500);


        type(By.id("j_username"), "testergg@test.test");
        type(By.id("j_password"), "!QAZ2wsx");
        wd.findElement(By.id("logbtn")).click();

        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.linkText("Készülékek")));



    }
}
