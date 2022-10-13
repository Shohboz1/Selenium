package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class youTube_example2 {
    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://youtube.com");
    }
    @Test
    public void mainCode(){
        WebElement enterNameOfSomething = driver.findElement(By.xpath("//input[@id='search']"));
        enterNameOfSomething.sendKeys("اجمل اغنية تركية ( لا لا لاااا لا لا ) كاملة مترجمه عربي");
        enterNameOfSomething.sendKeys(Keys.ENTER);

        WebElement clickMusic = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        clickMusic.click();



    }
}
