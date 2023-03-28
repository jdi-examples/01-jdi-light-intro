package pageobject;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import pageobject.uiobjects.example.site.SiteJdi;

import static com.epam.jdi.light.driver.WebDriverFactory.close;
import static com.epam.jdi.light.elements.init.PageFactory.initElements;
import static com.epam.jdi.light.logger.LogLevels.STEP;
import static com.epam.jdi.light.settings.WebSettings.logger;

public interface TestsInit {
    @BeforeMethod(alwaysRun = true)
    default void setUp() {
        logger.setLogLevel(STEP);
        initElements(SiteJdi.class);
    }

    @AfterMethod(alwaysRun = true)
    default void teardown() {
        close();
    }
}
