package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import pages.ManageCategoryPage;
import pages.ManageNewsPage;
import utilities.ExcelUtilities;

public class ManageCategoryTest extends Base {
	HomePage homePage;
	ManageCategoryPage manageCategoryPage;
	
	@Test (description = "used to verify that the user is able to manage categories")
	public void validateThatUserIsAbleToManageCategories() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		
		//ManageCategoryPage manageCategoryPage = new ManageCategoryPage(driver);
		String category = ExcelUtilities.readStringData(0, 0, "managecategory");
		//manageCategoryPage.clickOnManageCategoryMoreInfo();
		manageCategoryPage= homePage.clickOnManageCategoryMoreInfo();
		manageCategoryPage.clickOnNewButton();
		manageCategoryPage.enterCategory(category);
		manageCategoryPage.clickOnDiscount();
		manageCategoryPage.chooseFile();
		manageCategoryPage.selectYesFromShowOnTopMenu();
		manageCategoryPage.selectYesFromShowOnLeftMenu();
		manageCategoryPage.clickOnSaveButton();
		manageCategoryPage.isCategoryAlertCreated();
		boolean categoryAlert = manageCategoryPage.isCategoryAlertCreated();
		Assert.assertTrue(categoryAlert);
		
		
	}
}
