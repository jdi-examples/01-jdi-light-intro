package pageobject;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.site.SiteJdi;

import static com.epam.jdi.light.driver.WebDriverFactory.close;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;

public interface TestsInit {
    @BeforeSuite(alwaysRun = true)
    static void setUp() {
        logger.setLogLevel(STEP);
        initElements(SiteJdi.class);
    }

    @AfterSuite(alwaysRun = true)
    static void teardown() {
        close();
    }
}
