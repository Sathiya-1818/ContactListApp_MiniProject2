package page;

import base.ProjectSpecification;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class AddContact extends ProjectSpecification {

    public AddContact(WebDriver ldriver)
    {
        this.driver = ldriver;
    }
    public AddContact contactAddbtn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"add-contact\"]")));
        element.click();
        return new AddContact(driver);
    }
    public AddContact contactFirstName(String fname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.sendKeys(fname);
        return this;
    }
    public AddContact contactLastName(String lname)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"lastName\"]")));
        element.sendKeys(lname);
        return this;
    }
    public AddContact contactDOB(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"birthdate\"]")));
        element.sendKeys(name);
        return this;
    }
    public AddContact contactEmail(String domain)
    {
        Random random = new Random();
        int uniqueNumber = random.nextInt(1000000);
        System.out.println(uniqueNumber + "@" + domain);
        String emailID=uniqueNumber + "@" + domain;

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"email\"]")));
        element.sendKeys(emailID);
        return this;
    }
    public AddContact contactPhone(int num)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"phone\"]")));
        element.sendKeys(String.valueOf(num));
        return this;
    }
    public AddContact contactAdd1(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"street1\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public AddContact contactAdd2(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"street2\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public AddContact contactCity(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"city\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public AddContact contactState(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"stateProvince\"]")));
        element.sendKeys(String.valueOf(name));
        return this;
    }
    public AddContact contactPostalCode(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"postalCode\"]")));
        element.sendKeys(name);
        return this;
    }
    public AddContact contactCountry(String name)
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"country\"]")));
        element.sendKeys(name);
        return this;
    }
    public AddContact contactSubmit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"submit\"]")));
        element.click();
        return this;
    }
    public AddContact contactOrderVerify()
    {
        List<WebElement> contactElements = driver.findElements(By.cssSelector(".contacts > div"));
        // Adjust the selector based on how the contacts are displayed

        // Extract contact names into a list
        List<String> actualContactNames = new ArrayList<>();
        for (WebElement contact : contactElements) {
            actualContactNames.add(contact.getText());
            System.out.println("Contact Name:   "+actualContactNames.add(contact.getText()));
        }

        // Create a copy and sort it
        List<String> sortedContactNames = new ArrayList<>(actualContactNames);
        Collections.sort(sortedContactNames);

        // Compare original and sorted lists
        if (actualContactNames.equals(sortedContactNames)) {
            System.out.println("Contacts are in alphabetical order.");
        } else {
            System.out.println("Contacts are NOT in alphabetical order.");
        }
        return this;
    }
    public AddContact contactOpen()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")));
        element.click();
        return this;
    }
    public AddContact contactEdit()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"edit-contact\"]")));
        element.click();
        return this;
    }
    public AddContact contactEditFirstName(String name) throws InterruptedException
    {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Edit Contact')]")));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id=\"firstName\"]")));
        element.clear();
        element.sendKeys(name);
        return this;
    }
    public AddContact contactReturn()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"return\"]")));
        element.click();
        return this;
    }
    public AddContact contactEditVerify()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[1]/td[2]")));
        String ele = element.getText();
        Assert.assertEquals(ele, "Arun New Kumar", "Page title does not match!");

        return this;
    }
    public AddContact contactOpen2() throws InterruptedException
    {
        Thread.sleep(3000);
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"myTable\"]/tr[2]/td[2]")));
        element.click();
        return this;
    }
    public AddContact contactDelete()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"delete\"]")));
        element.click();
        return this;
    }
    public AddContact contactDeleteok()
    {
        Alert alert = driver.switchTo().alert();
        alert.accept();
        return this;
    }
    public AddContact Logout() throws InterruptedException
    {
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"logout\"]")).click();
        return this;
    }

    public AddContact contactLoginScreen()
    {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id=\"signup\"]")));
        System.out.println("Logout Successfully...!!!");
        return this;
    }

}
