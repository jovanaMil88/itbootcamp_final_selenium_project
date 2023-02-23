package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavPage extends BasePage {
    public NavPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    Home link
//    About link
//    My profile link
//    Sign up dugme
//    Login dugme

    public WebElement getNavigationLink(String page) {
        // page: signup,about,profile,login;
        // for Home Page stays ""
        return driver.findElement(By.xpath(
                "//div[@class='v-toolbar__items']/a[contains(@href,'/" + page + "')]"));
    }
    //    Admin dugme
    //    Logout dugme
    //    Dugme za izbor jezika
    public WebElement getNavigationButton(String keyWord) {
        //   keyWord: Logout, Admin, LocaleActivation
        return driver.findElement(By.xpath(
                "//*[contains(@class, 'btn" + keyWord + "')]"));
    }

    //    Cities link iz padajuceg Admin menija
    //    Users link iz padajuceg Admin menija
    public WebElement getAdminManuButton(String list) {
//        list: cities,users
        return driver.findElement(By.xpath(
                "//a[contains(@href, '" + list + "')]"));
    }

    public void waitLogoutButtonToBeVisible() {
        wait.until(ExpectedConditions.
                visibilityOf(getNavigationButton("Logout")));
    }

//    EN dugme iz padajuceg menija za izbor jezika
//    ES dugme iz padajuceg menija za izbor jezika
//    FR dugme iz padajuceg menija za izbor jezika
//    CN dugme iz padajuceg menija za izbor jezika

    public WebElement getLanguageButton(String language) {
//        language: EN,ES,CN,FR,UA
        wait.until(ExpectedConditions.visibilityOf(
                driver.findElement(By.xpath(
                        "//div[contains(@id,'list-item')]//div[contains(text(), '"
                                + language + "')]"))));
        return driver.findElement(By.xpath(
                "//div[contains(@id,'list-item')]//div[contains(text(), '"
                        + language + "')]/.."));
    }

    //    Verifikovati da se u url-u stranice javlja određena ruta
    public void verifyThatTheCurrentUrlIsCorrect(String part) {
        wait.until(ExpectedConditions.urlContains(part));
    }

//    waiter for the title to be
    public void waitTitleToBe() {
        wait.until(ExpectedConditions.titleIs("Protected Home - My Awesome App"));
    }

    public void getWantedPage(String route){
        driver.get("https://vue-demo.daniel-avellaneda.com" + route);
    }

    public WebElement getHomePageHeader(){
        return driver.findElement(By.tagName("h1"));
    }
}







