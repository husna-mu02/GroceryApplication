package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(name = "username")WebElement userName;
	@FindBy(xpath = "//input[@name='password']")WebElement passWord;
	@FindBy(xpath = "//button[text()='Sign In']")WebElement signIn;
	@FindBy(xpath = "//p[text()='Dashboard']")WebElement dashBoard;
	@FindBy(xpath = "//button[@type='button' and @class='close']")WebElement alert;
	
	public WebDriver driver; 
	public LoginPage(WebDriver driver) {
		//driver = driver; here both are local, so use this keyword
		this.driver = driver;
		PageFactory.initElements(driver, this);//initElements used to initialise web elements
	}
	
	public LoginPage enterTheUsername(String userName2) {
		userName.sendKeys(userName2);
		return this;
	}
	public LoginPage enterThePassword(String passWord2) {
		passWord.sendKeys(passWord2);
		return this;
	}
	public HomePage clickTheSighIn() {
		signIn.click();
		return new HomePage(driver);
	}
	public boolean isHomePageDisplayed() {
	return dashBoard.isDisplayed();
	}
	
	public boolean isAlertDisplayed() {
	return alert.isDisplayed();
	}

}
