package com.cydeo.tests.day13_pom_explicitwait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.ConfigretionReader;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LibraryLoginTest {

    LibraryLoginPage obj;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://library1.cydeo.com");
        obj = new LibraryLoginPage();
    }
    @Test
    public void required_field_error_message_test(){
        //1. Open a Chrome browser
        //2. Go to https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");

        //3. Do not enter any information
        //4. Click to "Sign in" button
        //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        obj.signInButton.click();

        //5. Verify expected error is displayed
        //Expected: The field is required.
        Assert.assertTrue(obj.fieldRequiredErrorMsg.isDisplayed());
    }

    @Test
    public void invalid_email_format_error_message_test(){
        //1. Open a Chrome browser
        //2. Go to https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");

        //3. Enter invalid email format
        //LibraryLoginPage libraryLoginPage = new LibraryLoginPage();

        obj.inputUsername.sendKeys("aslamyobr@gamil.com");
        obj.inputPassword.sendKeys("aslamyobr");
        obj.signInButton.click();

        //4. Verify expected error is displayed:
        //Expected: Please enter a valid
        Assert.assertTrue(obj.wrongEmailOrPasswordMsg.isDisplayed());
    }

    @Test
    public void library_negative_login_test(){
        //1. Open a Chrome browser
        //2. Go to https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");

        //3. Enter invalid email format
        // LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        obj.inputUsername.sendKeys("wrong@gmail.com");
        obj.inputPassword.sendKeys("wrongpassword");
        obj.signInButton.click();

        //4. Verify expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(obj.wrongEmailOrPasswordMsg.isDisplayed());

    }
    @Test
    public void library_positive_login_test(){
        //1. Open a Chrome browser
        //2. Go to https://library1.cydeo.com
        //Driver.getDriver().get("https://library1.cydeo.com");

        //3. Enter invalid email format
        // LibraryLoginPage libraryLoginPage = new LibraryLoginPage();
        obj.inputUsername.sendKeys(ConfigretionReader.getProperty("library.app.username"));
        obj.inputPassword.sendKeys(ConfigretionReader.getProperty("library.app.password"));
        obj.signInButton.click();

    }

    @AfterMethod
    public void tearDown() {
        Driver.closeDriver();
    }


}
