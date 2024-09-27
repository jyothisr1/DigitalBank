package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(xpath = "//button[text()='Sign in']")
    WebElement signInButton;

    @FindBy(xpath = "//a[text()=' Sign Up Here']")
    WebElement signUpLink;

    public void openWebsite(){
        driver.get("https://dbank-qa.wedevx.co/bank/login");
    }
    public boolean onLoginPage(){
       return signInButton.isDisplayed();
    }
    public void signUp(){
        signUpLink.click();
    }

}
