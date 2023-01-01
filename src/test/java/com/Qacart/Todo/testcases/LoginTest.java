package com.Qacart.Todo.testcases;

import com.Qacart.Todo.Base.BaseTest;
import com.Qacart.Todo.factory.DriverFactory;
import com.Qacart.Todo.pages.LoginPage;
import com.Qacart.Todo.pages.ToDOPage;
import com.Qacart.Todo.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest {

    @Test
    public void shouldbeabletologinwithemailandpassword(){

        LoginPage loginpage = new LoginPage(driver);
        boolean isWelcomeDisplayed =
                loginpage
                        .load()
                                .login(ConfigUtils.getInstance().getemail(), ConfigUtils.getInstance().getpassword())
                                        .isWelcomeMessageDisplayed();

        Assert.assertTrue(isWelcomeDisplayed);


    }
}
