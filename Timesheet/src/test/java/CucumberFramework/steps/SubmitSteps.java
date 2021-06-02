package CucumberFramework.steps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class SubmitSteps {

	WebDriver driver;
	
	@Before()
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\copet\\OneDrive\\Desktop\\Selenium\\CucumberFramework\\src\\test\\java\\resources\\chromedriver.exe");
	this.driver = new ChromeDriver();
	this.driver.manage().window().maximize();
	this.driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
	}
	
	@After()
		public void tearDown() {
			driver.manage().deleteAllCookies();
			driver.close();
			driver.quit();
		}
	
	
	@Given("^User navigates to rev(\\d+)\\.force\\.com$")
	public void user_navigates_to_rev_force_com(int arg1) throws Throwable {
		driver.get("https://rev2.force.com/s/");
	}

	@And("^User enters username$")
	public void user_enters_username() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/input[1]")).sendKeys("");
	}

	@And("^User clicks submit$")
	public void user_clicks_submit() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/button[1]")).click();
	}

	@And("^User enters password$")
	public void user_enters_password() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[3]/div[1]/input[1]")).sendKeys("");
	}

	@And("^User clicks login$")
	public void user_clicks_login() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[4]/button[1]")).click();
	}

	@And("^User clicks open timesheets$")
	public void user_clicks_open_timesheets() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/header[1]/button[1]")).click();
	}

	@And("^User enters Monday hours$")
	public void user_enters_Monday_hours() throws Throwable {
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[4]/input[1]")).sendKeys("8");
	}

	@And("^User enters Tuesday hours$")
	public void user_enters_Tuesday_hours() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[5]/input[1]")).sendKeys("8");
	}

	@And("^User enters Wednesday hours$")
	public void user_enters_Wednesday_hours() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[6]/input[1]")).sendKeys("8");
	}

	@And("^User enters Thursday hours$")
	public void user_enters_Thursday_hours() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[7]/input[1]")).sendKeys("8");
	}

	@When("^User enters Friday hours$")
	public void user_enters_Friday_hours() throws Throwable {
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/table[1]/tbody[1]/tr[1]/td[8]/input[1]")).sendKeys("8");
	}



	@SuppressWarnings("deprecation")
	@Then("^User confirms submit button is on page$")
	public void user_confirms_submit_button_is_on_page() throws Throwable {
		WebElement submitButton = driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/div[3]/div[2]/button[1]"));
		Assert.assertEquals(true, submitButton.isDisplayed());
	}


}
