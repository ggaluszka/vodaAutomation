package Vodafon.Storefront;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Grzegorz Gałuszka on 26.05.2017.
 */
public class Personal_details_form extends PageObject {

    public Personal_details_form(WebDriver driver) {super(driver);}

    @FindBy(id = "mobileNumber")
    private WebElement mobileNoField;

    @FindBy(name = "contactEmailAddress")
    private WebElement emailAddressField;

    @FindBy(id = "lastName")
    private WebElement lastNameField;

    @FindBy(id = "firstName")
    private WebElement firstNameField;

    @FindBy(id = "birthPlace")
    private WebElement birthPlaceField;


    @FindBy(name = "DOB")
    private WebElement DOBField;

    @FindBy(id = "mothersMaidenName")
    private WebElement mothersMaidenNameField;

    @FindBy(xpath = "//div[10]/div[7]/div[3]/div[2]/form/div/div[1]/div[1]/div/div[2]/fieldset/div[15]/div")
    private WebElement sexField;

    @FindBy(xpath = "//select[@id='identification_select']//option[2]")
    private WebElement idTypeField;

    @FindBy(id = "idNumber")
    private WebElement idNumberField;


    @FindBy(id = "home_postcode")
    private WebElement postcodeField;

    @FindBy(id = "home_townCity")
    private WebElement townField;

    @FindBy(id = "home_streetName")
    private WebElement streetField;

    @FindBy(id = "home_streetType")
    private WebElement streetTypeField;

    @FindBy(id = "home_houseNo")
    private WebElement houseNoField;

    @FindBy(id = "personalinfoConfirm")
    private WebElement Confirm;






    public void fill_details_form() {

        mobileNoField.sendKeys("701234567");

        emailAddressField.sendKeys("testergg@test.test");

        lastNameField.sendKeys("dupa");

        firstNameField.sendKeys("el dupa");

        birthPlaceField.sendKeys("buda");

        DOBField.sendKeys("1989/01/01");

        mothersMaidenNameField.sendKeys("lisica");

        sexField.click();

        idTypeField.click();

        idNumberField.sendKeys("AB 123456");

        postcodeField.sendKeys("11211");

        townField.sendKeys("buda");

        streetField.sendKeys("pszeniczna");

        streetTypeField.sendKeys("utca");

        houseNoField.sendKeys("4");

        Confirm.click();


    }


}
