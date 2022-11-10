package testClasses;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstSeleniumScript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\003Z5M744\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/calorie-calculator.html");
		WebElement calcBtn = driver.findElement(By.xpath("//input[@value='Calculate']"));
//	    JavascriptExecutor js = (JavascriptExecutor)driver;
//	    js.executeScript("arguments[0].click();", calcBtn);
	    
//	    Actions action = new Actions(driver);
//	    action.click(calcBtn).perform();
	    
	    calcBtn.click();
		
//		driver.findElement(By.id("cage")).clear();
//		driver.findElement(By.id("cheightmeter")).clear();
//		driver.findElement(By.id("ckg")).clear();
//		
//		driver.findElement(By.id("cage")).sendKeys("22");
//		driver.findElement(By.id("cheightmeter")).sendKeys("165");
//		driver.findElement(By.id("ckg")).sendKeys("63");
		
//		WebElement radio = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
//		WebElement checkbox = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
//		
//		radio.click();
//		checkbox.click();
//		
//		Select select = new Select(driver.findElement(By.id("country")));
//		select.selectByVisibleText("India");
//		
//		radio.getAttribute("value").length();
		
		


	}

}
