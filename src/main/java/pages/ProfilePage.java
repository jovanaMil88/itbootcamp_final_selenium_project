package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProfilePage extends BasePage {
    public ProfilePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getProfileInput(String field) {
//        field: name, phone, city, country, urlTwitter, urlGitHub
        return driver.findElement(By.id(field));
    }

    public WebElement getMyProfileSaveButton(){
        return driver.findElement(By.xpath(
                "//*[contains(@class,'btnSave')]"));
    }

//    waiter for the title to be
    public void waitTitleToBe() {
        wait.until(ExpectedConditions.titleIs("My profile - My Awesome App"));
    }

//    verifies that some input field has certain attribute value
    public void verifyThatInputFieldHasTheAttributeValue
            (String field, String attribute, String value) {
//     field: name, phone, city, country, urlTwitter, urlGitHub
//     attribute: type, disabled,
//     value: email, text, url, tel

        wait.until(ExpectedConditions.attributeContains(
                getProfileInput(field), attribute, value));
    }

    }

