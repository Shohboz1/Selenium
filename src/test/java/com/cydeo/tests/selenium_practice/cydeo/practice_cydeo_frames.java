package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_frames {

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
        WebElement searchFrames = driver.findElement(By.xpath("//a[@href='/frames']"));
        searchFrames.click();

        Thread.sleep(2000);
        WebElement clickNestedFrames = driver.findElement(By.linkText("Nested Frames"));
        clickNestedFrames.click();





    }

}
