package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {
    public static void login_crm(WebDriver driver){
        //2. Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement enterUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        enterUserName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password. UserUser
        WebElement enterPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        enterPassword.sendKeys("UserUser");

        //5. Click t login button
        WebElement clickLoginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        clickLoginBtn.click();

        //6. Verify title is as expected.
        // Expected: Portal
        BrowserUtilities.verifyTitle(driver, "Portal");

    }

    public static void login_crm(WebDriver driver, String username, String password){

        //2. Go to https://login1.nextbasecrm.com/
        driver.get("https://login1.nextbasecrm.com/");

        //3. Enter valid username
        WebElement enterUserName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        enterUserName.sendKeys("hr2@cydeo.com");

        //4. Enter valid password. UserUser
        WebElement enterPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        enterPassword.sendKeys("UserUser");

        //5. Click t login button
        WebElement clickLoginBtn = driver.findElement(By.xpath("//input[@class='login-btn']"));
        clickLoginBtn.click();

        //6. Verify title is as expected.
        // Expected: Portal
        BrowserUtilities.verifyTitle(driver, "Portal");
    }
}
