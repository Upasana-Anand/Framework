package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import reusableAbstractComponents.AbstractComponents;

public class LoginPageObject extends AbstractComponents
{
	
    WebDriver driver;
    
	
	
	public LoginPageObject(WebDriver driver)
	{
		super(driver);
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="email") WebElement un;
	@FindBy(id="pass") WebElement pw;
	@FindBy(name="login") WebElement lgbtn;

	
	
	public void dologin(String uname, String password) 
	    {
	
		un.sendKeys(uname);
		pw.sendKeys(password);
		lgbtn.click();
		close();
		
		}
		
	
	public void launchApp()
	{
		driver.get("https://www.facebook.com/");
		max();
	}
	
	public void launchlogin() 
	{
		driver.get("https://www.facebook.com/");
		WebElement un=driver.findElement(By.id("email"));
		WebElement pw=driver.findElement(By.id("pass"));
		WebElement lgbtn=driver.findElement(By.name("login"));
		un.sendKeys("admin@123");
		pw.sendKeys("1234");
		lgbtn.click();
		
	}
}
