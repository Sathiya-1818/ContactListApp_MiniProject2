package page;

import base.ProjectSpecification;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.ITestContext;
import org.testng.ITestResult;

import java.time.Duration;
import java.util.Random;

public class MainScreen extends ProjectSpecification {
    public void Mainscreen(WebDriver driver) {
        this.driver = driver;
    }
    public MainScreen clickDesktop()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//a[@href=\"/desktops\"])[4]")));
        element.click();
        return this;
    }
    public MainScreen AddContact()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@onclick=\"AjaxCart.addproducttocart_catalog('/addproducttocart/catalog/72/1/1    ');return false;\"]")));
        element.click();
        return this;
    }

    public MainScreen contactFirstName()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.sendKeys("Karnan");
        return this;
    }
    public MainScreen contactLastName()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"lastName\"]")));
        element.sendKeys("Athisivam");
        return this;
    }
    public MainScreen contactEmail(String domain)
    {
        Random random = new Random();
        int uniqueNumber = random.nextInt(1000000);
        System.out.println("Login Email ID: "+"sathya" + uniqueNumber + "@" + domain);
        String emailID="sathya" + uniqueNumber + "@" + domain;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        element.sendKeys(emailID);
        return this;
    }
    public MainScreen contactPassword(String password)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"password\"]")));
        element.sendKeys(password);
        return this;
    }
    public MainScreen contactSubmit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"submit\"]")));
        element.click();
        return this;
    }

}
