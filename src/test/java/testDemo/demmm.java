package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Set;

public class demmm {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        driver.get("http://amazon.com");
        System.out.println(driver.getWindowHandle());
        driver.findElement(By.cssSelector("[class=\"nav-cart-icon nav-sprite\"]")).click();
        Set<String> handle = driver.getWindowHandles();
        for (String iterate:handle){
            if (!iterate.equalsIgnoreCase(driver.getWindowHandle()))
                driver.switchTo().window(iterate);
        }
        driver.navigate().back();
        driver.navigate().to("http://www.gmail.com");
        System.out.println(driver.getTitle());
        driver.findElement(By.cssSelector("[class=\"inputtext _55r1 _6luy\"]")).sendKeys("556625dtr@");
        driver.findElement(By.cssSelector("[class=\"inputtext _55r1 _6luy _9npi\"]")).sendKeys("15555");
      driver.findElement(By.name("login")).click();
    }
}
