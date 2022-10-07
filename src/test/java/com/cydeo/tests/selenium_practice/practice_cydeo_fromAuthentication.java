package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_fromAuthentication {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");
    }

    @Test
    public void codePart() throws InterruptedException {
        WebElement searchLoginAndClick = driver.findElement(By.xpath("//a[@href='/login']"));
        searchLoginAndClick.click();

        Thread.sleep(2000);
        WebElement enterEmail = driver.findElement(By.xpath("//input[@name='username']"));
        enterEmail.sendKeys("tomsmith");

        Thread.sleep(2000);
        WebElement enterPassword = driver.findElement(By.cssSelector("input[name='password']"));
        enterPassword.sendKeys("SuperSecretPassword");

        Thread.sleep(2000);
        WebElement clickLoginBtn = driver.findElement(By.id("wooden_spoon"));
        clickLoginBtn.click();

        Thread.sleep(2000);
        WebElement searchHomeBtn = driver.findElement(By.cssSelector("a[class='nav-link']"));
        searchHomeBtn.click();

    }

    @AfterMethod
    public void finishCode(){
        driver.quit();
    }
}
