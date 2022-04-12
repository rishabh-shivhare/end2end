package e2e_Automation_TestScript;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import e2e_Automation_PageObjects.LoginPage;





public class TC_LoginPage extends BaseClass {
	
	@Test(dataProvider ="datapro1")
	public void login(String userid, String pass) {
		
		driver.get(c.getUrl());
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(userid);
		lp.setUserPass(pass);
		lp.clickLogin();
		
	}
	
	@DataProvider(name="datapro1")
	public Object[][] dataPro(){
		
		Object[][] data =  new Object[1][2];
		data[0][0] = "mngr398703";
		data[0][1] = "UsazUdU";
		return data;
	}

}
 