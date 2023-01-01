package com.Qacart.Todo.pages;

import com.Qacart.Todo.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ToDOPage extends BasePage {
    public ToDOPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[data-testid=\"welcome\"]")
    private WebElement welcomeMessage;

    @FindBy(css="[data-testid=\"add\"]")
    private WebElement addBtn;

    @FindBy(css="[data-testid=\"todo-text\"]")
    private WebElement toDoItem;

    @FindBy(css="[data-testid=\"delete\"]")
    private WebElement deleteBtn;

    @FindBy(css="[data-testid=\"no-todos\"]")
    private WebElement noToDosMessage;



    public boolean isWelcomeMessageDisplayed(){
        return welcomeMessage.isDisplayed();
    }

    public NewToDoPage clickAddBtn(){
        addBtn.click();
        return new NewToDoPage(driver);
    }

    public String gettoDotext(){
       return toDoItem.getText();
    }

    public ToDOPage clickDeleteBtn(){
        deleteBtn.click();
        return this;
    }
    public boolean checkNoToDOMessageDisplayed(){
        return noToDosMessage.isDisplayed();
    }
}
