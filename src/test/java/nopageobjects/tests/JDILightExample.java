package nopageobjects.tests;

import com.epam.jdi.light.elements.composite.WebPage;
import org.testng.annotations.Test;

import static com.epam.jdi.light.elements.composite.WebPage.getTitle;
import static com.epam.jdi.light.elements.composite.WebPage.getUrl;
import static com.epam.jdi.light.elements.composite.WebPage.openUrl;
import static com.epam.jdi.light.elements.init.UIFactory.$;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class JDILightExample {
    @Test
    public void openJDITestSite() {
        openUrl("https://epam.github.io/JDI/index.html");
    }

    @Test
    public void loginAndOpenContactPage() {
        openUrl("https://epam.github.io/JDI/index.html");
        $("img#user-icon").click();
        $("#name").sendKeys("epam");
        $("#password").sendKeys("1234");
        $("#login-button").click();
        $("//*[@class='sidebar-menu']//*[text()='Contact form']").click();
        assertThat(getUrl(), is("https://epam.github.io/JDI/contacts.html"));
        assertThat(getTitle(), is("Contact Form"));
    }

    @Test
    public void actionsWithPage() {
        WebPage.openUrl("https://epam.github.io/JDI/index.html");
        WebPage.getUrl();
        WebPage.getTitle();
        WebPage.back();
        WebPage.forward();
        WebPage.getHtml();
        WebPage.refresh();
    }
}
