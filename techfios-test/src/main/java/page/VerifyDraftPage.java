package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class VerifyDraftPage {

	WebDriver driver;

	// Every Page must have a constructor to invite the driver
	public VerifyDraftPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.ID, using = "user_login")
	WebElement UserName;
	@FindBy(how = How.ID, using = "user_pass")
	WebElement Password;
	@FindBy(how = How.NAME, using = "wp-submit")
	WebElement SignInButton;
	@FindBy(how = How.XPATH, using = "//div[text()='Posts']")
	WebElement RecentDraft;

	// Methods to interact with the elements
	public void login(String userName, String password) {
		UserName.sendKeys(userName);
		Password.sendKeys(password);
		SignInButton.click();
		RecentDraft.click();
	}
	
	
	
	
	

}
