package com.cydeo.tests.selenium_practice.socialMedias;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class youTube_example3 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://youtube.com");

        WebElement enterSomething  = driver.findElement(By.xpath("//input[@id='search']"));
        enterSomething.sendKeys("Aslamboi");
        enterSomething.sendKeys(Keys.ENTER);

        WebElement enterVideo = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        enterVideo.click();

    }
}
