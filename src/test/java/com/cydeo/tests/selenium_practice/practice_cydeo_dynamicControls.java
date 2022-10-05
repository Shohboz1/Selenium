package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_dynamicControls {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/dynamic_controls");

        Thread.sleep(2000);
        WebElement searchCheckbox = driver.findElement(By.xpath("//*[@id='checkbox']"));
        searchCheckbox.click();

        Thread.sleep(3000);
        WebElement clickRemoveBtn = driver.findElement(By.xpath("//button[@onclick='swapCheckbox()']"));
        clickRemoveBtn.click();








    }
}
