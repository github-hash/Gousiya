package bdcstepdefinations;


import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CucumberAddToCart {
	WebDriver driver;


  @Given("click on the login button")
  public void click_on_the_login_button() {
      // Write code here that turns the phrase above into concrete actions
     // throw new cucumber.api.PendingException();
   driver=Driver.configurationDriver("chrome");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    driver.get("http://demowebshop.tricentis.com/");
   driver.findElement(By.xpath("//a[@href='/login']")).click();
  }




 @Then("enter the user credentials")
  public void enter_the_user_credentials() {
      // Write code here that turns the phrase above into concrete actions
      //throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("gousiya.biradar@accenture.com");
   driver.findElement(By.xpath("//input[@id='Password']")).sendKeys("Demo@123");
  }




 @Then("click to continue shopping")
  public void click_to_continue_shopping() {
      // Write code here that turns the phrase above into concrete actions
     // throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//input[@value='Log in']")).click();
  }




 @Given("select the category to select products")
  public void select_the_category_to_select_products() {
      // Write code here that turns the phrase above into concrete actions
     // throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//a[@href='/books']")).click();
  }




 @Then("click on add to cart button")
  public void click_on_add_to_cart_button() {
      // Write code here that turns the phrase above into concrete actions
    //  throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
   
  }




 @Given("select the item")
  public void select_the_item() {
      // Write code here that turns the phrase above into concrete actions
     // throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//a[@href='/digital-downloads']")).click();
  }




 @Then("add the item to cart")
  public void add_the_item_to_cart() {
      // Write code here that turns the phrase above into concrete actions
     // throw new cucumber.api.PendingException();
   driver.findElement(By.xpath("//input[@value='Add to cart']")).click();
  }
 }





