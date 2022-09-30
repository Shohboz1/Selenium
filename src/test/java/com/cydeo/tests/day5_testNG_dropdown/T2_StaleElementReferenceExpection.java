package com.cydeo.tests.day5_testNG_dropdown;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_StaleElementReferenceExpection {
    public static void main(String[] args) {

        //1. Open Chrome Browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2 Go to https://practice.cydeo.com/add_remove_elements/
        driver.get("https://practice.cydeo.com/add_remove_elements/");

        //3 Click to "Add element" button
        WebElement clickAddElementBtn = driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        clickAddElementBtn.click();

        //4 Verify "Delete" button is displayed after clicking
        WebElement deleteButton = driver.findElement(By.xpath("//button[@class='added-manually']"));

        //5 Click to "Delete" button
        deleteButton.click();

        //6 Verify "Delete" button is NOT displayed after clicking, USE
        try{
            System.out.println("deleteButton.isDisplayed() = " + deleteButton.isDisplayed());
        }catch (StaleElementReferenceException sh){
            System.out.println("Stale Element Reference Exception is thrown and this is already expected");
        }

        driver.quit();






    }
}
