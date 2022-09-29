package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exs_1 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='search']"));
        searchBox.sendKeys("indila");
        searchBox.sendKeys(Keys.ENTER);

       WebElement enterMusic = driver.findElement(By.className("Indila - Dernière Danse (Clip Officiel)"));
       enterMusic.click();







    }
}
