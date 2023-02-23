package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    //        waiter for the title to be
    public void waitTitleToBe() {
        wait.until(ExpectedConditions.titleIs("Login - My Awesome App"));
    }

//        Polje za unos email-a
//        Polje za unos lozinke
//        Dugme za login.
    public WebElement getLoginInput(String input) {
//        input: email, password

        return driver.findElement(By.xpath(
                "//input[@id='" + input + "']"));
    }

    public WebElement getLoginButton() {
        return driver.findElement(By.xpath(
                "//*[@type='submit']"));
    }

    //    Verifikovati da polje za unos za atribut type ima određenu vrednost
    public void verifyThatInputFieldHasTheTypeValue(String input) {
        wait.until(ExpectedConditions.attributeContains(
                getLoginInput(input), "type", input));
    }
}
