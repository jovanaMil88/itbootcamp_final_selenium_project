package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends BasePage {
    public SignupPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

//        Polje za unos imena
//        Polje za unos emaila
//        Polje za unos lozinke
//        Polje za potvrdi lozinku

    public WebElement getSignupInput(String input) {
//    input:    name, email, password,confirmPassword
        return driver.findElement(By.id(input));
    }
//    waiter for the title to be
    public void waitTitleToBe() {
        wait.until(ExpectedConditions.titleIs("Signup - My Awesome App"));
    }

    public void verifyThatInputFieldHasTheTypeValue(String input) {
//      input:  email, password
        wait.until(ExpectedConditions.attributeContains(
                getSignupInput(input), "type", input));
    }

    //        Sign me up dugme
    public WebElement getSignMeUpButton(){
        return driver.findElement(By.xpath("//*[@type='submit']"));
    }
}