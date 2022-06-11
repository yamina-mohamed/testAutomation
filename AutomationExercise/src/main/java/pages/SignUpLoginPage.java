package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpLoginPage {
private ChromeDriver driver;
//By signupButtonLocator=By.cssSelector("div.signup-form > button");
    By signupButtonLocator=By.xpath("//button[text()='Signup']");





    public SignUpLoginPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public Boolean checkNewUserTextVisibility(){
        WebElement newUserSignupTitle = driver.findElement(By.cssSelector("div.signup-form > h2"));
        if(newUserSignupTitle.isDisplayed()){
            return true;
        }
        else {
            return false;
        }
    }

    public void enterName(String mName){
        driver.findElement(By.name("name")).sendKeys(mName);

    }

    public void enterEmailAddress(String emailAddress){
        driver.findElement(By.cssSelector("div.signup-form " +
                "[name='email']")).sendKeys(emailAddress);
    }


    public LoginFormPage clickOnSignup(){
        driver.findElement(signupButtonLocator).click();
        return new LoginFormPage(driver);
    }


}
