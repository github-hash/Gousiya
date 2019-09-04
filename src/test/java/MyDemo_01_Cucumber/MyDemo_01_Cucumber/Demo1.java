package MyDemo_01_Cucumber.MyDemo_01_Cucumber;

import java.io.FileNotFoundException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Demo1 {
	WebDriver driver;
	@Given("Application is launched by guest user")
	public void application_is_launched_by_guest_user() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//System.out.println("application is launced");
		
		driver=Driver.configurationDriver("chrome");
		  driver.manage().window().maximize();
		  driver.get("http://10.232.237.143:443/TestMeApp/");
	}

	@When("User clicks on Sign In link available")
	public void user_clicks_on_Sign_In_link_available() 	throws FileNotFoundException {
	
			 // Actions act = new Actions(driver);
			  
			  /*FileInputStream fis=new FileInputStream("C:\\Users\\gousiya.biradar\\Gousiya\\Book1.xlsx");*/
			  
			 
			  driver.findElement(By.xpath("//a[@href='RegisterUser.htm']")).click();
			  /*driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("Admin");*/
			  
			  
		  }
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("Sign In link available");
	

	@When("provides the required data in the form")
	public void provides_the_required_data_in_the_form() {
		driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("GousiyaBiradar");
		  driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Gousiya");
		  driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Biradar");
		  driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Gousiya@123");
		  driver.findElement(By.xpath("//input[@id='pass_confirmation']")).sendKeys("Gousiya@123");
		  driver.findElement(By.xpath("//input[@value='Female']"));
		  
		  
		  driver.findElement(By.xpath("//input[@id='emailAddress']")).sendKeys("Gousiyakhan123@gmail.com");
		  driver.findElement(By.xpath("//input[@id='mobileNumber']")).sendKeys("8765678987");
		 
		  driver.findElement(By.xpath("//img[@class='ui-datepicker-trigger']")).click();
		  driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
		   Select month1=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")));
		   month1.selectByVisibleText("Jan");
		   
		   
			  driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")).click();
			   Select year=new Select(driver.findElement(By.xpath("//select[@class='ui-datepicker-year']")));
			   year.selectByVisibleText("1995");
			   
		   
		  
		  driver.findElement(By.linkText("3")).click();
		  
		  
		  
		  driver.findElement(By.xpath("//textarea[@id='address']")).sendKeys("kundanhalli bangalore");
		 
		 
		  Select catgDrop=new Select(driver.findElement(By.id("securityQuestion")));
		    catgDrop.selectByVisibleText("What is your Birth Place?");
		  
		  /*driver.findElement(By.xpath("//div[@id='securityQuestion']")).click();
		  act.moveToElement(driver.findElement(By.xpath("//div[contains(text(),'What 
		  is your Birth Place')]"))).click().build().perform();*/
		  
		  driver.findElement(By.xpath("//input[@id='answer']")).sendKeys("Hubballi");
		 
		  
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//System.out.println("form data provided");
	}

	@Then("User submits the data")
	public void user_submits_the_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//System.out.println("User submits the data");
		 driver.findElement(By.xpath("//input[@value='Register']")).click();
	}

	@Then("verifies for the account creation")
	public void verifies_for_the_account_creation() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		System.out.println("verifies");
	}

}
