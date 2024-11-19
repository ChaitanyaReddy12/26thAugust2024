package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Narmada {

	public WebDriver driver;

	public Narmada(WebDriver driver) {

		this.driver = driver;
	}

	// Syntax: accessmodifier By webelementname = By.locator(“”);

	// 2nd way

	public By username_Textbox = By.xpath("//input[@name='username']");

	public By cancel_Button = By.xpath("//button[@type='button']");

	public By resetPassword_Button = By.xpath("//button[@type='submit']");

}
