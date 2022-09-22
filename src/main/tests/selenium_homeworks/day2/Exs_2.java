package selenium_homeworks.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exs_2 {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://zero.webappsecurity.com/login.html");

        String expectedHeaderText = "Log in to ZeroBank";
        String actualHeaderText = driver.findElement(By.tagName("h3")).getText();



        System.out.println(actualHeaderText.equals(expectedHeaderText) ? "PASSED" : "FAILED");

        driver.quit();

    }
}
