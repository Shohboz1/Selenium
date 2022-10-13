package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class youTube_example {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://www.youtube.com");

        WebElement searchBox = driver.findElement(By.cssSelector("input[id='search']"));
        searchBox.sendKeys("اجمل اغنية تركية ( لا لا لاااا لا لا ) كاملة مترجمه عربي");
        searchBox.sendKeys(Keys.ENTER);











    }
}
