package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']//child::p")WebElement manageCategoryMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-contact' and @class=' nav-link']") WebElement ManageContactMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-footertext' and @class='small-box-footer']")WebElement manageFooterTextMoreInfo;
	@FindBy(xpath = "//a[@class='small-box-footer' and @href='https://groceryapp.uniqassosiates.com/admin/list-news']")WebElement manageNewsMoreInfo;
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-admin' and @class='small-box-footer'] ")WebElement adminUsersMoreInfo;
	
	public WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public ManageCategoryPage clickOnManageCategoryMoreInfo() {
		manageCategoryMoreInfo.click();
		return new ManageCategoryPage(driver);
	}
	public ManageContactPage clickOnManageContactMoreInfo()
	{
		ManageContactMoreInfo.click();
		return new ManageContactPage(driver);
	}
	public ManageFooterTextPage clickOnManageFooterTextMoreInfo() {
		manageFooterTextMoreInfo.click();
		return new ManageFooterTextPage(driver);
	}
	public ManageNewsPage clickTheManageNewsMoreInfo() {
		manageNewsMoreInfo.click();
		return new ManageNewsPage(driver);
	}
	public AdminUsersPage clickTheAdminUsersMoreInfo() {
		adminUsersMoreInfo.click();
		return new AdminUsersPage(driver);
	}
	
	  
}
