package tests.TestCases.testsG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.remote.BrowserType;
import tests.TestCases.appmanager.ApplicationManager;

/**
 * Created by g on 2017-05-17.
 */
public class TestBase {

    protected static final ApplicationManager app = ApplicationManager.create(BrowserType.CHROME);
    @BeforeSuite
    public void setUp() throws Exception {
        app.init();
    }

    @AfterSuite
    public void tearDown() {
        app.stop();
    }

}
