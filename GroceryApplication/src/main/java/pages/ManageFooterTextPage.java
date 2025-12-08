package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageFooterTextPage {
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement manageFooterText;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/Footertext/edit?edit=1']")WebElement newButton;
	@FindBy(xpath = "//textarea[@placeholder='Enter the Address']")WebElement address;
	@FindBy(xpath = "//input[@id='email']")WebElement email;
	@FindBy(xpath = "//input[@id='phone']")WebElement phoneNum;
	@FindBy(xpath = "//button[@class='btn btn-block-sm btn-info']")WebElement updateFooterText;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement footerTextAlert;
	
	public WebDriver driver;
	public ManageFooterTextPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageFooterText() {
		manageFooterText.click();
	}
	public void clickOnNewFooterTextButton() {
		newButton.click();
	}
	public void enterAddress(String address2) {
		address.clear();
		address.sendKeys(address2);
	}
	public void enterEmail(String email2) {
		email.clear();
		email.sendKeys(email2);
	}
	public void enterPhoneNum(String phoneNumber) {
		phoneNum.clear();
		phoneNum.sendKeys(phoneNumber);
	}
	public void clickOnUpdateFooterTextButton() {
		updateFooterText.click();
	}
	public boolean isFooterTextAlertDisplayed() {
		return footerTextAlert.isDisplayed();
	}
}
