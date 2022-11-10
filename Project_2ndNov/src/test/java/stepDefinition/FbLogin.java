package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin {
	
	WebDriver driver;
	
	@Given("The Facebook website is launched")
	public void the_Facebook_website_is_launched() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
	}

	@When("Username and password are entered")
	public void username_and_password_are_entered() {
		driver.findElement(By.id("email")).sendKeys("abc@test.com");
		driver.findElement(By.id("pass")).sendKeys("test@123");	}
	
	@When("Username and password fields are visible")
	public void username_and_password_fields_are_visible() {
	    System.out.println(driver.findElement(By.id("email")).isDisplayed());
	    System.out.println(driver.findElement(By.id("pass")).isDisplayed());
	}

//	@Then("Enter username and password")
//	public void enter_username_and_password() {
//		driver.findElement(By.id("email")).sendKeys("abc@test.com");
//		driver.findElement(By.id("pass")).sendKeys("test@123");
//	}
	
	@Then("Enter username {string} and password {string}")
	public void enter_username_and_password(String uname, String pwd) {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys(uname);
		driver.findElement(By.id("pass")).sendKeys(pwd);	
	}

}
