package e2e_Automation_utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigData {
	
	Properties pro;
	public ConfigData() {
		
		try {
			File fil = new File(System.getProperty("user.dir")+"//Configuration//data.properties");
			FileInputStream scr = new FileInputStream(fil);
			pro = new Properties();
			pro.load(scr);
		}
		
		catch(Exception e) {
			 System.out.println(e.getMessage());
			
		}
	
	}
	
	public String getUrl() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;
	}
	
	

}
