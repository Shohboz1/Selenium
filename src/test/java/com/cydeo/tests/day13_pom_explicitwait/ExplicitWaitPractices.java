package com.cydeo.tests.day13_pom_explicitwait;

import com.cydeo.pages.DynamicallyLoadedPage_7;
import com.cydeo.pages.DynamicallyLoadedPage1;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {

    @Test
    public void dynamically_loaded_page_elements_7_test() throws InterruptedException {
        //1. Go to https://practice.cydeo.com/dynamic_loading/7
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/7");

        //2. wait until title is "Dynamic title"
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

        wait.until(ExpectedConditions.titleIs("Dynamic title"));

        //3. Assert: Message "Done" is Displayed
        DynamicallyLoadedPage_7 obj = new DynamicallyLoadedPage_7();

        Assert.assertTrue(obj.doneMessage.isDisplayed());

        //4. Assert: Image is Displayed
        Thread.sleep(5000);
        Assert.assertTrue(obj.spongeBobImage.isDisplayed());

    }

    @Test
    public void dynamically_loaded_page_elements_1_test(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_loading/1");

        DynamicallyLoadedPage1 dynamicallyLoadedPage1 = new DynamicallyLoadedPage1();
        dynamicallyLoadedPage1.startButton.click();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(dynamicallyLoadedPage1.loadingBar));

    }


}
