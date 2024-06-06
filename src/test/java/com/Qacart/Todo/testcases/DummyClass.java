package com.Qacart.Todo.testcases;

import com.Qacart.Todo.api.RegisterAPI;
import com.Qacart.Todo.objects.User;
import com.Qacart.Todo.utils.ConfigUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static io.restassured.RestAssured.given;

public class DummyClass {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get(ConfigUtils.getInstance().getBaseUrl());
        driver.manage().window().maximize();
        Thread.sleep(10000);
        driver.quit();

//       RegisterAPI registerAPI = new RegisterAPI();
//       registerAPI.register();
//        System.out.println(registerAPI.getAccessToken());
//        System.out.println(registerAPI.getFirstName());
//        System.out.println(registerAPI.getUserId());
    }
}
