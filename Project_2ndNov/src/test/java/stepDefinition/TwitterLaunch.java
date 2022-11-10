package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TwitterLaunch {
	
	WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@Given("Twitter website is launched")
	public void twitter_website_is_launched() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://twitter.com/i/flow/login");
		Thread.sleep(3000);
	}

	@When("Username field is visible")
	public void username_field_is_visible() {
		//driver.switchTo().frame(0)
		System.out.println(driver.findElement(By.xpath("//input[@autocomplete='username']")).isDisplayed());
	}

	@Then("Enter username")
	public void enter_username() {
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys("hello");
		
	}

	@Then("Click next button")
	public void click_next_button() throws InterruptedException {
	    driver.findElement(By.xpath("//span[text()='Next']")).click();
	    Thread.sleep(3000);
	}

	@When("Password field is visible")
	public void password_field_is_visible() {
	    System.out.println(driver.findElement(By.name("password")).isDisplayed());
	}

	@Then("Enter password")
	public void enter_password() {
		driver.findElement(By.name("password")).sendKeys("test@123");
	}

}
