package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts {
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("");
        /**
         * if my website sends an alert u can accept it or dismiss it or if the alert is a prompt u can send keys
         */
        driver.findElement(By.id("the id of the element the let the alert to appear")).click();
        Thread.sleep(5000);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("hello"); // alert send the data to my code and to console
        driver.switchTo().alert().accept();

    }



}
