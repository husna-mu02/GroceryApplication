package testscript;

import java.io.IOException;
import java.lang.invoke.ConstantBootstraps;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import constant.Constant;
import pages.HomePage;
import pages.LoginPage;
import utilities.ExcelUtilities;

public class LoginTest extends Base {
	
	HomePage homePage;
	@Test (description = "used to verify that the user is able to login using valid credentials")
	public void verifyTheUserIsAbleToLoginUsingValidCredentials() throws IOException {
		String userName = ExcelUtilities.readStringData(1, 0, "loginpage");
		String passWord = ExcelUtilities.readStringData(1, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(userName).enterThePassword(passWord);
		//loginPage.enterThePassword(passWord);
		homePage =  loginPage.clickTheSighIn();
		boolean homepage = loginPage.isHomePageDisplayed();
		Assert.assertTrue(homepage, Constant.LOGINCORRECTUSERNAMEANDPASSWORD);
	}
	@Test (description = "used to verify that the user is unable to login using valid username and invalid password")
	public void verifyTheUserIsUnableToLoginUsingInvalidPassword() throws IOException {
		String username = ExcelUtilities.readStringData(2, 0, "loginpage");
		String password = ExcelUtilities.readStringData(2, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		boolean alert = loginPage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDPASSWORD);
	}
	@Test (description = "used to verify that the user is unable to login using invalid username and valid password")
	public void verifyTheUserIsUnableToLoginUsingInvalidUsername() throws IOException {
		String username =ExcelUtilities.readStringData(3, 0, "loginpage");
		String password = ExcelUtilities.readStringData(3, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		boolean alert = loginPage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDUSERNAME);
	}
	@Test (description = "used to verify that the user is unable to login using invalid username and password")
	public void verifyTheUserIsUnableToLoginUsingInvalidPasswordAndUsername() throws IOException {
		String username = ExcelUtilities.readStringData(4, 0, "loginpage");
		String password = ExcelUtilities.readStringData(4, 1, "loginpage");
		LoginPage loginPage = new LoginPage(driver);
		loginPage.enterTheUsername(username).enterThePassword(password);
		//loginPage.enterThePassword(password);
		homePage = loginPage.clickTheSighIn();
		boolean alert = loginPage.isAlertDisplayed();
		Assert.assertTrue(alert, Constant.LOGININVALIDUSERNAMEANDPASSWORD);
		
		
	}
	@Test(description="userlogin with invalid username and invalid password",dataProvider ="LoginProvider")
	public void VerifyUserLoginUsingInvalidUsernameAndInvalidPassword(String username,String password) throws IOException
	{
		//String username=ExcelUtilities.getStringData(4, 0, "loginpage");
		//String password=ExcelUtilities.getStringData(4, 1, "loginpage");
		LoginPage loginpage=new LoginPage(driver);
		loginpage.enterTheUsername(username);
		loginpage.enterThePassword(password);
		loginpage.clickTheSighIn();
		boolean alert=loginpage.isAlertDisplayed();
		Assert.assertTrue(alert,Constant.LOGININVALIDUSERNAMEANDPASSWORD);
		
	}
	@DataProvider(name="LoginProvider")
	public Object[][] getDataFromTestData() throws IOException{
		return new Object[][] {{ExcelUtilities.readStringData(4, 0,"loginpage"),ExcelUtilities.readStringData(4,1,"loginpage")}};
		
	
	
	}
}
