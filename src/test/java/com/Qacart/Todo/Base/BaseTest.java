package com.Qacart.Todo.Base;

import com.Qacart.Todo.factory.DriverFactory;
import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = new DriverFactory().initializeDriver();
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

}
