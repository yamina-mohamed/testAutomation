package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductsPage {
    ChromeDriver driver;
    By loginUserName=By.cssSelector("i.fa-user~b");
    By deleteAccountElement=By.className("fa-trash-o");

    public ProductsPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public String verifyUserName(){
       return driver.findElement(loginUserName).getText();
    }

    public AccountDeletedPage deleteAccountButton(){
        driver.findElement(deleteAccountElement).click();
        return new AccountDeletedPage(driver);
    }


}
