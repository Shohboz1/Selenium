package com.cydeo.tests.selenium_practice;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class music {

    WebDriver driver;
    @BeforeMethod
    public void setUpD(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.youtube.com");
    }

    @Test
    public void getting_music_text(){
        driver.findElement(By.xpath("//input[@id='search']")).sendKeys("go gyal");
        driver.findElement(By.xpath("//button[@class='style-scope ytd-searchbox']")).click();
        driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]")).click();
        String text = driver.findElement(By.xpath("(//*[contains(@title,'Ahzee – Go Gyal (Official Music Video) (HD) (HQ)')])[2]")).getText();
        System.out.println(text);
    }
}
