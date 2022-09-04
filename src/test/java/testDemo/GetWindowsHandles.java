package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetWindowsHandles {
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://google.com");
        String parentID = driver.getWindowHandle();
        System.out.println("Google Page ID Handle Is : \t" + parentID);
       driver.findElement(By.cssSelector("[class=\"gb_d\"]")).click();
       System.out.println("Child Page ID Handle Is : \t" + driver.getWindowHandles());
        driver.quit();
    }
}
