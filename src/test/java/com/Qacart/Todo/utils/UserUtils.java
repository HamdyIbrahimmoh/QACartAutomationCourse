package com.Qacart.Todo.utils;

import com.Qacart.Todo.objects.User;
import com.github.javafaker.Faker;

public  class UserUtils {
    public static User generateRandomUser(){
        String firstName = new Faker().name().firstName();
        String lastName = new Faker().name().lastName();
        String emailAddress = new Faker().internet().emailAddress();
        String password = new Faker().internet().password();
        User user = new User(emailAddress,password,firstName,lastName);
        return user;
    }
}
