package com.vytrack.step_definitions;
import io.cucumber.java.en.*;
public class NavigationMenuStepDefs {


    @When("the user navigates to Fleet, Vehicles")
    public void the_user_navigates_to_Fleet_Vehicles() {
        System.out.println("the user navigates to Fleet, Vehicles");
    }

    @Then("the title should be vehicles")
    public void the_title_should_be_vehicles() {
        System.out.println("the title should be vehicles");
    }

    @Given("the ser is on the login page")
    public void the_ser_is_on_the_login_page() {
        System.out.println("the ser is on the login page");
    }

    @Given("the user  enters the sales manager informtion")
    public void the_user_enters_the_sales_manager_informtion() {
        System.out.println("the user  enters the sales manager informtion");
    }

    @When("the user navigates to Marketing, Compaigns")
    public void the_user_navigates_to_Marketing_Compaigns() {
        System.out.println("the user navigates to Marketing, Compaigns");
    }

    @Then("title shoudl be Campaigns")
    public void title_shoudl_be_Campaigns() {
        System.out.println("title shoudl be Campaigns");
    }

    @When("the user navigates to Activities, Calendar Events")
    public void the_user_navigates_to_Activities_Calendar_Events() {

        System.out.println("the user navigates to Activities, Calendar Events");
    }

    @Then("title should be Calendars")
    public void title_should_be_Calendars() {
        System.out.println("title should be Calendars");
    }



}
