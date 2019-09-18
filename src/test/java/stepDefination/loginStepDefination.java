package stepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class loginStepDefination {
	
	WebDriver driver;
	
	@Given("^User is Already on Login Page$")
	public void User_is_Already_on_Login_Page()
	{
		System.setProperty("webdriver.chrome.driver","D:\\Softwares\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://ui.freecrm.com");
	}

	@When("^Title of Login Page is CRM$")
	public void Title_of_Login_Page_is_CRM()
	{
		String title= driver.getTitle();
		System.out.println(title);
	    Assert.assertEquals("CRM", title);
		
	}
	
	@Then("^User Enters \"(.*)\" and \"(.*)\"$")
	public void User_Enters_Username_and_Password(String UserName,String Password)
	{
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys(UserName);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(Password);
	}
	
	
	
	@Then("^User clicks on login Button$")
	public void User_clicks_on_login_Button()
	{
		WebElement LoginBtn= driver.findElement(By.xpath("//div[@class='ui fluid large blue submit button']"));
		LoginBtn.click();
		//JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("argument[0],click();", LoginBtn);
	}
	
	@Then("^User is on Home Page$")
	public void User_is_on_Home_page()
	{
		String title= driver.getTitle();
		System.out.println(title);
		Assert.assertEquals("CRM", title);
	}
	
	
}
