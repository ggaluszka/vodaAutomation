package Vodafon.Storefront;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class MainPage extends PageObject {
    public MainPage(WebDriver driver) {super(driver);}


    private WebDriver.Timeouts wait1;
    private WebDriverWait wait2;

    private String StoreFront = "https://37.59.19.116:9002/vodafonestorefront/b2ctelco/en#";

    @FindBy(id = "user-out-popover")
    private WebElement LogIn_Icon;

    @FindBy(xpath = "//*[@id=\"login_formt\"]/fieldset/div[5]/a")
    private WebElement GoToEmail;

    @FindBy(id = "loginLinkLoginHeader")
    private WebElement title;

    @FindBy(id = "j_username")
    private WebElement Username;


    @FindBy(id = "j_password")
    private WebElement Password;

    @FindBy(id = "logbtn")
    private WebElement LogInButton;

    public MainPage GoToFrontPage() {
        driver.get(StoreFront);
        return new MainPage(driver);
    }


    public MainPage logInProcess(String username, String password) throws Exception {

        LogIn_Icon.click();

        Thread.sleep(500);
        GoToEmail.click();
        this.Username.sendKeys(username);
        this.Password.sendKeys(password);
        LogInButton.click();
        return new MainPage(driver);

    }

}



