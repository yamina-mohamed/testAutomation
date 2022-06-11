package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountCreatedConfirmationPage {
    ChromeDriver driver;
    By continueElement = By.cssSelector("div.pull-right >a");
    By titleElement=By.xpath("//b[text()='Account Created!']");

    public AccountCreatedConfirmationPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public Boolean verifyTitleVisibility(){
        WebElement title=driver.findElement(titleElement);
        if(title.isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }

    public ProductsPage clickContinue(){
        driver.findElement(continueElement).click();
        return new ProductsPage(driver);
    }



}
