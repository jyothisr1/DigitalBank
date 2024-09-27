package com.automation.steps;

import com.automation.pages.SignUpPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignUpStep {

    @FindBy(xpath = "")
    WebElement a;

    @FindBy(xpath = "//select")
    WebElement selectMr;

    SignUpPage signUpPage=new SignUpPage();

    @Then("verify user is on signup page")
    public void verify_user_is_on_signup_page() {
        Assert.assertTrue(signUpPage.VerifySignUpPage());
    }

    @When("user enters all the required details")
    public void user_enters_all_the_required_details() {
        
    }


}
