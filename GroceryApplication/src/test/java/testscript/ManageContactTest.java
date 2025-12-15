package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageContactPage;
import utilities.ExcelUtilities;

public class ManageContactTest extends Base{
	HomePage homePage;
	ManageContactPage manageContactPage;
	@Test (description = "used to verify that the user is able to manage contact")
	public void verifyThatUserIsAbleToManageContact() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		
		//ManageContactPage manageContactPage = new ManageContactPage(driver);
		String PhoneNum = ExcelUtilities.readIntegerData(1, 0, "managecontact");
		String EmailID = ExcelUtilities.readStringData(1, 1, "managecontact");
		String Address = ExcelUtilities.readStringData(1, 2, "managecontact");
		String DeliveryTime = ExcelUtilities.readIntegerData(1, 3, "managecontact");
		String DeliveryTimeLimit = ExcelUtilities.readIntegerData(1, 4, "managecontact");
		manageContactPage =  homePage.clickOnManageContactMoreInfo();
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
