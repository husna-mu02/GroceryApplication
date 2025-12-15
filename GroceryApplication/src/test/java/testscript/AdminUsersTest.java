package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.AdminUsersPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;
import utilities.FakerUtilities;

public class AdminUsersTest extends Base {
	HomePage homePage;
	AdminUsersPage adminUsersPage;
	@Test (description = "used to verify that the user is save the admin users information", groups= {"regression"})
	public void verifyThatUserIsAbleToNavigateToAdminUsersPage() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		
		FakerUtilities fakerUtilities = new FakerUtilities();
		String adminUsername = fakerUtilities.creatARandomFirstName();
		String adminPassword = fakerUtilities.creatARandomFirstName();
		//String adminUsername = ExcelUtilities.readStringData(0, 0, "adminuserspage");
		//String adminPassword = ExcelUtilities.readStringData(0, 1, "adminuserspage");
		//AdminUsersPage adminUsersPage = new AdminUsersPage(driver);
		adminUsersPage = homePage.clickTheAdminUsersMoreInfo();
		adminUsersPage.clickNew().enterTheUsername(adminUsername).enterThePassword(adminPassword).selectUserType().clickSaveButton();
		//adminUsersPage.enterTheUsername(adminUsername);
		//adminUsersPage.enterThePassword(adminPassword);
		//adminUsersPage.selectUserType();
		//adminUsersPage.clickSaveButton();
		adminUsersPage.isAlertDisplayed();
		boolean adminAlertDisplayed = adminUsersPage.isAlertDisplayed();
		Assert.assertTrue(adminAlertDisplayed);

	}
}
