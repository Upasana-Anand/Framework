package testScript;


import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



import pageObject.LoginPageObject;

public class BaseTest extends ReusableTestComponents

{
    
	@Test 
	public void tc1() throws IOException 
	
	{
	
		lanchandlogin();
	}
  
	   
	
	
}
