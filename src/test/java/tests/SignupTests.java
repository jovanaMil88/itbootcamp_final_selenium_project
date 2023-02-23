package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Visits the signup page")
    public void visitsTheSignupPage() {

//        Klik na sign up dugme iz navigacije
//        Verifikovati da se u url-u stranice javlja /signup ruta

        navPage.getNavigationLink("signup").click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/signup");
    }

    @Test(priority = 2)
    @Description("TC-2: Checks input types")
    public void checksInputTypes() {

//        Klik na sign up dugme iz navigacije
//        Verifikovati da polje za unos emaila za atribut type ima vrednost email
//        Verifikovati da polje za unos lozinke za atribut type ima vrednost password
//        Verifikovati da polje za unos lozinke za potvrdu
//        za atribut type ima vrednost password

        navPage.getNavigationLink("signup").click();
        signupPage.waitTitleToBe();
        signupPage.verifyThatInputFieldHasTheTypeValue("email");
        signupPage.verifyThatInputFieldHasTheTypeValue("password");
        signupPage.verifyThatInputFieldHasTheTypeValue("password");
    }

    @Test(priority = 3)
    @Description("TC-3: Displays errors when user already exists")
    public void displaysErrorsWhenUserAlreadyExists() {
//        name: Another User
//        email: admin@admin.com
//        password: 12345
//        confirm password: 12345

//        Klik na sign up dugme iz navigacije
//        Verifikovati da se u url-u stranice javlja /signup ruta
//        Popuniti formu za registraciju podacima
//        Klik na sign up dugme
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da greska sadrzi poruku E-mail already exists
//        Verifikovati da se u url-u stranice javlja /signup ruta

        navPage.getNavigationLink("signup").click();
        signupPage.waitTitleToBe();
        navPage.verifyThatTheCurrentUrlIsCorrect("/signup");
        signupPage.getSignupInput("name")
                .sendKeys("Another User");
        signupPage.getSignupInput("email")
                .sendKeys("admin@admin.com");
        signupPage.getSignupInput("password")
                .sendKeys("12345");
        signupPage.getSignupInput("confirmPassword")
                .sendKeys("12345");
        signupPage.getSignMeUpButton().click();
        messagePopUpPage.waitPopUpToBeVisible("error");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("E-mail already exists"),
                    "Error message does not contain E-mail already exists.");
        }
        navPage.verifyThatTheCurrentUrlIsCorrect("/signup");
    }

    @Test(priority = 4)
    @Description("TC-4: Signup")
    public void signup() {
//        name: Ime i prezime polaznika
//        email template: ime.prezime@itbootcamp.rs
//        password: 12345
//        confirm password: 12345

//        Klik na sign up dugme iz navigacije
//        Popuniti formu podacima za registraciju
//        Klik na sign up dugme

        navPage.getNavigationLink("signup").click();
        signupPage.waitTitleToBe();
        signupPage.getSignupInput("name")
                .sendKeys("Pavle Pavlovic");
        signupPage.getSignupInput("email")
                .sendKeys("pavlepavlovic@itbootcamp.rs");
        signupPage.getSignupInput("password")
                .sendKeys("12345");
        signupPage.getSignupInput("confirmPassword")
                .sendKeys("12345");
        signupPage.getSignMeUpButton().click();

        //        Ucitati stranicu /home
        //        Verifikovati da dijalog za obavestenje sadrzi tekst
        //        IMPORTANT: Verify your account
        //        Kliknuti na Close dugme iz dijaloga
        //        Kliknuti na logout

        navPage.verifyThatTheCurrentUrlIsCorrect("/home");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("IMPORTANT: Verify your account"),
                    "Error message does not contain E-mail already exists.");
        }
        messagePopUpPage.getVerifyAccountCloseButton().click();
        navPage.getNavigationButton("Logout").click();
    }
}
