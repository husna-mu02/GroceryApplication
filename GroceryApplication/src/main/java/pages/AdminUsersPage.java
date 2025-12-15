package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class AdminUsersPage {
	
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement NewButton;
	@FindBy(xpath = "//input[@id='username']")WebElement UsernameField;
	@FindBy(xpath = "//input[@id='password']")WebElement PasswordField;
	@FindBy(xpath = "//select[@id='user_type']")WebElement UserType;
	@FindBy(xpath = "//button[@name='Create']")WebElement SaveButton;
	@FindBy(xpath = "//button[@aria-hidden='true']")WebElement AdminAlert;
	
	public WebDriver driver;
	public AdminUsersPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public AdminUsersPage clickNew() {
		NewButton.click();
		return this;
	}
	public AdminUsersPage enterTheUsername(String adminUsername) {
		UsernameField.sendKeys(adminUsername);
		return this;
	}
	public AdminUsersPage enterThePassword(String adminPassword) {
		PasswordField.sendKeys(adminPassword);
		return this;
	}
	public AdminUsersPage selectUserType() {
		PageUtilities pageUtilities = new PageUtilities();
		pageUtilities.selectByVisibleText(UserType, "Admin");
		return this;
	}
	public AdminUsersPage clickSaveButton() {
		SaveButton.click();
		return this;
	}
	public boolean isAlertDisplayed() {
		return AdminAlert.isDisplayed();
		
	}
	
}
