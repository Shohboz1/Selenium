package com.cydeo.tests.selenium_homeworks.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T6_SelectValue {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectValue() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        driver.findElement(By.linkText("Dropdown link")).click();
        driver.findElement(By.linkText("Facebook")).click();

        System.out.println("driver.getTitle() = " + driver.getTitle());


    }

    @AfterMethod
    public void tearDropdown(){
        driver.quit();
    }

}
