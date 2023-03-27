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
    @UI("[name=your-name]") public TextField firstName;
    @UI("[name=your-email]") public TextField email;
    @UI("[name=your-message]") public TextArea message;
    @UI("//*[@value='Send your message']") public Button send;
    @UI("button.css-47sehv") public Button applyCookies;
}
