package com.Qacart.Todo.pages;

import com.Qacart.Todo.Base.BasePage;
import com.Qacart.Todo.utils.ConfigUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {

    public LoginPage(WebDriver driver) {
        super(driver);
    }
    @FindBy(css = "[data-testid=\"email\"]")
   private WebElement emailInput;

    @FindBy(css="[data-testid=\"password\"]")
    private WebElement passwordInput;

    @FindBy(css="[data-testid=\"submit\"]")
    private WebElement submitBtn;


    public ToDOPage login (String Email , String Password){
        emailInput.sendKeys(Email);
        passwordInput.sendKeys(Password);
        submitBtn.click();
        return new ToDOPage(driver);
    }
    public LoginPage load(){

        driver.get(ConfigUtils.getInstance().getBaseUrl());
        return this;
    }
}
