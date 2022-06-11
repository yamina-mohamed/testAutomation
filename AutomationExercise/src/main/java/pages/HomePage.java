package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {
    ChromeDriver driver;
    By signupLogin=By.partialLinkText("Signup / Login");
    public HomePage(ChromeDriver driver) {
        this.driver=driver;
    }


//    public Boolean isHomePageVisible() {
//        if (driver.getTitle().equals("Automation Exercise")) {
//            return true;
//        } else {
//            return false;
//        }
//    }

    public SignUpLoginPage clickOnSignupLoginPage(){
        onClick(signupLogin);
        return new SignUpLoginPage(driver);


    }
public void onClick(By by){
    driver.findElement(by).click();
}

}
