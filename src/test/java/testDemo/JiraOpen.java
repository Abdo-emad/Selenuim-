package testDemo;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class JiraOpen {
    public static void main(String []a){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5000));
       driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        driver.get("https://www.atlassian.com/");
        driver.findElement(By.xpath("//*[@id=\"wac\"]/header/div/div[1]/div/div[1]/div[2]/div[1]/a")).click();
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("class=\"lCoei YZVTmd SmR8\"")));
        driver.findElement(By.xpath("//*[@id=\"dropdown-b7fc3020\"]/div/div/div[1]/div/div/div[1]/div/a[1]")).click();
       // driver.findElement(By.className("class=\"component__link button button--one button--small button--secondary button--primary__on-stuck\"")).click();
       driver.findElement(By.xpath("//*[@id=\"jira\"]/main/div[1]/nav/div[1]/div/div/div[2]/a")).click();
       // driver.findElement(By.className("class=\"sc-cvbbAY rUWaJ css-1yx6h60\"")).click();
        driver.findElement(By.xpath("//*[@id=\"imkt-jsx--efe16b57\"]/div/div/section/div[2]/div[3]/button")).click();
        driver.findElement(By.className("class=\"social-signup-button google css-12buiv1\"")).click();
        driver.switchTo().frame("jsname=\"bN97Pc\"");
        driver.switchTo().frame("jsname=\"uybdVe\"");
        driver.switchTo().frame("jsname=\"USBQqe\"");
        driver.switchTo().frame("jsname=\"rEuO1b\"");
        driver.findElement(By.className("class=\"lCoei YZVTmd SmR8\"")).click();

    }
}
