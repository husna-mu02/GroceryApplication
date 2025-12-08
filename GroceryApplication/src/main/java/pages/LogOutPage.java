package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogOutPage {
	@FindBy(xpath = "//a[@data-toggle='dropdown']")WebElement admin;
	@FindBy(xpath = "//i[@class='ace-icon fa fa-power-off']")WebElement logout;
	@FindBy(xpath = "//b[text()='7rmart supermarket']")WebElement signInPage;
	
	public WebDriver driver;
	public LogOutPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void clickOnAdmin() {
		admin.click();
	}
	public void clickOnLogOut() {
		logout.click();
	}
	public boolean isSignInPageDisplayed() {
		return signInPage.isDisplayed();
	}
}
