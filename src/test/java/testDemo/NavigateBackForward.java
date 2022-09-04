package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateBackForward {
    public static void main(String []args){
        WebDriverManager .chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
      /*  driver.navigate().to("http://amazone.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
       String Source_Code=driver.getPageSource();
        System.out.println("Amazon Source Code :" +Source_Code);*/
       String element =driver.findElement(By.xpath("//*[@id=\"reg_pages_msg\"]")).getText();
       System.out.println(element);
      // driver.quit();
    }
}
