package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class BMICalculator {
	
	static WebDriver driver;

	@Given("Launch Calorie Calculator website")
	public void launch_Calorie_Calculator_website() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@When("Title of page is not blank or empty")
	public void title_of_page_is_not_blank_or_empty() {
	    String currTitle = driver.getTitle();
	    Assert.assertEquals(false, currTitle.isBlank());
	    Assert.assertEquals(false, currTitle.isEmpty());
	}

	@Then("Validate the title of current page")
	public void validate_the_title_of_current_page() {
	    Assert.assertEquals("Calorie Calculator", driver.getTitle());
	}

	@Given("Title of current page is Calorie Calculator")
	public void title_of_current_page_is_Calorie_Calculator() {
		System.out.println(driver.getTitle());
	    Assert.assertEquals("Calorie Calculator", driver.getTitle());
	}

	@When("Age field is visible")
	public void age_field_is_visible() {
	   Assert.assertEquals(driver.findElement(By.cssSelector("#cage")).isDisplayed(), true);
	}

	@Then("Enter Age {string}")
	public void enter_Age(String age) {
		driver.findElement(By.cssSelector("#cage")).clear();
		driver.findElement(By.cssSelector("#cage")).sendKeys(age);
	}

	@When("Height field is visible")
	public void height_field_is_visible() {
		Assert.assertEquals(driver.findElement(By.cssSelector("#cheightmeter")).isDisplayed(), true);

	}

	@Then("Enter Height {string}")
	public void enter_Height(String height) {
		driver.findElement(By.cssSelector("#cheightmeter")).clear();
		driver.findElement(By.cssSelector("#cheightmeter")).sendKeys(height);
	}

	@When("Weight field is visible")
	public void weight_field_is_visible() {
		Assert.assertEquals(driver.findElement(By.cssSelector("#ckg")).isDisplayed(), true);

	}

	@Then("Enter Weight {string}")
	public void enter_Weight(String weight) {
		driver.findElement(By.cssSelector("#ckg")).clear();
		driver.findElement(By.cssSelector("#ckg")).sendKeys(weight);
	}

	@Then("Click on Calculate button")
	public void click_on_Calculate_button() {
	    WebElement calcBtn = driver.findElement(By.xpath("//input[@value='Calculate']//preceding-sibling::input[@name='printit']"));
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("arguments[0].click();", calcBtn);
	}


}
