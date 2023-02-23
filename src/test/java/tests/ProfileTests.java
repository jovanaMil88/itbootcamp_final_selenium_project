package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ProfileTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Visits the profile page")
    public void visitsTheProfilePage() {

//        email: admin@admin.com
//        password: 12345

//        Klik na login dugme iz navigacije
//        Prijavljivanje na sistem sa admin kredencijalima
//        Ucitati /profile stranicu
//        Verifikovati da se u url-u stranice javlja ruta /profile

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("admin@admin.com");
        loginPage.getLoginInput("password")
                .sendKeys("12345");
        loginPage.getLoginButton().click();
        navPage.waitTitleToBe();
        navPage.getNavigationLink("profile").click();
        profilePage.waitTitleToBe();
        navPage.verifyThatTheCurrentUrlIsCorrect("/profile");

//        Verifikovati da email polje za atribut value ima vrednost admin@admin.com
//        Klik na logout dugme

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "email", "value", "admin@admin.com");
        navPage.getNavigationButton("Logout").click();
    }

    @Test(priority = 2)
    @Description("TC-2: Checks input types")
    public void checksInputTypes() {
//        email: admin@admin.com
//        password: 12345

//        Klik na login dugme iz navigacije
//        Prijavljivanje na sistem sa admin kredencijalima
//        Klik na my profile dugme iz navigacije

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("admin@admin.com");
        loginPage.getLoginInput("password")
                .sendKeys("12345");
        loginPage.getLoginButton().click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/home");
        navPage.getNavigationLink("profile").click();
        profilePage.waitTitleToBe();

//        Verifikovati da polje za email za atribut type ima vrednost email

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "email", "type", "email");

//       Verifikovati da polje za name za atribut type ima vrednost text

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "name", "type", "text");

//       Verifikovati da polje za city za atribut type ima vrednost text

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "city", "type", "text");

//        Verifikovati da polje za country za atribut type ima vrednost text

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "country", "type", "text");

//        Verifikovati da polje za urlTwitter za atribut type ima vrednost url

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "urlTwitter", "type", "url");

//        Verifikovati da polje za urlGitHub za atribut type ima vrednost url

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "urlGitHub", "type", "url");

//        Verifikovati da polje za telefon za atribut type ima vrednost tel

        profilePage.verifyThatInputFieldHasTheAttributeValue(
                "phone", "type", "tel");

//        Klik na logout dugme

        navPage.getNavigationButton("Logout").click();

    }


    @Test(priority = 3)
    @Description("TC-3: Edits profile")
    public void editsProfile() {
//        email: admin@admin.com
//        password: 12345
//        name: ime i prezime polaznika
//        phone: +38161283223
//        city: Bucaramanga
//        country: Spain
//        twitter: https://twitter.com/profile/milan1232
//        gitHub: link do vaseg github-a

//        Klik na login dugme iz navigacije
//        Prijavljivanje na sistem sa admin kredencijalima
//        Klik na my profile dugme iz navigacije

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("admin@admin.com");
        loginPage.getLoginInput("password")
                .sendKeys("12345");
        loginPage.getLoginButton().click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/home");
        navPage.getNavigationLink("profile").click();
        profilePage.waitTitleToBe();

//        Popuniti formu podacima
//        klik na Save dugme

        profilePage.getProfileInput("name").click();
        profilePage.getProfileInput("name")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("name")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("name")
                .sendKeys("Jovana Milojević");

        profilePage.getProfileInput("phone").click();
        profilePage.getProfileInput("phone")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("phone")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("phone")
                .sendKeys("063333333");

        profilePage.getProfileInput("city").click();
        profilePage.getProfileInput("city")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("city")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("city")
                .sendKeys("Bucaramanga");

        profilePage.getProfileInput("country").click();
        profilePage.getProfileInput("country")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("country")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("country")
                .sendKeys("Spain");

        profilePage.getProfileInput("urlTwitter").click();
        profilePage.getProfileInput("urlTwitter")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("urlTwitter")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("urlTwitter")
                .sendKeys("https://twitter.com/profile/milan1232");

        profilePage.getProfileInput("urlGitHub").click();
        profilePage.getProfileInput("urlGitHub")
                .sendKeys(Keys.CONTROL + "a");
        profilePage.getProfileInput("urlGitHub")
                .sendKeys(Keys.BACK_SPACE);
        profilePage.getProfileInput("urlGitHub")
                .sendKeys("https://github.com/jovanamil88");

        profilePage.getMyProfileSaveButton().click();

//        Verifikovati da je dijalog za poruku vidljiv
//        Verifikovati da je prikazana poruka Profile saved successfully

        messagePopUpPage.waitPopUpToBeVisible("success");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("Profile saved successfully"),
                    "Pop up message does not contain Profile saved successfully.");
        }
//        Verifikovati da svaki input sada za value atribut
//        ima vrednost koja je uneta u okviru forme
//        Klik na logout dugme

        Assert.assertEquals(profilePage.getProfileInput("name")
                        .getAttribute("value"), "Jovana Milojević",
                "Value attribute does not equal Jovana Milojević.");
        Assert.assertEquals(profilePage.getProfileInput("phone")
                        .getAttribute("value"), "063333333",
                "Value attribute does not equal 063333333.");
        Assert.assertEquals(profilePage.getProfileInput("city")
                        .getAttribute("value"), "Bucaramanga",
                "Value attribute does not equal Bucaramanga.");
        Assert.assertEquals(profilePage.getProfileInput("country")
                        .getAttribute("value"), "Spain",
                "Value attribute does not equal Spain.");
        Assert.assertEquals(profilePage.getProfileInput("urlTwitter")
                        .getAttribute("value"), "https://twitter.com/profile/milan1232",
                "Value attribute does not equal https://twitter.com/profile/milan1232.");
        Assert.assertEquals(profilePage.getProfileInput("urlGitHub")
                        .getAttribute("value"), "https://github.com/jovanamil88",
                "Value attribute does not equal https://github.com/jovanamil88.");

        navPage.getNavigationButton("Logout").click();

    }
}

