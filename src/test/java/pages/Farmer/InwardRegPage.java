package pages.Farmer;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class InwardRegPage {
	WebDriver driver;
	WebDriverWait wait;
	
//	@FindBy (xpath="//span[text()='Farmer']")
//	private WebElement farmer;
	
	@FindBy(xpath="//h1[text()=' Inward commodity Details / ಸರಕು ಸ್ವೀಕರಿಸಿಕೊಳ್ಳುವ ವಿವರಗಳು ']")
	private WebElement InwardPageHeader;
	
	@FindBy(id="custId")
	private WebElement RegistrationID;
	
	@FindBy(id=("_getcutDataById"))
	private WebElement GetData;
	
	@FindBy(id="materialCatId")
	private WebElement MatirialCategory;
	
	@FindBy(id="ddlMaterial")
	private WebElement CommodityName;
	
	@FindBy(id="ddlPackages")
	private WebElement PackageType;
	
	@FindBy(id="QualityGoods")
	private WebElement CommodityGrade;
	
	@FindBy(id="inward_quantity")
	private WebElement InwardQuantity;
	
	@FindBy(id="SaveInward_NofBags")
	private WebElement NumberOfBags;
	
	@FindBy(id="SaveInward_ir_tentative_withdrawn_date")
	private WebElement ExpOutwardDate;
	
	@FindBy(id="saveInward_for_farmer_gok_rebate_figk_farmer_land_area")
	private WebElement LandInAcres;
	
	@FindBy(id="saveInward_for_farmer_gok_rebate_figk_farmer_land_gunta")
	private WebElement LandInGunta;
	
	@FindBy(id="saveInward_for_farmer_gok_rebate_figk_crop_year")
	private WebElement CropYear;
	
	@FindBy(id="saveInward_for_farmer_gok_rebate_figk_season_type")
	private WebElement SeasonType;
	
	@FindBy (id="SaveQualityChk_qci_moisture")
	private WebElement Moisture;
	
	@FindBy (id="SaveQualityChk_qci_pest")
	private WebElement pest;
	
	@FindBy (id="ShowWeimentDetails_MarketValue")
	private WebElement MarketValue;
	
	@FindBy (id="ShowWeimentDetails_BagMarking")
	private WebElement BagMarking;
	
	@FindBy (id="getTruckDetailsweighmentaction_0__td_owner_or_driver_name")
	private WebElement DriverName;
	
	@FindBy(id="getTruckDetailsweighmentaction_0__td_number")
	private WebElement VehicleNumber;
	
	@FindBy(id="getTruckDetailsweighmentaction_0__td_quantity")
	private WebElement Quantity;
	
	@FindBy (id="getTruckDetailsweighmentaction_0__No_of_Bags") 
	private WebElement NumberOfBag;
	
	@FindBy (id="getTruckDetailsweighmentaction_0__Vehicle_Type_id")
	private WebElement VehicleType;
	
	@FindBy (id="Oqtyctrl_ir_remarks")
	private WebElement Remark;
	
	@FindBy (id="trader_inward_reg")
	private WebElement Submit;
	
	@FindBy (xpath="//div[@aria-disabled='false' and @class='icheckbox_minimal-blue']")
	private WebElement CheckBox;
	
	@FindBy (xpath="//input[@value='Submit' and @onclick='saveform();']")//*[@id=\"row_Submit\"]/div[2]/input[2]
	private WebElement submit;
	
	@FindBy (xpath = "//button[text()='OK']")
	private WebElement okay;
	
	@FindBy (xpath="//label[text()='Customer Details / ಗ್ರಾಹಕರ  ವಿವರಗಳು']")
	private WebElement preview;
	
	@FindBy (className="bootbox-alert")
	private WebElement InwardRegID;
	 
	@FindBy (xpath = "//button[text()='OK']")
	private WebElement ok;
	
	public InwardRegPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		wait=new WebDriverWait(driver, 50);
	}
	
	public void InwardRegPageData(String registrationId) throws Throwable {
		SoftAssert soft=new SoftAssert();
		//wait.until(ExpectedConditions.visibilityOf(InwardPageHeader));
		System.out.println(InwardPageHeader.getText());
		soft.assertEquals(InwardPageHeader.getText(),"Inward commodity Details / ಸರಕು ಸ್ವೀಕರಿಸಿಕೊಳ್ಳುವ ವಿವರಗಳು");
		InwardPageHeader.click();
		
		RegistrationID.sendKeys(registrationId);
		
		GetData.click();
		
		MatirialCategory.click();
		wait.until(ExpectedConditions.visibilityOf(MatirialCategory));
		Select category=new Select(MatirialCategory);
		category.selectByIndex(1);
		
		Thread.sleep(10000);
		CommodityName.click();
		
		wait.until(ExpectedConditions.visibilityOf(CommodityName));
		Select CName=new Select(CommodityName);
		CName.selectByIndex(1);
		
		Thread.sleep(10000);
		PackageType.click();
		wait.until(ExpectedConditions.visibilityOf(PackageType));
		Select PType=new Select(PackageType);
		PType.selectByIndex(2);
		
		CommodityGrade.click();
		wait.until(ExpectedConditions.visibilityOf(CommodityGrade));
		Select CGrade=new Select(CommodityGrade);
		CGrade.selectByIndex(1);
		
		InwardQuantity.sendKeys("100.00");
		
		NumberOfBags.sendKeys("50");
		
		ExpOutwardDate.sendKeys("30-12-2023");
		
		LandInAcres.sendKeys("20");
		
		LandInGunta.sendKeys("10");
		
		CropYear.click();
		wait.until(ExpectedConditions.visibilityOf(CropYear));
		Select CYear=new Select(CropYear); 
		CYear.selectByIndex(1);
		
		SeasonType.click();
		wait.until(ExpectedConditions.visibilityOf(SeasonType));
		Select SType=new Select(SeasonType);
		SType.selectByIndex(1);
		
		Moisture.sendKeys("14.00");
		
		pest.sendKeys("no");
		
		MarketValue.sendKeys("1500.00");
		
		BagMarking.sendKeys("no");
		
		DriverName.sendKeys("Karthik");
		
		VehicleNumber.sendKeys("KA05KF4250");
		
		Quantity.sendKeys("100.00");
		
		NumberOfBag.sendKeys("50");
		
		VehicleType.click();
		wait.until(ExpectedConditions.visibilityOf(VehicleType));
		Select Vtype=new Select(VehicleType);
		Vtype.selectByIndex(2);
		
		Remark.sendKeys("No Remarks");
		
		Submit.click();
		
	System.out.println(preview.getText());
		
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,1500)");
		//System.out.println();
		
		wait.until(ExpectedConditions.visibilityOf(CheckBox));
		CheckBox.click();
		
		Thread.sleep(10000);
		Actions action=new Actions(driver);
	//	wait.until(ExpectedConditions.visibilityOf(submit));
		action.moveToElement(submit).perform();
		submit.click();
		
		Thread.sleep(10000);
		//wait.until(ExpectedConditions.visibilityOf(okay));
		okay.click();
		InwardGetID();
		ok.click();
		
	}
	
	
	public String InwardGetID() throws Throwable{
		System.out.println("Enter");
		//wait.until(ExpectedConditions.visibilityOf(InwardRegID));
		InwardRegID.isDisplayed();
		
		Thread.sleep(10000);

		int len=InwardRegID.getText().length();
		//wait.until(ExpectedConditions.visibilityOf(len));
		String ReferNum=InwardRegID.getText().substring(len-8);
		System.out.println(ReferNum);
		return ReferNum;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
