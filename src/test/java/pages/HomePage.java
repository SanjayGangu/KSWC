package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class HomePage {

	@FindBy(xpath  = "//span[text()='Warehouse Manager Mandya U-I']")
	private WebElement homePageHeader;
	
	@FindBy(xpath = "//span[text()='Customer Registration']")
	private WebElement customerRegistration;
	
	@FindBy(xpath = "//a[contains(text(),'  Farmer Registration')]")
	private WebElement farmerRegistartion;
	
	@FindBy(xpath="//span[text()='Farmer']")
	private WebElement FarmerPage;
	
	@FindBy(xpath="//a[@href='/Inward/SimpleInwardReg']")
	private WebElement Inward;
	
	@FindBy(xpath="//a[@href='/Godown/GodownFOrFarmerList']")
	private WebElement inWardGodownAllocation;
	
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void validateHomePageHeader() {
		Assert.assertTrue(homePageHeader.isDisplayed());
	}
	
	public void clickOnCustomerRegistration() {
		customerRegistration.isDisplayed();
		customerRegistration.click();
	}
	
	public void clickOnFarmerRegistartion() {
		farmerRegistartion.isDisplayed();
		farmerRegistartion.click();
	
	}
	
	public HomePage clickOnFarmerPage() {
		FarmerPage.isDisplayed();
		FarmerPage.click();
		return this;
	}
	
	public HomePage clickOnInward() {
		Inward.isDisplayed();
		Inward.click();
		return this;
	}
	
	public void clickOnInWardAllocation() {
	inWardGodownAllocation.isDisplayed();
	inWardGodownAllocation.click();
	}
	
	
	
}
