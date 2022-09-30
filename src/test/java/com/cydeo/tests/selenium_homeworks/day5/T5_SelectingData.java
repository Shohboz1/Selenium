package com.cydeo.tests.selenium_homeworks.day5;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_SelectingData {

    WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void selectData() throws InterruptedException {
        driver.get("https://practice.cydeo.com/dropdown");

        Thread.sleep(3000);
        Select data = new Select(driver.findElement(By.id("year")));
        data.selectByVisibleText("1923");

        Thread.sleep(3000);
        Select month = new Select(driver.findElement(By.id("month")));
        month.selectByValue("11");

        Thread.sleep(3000);
        Select day = new Select(driver.findElement(By.id("day")));
        day.selectByIndex(0);

    }

    @AfterMethod
    public void tearDropdown(){
        driver.quit();
    }






}
