package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class MessagePopUpPage extends BasePage {
    public MessagePopUpPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//    metodu koja ceka da pop up bude vidljiv
    public void waitPopUpToBeVisible(String result) {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(
                        "//div[contains(@class, '" + result + "')]")));
    }

    //    Elemente koji u sebi sadrze tekstove poruke
    public List<WebElement> getMessageElements() {
        return driver.findElements(By.xpath(
                "//div[contains(@class, 'v-snack__content')]/ul/li"));
    }

    //    Close dugme iz verify account dijaloga
    public WebElement getVerifyAccountCloseButton() {
        return driver.findElement(By.xpath(
                "//*[contains(@class, 'btnClose')]"));

    }
}



