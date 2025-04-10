package testScript;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import pageObject.LoginPageObject;

public class BaseTest {
    
	@Test 
	public void tc1() 
	
	{
	
        WebDriver driver=new ChromeDriver();
        LoginPageObject lpo=new LoginPageObject(driver);
       
       lpo.launchApp();
        lpo.dologin("admin@1233","12333");
        //lpo.launchlogin();
	}

}
