package bdcstepdefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class demo2_definations {
	@Given("user access the signup page")
	public void user_access_the_signup_page() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user access sign up");
	}

	@Given("gets the credentials")
	public void gets_the_credentials() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user access sign up");}

	@Given("user has valid account creds for DemoWebshop")
	public void user_has_valid_account_creds_for_DemoWebshop() {
	    // Write code here that turns the phrase above into concrete actions
	 // throw new cucumber.api.PendingException();
		System.out.println("user access sign up");
	}

	@Given("provides the valid creds as inputs for the login process")
	public void provides_the_valid_creds_as_inputs_for_the_login_process() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("user access sign up");
	}
@Then("verifies the state for the login status")
public void verifies_the_state_for_the_login_status() {
    // Write code here that turns the phrase above into concrete actions
    throw new cucumber.api.PendingException();
}
	

}
