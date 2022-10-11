package com.cydeo.tests.day6_Window_webtables;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class T1_Windows {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void codePart(){

        //3. Assert: Title is "Windows"
        //Assert.assertEquals(driver.getTitle(), "Windows");
        String actualTitle = driver.getTitle();
        String expectedTitle = "Windows";
        Assert.assertEquals(actualTitle, expectedTitle);

        //4. Click to: "Click here" link
        driver.findElement(By.linkText("Click here")).click();

        //5. Click to: "CYDEO" link
        driver.findElement(By.linkText("CYDEO")).click();

        //6. Switch to cydeo page
        Set<String> allWindows = driver.getWindowHandles();
        for (String eachWindow : allWindows){
            driver.switchTo().window(eachWindow);
            System.out.println("driver.getTitle() = " + driver.getTitle());

            if (driver.getTitle().equals("Cydeo")){
                break;
            }
        }


        //7. Assert: Title is "Cydeo"

   //     actualTitle = driver.getTitle();
   //     expectedTitle = "Cydeo";
   //     Assert.assertEquals(actualTitle, expectedTitle);

        Assert.assertEquals(driver.getTitle(), "Cydeo");

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
