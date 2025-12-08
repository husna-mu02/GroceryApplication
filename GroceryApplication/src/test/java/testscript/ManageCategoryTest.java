package testscript;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import pages.ManageCategoryPage;
import utilities.ExcelUtilities;

public class ManageCategoryTest extends Base {
	
	@Test (priority = 9)
	public void validateThatUserIsAbleToManageCategories() throws IOException {
		String username = ExcelUtilities.readStringData(1, 0, "loginpage");
		String password = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username);
		loginPage.enterThePassword(password);
		loginPage.clickTheSighIn();
		
		ManageCategoryPage manageCategoryPage = new ManageCategoryPage(driver);
		String category = ExcelUtilities.readStringData(0, 0, "managecategory");
		manageCategoryPage.clickOnManageCategory();
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
