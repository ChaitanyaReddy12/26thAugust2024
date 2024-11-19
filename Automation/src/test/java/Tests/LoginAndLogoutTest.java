package Tests;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseOrCommon;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.SignoutPage;

public class LoginAndLogoutTest extends BaseOrCommon {
	
	LoginPage lp;
	
	HomePage hp;
	
	SignoutPage sp;

	@BeforeSuite
	public void launchBrowser() {

		browserLaunching("chrome");
		
		lp = new LoginPage(driver);
		
		//Classname objectname = pagefactory.initElements(web driver object, pagefactoryclass.class)
		
		hp = PageFactory.initElements(driver, HomePage.class);
		
		sp = PageFactory.initElements(driver, SignoutPage.class);

		System.out.println("in @BeforeSuite method");
	}

	@BeforeTest
	public void maximizeBrowser() {

		maximizeTheBrowser();

		System.out.println("in @BeforeTest method");
	}

	@BeforeClass
	public void launchURL() {

		urlLaunching("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		System.out.println("in @BeforeClass method");

	}

	@BeforeMethod
	public void waits() {

		waitForAnWebelement();

		System.out.println("in @BeforeMethod method");

	}
	
	@Test(priority = -1)
	public void VerifyApplicationLogo() {

		lp.verifyLogo();

		System.out.println("in @VerifyApplicationLogo method");

	}
	
	@Test(priority = 0)
	public void verifyForgotYourPasswordLink() {

		lp.verifyForgotYourPassword();

		System.out.println("in @verifyForgotYourPasswordLink method");

	}

	@Test(priority = 1)
	public void enterUsername() {

		lp.enterUsername();

		System.out.println("in @enterUsername method");

	}

	@Test(priority = 2)
	public void enterPassword() {

		lp.enterPassword();

		System.out.println("in @enterPassword method");

	}

	@Test(priority = 3)
	public void clickLogin() {

		lp.clickLogin();

		System.out.println("in @clickLogin method");

	}
	
	@Test(priority = 4)
	public void clickUserDropdownMenu() {

		hp.clickDropdownMenu();

		System.out.println("in @clickUserDropdownMenu method");

	}
	
	@Test(priority = 5)
	public void clickLogoutTab() {

		sp.clickLogout();

		System.out.println("in @clickLogoutTab method");

	}

	@AfterMethod
	public void waits1() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));

		System.out.println("in @AfterMethod method");

	}

	@AfterSuite
	public void closeBrowser() {

		browserClosing();

		System.out.println("in @AfterSuite method");

	}
}
