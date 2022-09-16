package day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigation {
    public static void main(String[] args) throws InterruptedException {

        //1. set up web driver manager
        WebDriverManager.chromedriver().setup();

        //2. opening an empty browser with creating instance driver
        WebDriver driver = new ChromeDriver();
        // Session id = 72ABYHUKH86

        // making window full screen/ maximizing
        driver.manage().window().maximize();

        //3. go to "https://www.tesla.com"
        //driver.get("https://www.tesla.com");

        // navigate().to() method is loading to url in browser
        driver.navigate().to("https://www.tesla.com");

        String currentTitle = driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        // System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
        String currentURL = driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);

        Thread.sleep(3000);

        // navigate().back() method will take to previous page
        driver.navigate().back();

        Thread.sleep(3000);

        // navigate().forward() method will take to following page
        driver.navigate().forward();

        Thread.sleep(3000);

        // navigate().refresh() method will refresh the page
        driver.navigate().refresh();


        driver.navigate().to("https://www.google.com");
        // System.out.println("driver.getTitle() = " + driver.getTitle());
       // String currentTitle = driver.getTitle();
       // System.out.println("currentTitle = " + currentTitle);
//
       // // System.out.println("driver.getCurrentUrl() = " + driver.getCurrentUrl());
       // String currentURL = driver.getCurrentUrl();
       // System.out.println("currentURL = " + currentURL);

        //close() method will close current open page
        //driver.close();

        //quit() method will close all opened pages
        driver.quit();


    }
}
