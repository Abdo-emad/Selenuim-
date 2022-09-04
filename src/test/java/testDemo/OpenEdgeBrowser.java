package testDemo;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenEdgeBrowser {
    public static void main(String []args){
        WebDriverManager.edgedriver().setup();
        WebDriver webDriver= new EdgeDriver();
        webDriver.get("http://facebook.com");
    }
}
