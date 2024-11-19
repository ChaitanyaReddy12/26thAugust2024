package TestNgAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Common.BaseOrCommon;

public class Attribute_Priority extends BaseOrCommon{
		
	@BeforeSuite
	public void launchBrowser() {
		
	    browserLaunching("chrome");
		
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
	
	@Test (priority = 1)
	public void enterUsername() {
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		
		System.out.println("in @enterUsername method"); 

	}
	
	@Test(priority = 2)
	public void enterPassword() {
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		
		System.out.println("in @enterPassword method"); 

	}
	
	@Test(priority = 3)
	public void clickLogin() {
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		System.out.println("in @clickLogin method"); 

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
