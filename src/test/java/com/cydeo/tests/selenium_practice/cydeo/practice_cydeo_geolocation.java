package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_geolocation {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com");

        WebElement searchGoeLocation = driver.findElement(By.xpath("//a[@href='/geolocation']"));
        searchGoeLocation.click();

        WebElement clickWhereAmI = driver.findElement(By.cssSelector("button[onclick='getLocation()']"));
        clickWhereAmI.click();

        WebElement clickSeeItOnGoogle = driver.findElement(By.xpath("//a[@href='http://maps.google.com/?q=41.2994958,69.2400734']"));
        clickSeeItOnGoogle.click();





    }
}
