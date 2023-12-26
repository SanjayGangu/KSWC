package pages.CustomerRegPages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class FarmerRegPage {
	WebDriver driver;
	WebDriverWait slow;
	
	@FindBy(xpath="//h1[text()='Farmer Registration / ರೈತರ ನೋಂದಣಿ']")
	private WebElement FarmerRegHeader;
	
	@FindBy(xpath="//input[@ng-model='FirstName']")
	private WebElement Name;
	
	@FindBy(id="fm_father_name")
	private WebElement FatherName;
	
	@FindBy(id="txt_age")
	private WebElement age;
	
	@FindBy(id="Gender")
	private WebElement gender;
	
	@FindBy(id="fm_mobile_number")
	private WebElement MobileNumber;
	
	@FindBy(id="Caste")
	private WebElement caste;
	
	@FindBy(id="fm_address")
	private WebElement adress;
	
	@FindBy(id="ddlDistrict")
	private WebElement distict;
	
	@FindBy(id="Taluka")
	private WebElement taluk;
	
	@FindBy(id="Hobli")
	private WebElement hobli;
	
	@FindBy(id="Village")
	private WebElement village;
	
	@FindBy(id="btnSave")
	private WebElement submit;
	
	@FindBy(xpath="//div[@class='icheckbox_minimal-blue']")
	private WebElement checkBox;
	
	@FindBy(xpath="//input[@class='btn btn-success'and@onclick='saveform();']")
	private WebElement FinalSubmit;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement okey;
	
	@FindBy(xpath="//button[contains(text(),'OK')]")
	private WebElement okybutton;
	
	@FindBy (className ="bootbox-body")
	private WebElement RegID;
	
	public FarmerRegPage(WebDriver driver) {
		this.driver=driver;
		slow=new WebDriverWait(driver, 15);
		PageFactory.initElements(driver, this);
	}
	
	public String FarmerRegPageValues() throws Throwable  {
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(FarmerRegHeader.getText(), "Farmer Registration / ರೈತರ ನೋಂದಣಿ");
		FarmerRegHeader.click();
		Name.sendKeys("karthik");
		FatherName.sendKeys("Lokesh");
		age.sendKeys("27");
		
		gender.click();
		
		slow.until(ExpectedConditions.visibilityOf(gender));
//		slow.until(null)
		Select gen=new Select(gender);
		gen.selectByIndex(1);
		
	
//		JavascriptExecutor js=(JavascriptExecutor)driver;
//		js.executeScript("window.scrollBy(0,500)");
		
		
		//Thread.sleep(2000);
		slow.until(ExpectedConditions.visibilityOf(MobileNumber));
		MobileNumber.sendKeys("8197292096");
		
		//Thread.sleep(2000);
		slow.until(ExpectedConditions.visibilityOf(caste));
		Select Caste=new Select(caste);
		Caste.selectByIndex(2);
		
		//Thread.sleep(2000);
		slow.until(ExpectedConditions.visibilityOf(adress));
		adress.sendKeys("Sunkadakatte,Banglore");
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(distict));
		Select Distict=new Select(distict);
		Distict.selectByIndex(18);
		
		Thread.sleep(10000);
		//slow.until(ExpectedConditions.visibilityOf(taluk));
		Select Taluk=new Select(taluk);
		Taluk.selectByIndex(2);
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(hobli));
		Select Hobli=new Select(hobli);
		Hobli.selectByIndex(2);
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(village));
		Select Village=new Select(village);
		Village.selectByIndex(4);
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(submit));
		submit.click();
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(checkBox));
		checkBox.click();
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(FinalSubmit));
		FinalSubmit.click();
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(okey));
		okey.click();
		
//		Actions action= new Actions(driver);
//		action.moveToElement(FinalSubmit).perform();
//		
		String rge=GetRegID();
		
		//Thread.sleep(10000);
		slow.until(ExpectedConditions.visibilityOf(okybutton));
		okybutton.click();
		return rge;
		
	}
	 public String GetRegID() throws Throwable {
		 RegID.isDisplayed();
//		 String reg=RegID.getText();
//		 System.out.println(reg);
		
		Thread.sleep(5000);
		int length = RegID.getText().length();
		 String id =  RegID.getText().substring(length-5);
		 System.out.println(id);
		 return id;
		  
	 }
 
	
}
