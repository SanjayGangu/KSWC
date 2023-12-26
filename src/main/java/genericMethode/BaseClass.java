package genericMethode;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

public WebDriver driver;
	@BeforeMethod
	public void lunchchrome() throws Throwable {
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 driver.get("http://49.204.72.13:100");
		 LogInPage login=new LogInPage(driver);
		 login.loginToApplication();
		 
		 
		 
	}
	@AfterMethod
	public  void clossChrome() {
		driver.quit();
	}
		
}
