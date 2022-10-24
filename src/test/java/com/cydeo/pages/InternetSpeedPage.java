package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetSpeedPage {

    public void InternetSpeedPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // If you have white spaces in your locator in HTML, you can use "normalize-space()" for text of elements
    @FindBy (xpath = "//a[normalize-space()='Results']")
    public WebElement resultLink;

    @FindBy (xpath = "//span[.='Go']")
    public WebElement buttonGo;

    @FindBy (className = "gauge-speed-text")
    public WebElement gaugeSpeedNeedle;

    @FindBy (css = ".result-data-large.number.result-data-value.download-speed")
    public WebElement downloadSpeed;

    @FindBy (css = ".result-data-large.number.result-data-value.upload-speed")
    public WebElement uploadSpeed;
}
