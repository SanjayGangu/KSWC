package Test;

import org.testng.annotations.Test;

import genericMethode.BaseClass;
import pages.HomePage;
import pages.CustomerRegPages.FarmerRegPage;
import pages.Farmer.InwardRegPage;

public class HomeTest extends BaseClass{
	@Test
	public void test() throws Throwable  {
		System.out.println("print");
		HomePage homePage=new HomePage(driver);
		homePage.validateHomePageHeader();
		homePage.clickOnCustomerRegistration();
		homePage.clickOnFarmerRegistartion();
		FarmerRegPage FRP=new FarmerRegPage(driver);
		String	registraionId = (String) FRP.FarmerRegPageValues();
		homePage.clickOnFarmerPage().clickOnInward();
		new InwardRegPage(driver).InwardRegPageData(registraionId);
		
//		

		
//		homePage.clickOnFarmerPage();
//		homePage.clickOnInward();
//		
//		
		
	}

}
