package com.Qacart.Todo.factory;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.bytebuddy.implementation.bytecode.Throw;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverFactory {
private WebDriver driver;
    public WebDriver initializeDriver(){

        String browser = System.setProperty("browser","CHROME");
        switch (browser){
            case "CHROME":
                WebDriverManager.chromedriver().setup();
                 driver=new ChromeDriver();
                break;
            case "FIREFOX":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
            case "EDGE":
                WebDriverManager.edgedriver().setup();
                driver=new EdgeDriver();
                break;
            default:
                throw new RuntimeException("the browser is not supported");
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        return driver;

    }
}
