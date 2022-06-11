package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.*;

public class LoginFormPage {
//    By accountInformationTitle=By.cssSelector("div.login-form h2 b");
    By accountInformationTitle=By.xpath("//b[text()='Enter Account Information']");
    By createAccountElement=By.xpath("//button[text()='Create Account']");
    ChromeDriver driver;
    By checkBoxSelection=By.id("id_gender2");
    By nameInput=By.id("name");
    By emailInput=By.id("email");
    By passwordInput=By.id("password");
    By daysDropDown=By.id("days");
    By monthsDropDown=By.id("months");
    By yearsDropDown=By.id("years");
    By newsLetterElement=By.id("newsletter");
    By offersElement=By.id("optin");
    By firstName=By.id("first_name");
    By lastName=By.id("last_name");
    By company=By.id("company");
    By address1=By.id("address1");
    By address2=By.id("address2");
    By country=By.id("country");
    By state=By.id("state");
    By city=By.id("city");
    By zipCode=By.id("zipcode");
    By mobileNumber=By.id("mobile_number");


    public LoginFormPage(ChromeDriver driver) {
        this.driver=driver;
    }

    public boolean checkTitleExistence(){

        WebElement title=driver.findElement(accountInformationTitle);
        if(title.isDisplayed()){
            return true;
        }
        else {return false; }
    }


    private Select getDropDownElementSelection(By element){
        return new Select(driver.findElement(element));
    }


    public void fillAccountInformationForm(String name,String email,String password){
        onClick(checkBoxSelection);
        fillInput(nameInput,name);
        fillInput(passwordInput,password);
        dropDownSelection(getDropDownElementSelection(daysDropDown),1);
        dropDownSelection(getDropDownElementSelection(monthsDropDown),3);
        dropDownSelection(getDropDownElementSelection(yearsDropDown),2);
        onClick(newsLetterElement);
        onClick(offersElement);
        fillInput(firstName,"so8nn");
        fillInput(lastName,"elkabbany");
        fillInput(company,"bugzy");
        fillInput(address1,"sporting");
        fillInput(address2,"smouha");
        dropDownSelection(getDropDownElementSelection(country),2);
        fillInput(state,"Eg");
        fillInput(city,"Alex");
        fillInput(zipCode,"111");
        fillInput(mobileNumber,"1111444");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }

    public AccountCreatedConfirmationPage createAccount(){
        driver.findElement(createAccountElement).click();
        return new AccountCreatedConfirmationPage(driver);
    }

    private void fillInput(By element,String userInput){
        driver.findElement(element).sendKeys(userInput);
    }

    private void onClick(By element){
        driver.findElement(element).click();
    }

    private void dropDownSelection(Select select,int index){
        select.selectByIndex(index);
    }

}
