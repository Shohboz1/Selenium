package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_Locators_getText {
    public static void main(String[] args) {

        // 1- Open a chrome browser
    //    WebDriverManager.chromedriver().setup();
    //    WebDriver driver = new ChromeDriver();
    //    driver.manage().window().maximize();
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        // 2- Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        // 3- Enter incorrect username: "incorrect"
        WebElement username = driver.findElement(By.className("login-inp"));
        username.sendKeys("incorrect@gmail.com" + Keys.ENTER);

        // 4- Enter incorrect password. "incorrect"
        WebElement password = driver.findElement(By.name("USER_PASSWORD"));
        password.sendKeys("incorrect" + Keys.ENTER);

        // 5- click to login button.
        WebElement touchButton = driver.findElement(By.className("login-btn"));
        touchButton.click();

        // 6- Verify error message text is as expected
            // Expected: Incorrect login or password
        String expected = "Incorrect login or password";
        String actual = driver.findElement(By.className("errortext")).getText();

        System.out.println(actual.equals(expected) ? "PASSED" : "FAILED");

        driver.quit();
    }
}
