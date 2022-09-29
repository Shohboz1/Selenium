package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Exs_3 {
    public static void main(String[] args) throws Exception {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://codingbat.com/java");

        Thread.sleep(4000);
        WebElement searchEmail = driver.findElement(By.cssSelector("input[name='uname']"));
        searchEmail.sendKeys("faxrjonmadaliyev20012112@gmail.com" + Keys.ENTER);

        Thread.sleep(4000);
        WebElement searchPassword = driver.findElement(By.cssSelector("input[name='pw']"));
        searchPassword.sendKeys("945670108" + Keys.ENTER);

        Thread.sleep(4000);
        WebElement searchLoginButton = driver.findElement(By.cssSelector("input[name='dologin']"));
        searchLoginButton.click();


    }
}
