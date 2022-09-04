package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class OpenChromeBrowser {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
         WebDriver driver = new ChromeDriver();
         driver.manage().window().fullscreen();
         driver.manage().window().maximize();
        Dimension iphoneXR = new Dimension(414,896);
         driver.manage().window().setSize(iphoneXR);
         driver.get("http://facebook.com");



    }
}
