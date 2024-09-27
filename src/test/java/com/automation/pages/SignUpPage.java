package com.automation.pages;

public class SignUpPage extends BasePage{
    public boolean VerifySignUpPage(){
        return driver.getCurrentUrl().contains("signup");
    }
}
