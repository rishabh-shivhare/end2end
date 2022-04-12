package e2e_Automation_PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver localdriver;
	
	public LoginPage(WebDriver driver) {
		
		localdriver = driver;
		PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(name="uid")
	WebElement txtUserName;
	
	@FindBy(name="password")
	WebElement txtUserPass;
	
	
	@FindBy(name="btnLogin")
	WebElement btnLogin;
	
	
	public void setUserName(String uname) {
		txtUserName.sendKeys(uname);
	}
	
	public void setUserPass(String pass) {
		txtUserPass.sendKeys(pass);
	}
	
	public void clickLogin() {
		btnLogin.click();
	}
	
	
	

}
