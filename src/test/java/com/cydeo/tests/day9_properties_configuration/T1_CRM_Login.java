package com.cydeo.tests.day9_properties_configuration;

import com.cydeo.tests.base.TestBase;
//import com.cydeo.utilities.BrowserUtilities;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T1_CRM_Login extends TestBase {

    @Test
    public void crm_login_test(){
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
        // BrowserUtil.verifyTitle(driver, "Portal");



    }
}
