package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SeleniumWithCucumberProject {
	
	static WebDriver driver;
	JavascriptExecutor js = (JavascriptExecutor)driver;
	
	@Given("Website is launched")
	public void website_is_launched() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://elearningm1.upskills.in/");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("User clicks on Sign up button")
	public void user_clicks_on_Sign_up_button() {
	    driver.findElement(By.linkText("Sign up!")).click();
	}

	@Then("Registration page is opened")
	public void registration_page_is_opened() {
	    //System.out.println(driver.getTitle());
	    Assert.assertEquals(driver.getTitle(), "elearning - elearning - Registration");
	}
	
	@Given("Registration page is launched")
	public void registration_page_is_launched() {
	    Assert.assertEquals(driver.getCurrentUrl(), "http://elearningm1.upskills.in/main/auth/inscription.php");

	}

	@When("User fills up all the mandatory fields")
	public void user_fills_up_all_the_mandatory_fields() {
	    driver.findElement(By.name("firstname")).sendKeys("Hello15"); //first name
	    driver.findElement(By.name("lastname")).sendKeys("World15"); //last name
	    driver.findElement(By.name("email")).sendKeys("hello@world15.com"); //email
	    driver.findElement(By.name("username")).sendKeys("hello_world15"); //username
	    driver.findElement(By.name("pass1")).sendKeys("test@123"); //password
	    driver.findElement(By.name("pass2")).sendKeys("test@123"); //confirm password

	}
	
	@When("Click on Registration button")
	public void click_on_Registration_button() {
		driver.findElement(By.name("submit")).click(); //Register button
	}

	@Then("Registration successful and next button is displayed")
	public void registration_successful_and_next_button_is_displayed() {
	    System.out.println(driver.findElement(By.name("next")).isDisplayed());
	}

	@Given("After succussful registration Next button is visible")
	public void after_succussful_registration_Next_button_is_visible() {
	    Assert.assertEquals(driver.findElement(By.name("next")).isDisplayed(),true);
	}

	@When("Click on Next button")
	public void click_on_Next_button() {
		driver.findElement(By.name("next")).click();
	}

	@Then("On the redirected page name of user is visible in dropdown")
	public void on_the_redirected_page_name_of_user_is_visible_in_dropdown() {
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/a")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/a")).getText());

	}

	@Given("User is able to view their name in dropdown")
	public void user_is_able_to_view_their_name_in_dropdown() {
	    System.out.println(driver.findElement(By.xpath("//*[@id=\"menuone\"]/ul[2]/li[1]/a")).isDisplayed());
	}

	@When("Click on name dropdown")
	public void click_on_name_dropdown() {
	    driver.findElement(By.xpath("//a[@data-toggle='dropdown']")).click();
	}

	@When("Click on Profile link")
	public void click_on_Profile_link() {
	    driver.findElement(By.xpath("//a[text()=' Profile']")).click();
	}

	@Then("User is navigated to profile page")
	public void user_is_navigated_to_profile_page() {
	    Assert.assertEquals(driver.getTitle(), "elearning - elearning - Social network");
	}
	
	@Given("User is on profile page")
	public void user_is_on_profile_page() {
	    Assert.assertEquals(driver.getTitle(), "elearning - elearning - Social network");
	}

	@When("User clicks on Messages link")
	public void user_clicks_on_Messages_link() {
	    js.executeScript("arguments[0].scrollIntoView(true)", driver.findElement(By.xpath("//li[@class='messages-icon ']")));
	    driver.findElement(By.xpath("//li[@class='messages-icon ']/a")).click();
	}

	@When("User clicks on Compose message button")
	public void user_clicks_on_Compose_message_button() {
	    driver.findElement(By.xpath("//a/img[@title='Compose message']")).click();
	}

	@Then("User is navigated to Compose Message page")
	public void user_is_navigated_to_Compose_Message_page() {
		Assert.assertEquals(driver.getTitle(), "elearning - elearning - Compose message");
	}
	

	@Given("User is on Compose Message page")
	public void user_is_on_Compose_Message_page() {
	    Assert.assertEquals(driver.getTitle(), "elearning - elearning - Compose message");

	}

	@When("User enters the subject of the message")
	public void user_enters_the_subject_of_the_message() {
	    driver.findElement(By.xpath("//input[@name='title']")).sendKeys("Test subject");
	}

	@When("Clicks on Send message button")
	public void clicks_on_Send_message_button() {
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

	@Then("Message is sent")
	public void message_is_sent() {
	   String errorMsg = driver.findElement(By.xpath("//div[@class='alert alert-danger']")).getText();
	   Assert.assertEquals(errorMsg,"There was an error while trying to send the message.");
	}


}
