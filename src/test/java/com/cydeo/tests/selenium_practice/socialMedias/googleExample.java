package com.cydeo.tests.selenium_practice.socialMedias;

import com.cydeo.tests.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class googleExample extends TestBase {

    @Test
    public void code(){

        driver.get("https://www.google.com");

        WebElement enterSomething = driver.findElement(By.cssSelector("input[name='q']"));
        enterSomething.sendKeys("youtube" + Keys.ENTER);

        WebElement clickYoutubeBtn = driver.findElement(By.xpath("(//h3[@class='LC20lb MBeuO DKV0Md'])[1]"));
        clickYoutubeBtn.click();

        WebElement video = driver.findElement(By.cssSelector("input[name='search_query']"));
        video.sendKeys("اغنية مهراب الوداع حزينة _ 『");
        video.sendKeys(Keys.ENTER);

        WebElement clickVideo = driver.findElement(By.xpath("(//a[@id='video-title'])[1]"));
        clickVideo.click();





    }


}
