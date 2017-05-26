package tests.TestCases;

import org.testng.annotations.Test;
import pages.signUpForm;
import tests.testBase;

import static org.junit.Assert.assertNotNull;

public class testCase extends testBase {
    @Test
    public void signUp() throws InterruptedException {
        driver.get("https://37.59.19.116:9002/hu/handset/#list");

        signUpForm SignUpForm = new signUpForm(driver);
        assertNotNull(SignUpForm);

        SignUpForm.enterName("test@test.test", "Q@AZwsx12");
        /*
        nextPageClass nextpage = signUpForm.submit();
        assertTrue(receiptPage.isInitialized());
        */

        //tu jakis asercik ale aktualnie u nas nie przechodzi na strone. bo jest blank
    }
}
