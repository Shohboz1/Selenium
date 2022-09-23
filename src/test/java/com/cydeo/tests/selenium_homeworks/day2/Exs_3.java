package com.cydeo.tests.selenium_homeworks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exs_3 {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement searchGMAIL = driver.findElement(By.className("gb_d"));
        searchGMAIL.sendKeys("Gmail" + Keys.ENTER);

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.contains(expectedTitle) ? "Title verification is PASSED" : "Title verification is FAILED");

        driver.navigate().back();

        String expectedName = "Google";
        String actualName = driver.getTitle();

        System.out.println(actualName.equals(expectedName) ? "PASSED" : "FAILED");


      //  driver.quit();
    }
}
