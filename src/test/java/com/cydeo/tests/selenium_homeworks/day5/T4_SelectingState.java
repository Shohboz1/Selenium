package com.cydeo.tests.selenium_homeworks.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class T4_SelectingState {
    public static void main(String[] args) throws InterruptedException {

        //1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2 Go to http://practice.cybertekschool.com/dropdown
        driver.get("http://practice.cybertekschool.com/dropdown");

        Thread.sleep(3000);
        Select dropdown = new Select(driver.findElement(By.id("state")));
        dropdown.selectByVisibleText("Illinois");

        Thread.sleep(3000);
        dropdown.selectByValue("VA");

        Thread.sleep(3000);
        dropdown.selectByIndex(5);

        String actual = dropdown.getFirstSelectedOption().getText();
        String expected = "California";

        Assert.assertEquals(actual, expected);

        driver.quit();


    }
}
