package TestNgAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Common.BaseOrCommon;

public class Attribute_DataProvider extends BaseOrCommon{
		
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
	
	@DataProvider(name = "credentials")
	public Object[][] addCredentials(){
		
		Object[][] values = new Object[3][2];
		
		values[0][0] = "Divya";
		values[0][1] = "Divya@test";
		
		values[1][0] = "Testing";
		values[1][1] = "selenium@test";
		
		values[2][0] = "narmada";
		values[2][1] = "Deepika@test";		
		
		return values;			
	}
			
	
	@Test (priority = 1, dataProvider = "credentials")
	public void enterCredentials(String username, String password) {
		
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		
		System.out.println("in @enterCredentials method");

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
