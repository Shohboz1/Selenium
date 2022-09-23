package com.cydeo.tests.day3_locators_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_Attribute {
    public static void main(String[] args) {

         WebDriver driver = WebDriverFactory.getDriver("chrome");
         driver.manage().window().maximize();

         driver.get("https://login1.nextbasecrm.com/");

        WebElement rememberMeLabel = driver.findElement(By.className("login-item-checkbox-label"));

        String expectedRememberMeLabel = "Remember me on this computer";
        String actualRememberMeLabel = rememberMeLabel.getText();

        System.out.println(actualRememberMeLabel.equals(expectedRememberMeLabel) ? "Remember me label text verification passed" : "Remember me label text verification failed");

        WebElement forgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedForgotPassword = "Forgot your password?";
        String actualForgotPassword = forgotPassword.getText();
        if (actualForgotPassword.equals(expectedForgotPassword)){
            System.out.println("Forgot password link text verification passed");
        } else {
            System.out.println("Forgot password link text verification passed");
        }

        String expectedInHref = "forgot_password=yes";
        String actualInHref = forgotPassword.getAttribute("href");

        if (actualInHref.contains(expectedInHref)){
            System.out.println("href attribute value verification is passed");
        }else{
            System.out.println("href attribute value verification is failed");
        }


       // driver.quit();


    }
}
