package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.LogOutPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class HomeTest extends Base{
	@Test (description = "used to verify that the user is able to logout")
	public void VerifyThatUserIsAbleToLogOut() throws IOException {
		String Username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String Password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(Username).enterThePassword(Password);
		//loginPage.enterThePassword(Password);
		loginPage.clickTheSighIn();
		
		
	}
}
