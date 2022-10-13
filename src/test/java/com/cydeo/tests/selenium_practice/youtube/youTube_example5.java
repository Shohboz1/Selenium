package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class youTube_example5 {
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
        WebElement enterYouTube = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
        enterYouTube.sendKeys("youtube.com");
        enterYouTube.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement clickYoutube = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        clickYoutube.click();

        Thread.sleep(2000);
        WebElement enterNameOfVideo = driver.findElement(By.xpath("//input[@id='search']"));
        enterNameOfVideo.sendKeys("Tom & Jerry");
        enterNameOfVideo.sendKeys(Keys.ENTER);

        Thread.sleep(2000);
        WebElement enterFilm = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        enterFilm.click();







    }
}
