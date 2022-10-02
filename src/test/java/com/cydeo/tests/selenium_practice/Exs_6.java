package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Exs_6 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/shifting_content");
    }

    @Test
    public void code(){
        WebElement search1 = driver.findElement(By.xpath("//a[@href='/shifting_content/menu']"));
        search1.click();

        String expected = "Shifting Content: Menu Element";
        String actual = driver.findElement(By.xpath("//h3")).getText();

        Assert.assertEquals(actual, expected, "Fail");

        WebElement searchGalleryBtn = driver.findElement(By.xpath("//a[@class='shift']"));
        searchGalleryBtn.click();

        String expectedDTitle = "Not Found";
        String actualTitle = driver.findElement(By.xpath("//h1")).getText();

        System.out.println(actualTitle.equals(expectedDTitle) ? "Expected title is Passed" : "Expected title is Failed");

    }

    @AfterMethod
    public void tearUp(){
        driver.quit();
    }
}
