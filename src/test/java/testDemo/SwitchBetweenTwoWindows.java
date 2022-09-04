package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class SwitchBetweenTwoWindows {
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com");
        String parent = driver.getWindowHandle();

        driver.findElement(By.cssSelector("[class=\"gb_d\"]")).click();
      Set <String> ChildWindow = driver.getWindowHandles();
        for (String next:ChildWindow){

         if ( !next.equalsIgnoreCase(parent)){
             System.out.println(driver.getTitle());
             driver.switchTo().window(next);
             driver.quit();
         }
        }
    }
}
