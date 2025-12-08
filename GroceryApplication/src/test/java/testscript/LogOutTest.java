package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LogOutTest extends Base{
	@Test (priority = 10)
	public void VerifyThatUserIsAbleToLogOut() throws IOException {
		String Username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String Password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(Username);
		loginPage.enterThePassword(Password);
		loginPage.clickTheSighIn();
		
		LogOutPage logOutPage = new LogOutPage(driver);
		logOutPage.clickOnAdmin();
		logOutPage.clickOnLogOut();
		logOutPage.isSignInPageDisplayed();
		boolean signInPage = logOutPage.isSignInPageDisplayed();
		Assert.assertTrue(signInPage);
		
	}
}
