package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T3_GoogleSearch {
    public static void main(String[] args) {

        //1. Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        //2. Go to https://google.com
        driver.get("https://google.com");

        //3. Write "apple" in search box
        //4. use Keys.ENTER to search
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple 14 pro max vs 13 pro max" + Keys.ENTER);

        //5. Verify title: Expected: Title should start with "apple" word
        String expectedInTitle = "apple";
        String actualInTitle = driver.getTitle();

        System.out.println(actualInTitle.startsWith(expectedInTitle) ? "Title verification PASSED" : "Title verification Failed");

    }
}
