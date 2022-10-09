package com.cydeo.tests.selenium_practice.cydeo;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class practice_cydeo_registrationForm {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://practice.cydeo.com/");

        WebElement searchRegistrationForm = driver.findElement(By.xpath("//a[@href='/registration_form']"));
        searchRegistrationForm.click();

        WebElement enterFirstName = driver.findElement(By.name("firstname"));
        enterFirstName.sendKeys("Shahboz");

        WebElement enterLastName = driver.findElement(By.name("lastname"));
        enterLastName.sendKeys("Rejabaliyev");

        WebElement enterUsername = driver.findElement(By.name("username"));
        enterUsername.sendKeys("Rejabaliyev_sh");

        WebElement enterEmail = driver.findElement(By.name("email"));
        enterEmail.sendKeys("rejabaliyevshohbozbek2006@gmail.com");

        WebElement enterPassword = driver.findElement(By.name("password"));
        enterPassword.sendKeys("shoh2oo6shigio1o8");

        WebElement enterPhoneNumber = driver.findElement(By.name("phone"));
        enterPhoneNumber.sendKeys("+998-94-567-0108");

        WebElement selectGender = driver.findElement(By.xpath("(//input[@name='gender'])[1]"));
        selectGender.click();

        WebElement enterBirthData = driver.findElement(By.name("birthday"));
        enterBirthData.sendKeys("02/23/2006");














    }
}
