package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login_SD {

    @Given("user is in the login screen")
    public void user_is_in_the_login_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user is in the login screen");
    }
    @When("user enters username and password")
    public void user_enters_username_and_password() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user enters username and password");
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user clicks on login button");
    }
    @Then("user will be on the Homepage screen")
    public void user_will_be_on_the_homepage_screen() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("user will be on the Homepage screen");
    }
}
