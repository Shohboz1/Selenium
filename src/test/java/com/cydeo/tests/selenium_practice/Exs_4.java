package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exs_4 {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://wiq.ru/");
    }

    @Test
    public void code(){

        WebElement searchNewOrderBtn = driver.findElement(By.xpath("//a[(@class='btn btn-mod btn-border btn-medium btn-round')][1]"));
        searchNewOrderBtn.click();

    }
    @AfterMethod
    public void tearUp(){
        driver.quit();
    }
}
