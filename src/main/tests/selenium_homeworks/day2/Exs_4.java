package selenium_homeworks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exs_4 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://practice.cydeo.com/inputs");

        WebElement searchHomeButton = driver.findElement(By.className("nav-link"));
        searchHomeButton.sendKeys("Home" + Keys.ENTER);

        String expectedTitle = "Practice";
        String actualTitle = driver.getTitle();

        System.out.println(actualTitle.equals(expectedTitle) ? "PASSED" : "FAILED");

        driver.quit();







    }
}
