package Vodafon.Storefront;
import org.testng.annotations.Test;


public class StoreFrontTest extends TestPattern {


    @Test
    public void Test() throws Exception {
        MainPage mainpage = new MainPage(driver);
        Mobile_List m1 = new Mobile_List(driver);


        mainpage.GoToFrontPage();
        mainpage.logInProcess("customer1","customer1");
        m1.choose_mobile("iPhone 7");

    }
}
//*[@id="login_formt"]/fieldset/div[5]/a