package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.HomePage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BaseTest {
private ChromeDriver driver;
public HomePage homePage;

@BeforeClass
public void setup(){
System.setProperty("webdriver.chrome.driver","./resources/chromedriver.exe");
driver=new ChromeDriver();
goHome();
}

@BeforeMethod
public void goHome(){
driver.get("https://www.automationexercise.com/test_cases");

homePage=new HomePage(driver);
}

@AfterClass
public void quit(){
driver.quit();
}
}
