package bdcstepdefinations;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Parametrization {
	WebDriver driver;
	@Given("launch using chrome browser")
	public void launch_using_chrome_browser() {
		
		driver=Driver.configurationDriver("chrome");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    driver.get("http://demowebshop.tricentis.com/");
	   
	    
	}

	@Given("login button is clicked")
	public void login_button_is_clicked() {
	    
	    driver.findElement(By.xpath("//a[@href='/login']")).click();
	}

	@Then("enter the user credentials {string} and {string} and login")
	public void enter_the_user_credentials_and_and_login(String string, String string2) {
		
		
		
		
	    
	}

	@Then("click on login to continue")
	public void click_on_login_to_continue() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new cucumber.api.PendingException();
	}
}
