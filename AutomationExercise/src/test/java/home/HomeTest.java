package home;

import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AccountCreatedConfirmationPage;
import pages.LoginFormPage;
import pages.ProductsPage;
import pages.SignUpLoginPage;

public class HomeTest extends BaseTest {
    SignUpLoginPage signUpLoginPage;
    @Test
    public void openPage(){
        signUpLoginPage= homePage.clickOnSignupLoginPage();
        Assert.assertTrue(signUpLoginPage.checkNewUserTextVisibility());
        signUpLoginPage.enterName("so8nn");
        signUpLoginPage.enterEmailAddress("so8nn11@gmail.com");
        LoginFormPage loginFormPage=signUpLoginPage.clickOnSignup();
        Boolean isTitleDisplayed=loginFormPage.checkTitleExistence();
        Assert.assertTrue(isTitleDisplayed);
        loginFormPage.fillAccountInformationForm("","so8nn11@gmail.com","1234567");
        AccountCreatedConfirmationPage accountCreatedConfirmationPage=loginFormPage.createAccount();
       Assert.assertTrue(accountCreatedConfirmationPage.verifyTitleVisibility());
        ProductsPage productsPage= accountCreatedConfirmationPage.clickContinue();
        Assert.assertEquals(productsPage.verifyUserName(),"so8nn");
        productsPage.deleteAccountButton();

    }
    @Test
    public void enterData(){
//        signUpLoginPage.enterEmailAddress("yasmina.mohamed@gmail.com");
//        signUpLoginPage.clickOnSignup();


    }

}
