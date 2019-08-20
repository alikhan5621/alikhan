package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


import page.LoginPage;
import util.BrowserFactory;

public class LoginTest {

	WebDriver driver;

	@BeforeMethod
	public void launchBrowser() {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void validUserShouldBeAbleToLogin() {

		// Take you to the site
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");

		// Calling LoginPage Class or Activate
		LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

		

		// Call the login method from the LoginPage Class
		loginPage.login("opensourcecms", "opensourcecms");

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
