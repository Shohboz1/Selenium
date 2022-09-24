package com.cydeo.tests.day4_xpath_findElements_checkbox;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_xpath_cssSelector {
    public static void main(String[] args) {

//       1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

//       2. Go to https://practice.cydeo.com/forgot_password
        driver.get("https://practice.cydeo.com/forgot_password");

//       3. Locate all the WebElements on the page using XPATH and / or CSS locator only (total of 6)
//       a. "Home" link
        // Locate using cssSelector with class attribute syntax #2
        WebElement homeLink1 = driver.findElement(By.cssSelector("a.nav-link"));

        // Locate using cssSelector with class attribute syntax #1
        WebElement homeLink2 = driver.findElement(By.cssSelector("a[class='nav-link']"));

        // Locate using xpath with class attribute syntax #1
        WebElement homeLink3 = driver.findElement(By.xpath("//a[@class='nav-link']"));

//       b. "Forgot password" header
        // Locate using cssSelector with class attribute syntax #1
        WebElement forgotPassword1 = driver.findElement(By.cssSelector("div[class='example']>h2"));

        // Locate using cssSelector with class attribute syntax #1
        // instead ////h2[text()='Forgot Password'] we can also write //h2[.='Forgot Password']
        WebElement forgotPassword2 = driver.findElement(By.cssSelector("div.example>h2"));

        // Locate using xpath with class attribute syntax #1
        WebElement forgotPassword3 = driver.findElement(By.xpath("//h2[.='Forgot Password']"));

        // Locate using xpath with class attribute from parent to child
        WebElement forgotPassword4 = driver.findElement(By.xpath("//div[@class='example']/h2"));

//       c. "E-mail" text
        // Locate using cssSelector with class attribute
        WebElement emailText1 = driver.findElement(By.xpath("//label[.='E-mail']"));

        //Locate using cssSelector with class attribute

//       d. E-mail input box
        WebElement emailInputBox = driver.findElement(By.xpath("//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}$']"));

       // WebElement emailInputBoz = driver.findElement(By.xpath("//input[contains(@pattern, 'a-z')]")); --> this is a short form of emailInputBox

//       e."Retrieve password" button
        WebElement retrievePassword = driver.findElement(By.cssSelector("button[id='form_submit']>i"));

//       f. "Powered by Cydeo" text
        WebElement poweredByCydeo = driver.findElement(By.xpath("//div[@style='text-align: center;']"));

//       4. Verify all web elements are displayed
        // isDisplayed() method return to boolean true/false
        System.out.println("homeLink1.isDisplayed() = " + homeLink1.isDisplayed());
        System.out.println("forgotPassword1.isDisplayed() = " + forgotPassword1.isDisplayed());
        System.out.println("emailText1.isDisplayed() = " + emailText1.isDisplayed());
        System.out.println("emailInputBox.isDisplayed() = " + emailInputBox.isDisplayed());
        System.out.println("retrievePassword.isDisplayed() = " + retrievePassword.isDisplayed());
        System.out.println("poweredByCydeo.isDisplayed() = " + poweredByCydeo.isDisplayed());


    }
}
