package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_multipleButtons1 {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");
    }

    @Test
    public void codePart() throws InterruptedException {
        Thread.sleep(2000);
        WebElement searchMultiple = driver.findElement(By.xpath("//a[@href='/multiple_buttons']"));
        searchMultiple.click();

        Thread.sleep(2000);
        WebElement clickButton1 = driver.findElement(By.xpath("//button[@onclick='button1()']"));
        clickButton1.click();

        String actualText1 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText1 = "Clicked on button one!";

        System.out.println(actualText1.equals(expectedText1) ? "1. Passed" : "1. Failed");

        Thread.sleep(2000);
        WebElement clickButton2 = driver.findElement(By.xpath("//button[@onclick='button2()']"));
        clickButton2.click();

        String actualText2 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText2 = "Clicked on button two!";

        System.out.println(actualText2.equals(expectedText2) ? "2. Passed" : "2. Failed");

        Thread.sleep(2000);
        WebElement clickButton3 = driver.findElement(By.xpath("//button[@onclick='button3()']"));
        clickButton3.click();

        String actualText3 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText3 = "Clicked on button three!";

        System.out.println(actualText3.equals(expectedText3) ? "3. Passed" : "3. Failed");

        Thread.sleep(2000);
        WebElement clickButton4 = driver.findElement(By.xpath("//button[@onclick='button4()']"));
        clickButton4.click();

        String actualText4 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText4 = "Clicked on button four!";

        System.out.println(actualText4.equals(expectedText4) ? "4. Passed" : "4. Failed");

        Thread.sleep(2000);
        WebElement clickButton5 = driver.findElement(By.xpath("//button[@onclick='button5()']"));
        clickButton5.click();

        String actualText5 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText5 = "Clicked on button five!";

        System.out.println(actualText5.equals(expectedText5) ? "5. Passed" : "5. Failed");

        Thread.sleep(2000);
        WebElement clickDoNotClickBtn = driver.findElement(By.xpath("//button[@onclick='button6()']"));
        clickDoNotClickBtn.click();

        String actualText6 = driver.findElement(By.xpath("//p[@id='result']")).getText();
        String expectedText6 = "Now it's gone!";

        System.out.println(actualText6.equals(expectedText6) ? "Passed" : "Failed");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
