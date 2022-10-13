package com.cydeo.tests.selenium_practice.youtube;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class youTube_example6 {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://www.youtube.com");

        WebElement enterVideoName = driver.findElement(By.xpath("//input[@id='search']"));
        enterVideoName.sendKeys("KO'RGAN SARI KO'RGING KELAR // SENATOR INSTAGRAM REAKSIYA");
        enterVideoName.sendKeys(Keys.ENTER);

        WebElement enterVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        enterVideo.click();



    }
}
