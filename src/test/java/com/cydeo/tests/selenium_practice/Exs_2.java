package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exs_2 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://agar.io/#ffa");

        WebElement settingsButton = driver.findElement(By.id("settingsButton"));
        settingsButton.click();

        WebElement region = driver.findElement(By.id("region"));
        region.click();

        WebElement findServer = driver.findElement(By.linkText("Turkey"));
        findServer.click();

        WebElement findXButton = driver.findElement(By.className("leagues-inner-close sprite-main Close"));
        findXButton.click();

        WebElement findPlayButton = driver.findElement(By.id("play"));
        findPlayButton.click();




    }
}
