package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_statusCodes {

    WebDriver driver;

    @BeforeMethod
    public void setUp() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/status_codes");
    }

    @Test
    public void code() throws InterruptedException {

        Thread.sleep(3000);
        WebElement search200Btn = driver.findElement(By.xpath("//a[@href='status_codes/200']"));
        search200Btn.click();

        Thread.sleep(3000);
        WebElement searchHereBtn = driver.findElement(By.xpath("//a[@href='/status_codes']"));
        searchHereBtn.click();

        String actualText = driver.findElement(By.xpath("//div[@style='text-align: center;']")).getText();
        String expectedText = "Powered by CYDEO";

        System.out.println(actualText.equals(expectedText) ? "Text verification is PASSED" : "Text verification is FAILED");

        Thread.sleep(3000);
        WebElement searchCydeoBtn = driver.findElement(By.xpath("//a[@target='_blank']"));
        searchCydeoBtn.click();
    }

    @AfterMethod
    public void tearUp() {
        driver.quit();
    }
}
