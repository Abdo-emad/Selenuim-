package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.com");
        /**
         * Frames (page) : is a more than one page in Website Page
         * if u have multiply frames in website page and u want to switch between them , u can use the method Switch
         */
        driver.switchTo().frame("frameId");
        driver.findElement(By.id("element id in the chosen frame")).click();
        /**
         * if u want to come Back to the parent frame or the parent page u need to use SwitchTo().ParentFrame
         */
        driver.switchTo().parentFrame();
    }
}
