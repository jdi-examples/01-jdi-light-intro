package pageobject.uiobjects.example.baeldung.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.Title;
import com.epam.jdi.light.elements.pageobjects.annotations.Url;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.UI;
import com.epam.jdi.light.ui.html.elements.common.Button;
import com.epam.jdi.light.ui.html.elements.common.TextArea;
import com.epam.jdi.light.ui.html.elements.common.TextField;

@Url("/contact")
@Title("Contact Us | Baeldung")
public class ContactPage extends WebPage {
    @UI("[name=your-name]") TextField firstName;
    @UI("[name=your-email]") TextField email;
    @UI("[name=your-message]") TextArea message;
    @UI("//*[@value='Send your message']") Button send;
    @UI("button.css-47sehv") public Button applyCookies;
}
