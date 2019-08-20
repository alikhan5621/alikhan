package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

	WebDriver driver; // Global

	// Every Page must have a constructor to invite the driver
	public DashboardPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library
	@FindBy(how = How.XPATH, using = "//h1[contains(text(),'Dashboard')]")

	WebElement PageTitle;

	@FindBy(how = How.NAME, using = "post_title")
	WebElement Title;

	@FindBy(how = How.ID, using = "content")
	WebElement Content;

	@FindBy(how = How.ID, using = "save-post")
	WebElement Save;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'View all')]")
	WebElement RecentDrafts;

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Ali Khan')]")
	WebElement AliKhan;

	// Methods to interact with the elements

	BasePage basePage = PageFactory.initElements(driver, BasePage.class);

	/*
	 * public void waitForPage() { BasePage.waitForElement(Title, driver); }
	 */

	public void quickDraft (String description, String content) {
		
		BasePage.waitForElement(Title, driver);
		
		Title.sendKeys(description);
		Content.sendKeys(content);
		Save.click();
	
	}}

