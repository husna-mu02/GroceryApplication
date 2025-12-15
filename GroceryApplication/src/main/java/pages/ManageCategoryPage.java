package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.PageUtilities;

public class ManageCategoryPage {
	
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
	
	public ManageCategoryPage clickOnNewButton() {
		newButton.click();
		return this;
	}
	public ManageCategoryPage enterCategory(String category2) {
		category.sendKeys(category2);
		return this;
	}
	public ManageCategoryPage clickOnDiscount() {
		selectGroups.click();
		return this;
	}
	public ManageCategoryPage chooseFile() {
		chooseFile.sendKeys("C:\\Users\\salma\\Desktop\\superhusna\\foto\\sun.png");
		return this;
	}
	public ManageCategoryPage selectYesFromShowOnTopMenu() {
		if(showOnTopMenu.isSelected()) {
			System.out.println("YES button is already selected.");
		}
		else {
			showOnTopMenu.click();
		}
		return this;
	}
	public ManageCategoryPage selectYesFromShowOnLeftMenu() {
		if(showOnLeftMenu.isSelected()) {
			System.out.println("YES button is already selected.");
		}
		else {
			showOnLeftMenu.click();
		}
		return this;
	}
	public ManageCategoryPage clickOnSaveButton() {
		//saveButton.click();
		PageUtilities pageUtilities = new PageUtilities();
		pageUtilities.clickbyJS(driver, saveButton);
		return this;
	}
	public boolean isCategoryAlertCreated() {
		return addCategoryAlert.isDisplayed();
	}
}
