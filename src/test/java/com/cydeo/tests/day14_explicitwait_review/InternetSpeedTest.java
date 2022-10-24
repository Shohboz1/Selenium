package com.cydeo.tests.day14_explicitwait_review;

import com.cydeo.pages.InternetSpeedPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class InternetSpeedTest {

    @Test
    public void internet_speed_test(){
        Driver.getDriver().get("https://www.speedtest.net");

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        InternetSpeedPage internetSpeedPage = new InternetSpeedPage();

        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.resultLink));

        internetSpeedPage.buttonGo.click();

        wait.until(ExpectedConditions.visibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        wait.until(ExpectedConditions.invisibilityOf(internetSpeedPage.gaugeSpeedNeedle));

        System.out.println("internetSpeedPage.downloadSpeed.getText() = " + internetSpeedPage.downloadSpeed.getText());
        System.out.println("internetSpeedPage.uploadSpeed.getText() = " + internetSpeedPage.uploadSpeed.getText());


    }
}
