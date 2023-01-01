package com.Qacart.Todo.pages;

import com.Qacart.Todo.Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewToDoPage extends BasePage {
    public NewToDoPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css="[data-testid=\"new-todo\"]")
    private WebElement newToDOInput;

    @FindBy(css="[data-testid=\"submit-newTask\"]")
    private WebElement newTODoSubmit;

    public ToDOPage addNewTask(String item){
        newToDOInput.sendKeys(item);
        newTODoSubmit.click();
        return new ToDOPage(driver);
    }

}
