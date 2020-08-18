package stepDefinitions;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginStep {
	WebDriver driver;

	@Given("^the application url google.com$")
	public void User_Enters_Application_Url() {
		// String os=System.getProperty("os.name").toLowerCase();
		String path = System.getProperty("user.dir");
		System.out.println(path);

		System.setProperty("webdriver.gecko.driver", path + "/geckodriver.exe");

		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com/");

	}

	@When("^User enters google in search bar$")
	public void User_enters_google() throws InterruptedException {
		driver.findElement(By.name("q")).sendKeys("google");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	}

	@Then("^User will be able to see google text$")
	public void User_validates_text() {
		String x = driver.findElement(By.xpath("//span[text()='Google']")).getText();
		Assert.assertEquals("Google", x);
		driver.close();
	}

}
