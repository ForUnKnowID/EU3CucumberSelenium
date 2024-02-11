package com.vytrack.step_definitions;


import com.vytrack.pages.LoginPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.ConfigurationReader;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.*;
import org.apache.hc.core5.util.Asserts;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import java.lang.module.Configuration;

public class LoginStepDefs {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() throws InterruptedException {

        String url = ConfigurationReader.get("url");
//        WebDriver driver = Driver.get();
        Driver.get().get(url);

    }

    @When("he user enters the dirver information")
    public void he_user_enters_the_dirver_information() throws InterruptedException {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() throws InterruptedException {
        BrowserUtils.waitFor(2);
        String acTitle = Driver.get().getTitle();
        Assert.assertEquals(acTitle,"Dashboard");

    }

    @When("the user enters the sales manager information")
    public void the_user_enters_the_sales_manager_information() throws InterruptedException {

        String username = ConfigurationReader.get("salesmanager_username");
        String password = ConfigurationReader.get("salesmanager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }


    @When("the user enters the store manager information")
    public void the_user_enters_the_store_manager_information() {
        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Given("the user enters the sale manager information")
    public void the_user_enters_the_sale_manager_information() {

        System.out.println("I Just login as Sales Manager");

    }



}
