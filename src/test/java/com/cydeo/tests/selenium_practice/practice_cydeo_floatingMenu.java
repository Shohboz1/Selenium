package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_floatingMenu {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");
    }

    @Test
    public void codePart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement searchFloatingManu = driver.findElement(By.xpath("//a[@href='/floating_menu']"));
        searchFloatingManu.click();

        String actual = driver.findElement(By.xpath("//h3")).getText();
        String expected = "Floating Menu";

        System.out.println(actual.equals(expected) ? "Passed" : "Failed");

        Thread.sleep(2000);
        WebElement searchHomeBtn = driver.findElement(By.xpath("//a[@class='nav-link']"));
        searchHomeBtn.click();

        Thread.sleep(2000);
        WebElement multipleWindow = driver.findElement(By.xpath("//a[@href='/windows']"));
        multipleWindow.click();

        Thread.sleep(2000);
        WebElement searchClickHere = driver.findElement(By.xpath("//a[@href='/windows/new']"));
        searchClickHere.click();

        Thread.sleep(3000);
        WebElement newWindow = driver.findElement(By.xpath("//h3"));
        String actualText = newWindow.getText();
        String expectedText = "Opening a new window";

        if (actualText.equals(expectedText)){
            System.out.println("New Window verification is PASSED!");
        }else{
            System.out.println("New Window verification is FAILED!");
        }
        System.out.println(actualText);

    }

    @AfterMethod
    public void finishMethod(){
        driver.quit();
    }
}
