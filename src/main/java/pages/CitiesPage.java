package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CitiesPage extends BasePage {
    public CitiesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    //    dugme New Item
    //    input za pretragu
    public WebElement getNewItemButton() {
        return driver.findElement(By.xpath(
                "//*[contains(@class, 'btnNewItem')]"));
    }
    public WebElement getSearchInput() {
        return driver.findElement(By.id("search"));
    }

//    Verifies that type attribute has certain value
    public void verifyThatInputHasTheTypeValue(String value) {
        wait.until(ExpectedConditions.attributeContains(
                getSearchInput(), "type", value));
    }

    //    metodu koja ceka da se dijalog za editovanje i kreiranje pojavi
    public void waitEditDialogToBeVisible() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(
                        "//*[contains(@class, 'dlgNewEditItem')]")));
    }

    //    metodu koja ceka da se dijalog za brisanje pojavi
    public void waitDeleteDialogToBeVisible() {
        wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath(
                        "//div[contains(@class, 'rounded-0')]")));
    }

    //    save dugme iz dijalog za editovanje i kreiranje
    public WebElement getSaveButton() {
        return driver.findElement(By.xpath(
                "//*[contains(@class, 'btnSave')]"));
    }

    //    delete dugme iz dijaloga za brisanje
    public WebElement getDialogDeleteButton() {
        return driver.findElement(By.xpath(
                "//button[contains(@class,'red--text')]"));
    }

//        metodu koja ceka da se u tabeli pojavi odredjeni broj redova.
//        Metoda kao parametar prima broj redova.
//        Ako se metoda pozove sa parametrom 5,
//        to znaci da metoda ceka da se u tabeli pojavi 5 redova.

    public void waitNumberOfRowsToBeVisible(int rows) {
        wait.until(ExpectedConditions
                .numberOfElementsToBe(By.xpath(
                        "//tbody/tr"), rows));

    }
//        metodu koja vraca celiju iz odredjenog reda.
//        Metoda kao parametre prima red i kolonu a vraca td iz tabele.
//        Npr: ukoliko se metoda pozove row=2, cell=3
//        tada metoda vraca trecu celiju iz 2 reda.

    public WebElement getTdOfTheTr(int row, int cell) {
        return driver.findElement(By.xpath(
                "//tbody/tr[" + row + "]/td[" + cell + "]"));
    }

    //    metodu koja vraca edit dugme trazenog reda.
    //    Metoda kao parametar prima red a vraca dugme.
    //    Npr ako se metoda pozove row=3,
    //    metoda vraca edit dugme iz treceg reda tabele

    public WebElement getEditButtonOfTheTr(int row) {
        return driver.findElement(By.xpath(
                "//tbody/tr[" + row + "]/td/div/button[@id='edit']"));
    }

    //   metodu koja vraca delete dugme trazenog reda.
    //   Metoda kao parametar prima red a vraca dugme.
    //   Npr ako se metoda pozove row=3,
    //   metoda vraca delete dugme iz treceg reda tabele

    public WebElement getDeleteButtonOfTheTr(int row) {
        return driver.findElement(By.xpath(
                "//tbody/tr[" + row + "]/td/div/button[@id='delete']"));
    }

//    waiter for the title to be
    public void waitTitleToBe() {
        wait.until(ExpectedConditions.titleIs("Cities - My Awesome App"));
    }

    public WebElement getNameInput(){
        return driver.findElement(By.id("name"));
    }
    public WebElement getEditItemInput(){
        return driver.findElement(By.name("name"));
    }


}
