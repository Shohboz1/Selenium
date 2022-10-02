package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exs_5 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/notification_message_rendered");
    }

    @Test
    public void code(){
        WebElement searchClickBtn = driver.findElement(By.cssSelector("a[href='/notification_message']"));
        searchClickBtn.click();

        WebElement searchSomething = driver.findElement(By.xpath("//div[@id='flash']"));

        if (searchSomething.isDisplayed()){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");
        }
    }



}
