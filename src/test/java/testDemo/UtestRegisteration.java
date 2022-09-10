package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class UtestRegisteration {
    public static void main(String []args){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(500));
        /**
         *    if u wait to wain the element to be visible in screen then click on it or do anything
         *WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(600));
         *wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("e"))).click();
         */

        driver.get("https://www.utest.com/signup/personal");
        driver.findElement(By.id("firstName")).sendKeys("Abdelrahman");
        //driver.findElement(By.cssSelector("[name=\"firstName\"]")).sendKeys("Abdelrhman");
        driver.findElement(By.id("lastName")).sendKeys("Emad");
        driver.findElement(By.id("email")).sendKeys("zidanabdoo54@gmail.com");
       Select select= new Select(driver.findElement(By.id("birthMonth")));
       select.selectByIndex(4);
       Select select1 = new Select(driver.findElement(By.id("birthDay")));
       select1.selectByIndex(21);
       Select select2 = new Select(driver.findElement(By.id("birthYear")));
       select2.selectByIndex(5);
       driver.findElement(By.xpath("//*[@aria-label=\"Next step - define your location\"]")).click();
      Actions actions = new Actions(driver);
       WebElement source = driver.findElement(By.cssSelector(".source"));
        WebElement destination = driver.findElement(By.cssSelector(".dest"));
        /**
         * Other Functions in Action Class
         */
        // actions.doubleClick(source).perform(); // if u want to click on button
    //  actions.dragAndDrop(source,destination).perform(); // if u want to drag element and drop it in place
     //  actions.clickAndHold(source).moveToElement(destination).release().build().perform();// if u want to drag element and drop it in place

    }
}
