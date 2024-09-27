package com.automation.steps;

import com.automation.pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStep {
    LoginPage loginPage=new LoginPage();
    @Given("user open the website")
    public void user_open_the_website() {
        loginPage.openWebsite();
    }

    @Then("verify user is on login page")
    public void verifyUserIsOnLoginPage() {
        loginPage.onLoginPage();
        Assert.assertTrue(loginPage.onLoginPage());
    }

    @When("user click on signup")
    public void user_click_on_signup() {
        loginPage.signUp();
    }

    @When("user enters username {string} and password {string}")
    public void user_enters_username_and_password(String string, String string2) {

    }

    @When("user click on login button")
    public void user_click_on_login_button() {

    }

    @Then("verify user is on home page")
    public void verify_user_is_on_home_page() {

    }
}
