package com.Qacart.Todo.testcases;

import com.Qacart.Todo.Base.BaseTest;
import com.Qacart.Todo.pages.LoginPage;
import com.Qacart.Todo.pages.NewToDoPage;
import com.Qacart.Todo.pages.ToDOPage;
import com.Qacart.Todo.utils.ConfigUtils;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ToDoTest extends BaseTest {

    @Test(enabled = false)
    public void shouldBeAbleToAddToDo(){

        LoginPage loginpage = new LoginPage(driver);
        String actualResult = loginpage.load()
                .login(ConfigUtils.getInstance().getemail(), ConfigUtils.getInstance().getpassword())
                .clickAddBtn().addNewTask("learn selenium")
                .gettoDotext();
        Assert.assertEquals(actualResult,"learn selenium");


    }

    @Test
    public void shouldBeAbleToDelete(){
        LoginPage loginpage = new LoginPage(driver);
        boolean isNoAvailableTodosDisplayed = loginpage
                        .load()
                .login(ConfigUtils.getInstance().getemail(), ConfigUtils.getInstance().getpassword())
                .clickAddBtn()
                .addNewTask("learn selenium")
                .clickDeleteBtn()
                .checkNoToDOMessageDisplayed();

       Assert.assertTrue(isNoAvailableTodosDisplayed);

    }
}
