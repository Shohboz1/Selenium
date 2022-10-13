package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class youTube_example4 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com");

        WebElement enterSomething = driver.findElement(By.cssSelector("input[id='search']"));
        enterSomething.sendKeys("BOBUR MANSUROV VINELAR TO'PLAMI 2022 // TIKTOK VINELAR TO'PLAMI 2022 // TIKTOK UZ #13");
        enterSomething.sendKeys(Keys.ENTER);

        WebElement clickVideo = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-renderer'])[1]"));
        clickVideo.click();

        String actualTitle = driver.findElement(By.xpath("(//yt-formatted-string[@class='style-scope ytd-video-primary-info-renderer'])[1]")).getText();
        String expectedTitle = "BOBUR MANSUROV VINELAR TO'PLAMI 2022 // TIKTOK VINELAR TO'PLAMI 2022 // TIKTOK UZ #13";

        if (actualTitle.equals(expectedTitle)){
            System.out.println("Title verification is PASSED!");
        }else{
            System.out.println("Title verification is FAILED!");
        }


    }
}
