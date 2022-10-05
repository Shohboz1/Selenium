package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_multipleButtons { //
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        WebElement searchMultipleButtons = driver.findElement(By.xpath("//a[@href='/multiple_buttons']"));
        searchMultipleButtons.click();

        WebElement clickButton1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickButton1.click();

        WebElement becomingText = driver.findElement(By.xpath("//p[@id='result']"));

        if (becomingText.isDisplayed()){
            System.out.println("PASSED!");
        }else{
            System.out.println("FAILED!");
        }








    }
}
