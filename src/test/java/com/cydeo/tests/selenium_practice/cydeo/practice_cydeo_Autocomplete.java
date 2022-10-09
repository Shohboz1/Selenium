package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_Autocomplete {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/autocomplete");

        Thread.sleep(3000);
        WebElement enterCountry = driver.findElement(By.id("myCountry"));
        enterCountry.sendKeys("Uzbekistan" + Keys.ENTER);

        Thread.sleep(1000);
        WebElement pressSubmitBtn = driver.findElement(By.xpath("//input[@type='button']"));
        pressSubmitBtn.click();

        String actualText = driver.findElement(By.cssSelector("p[id='result']")).getText();
        String expectedText = "You selected: Uzbekistan";

        if (actualText.equals(expectedText)){
            System.out.println("Country verification PASSED");
        }else{
            System.out.println("Country verification FAILED");
        }

        driver.quit();
    }
}
