package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class codingbat_example2 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.google.com");
    }

    @Test
    public void code() throws InterruptedException {
        Thread.sleep(2000);
        WebElement enterCodingBat = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        enterCodingBat.sendKeys("codingbat");
        enterCodingBat.sendKeys(Keys.ENTER);

        WebElement clickCodingBat = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        clickCodingBat.click();

        Thread.sleep(2000);
        WebElement createNewAccaunt = driver.findElement(By.linkText("create account"));
        createNewAccaunt.click();

        Thread.sleep(2000);
        WebElement enterEmail = driver.findElement(By.xpath("//input[@type='text']"));
        enterEmail.sendKeys("dostiyevoshna@gmail.com");

        Thread.sleep(2000);
        WebElement enterPassword = driver.findElement(By.xpath("//input[@type='password']"));
        enterPassword.sendKeys("shoh2oo6shigi0108");

        Thread.sleep(2000);
        WebElement clickShowOrHide = driver.findElement(By.xpath("//button"));
        clickShowOrHide.click();

        Thread.sleep(2000);
        WebElement clickSubmitBtn = driver.findElement(By.xpath("//input[@type='submit']"));
        clickSubmitBtn.click();

        Thread.sleep(2000);
        WebElement clickWarmup1 = driver.findElement(By.linkText("Warmup-1"));
        clickWarmup1.click();

        Thread.sleep(2000);
        WebElement clickSleepIn = driver.findElement(By.linkText("sleepIn"));
        clickSleepIn.click();

        Thread.sleep(2000);
        WebElement enterCode = driver.findElement(By.xpath("//textarea[@class='ace_text-input']"));
        enterCode.sendKeys("return !weekday && !vacation ? true : weekday && !vacation ? false :\n" +
                "    !weekday && vacation ? true : true;");

        Thread.sleep(2000);
        WebElement clickGo = driver.findElement(By.xpath("(//button[@class='go'])[1]"));
        clickGo.click();








    }
}
