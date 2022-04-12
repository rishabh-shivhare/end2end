package e2e_Automation_TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import e2e_Automation_utilities.ConfigData;







public class BaseClass {
	WebDriver driver;
	
	ConfigData c = new ConfigData();
	
	
	
	@BeforeClass
	public void setUp() {
		if(c.getBrowser().equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//Drivers//chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		
		else if(c.getBrowser().equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.edge.driver", System.getProperty("user.dir")+"//Drivers//msedgedriver.exe");
			driver= new EdgeDriver();
			
		}
		
		
		driver.manage().window().maximize();
		

		
		
	}
	

	
	@AfterClass
	public void tearDown() {
		
		driver.quit();
		
	}

}
