package com.Qacart.Todo.api;

import com.Qacart.Todo.objects.User;
import com.Qacart.Todo.utils.UserUtils;
import io.restassured.http.Cookies;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class RegisterAPI {

    private Cookies restAssuredCookies;
    private String accessToken;
    private String userId;
    private String firstName;


    public String getAccessToken(){
        return this.accessToken;
    }

    public Cookies getRestAssuredCookies(){
        return this.restAssuredCookies;
    }

    public String getUserId() {
        return this.userId;
    }

    public String getFirstName() {
        return this.firstName;
    }


    public void register(){
        User user= UserUtils.generateRandomUser();

        Response response =
                given()
                  .baseUri("https://qacart-todo.herokuapp.com")
                  .header("Content-Type","application/json")
                  .body(user)
                        .log().all()
                .when()
                  .post("/api/v1/users/register")
                .then()
                        .log().all()
                  .extract().response();

        if (response.getStatusCode() != 201){
            throw  new RuntimeException("some thing went wrong");
        }
        restAssuredCookies = response.detailedCookies();
        accessToken = response.path("access_token");
        userId=response.path("userID");
        firstName=response.path("firstName");

    }


}
