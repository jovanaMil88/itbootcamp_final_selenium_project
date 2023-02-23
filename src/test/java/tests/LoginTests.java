package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Visits the login page")
    public void visitsTheLoginPage() {

//    Postaviti EN jezik stranice
//    Klik na login dugme iz navigacije
//    Verifikovati da se u url-u stranice javlja ruta /login

        navPage.getNavigationButton("LocaleActivation").click();
        navPage.getLanguageButton("EN").click();
        navPage.getNavigationLink("login").click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

    @Test(priority = 2)
    @Description("TC-2: Checks input types")

    public void checksInputTypes() {

//        Klik na login dugme iz navigacije
//        Verifikovati da polje za unos emaila za atribut type ima vrednost email
//        Verifikovati da polje za unos lozinke za atribut type ima vrednost password

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.verifyThatInputFieldHasTheTypeValue("email");
        loginPage.verifyThatInputFieldHasTheTypeValue("password");
    }

    @Test(priority = 3)
    @Description("TC-3: Displays errors when user does not exist")
    public void displaysErrorWhenUserDoesNotExist() {
//        email: non-existing-user@gmal.com
//        password: password123

//        Klik na login dugme iz navigacije
//        Popuniti login formu podacima za logovanje
//        Klik na login dugme
//        Sacekati da popu za prikaz greske bude vidljiv
//        Verifikovati da greska sadrzi poruku User does not exists
//        Verifikovati da se u url-u stranice javlja /login ruta

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("mario12@gmail.com");
        loginPage.getLoginInput("password")
                .sendKeys("password123");
        loginPage.getLoginButton().click();
        messagePopUpPage.waitPopUpToBeVisible("error");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("User does not exists"),
                    "Error message does not contain User does not exists.");
        }
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");

    }

    @Test(priority = 4)
    @Description("TC-4: Displays errors when password is wrong")
    public void displaysErrorsWhenPasswordIsWrong() {
//        email: admin@admin.com
//        password: password123

//        Klik na login dugme iz navigacije
//        Popuniti login formu podacima za logovanje
//        Klik na login dugme
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da greska sadrzi poruku Wrong password
//        Verifikovati da se u url-u stranice javlja /login ruta

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("admin@admin.com");
        loginPage.getLoginInput("password")
                .sendKeys("password123");
        loginPage.getLoginButton().click();
        messagePopUpPage.waitPopUpToBeVisible("error");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("Wrong password"),
                    "Error message does not contain Wrong password.");
        }
        navPage.verifyThatTheCurrentUrlIsCorrect("/login");
    }

    @Test(priority = 5)
    @Description("TC-5: Login")
    public void login() {
//        email: admin@admin.com
//        password: 12345

//        Klik na login dugme iz navigacije
//        Popuniti login formu podacima za logovanje
//        Verifikovati da se u url-u stranice javlja /home ruta

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email")
                .sendKeys("admin@admin.com");
        loginPage.getLoginInput("password")
                .sendKeys("12345");
        loginPage.getLoginButton().click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/home");
    }

    @Test(priority = 6)
    @Description("TC-6: Logout")
    public void logout() {

//        Verifikovati da je dugme logout vidljivo na stranici
//        Kliknuti na logout dugme

        navPage.waitLogoutButtonToBeVisible();
        navPage.getNavigationButton("Logout").click();
    }
}


    


