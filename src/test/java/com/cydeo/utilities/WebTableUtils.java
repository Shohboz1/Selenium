package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class WebTableUtils {

    //Method #1 info:
    //* Name: returnOrderData()
    //* Return type: String
    //* Arg1: WebDriver driver
    //* Arg2: String costumerName
    // This method should accept a costumerName and return the costumer order data as a String
    public static String returnOrderData(WebDriver driver, String costumerName){

        String locator = "//td[.='" + costumerName + "']/following-sibling::td[3]";
        WebElement costumerOrderData = driver.findElement(By.xpath(locator));

        return costumerOrderData.getText();
    }

    //Method #2 info:
    //* Name: orderVerify()
    //* Return type: void
    //* Arg1: WebDriver driver
    //* Arg2: String costumerName
    //* arg3: String expectedOrderData
    // This method should accept above mentioned arguments and internally assert
    // expectedOrderData matching actualOrderData
    public static void orderVerify(WebDriver driver, String costumerName, String expectedOrderData){

        WebElement customerOrderData =
                driver.findElement(By.xpath("//td[.='" + costumerName + "']/following-sibling::td[3]"));

        String actualOrderData = customerOrderData.getText();

        Assert.assertEquals(actualOrderData, expectedOrderData);


    }



}
