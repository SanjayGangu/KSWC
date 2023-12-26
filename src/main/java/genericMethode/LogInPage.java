package genericMethode;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class LogInPage {
	WebDriver driver;
	@FindBy(className = "card-body")
	private WebElement loginPageTitle; 

	@FindBy(id = "LoginUserName")
	private WebElement userNameTextField; 
	
	@FindBy(id = "loginPassword")
	private WebElement passwordTextField; 
	
	@FindBy(id = "_myRandCaptcha")
	private WebElement captcha;
	
	@FindBy(id = "txt_manual_Input_captcha")
	private WebElement captachaTextField; 
	
	@FindBy(id = "btn_kswc_sign_In")
	private WebElement submitButton;
	
	public LogInPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
		
	}
	public void loginToApplication() throws Throwable {
		//Assert.assertEquals(loginPageTitle.getText(),"Integrated Inventory Management System");
		SoftAssert soft = new SoftAssert();
		soft.assertEquals(loginPageTitle.getText(),"Integrated Inventory Management System");
		userNameTextField.sendKeys("Wm19019");
		passwordTextField.sendKeys("Kswc@123");
		captachaTextField.sendKeys(captcha.getText());
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		submitButton.click();
		Thread.sleep(5000);
		soft.assertAll();
	}

}
