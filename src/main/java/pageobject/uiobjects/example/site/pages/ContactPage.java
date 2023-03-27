package pageobject.uiobjects.example.site.pages;

import com.epam.jdi.light.elements.composite.WebPage;
import com.epam.jdi.light.elements.pageobjects.annotations.locators.JDropdown;
import com.epam.jdi.light.material.elements.inputs.Select;
//Add any element from material-ui package
public class ContactPage extends WebPage {
@JDropdown(root = "#select") public Select select;
}
