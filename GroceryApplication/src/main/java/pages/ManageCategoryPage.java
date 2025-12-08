package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageCategoryPage {
	@FindBy(xpath = "//a[@href='https://groceryapp.uniqassosiates.com/admin/list-category']//child::p")WebElement manageCategory;
	@FindBy(xpath = "//a[@onclick='click_button(1)']")WebElement newButton;
	@FindBy(xpath = "//input[@placeholder='Enter the Category']")WebElement category;
	@FindBy(id = "134-selectable")WebElement selectGroups;
	@FindBy(xpath = "//input[@id='main_img']")WebElement chooseFile;
	@FindBy(xpath = "//input[@name='top_menu' and @value='yes']")WebElement showOnTopMenu;
	@FindBy(xpath = "//input[@name='show_home' and @value='yes']")WebElement showOnLeftMenu;
	@FindBy(xpath = "//button[text()='Save']")WebElement saveButton;
	@FindBy(xpath = "//button[@aria-hidden='true']")WebElement addCategoryAlert;
	
	public WebDriver driver;
	public ManageCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void clickOnManageCategory() {
		manageCategory.click();
	}
	public void clickOnNewButton() {
		newButton.click();
	}
	public void enterCategory(String category2) {
		category.sendKeys(category2);
	}
	public void clickOnDiscount() {
		selectGroups.click();
	}
	public void chooseFile() {
		chooseFile.sendKeys("C:\\Users\\salma\\Desktop\\superhusna\\foto\\sun.png");
	}
	public void selectYesFromShowOnTopMenu() {
		if(showOnTopMenu.isSelected()) {
			System.out.println("YES button is already selected.");
		}
		else {
			showOnTopMenu.click();
		}
	}
	public void selectYesFromShowOnLeftMenu() {
		if(showOnLeftMenu.isSelected()) {
			System.out.println("YES button is already selected.");
		}
		else {
			showOnLeftMenu.click();
		}
	}
	public void clickOnSaveButton() {
		//saveButton.click();
		PageUtilities pageUtilities = new PageUtilities();
		pageUtilities.clickbyJS(driver, saveButton);
	}
	public boolean isCategoryAlertCreated() {
		return addCategoryAlert.isDisplayed();
	}
}
