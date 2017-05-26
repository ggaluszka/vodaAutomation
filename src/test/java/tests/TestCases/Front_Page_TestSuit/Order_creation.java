package tests.TestCases.Front_Page_TestSuit;


import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tests.TestCases.testsG.TestBase;

public class Order_creation extends TestBase {


    @BeforeMethod
    public void ensurePreconditions() {
        app.getNavigationHelper().gotoFrontPage();

    }



    @Test
    public void testNewOrder() throws Exception {
        app.getSessionHelper().UserLogin();
        //app.getMethods().choose_mobile("Vodafone Smart Turbo 7");
        //app.getMethods().choose_tariff("Red Extra EU+ 2év, e-Pack","14 990 Ft");
        app.getMethods().goToKosaram();
        app.getMethods().kosaram_proceed();
        app.getMethods().fill_details_form();
    }


}


