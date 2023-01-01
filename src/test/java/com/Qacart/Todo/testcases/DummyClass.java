package com.Qacart.Todo.testcases;

import com.Qacart.Todo.api.RegisterAPI;
import com.Qacart.Todo.objects.User;
import io.restassured.RestAssured.*;
import io.restassured.matcher.RestAssuredMatchers.*;
import io.restassured.response.Response;
import org.hamcrest.Matchers.*;

import static io.restassured.RestAssured.given;

public class DummyClass {
    public static void main(String[] args) {

       RegisterAPI registerAPI = new RegisterAPI();
       registerAPI.register();
        System.out.println(registerAPI.getAccessToken());
        System.out.println(registerAPI.getFirstName());
        System.out.println(registerAPI.getUserId());
    }
}
