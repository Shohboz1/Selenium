package com.cydeo.tests.day12_actions_javascriptexecutor;

import com.cydeo.utilities.BrowserUtil;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractice {

        @Test
        public void task_4_and_5_test(){
            com.cydeo.utilities.Driver.getDriver().get("https://practice.cydeo.com/");

            Actions actions = new Actions(com.cydeo.utilities.Driver.getDriver());

            WebElement cydeoLink = com.cydeo.utilities.Driver.getDriver().findElement(By.linkText("CYDEO"));

            actions.moveToElement(cydeoLink).perform();

            BrowserUtil.sleep(3);

            actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP, Keys.PAGE_UP).perform();

            Driver.closeDriver();
    }
}
