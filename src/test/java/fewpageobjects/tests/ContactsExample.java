package fewpageobjects.tests;

import fewpageobjects.TestsInit;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pageobject.uiobjects.example.baeldung.entities.ContactInfo;
import pageobject.uiobjects.example.site.SiteJdi;

import static pageobject.uiobjects.example.baeldung.BaeldungSite.contactPage;

public class ContactsExample implements TestsInit {
    ContactInfo MY_CONTACT = new ContactInfo().set(c -> {
        c.firstName = "Roman";
        c.email = "roman.iovlev.jdi@gmail.com";
        c.message = "Hi Baeldung!";} );

    @Test
    public void fillContactTest() {
        contactPage.open();
        contactPage.asForm().send(MY_CONTACT);
        contactPage.asForm().check(MY_CONTACT);
    }
    @Test
    public void fillContactTest1() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest2() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest3() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest4() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest5() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest6() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest7() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest8() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest9() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest10() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest11() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest12() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest13() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest14() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest15() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest16() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest17() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest18() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest19() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest20() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest21() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest22() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest23() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest24() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest25() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest26() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest27() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest28() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest29() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }

    @Test
    public void fillContactTest30() throws InterruptedException {
        SiteJdi.contactPage.open();
        SiteJdi.contactPage.asForm().send(MY_CONTACT);
        SiteJdi.contactPage.asForm().check(MY_CONTACT);
        Thread.sleep(2000);
    }
}
