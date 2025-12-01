package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.AdminUsersPage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class AdminUsersTest extends Base {
	@Test
	public void verifyThatUserIsAbleToNavigateToAdminUsersPage() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username);
		loginPage.enterThePassword(password);
		loginPage.clickTheSighIn();
		
		String adminUsername = ExcelUtilities.readStringData(0, 0, "adminuserspage");
		String adminPassword = ExcelUtilities.readStringData(0, 1, "adminuserspage");
		AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage.clickTheAdminUsers();
		adminUsersPage.clickNew();
		adminUsersPage.enterTheUsername(adminUsername);
		adminUsersPage.enterThePassword(adminPassword);
		adminUsersPage.selectUserType();
		adminUsersPage.clickSaveButton();
		adminUsersPage.isAlertDisplayed();
		boolean adminAlertDisplayed = adminUsersPage.isAlertDisplayed();
		Assert.assertTrue(adminAlertDisplayed);

	}
}
