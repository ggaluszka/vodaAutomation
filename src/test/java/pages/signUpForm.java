package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class signUpForm extends PageObject {

    @FindBy(id = "user-out-popover")
    private WebElement loginIcon;
    @FindBy(how = How.XPATH, xpath = "//a[@data-js='gotoemailLogin']")
    private WebElement emailFormLink;
    @FindBy(id = "j_username")
    private WebElement username;
    @FindBy(id = "j_password")
    private WebElement passwrod;

    public signUpForm(WebDriver driver) {
        super(driver);
    }

    public void enterName(String username, String password) throws InterruptedException {

        this.loginIcon.click();
        Thread.sleep(1000);
        this.emailFormLink.click();
        this.username.sendKeys(username);
        this.passwrod.sendKeys(password);
    }

    /*
    public ReceiptPage submit() {
        //nie pamietam na ktora przekierowuje
        return new ReceiptPage(driver);
    }
    */
}
