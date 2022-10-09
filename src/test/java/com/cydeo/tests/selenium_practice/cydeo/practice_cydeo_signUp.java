package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_signUp {

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
        WebElement searchSignUp = driver.findElement(By.xpath("//a[@href='/sign_up']"));
        searchSignUp.click();

        Thread.sleep(2000);
        WebElement enterFullName = driver.findElement(By.cssSelector("input[type='text']"));
        enterFullName.sendKeys("Rejabaliyev Shohbozbek");

        Thread.sleep(2000);
        WebElement enterEmail = driver.findElement(By.xpath("//input[@type='email']"));
        enterEmail.sendKeys("rejabaliyevshohbozbek2006@gmail.com");

        WebElement clickSignUp = driver.findElement(By.xpath("//button[@class='radius']"));
        clickSignUp.click();




    }
}
