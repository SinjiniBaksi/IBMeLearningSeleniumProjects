package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleFeature {
	
	WebDriver driver;
	
	@Given("The Google website is launched")
	public void the_Google_website_is_launched() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}

	@When("Search bar is visible")
	public void search_bar_is_visible() {
		System.out.println(driver.findElement(By.name("q")).isDisplayed());
	}

	@Then("Enter text Hello")
	public void enter_text_Hello() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("q")).sendKeys("Hello");	
	}

}
