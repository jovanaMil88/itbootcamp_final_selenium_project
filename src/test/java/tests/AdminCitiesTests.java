package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AdminCitiesTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Visits the admin cities page and list cities")
    public void visitsTheAdminCitiesPageAndListCities() {
//        admin email: admin@admin.com
//        admin password: 12345

//        Klik na login dugme iz navigacije
//        Prijaviti se na sistem admin kredencijalima
//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija
//        Verifikovati da se u url-u stranice javlja /admin/cities ruta

        navPage.getNavigationLink("login").click();
        loginPage.waitTitleToBe();
        loginPage.getLoginInput("email").sendKeys("admin@admin.com");
        loginPage.getLoginInput("password").sendKeys("12345");
        loginPage.getLoginButton().click();
        navPage.waitTitleToBe();
        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        navPage.verifyThatTheCurrentUrlIsCorrect("/admin/cities");
    }

    @Test(priority = 2)
    @Description("TC-2: Checks input types for create/edit new city")
    public void checksInputTypesForCreateOrEditNewCity() {

//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija
//        Kliknuti na New Item dugme
//        Sacekati da se dijalog za kreiranje i editovanje grada pojavi
//        Verifikovati da polje za unos grada za atribut type ima tekst text

        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        citiesPage.waitTitleToBe();
        citiesPage.getNewItemButton().click();
        citiesPage.waitEditDialogToBeVisible();
        citiesPage.verifyThatInputHasTheTypeValue("text");
    }

    @Test(priority = 3)
    @Description("TC-3: Create new city")
    public void createNewCity() {
//        city: [Ime i prezime polaznika]’s city

//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija
//        Kliknuti na New Item dugme
//        Sacekati da se dijalog za kreiranje i editovanje grada pojavi

        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        citiesPage.waitTitleToBe();
        citiesPage.getNewItemButton().click();
        citiesPage.waitEditDialogToBeVisible();

//        Uneti ime grada u polje
//        Kliknuti na Save dugme
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da poruka sadrzi tekst Saved successfully

        citiesPage.getNameInput().sendKeys("Jovana Milojević's city");
        citiesPage.getSaveButton().click();
        messagePopUpPage.waitPopUpToBeVisible("success");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("Saved successfully"),
                    "Pop up message does not contain Saved successfully.");
        }
    }

    @Test(priority = 4)
    @Description("TC-4: Edit city")
    public void editCity() {
//        old city name: [Ime i prezime polaznika]’s city
//        new city name: [Ime i prezime polaznika]’s city Edited

//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija

        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        citiesPage.waitTitleToBe();

        //        U polje za pretragu uneti staro ime grada
        //        Sacekati da broj redova u tabeli bude 1

        citiesPage.getSearchInput().sendKeys("Jovana Milojević's city");
        citiesPage.waitNumberOfRowsToBeVisible(1);

//        Kliknuti na dugme Edit iz prvog reda
//        Uneti novo ime za grad
//        Kliknuti na dugme Save
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da poruka sadrzi tekst Saved successfully

        citiesPage.getEditButtonOfTheTr(1).click();
        citiesPage.getEditItemInput().sendKeys(" Edited");
        citiesPage.getSaveButton().click();
        messagePopUpPage.waitPopUpToBeVisible("success");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("Saved successfully"),
                    "Pop up message does not contain Saved successfully.");
        }
    }

    @Test(priority = 5)
    @Description("TC-5: Search city")
    public void searchCity() {
//        city name: [Ime i prezime polaznika]’s city Edited

//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija

        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        citiesPage.waitTitleToBe();

//        U polje za pretragu uneti staro ime grada
//        Sacekati da broj redova u tabeli bude 1
//        Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage

        citiesPage.getSearchInput().sendKeys("Jovana Milojević's city Edited");
        citiesPage.waitNumberOfRowsToBeVisible(1);
        Assert.assertEquals(citiesPage.getTdOfTheTr(1, 2).getText(),
                "Jovana Milojević's city Edited",
                "Not the right name displayed in name field");
    }

    @Test(priority = 6)
    @Description("TC-6: Delete city")
    public void deleteCity() {
//        city name: [Ime i prezime polaznika]’s city Edited

//        Klik na admin dugme iz navigacije
//        Klik na Cities dugme iz padajuceg Admin menija
//        U polje za pretragu uneti staro ime grada
//        Sacekati da broj redova u tabeli bude 1
//        Verifikovati da se u Name koloni prvog reda nalazi tekst iz pretrage

        navPage.getNavigationButton("Admin").click();
        navPage.getAdminManuButton("cities").click();
        citiesPage.waitTitleToBe();
        citiesPage.getSearchInput().sendKeys("Jovana Milojević's city Edited");
        citiesPage.waitNumberOfRowsToBeVisible(1);
        Assert.assertEquals(citiesPage.getTdOfTheTr(1, 2).getText(),
                "Jovana Milojević's city Edited",
                "Not the right name displayed in the name field");

//        Kliknuti na dugme Delete iz prvog reda
//        Sacekati da se dijalog za brisanje pojavi
//        Kliknuti na dugme Delete iz dijaloga
//        Sacekati da popu za prikaz poruke bude vidljiv
//        Verifikovati da poruka sadrzi tekst Deleted successfully

        citiesPage.getDeleteButtonOfTheTr(1).click();
        citiesPage.waitDeleteDialogToBeVisible();
        citiesPage.getDialogDeleteButton().click();
        messagePopUpPage.waitPopUpToBeVisible("success");
        for (int i = 0; i < messagePopUpPage.getMessageElements().size(); i++) {
            Assert.assertTrue(messagePopUpPage.getMessageElements().get(i)
                            .getText().contains("Deleted successfully"),
                    "Pop up message does not contain Deleted successfully.");
        }
    }
}

