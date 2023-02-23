package tests;

import com.sun.org.glassfish.gmbal.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LocaleTests extends BasicTest {

    @Test(priority = 1)
    @Description("TC-1: Set locale to ES")
    public void setLocaleToEs() {

//        Postaviti jezik na ES
//        Verifikovati da se na stranici u hederu javlja tekst Página de aterrizaje

        navPage.getNavigationButton("LocaleActivation").click();
        navPage.getLanguageButton("ES").click();
        Assert.assertTrue(navPage.getHomePageHeader()
                        .getText().contains("Página de aterrizaje"),
                "Header of the page does not contain Página de aterrizaje");
    }

    @Test(priority = 2)
    @Description("TC-2: Set locale to EN")
    public void setLocaleToEn() {

//        Postaviti jezik na EN
//        Verifikovati da se na stranici u hederu javlja tekst Landing

        navPage.getNavigationButton("LocaleActivation").click();
        navPage.getLanguageButton("EN").click();
        Assert.assertTrue(navPage.getHomePageHeader()
                        .getText().contains("Landing"),
                "Header of the page does not contain Landing");
    }

    @Test(priority = 3)
    @Description("TC-3: Set locale to CN")
    public void setLocaleToCn() {

//        Postaviti jezik na CN
//        Verifikovati da se na stranici u hederu javlja tekst Landing

        navPage.getNavigationButton("LocaleActivation").click();
        navPage.getLanguageButton("CN").click();
        Assert.assertTrue(navPage.getHomePageHeader()
                        .getText().contains("首页"),
                "Header of the page does not contain 首页");
    }

    @Test(priority = 4)
    @Description("TC-4: Set locale to FR")
    public void setLocaleToFR() {

//        Postaviti jezik na CN
//        Verifikovati da se na stranici u hederu javlja tekst Landing

        navPage.getNavigationButton("LocaleActivation").click();
        navPage.getLanguageButton("FR").click();
        Assert.assertTrue(navPage.getHomePageHeader()
                        .getText().contains("Page d'atterrissage"),
                "Header of the page does not contain Page d'atterrissage");
    }
}
