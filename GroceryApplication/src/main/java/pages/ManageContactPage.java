package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageContactPage {
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/contact/edit_contact?edit=1' and @class='btn btn-sm btn btn-primary btncss']") WebElement ActionIcon;
	@FindBy(xpath = "//input[@id='phone']") WebElement Phone;
	@FindBy(xpath = "//input[@id='email']")WebElement Email;
	@FindBy(xpath = "//textarea[@name='address']")WebElement Address;
	@FindBy(xpath = "//textarea[@name='del_time']")WebElement DeliveryTime;
	@FindBy(xpath = "//input[@name='del_limit']")WebElement DeliveryChargeLimit;
	@FindBy(xpath = "//button[@name='Update']")WebElement UpdateButton;
	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")WebElement alertDisplayed;

public WebDriver driver;
	
	public ManageContactPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public ManageContactPage clickOnActionIcon()
	{
		ActionIcon.click();
		return this;
	}
	public ManageContactPage enterPhoneNumber(String phoneNum)
	{
		Phone.clear();
		Phone.sendKeys(phoneNum);
		return this;
	}
	public ManageContactPage enterEmail(String emailID)
	{
		Email.clear();
		Email.sendKeys(emailID);
		return this;
	}
	public ManageContactPage enterTheAddress(String address2)
	{
		Address.clear();
		Address.sendKeys(address2);
		return this;
	}
	public ManageContactPage enterDeliveryTime(String deliveryTime2)
	{
		DeliveryTime.clear();
		DeliveryTime.sendKeys(deliveryTime2);
		return this;
	}
	public ManageContactPage enterDeliveryChargeLimit(String deliveryTimeLimit)
	{
		DeliveryChargeLimit.clear();
		DeliveryChargeLimit.sendKeys(deliveryTimeLimit);
		return this;
	}
	public ManageContactPage clickOnUpdateButton()
	{
		//UpdateButton.click();
		PageUtilities pageUtilities = new PageUtilities();
		pageUtilities.clickbyJS(driver, UpdateButton);
		return this;
	}
	public boolean isUpdateAlertDisplayed()
	{
		return alertDisplayed.isDisplayed();
	}

}