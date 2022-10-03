package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Flip_Example {

       WebDriver driver;


    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://flip.com/cb9bc4e2");
    }

    @Test
    public void code(){
        WebElement joinWithGoogleBtn = driver.findElement(By.xpath("//a[@data-testid='googleAuthLink__anchor__login']"));
        joinWithGoogleBtn.click();

        WebElement enterEmail = driver.findElement(By.cssSelector("input[type='email']"));
        enterEmail.sendKeys("rejabaliyevshohbozbek2006@gmail.com" + Keys.ENTER);

    }

    @AfterMethod
    public void tearUp(){
        driver.quit();
    }


}
