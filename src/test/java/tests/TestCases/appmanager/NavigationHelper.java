package tests.TestCases.appmanager;

import org.openqa.selenium.WebDriver;

/**
 * Created by Grzegorz Gałuszka on 19.05.2017.
 */
public class NavigationHelper extends HelperBase {

    public void gotoFrontPage() {
        wd.get("https://37.59.19.116:9002/vodafonestorefront/"); }

    public NavigationHelper(WebDriver wd) {
        super(wd);
    }



}
