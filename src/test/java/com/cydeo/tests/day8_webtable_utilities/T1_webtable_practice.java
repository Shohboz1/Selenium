package com.cydeo.tests.day8_webtable_utilities;

import com.cydeo.utilities.WebDriverFactory;
import com.cydeo.utilities.WebTableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_webtable_practice {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //1. Go to https://practice.cydeo.com/web-tables
        driver.get("https://practice.cydeo.com/web-tables");

    }
    @Test
    public void codePart(){
        //2. Verify Bob's name is listed as expected.
        WebElement clickName = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_orderGrid_ctl07_OrderSelector']"));
        clickName.click();
        //   Expected: "Bob Martin"
        String expectedName = "Bob Martin";
        String actualName = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='Bob Martin']")).getText();

        System.out.println(actualName.equals(expectedName) ? "Name verification is Passed" : "Name verification is Failed");
        //3. Verify Bob Martin's order data is as expected.
        // Expected: 21/31/2022

        WebElement data = driver.findElement(By.xpath("//table[@id='ctl00_MainContent_orderGrid']//td[.='12/31/2021']"));
        String expectedData = "12/31/2021";
        String actualData = data.getText();

        System.out.println(actualData.equals(expectedData) ? "Data verification is Passed" : "Data verification is Failed");

    }

    @Test
    public void codePart2(){
        String customerOrderData1 = WebTableUtils.returnOrderData(driver, "Alexandra Gray");
        System.out.println("customerOrderData1 = " + customerOrderData1);
    }

    @Test
    public void codePart3(){
        WebTableUtils.orderVerify(driver, "Ned Stark", "05/12/2021");
    }

    @AfterMethod
    public void finishCode(){ driver.quit();}
}
