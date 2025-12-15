package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageFooterTextPage;
import utilities.ExcelUtilities;

public class ManageFooterTextTest extends Base {
	HomePage homePage;
	ManageFooterTextPage manageFooterTextPage;
	@Test (description = "used to verify that the user is able to update footer text information")
	public void validateThatUserIsAbleToUpdateFooterTextInformation() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		
		//ManageFooterTextPage manageFooterTextPage = new ManageFooterTextPage(driver);
		String address = ExcelUtilities.readStringData(1, 0, "managefootertext");
		String email = ExcelUtilities.readStringData(1, 1, "managefootertext");
		String phoneNumber = ExcelUtilities.readIntegerData(1, 2, "managefootertext");
		manageFooterTextPage = homePage.clickOnManageFooterTextMoreInfo();
		manageFooterTextPage.clickOnNewFooterTextButton();
		manageFooterTextPage.enterAddress(address);
		manageFooterTextPage.enterEmail(email);
		manageFooterTextPage.enterPhoneNum(phoneNumber);
		manageFooterTextPage.clickOnUpdateFooterTextButton();
		manageFooterTextPage.isFooterTextAlertDisplayed();
		boolean footer_Alert = manageFooterTextPage.isFooterTextAlertDisplayed();
		Assert.assertTrue(footer_Alert);
	}
}
