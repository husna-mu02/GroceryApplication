package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class AdminUsersPage {
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] ")WebElement MoreInfo;
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
	
	public void clickTheAdminUsers() {
		MoreInfo.click();
	}
	public void clickNew() {
		NewButton.click();
	}
	public void enterTheUsername(String adminUsername) {
		UsernameField.sendKeys(adminUsername);
	}
	public void enterThePassword(String adminPassword) {
		PasswordField.sendKeys(adminPassword);
	}
	public void selectUserType() {
		PageUtilities pageUtilities = new PageUtilities();
		pageUtilities.selectByVisibleText(UserType, "Admin");
	}
	public void clickSaveButton() {
		SaveButton.click();
	}
	public boolean isAlertDisplayed() {
		return AdminAlert.isDisplayed();
		
	}
	
}
