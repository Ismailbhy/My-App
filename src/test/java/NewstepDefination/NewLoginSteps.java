package NewstepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewLoginSteps {
	WebDriver driver;
	
 @Before
 public void beforeScenario() {
	driver=new ChromeDriver();
	driver.manage().window().maximize();
 }
 @After
 public void afterScenario() {
	driver.close();
 }
	@Given("I open login page")
	public void i_open_login_page() {
		driver.get("https://www.mycontactform.com/");
		}

	
	@When("I enter my username{string}")
	public void i_enter_my_username(String username) throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.name("user")).sendKeys(username);
	}

	@When("I enter my password{string}")
	public void i_enter_my_password_password(String password){
		driver.findElement(By.name("pass")).sendKeys(password);
		
	}
	    
	@Then("I should be logged in")
	public void i_should_be_logged_in() {
		driver.findElement(By.name("btnSubmit")).click();
	  
	}




}
