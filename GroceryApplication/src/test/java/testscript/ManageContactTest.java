package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base{
	@Test (priority = 7)
	public void verifyThatUserIsAbleToManageContact() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username);
		loginPage.enterThePassword(password);
		loginPage.clickTheSighIn();
		
		ManageContactPage manageContactPage = new ManageContactPage(driver);
		String PhoneNum = ExcelUtilities.readIntegerData(1, 0, "managecontact");
		String EmailID = ExcelUtilities.readStringData(1, 1, "managecontact");
		String Address = ExcelUtilities.readStringData(1, 2, "managecontact");
		String DeliveryTime = ExcelUtilities.readIntegerData(1, 3, "managecontact");
		String DeliveryTimeLimit = ExcelUtilities.readIntegerData(1, 4, "managecontact");
		manageContactPage.clickOnMoreInfo();
		manageContactPage.clickOnActionIcon();
		manageContactPage.enterPhoneNumber(PhoneNum);
		manageContactPage.enterEmail(EmailID);
		manageContactPage.enterTheAddress(Address);
		manageContactPage.enterDeliveryTime(DeliveryTime);
		manageContactPage.enterDeliveryChargeLimit(DeliveryTimeLimit);
		manageContactPage.clickOnUpdateButton();
		manageContactPage.isUpdateAlertDisplayed();
		boolean update_alert = manageContactPage.isUpdateAlertDisplayed();
		Assert.assertTrue(update_alert);
	}
}
