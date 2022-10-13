package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class instagram_example {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://instagram.com");

        WebElement clickSignUpBtn = driver.findElement(By.linkText("Sign up"));
        clickSignUpBtn.click();

        WebElement enterEmail = driver.findElement(By.name("emailOrPhone"));
        enterEmail.sendKeys("aslamyobr@gmail.com");

        WebElement enterFullName = driver.findElement(By.name("fullName"));
        enterFullName.sendKeys("Aslam Yobr");

        WebElement enterUsername = driver.findElement(By.name("username"));
        enterUsername.sendKeys("aslamyobr_N1");

        WebElement enterPassword = driver.findElement(By.name("password"));
        enterPassword.sendKeys("aslamyobrmaytab");

        Thread.sleep(1000);
        WebElement clickSignUpBtn1 = driver.findElement(By.cssSelector("//button[@type='submit']"));
        clickSignUpBtn.click();



    }
}
