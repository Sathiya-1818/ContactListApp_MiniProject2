package page;

import base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestResult;

public class LoginPage extends ProjectSpecification {
    public LoginPage(WebDriver driver){
        this.driver = driver;
    }
    public LoginPage mail(String mailId){
        driver.findElement(By.id("Email")).sendKeys(mailId);
        return this;
    }
    public LoginPage Password(String password) {
        driver.findElement(By.id("Password")).sendKeys(password);
        return this;
    }
    public HomePage LoginButton() {
        driver.findElement(By.xpath("//input[contains(@class,'login-button')]")).click();
        return new HomePage(driver);
    }

}
