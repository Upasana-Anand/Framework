package testScript;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pageObject.LoginPageObject;

public class ReusableTestComponents {
	
	WebDriver driver;
  
	public WebDriver intializeDriver() throws IOException
	{
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("C:\\Users\\upasa\\eclipse-workspace\\javaProgram\\FrrameWork1\\src\\main\\java\\resources\\global_data.properties");
		prop.load(fis);	
		
		String browser_name=prop.getProperty("browser");
		
		if(browser_name.equalsIgnoreCase("chrome"));
		
		{
			 driver=new ChromeDriver();
			

			
		}
		
		return driver;
		
		
	}
	
	public void lanchandlogin() throws IOException
	{
		
		driver=intializeDriver();
		
		LoginPageObject lp=new LoginPageObject(driver);
		lp.launchApp();
		lp.dologin("admin@123", "ll");
		
		
		
		
	}
	
}
