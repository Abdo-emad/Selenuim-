package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class FaceBook {
    public static void main(String[]s){
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://facebook.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
       // driver.findElement(By.id("email")).sendKeys("fgf");
        driver.findElement(By.linkText("Create a Page")).click();
        WebElement create_account = driver.findElement(By.linkText("Sign Up"));
        create_account.click();
        WebElement firstname = driver.findElement(By.name("firstname"));
        firstname.sendKeys("Eng");
        WebElement lastname = driver.findElement(By.name("lastname"));
        lastname.sendKeys("Zedan");
        WebElement email = driver.findElement(By.name("reg_email__"));
        email.sendKeys("abdo@yahoo.com");
        WebElement re_email = driver.findElement(By.name("reg_email_confirmation__"));
        re_email.sendKeys("abdo@yahoo.com");
        WebElement pass = driver.findElement(By.name("reg_passwd__"));
        pass.sendKeys("123456");
        WebElement day = driver.findElement(By.id("day"));
        Select select_day = new Select(day);
        select_day.selectByValue("21");
        WebElement month = driver.findElement(By.id("month"));
        Select select_month = new Select(month);
        select_month.selectByVisibleText("Apr");
        WebElement year = driver.findElement(By.id("year"));
        Select select_year = new Select(year);
        select_year.selectByVisibleText("2000");
        WebElement male = driver.findElement(By.className("_58mt"));
        male.click();
        WebElement button = driver.findElement(By.name("websubmit"));
        button.click();




    }
}
