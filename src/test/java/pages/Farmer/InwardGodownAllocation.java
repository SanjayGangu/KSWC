package pages.Farmer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class InwardGodownAllocation {
	WebDriver driver;
	WebDriverWait wait;
	
	@FindBy (xpath="//h3[text()='Farmer Godown Allocation Details / ಗೋದಾಮು ಹಂಚಿಕೆ ವಿವರಗಳು']")
	private WebElement AllocationHeader;
	
	@FindBy (xpath="//input[@type='search']")
	private WebElement Search;
	
	@FindBy (xpath="//a[@irid='55192'and @class='saveButton']")
	private WebElement View;
	
	@FindBy (id="no_of_GodwonNames")
	private WebElement GodownName;
	
	@FindBy (id="View_Design_Layout")
	private WebElement ViewDesignLayout;
	
	@FindBy (xpath="//td[@id='A2']")
	private WebElement OccupiedCells;
	
	@FindBy (id="Save_Design_Layout")
	private WebElement SaveDesignLayout;
	
	public InwardGodownAllocation(WebDriver driver){
		PageFactory.initElements(driver, this);	
		wait=new WebDriverWait(driver, 50);
	}
	
	public void AllocationData() {
		SoftAssert soft=new SoftAssert();
		soft.assertEquals(AllocationHeader.getText(),"Farmer Godown Allocation Details / ಗೋದಾಮು ಹಂಚಿಕೆ ವಿವರಗಳು");
		AllocationHeader.click();
		
		Search.sendKeys("karthik");
		
		View.click();
		
		GodownName.click();
		wait.until(ExpectedConditions.visibilityOf(GodownName));
		Select godown=new Select(GodownName);
		godown.selectByIndex(1);
		
		ViewDesignLayout.click();
		
		OccupiedCells.click();
		
		SaveDesignLayout.click();
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	//
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
