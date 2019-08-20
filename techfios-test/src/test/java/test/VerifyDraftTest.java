package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import page.BasePage;
import page.DashboardPage;
import page.LoginPage;
import page.VerifyDraftPage;
import util.BrowserFactory;

public class VerifyDraftTest {

	WebDriver driver;
//123333
	@BeforeMethod
	public void launchBrowser() {
		// Starts the browser and saves the driver in the test class
		driver = BrowserFactory.startBrowser();
	}

	@Test
	public void Validatedraft() {

		// Take you to the site
		driver.get("https://s1.demo.opensourcecms.com/wordpress/wp-login.php");

		

		VerifyDraftPage VerifyDraft = PageFactory.initElements(driver, VerifyDraftPage.class);
		VerifyDraft.login("opensourcecms", "opensourcecms");
		
	
		
	}
	
	
	
	
	
	
	
	
}
