package stepDefination;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import Common.BaseOrCommon;
import Pages.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginTest extends BaseOrCommon {

	LoginPage lp;


	@Given("Open chrome and launch application")
	public void open_chrome_and_launch_application() throws IOException {

		browserLaunching("chrome");

		lp = new LoginPage(driver);

		screenshot("TC_1_VerifyLoginTest_launchBrowser");

		System.out.println("i am in @BeforeSuite method");

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		maximizeTheBrowser();

		screenshot("TC_1_VerifyLoginTest_launchURL");

		System.out.println("i am in @BeforeClass method");
		
		waitForAnWebelement();
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {

		lp.enterUsername();

		lp.enterPassword();

		lp.clickLogin();
	}

	@Then("user can able to see the home page")
	public void user_can_able_to_see_the_home_page() {

		System.out.println("Hi team");
	}
	
	@Then("I verify the title")
	public void i_verify_the_title() {
	    
		String expectedTitle = "OrangeHRM";
		
		String actualTitle = driver.getTitle();
		
		assertEquals(expectedTitle, actualTitle);
	}
	
	@Then("I close the browser")
	public void i_close_the_browser() {
	    
		driver.quit();
	}

}
