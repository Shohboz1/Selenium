package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_autocomplete1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");
    }

    @Test
    public void codePart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement searchAutocomplete = driver.findElement(By.xpath("//a[@href='/autocomplete']"));
        searchAutocomplete.click();

        Thread.sleep(2000);
        WebElement enterCountry = driver.findElement(By.xpath("//input[@name='myCountry']"));
        enterCountry.sendKeys("Uzbekistan");
        enterCountry.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement clickSubmitBtn = driver.findElement(By.xpath("//input[@onclick='log()']"));
        clickSubmitBtn.click();

        String actualText = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText = "You selected: Uzbekistan";

        System.out.println(actualText.equals(expectedText) ? "Text verification is Passed!" : "Text verification is Failed!");

        String actualTitle = driver.getTitle();
        String expectedTitle = "Autocomplete";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else {
            System.out.println("Title verification is FAILED!");
        }
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
