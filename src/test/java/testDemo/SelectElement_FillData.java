package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectElement_FillData {
    public static void main(String[]args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://ta3limy.com/login");
   /*     driver.findElement(By.cssSelector("[aria-label='Phone number, username, or email']")).sendKeys("zidanabdoo54@gmail.com");
       driver.findElement(By.cssSelector("[aria-label='password']")).sendKeys("123456789");
        driver.findElement(By.cssSelector("[name=\"mobileNumber\"]")).sendKeys("01023875861");
        driver.findElement(By.cssSelector("[name=\"password\"]")).sendKeys("15678#100100");
*/
        driver.findElement(By.xpath("//*[@name=\"mobileNumber\"]")).sendKeys("01023875861");
        driver.findElement(By.xpath("//*[@name=\"password\"]")).sendKeys("Abdo2142000");
        driver.findElement(By.cssSelector("[DButton undefined]")).click();
        // to select a checkbox u need to create object from class select
        WebElement dropDown = driver.findElement(By.id("Courses"));
        Select select = new Select(dropDown);
        select.selectByIndex(0); // this will select the first checkbox by index
        select.selectByValue("html");
        select.selectByVisibleText("css");

    }
}

